/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author marip
 */
public class Manipulacion implements Serializable
{

    private static boolean nomrep;
    private static boolean existePr;
    static TableRowSorter<DefaultTableModel> sorter;

    public static ListaDLC inserta(Proceso obj, ListaDLC lc)
    {
        ColaCircularD c = new ColaCircularD();
        Prioridad co = new Prioridad(obj.getNoPrioridad(), c);

        if (lc == null)
        {
            System.out.println("PRIORIDAD Y PROCESO 1");
            Nodo nodoObj = new Nodo(obj.getNombre(), obj);
            co.getCo().inserta(nodoObj);
            System.out.println(((Proceso) nodoObj.getObj()).getNombre());
            ListaDLC lc2 = new ListaDLC();
            lc = lc2;
            NodoL nodoObjp = new NodoL(String.valueOf(co.getNoPrioridad()), co);
            lc.insertar(nodoObjp);  //inserto la primer prioridad
            System.out.println(((Prioridad) nodoObjp.getObj()).getNoPrioridad());
        } else
        {
            if (lc.getR() == null)
            {
                System.out.println("PRIORIDAD Y PROCESO 1");
                Nodo nodoObj = new Nodo(obj.getNombre(), obj);
                co.getCo().inserta(nodoObj);
                System.out.println(((Proceso) nodoObj.getObj()).getNombre());
                NodoL nodoObjp = new NodoL(String.valueOf(co.getNoPrioridad()), co);
                lc.insertar(nodoObjp);  //inserto la primer prioridad
                System.out.println(((Prioridad) nodoObjp.getObj()).getNoPrioridad());
            } else
            {
                System.out.println("DATOS NUEVOS");
                NodoL aux = lc.getR();
                boolean nep = true;  //no encontró priori
                if (lc.getR() == null)
                {
                    Nodo nodoObj = new Nodo(obj.getNombre(), obj);
                    co.getCo().inserta(nodoObj);
                    NodoL nodoObjp = new NodoL(String.valueOf(co.getNoPrioridad()), co);
                    lc.insertar(nodoObjp);
                } else
                {
                    if (obj.getNoPrioridad() < ((Prioridad) lc.getR().getSiguiente().getObj()).getNoPrioridad() || obj.getNoPrioridad() > ((Prioridad) lc.getR().getObj()).getNoPrioridad())
                    {
                        Nodo nodoObj = new Nodo(obj.getNombre(), obj);
                        co.getCo().inserta(nodoObj);
                        NodoL nodoObjp = new NodoL(String.valueOf(co.getNoPrioridad()), co);
                        lc.insertar(nodoObjp);
                    } else
                    {
                        do
                        {
                            aux = aux.getSiguiente();
                            if (obj.getNoPrioridad() == (((Prioridad) aux.getObj()).getNoPrioridad()))
                            {
                                nep = false; // Se encontró la prioridad

                                System.out.println("EXISTE LA PRIORIDAD");
                                Nodo nodoObj = new Nodo(obj.getNombre(), obj);
                                (((Prioridad) aux.getObj()).getCo()).inserta(nodoObj);
                                break;
                            } else
                            {
                                if (obj.getNoPrioridad() > ((Prioridad) aux.getObj()).getNoPrioridad() && obj.getNoPrioridad() < ((Prioridad) aux.getSiguiente().getObj()).getNoPrioridad())
                                {
                                    Nodo nodoObj = new Nodo(obj.getNombre(), obj);
                                    co.getCo().inserta(nodoObj);
                                    NodoL nodoObjp = new NodoL(String.valueOf(co.getNoPrioridad()), co);
                                    lc.insertar(nodoObjp);
                                    break;
                                }
                            }

                        } while (aux != lc.getR());
                    }
                }

            }
        }
        return lc;
    }

    public static String[] insertaNom(String[] arre, String obj)
    {
        if (arre == null)
        {
            arre = new String[1];
        } else
        {
            String nvo[] = new String[arre.length + 1];
            System.arraycopy(arre, 0, nvo, 0, arre.length);
            arre = nvo;
        }
        arre[arre.length - 1] = obj;
        return arre;
    }

    public static String[] bajaNom(String[] arre, String obj)
    {
        if (arre != null)
        {
            if (arre.length == 1)
            {
                arre = null;
            } else
            {
                String nuevo[] = new String[arre.length - 1];
                for (int j = 0, i = 0; i < arre.length; i++)
                {
                    if (arre[i] == null ? obj != null : !arre[i].equals(obj))
                    {
                        nuevo[j++] = arre[i];
                        System.out.println("nombres que quedan " + arre[i]);
                    }
                }
                arre = nuevo;
                return arre;
            }

        } else
        {
            System.out.println("No hay datos ");
        }
        return arre;
    }

    public static boolean verifNR(String[] arre, String obj)
    {
        nomrep = false;

        if (arre == null)
        {
            return false;
        } else
        {
            for (int i = 0; i < arre.length; i++)
            {
                if (arre[i].equals(obj))
                {
                    nomrep = true;
                    return nomrep;
                }

            }
        }
        return nomrep;
    }

//    public static ListaDLC elimina(String obj, ListaDLC lc)
//    {
//        if (lc != null)
//        {
//            NodoL aux = lc.getR();
//
//            do
//            {
//                aux = aux.getSiguiente();
//
//                ColaCircularD cola = new ColaCircularD();
////                Nodo aux2 = ((Prioridad) aux.getObj()).getCo().getAtras();
//                do
//                {
//                    Nodo aux2 = ((Prioridad) aux.getObj()).getCo().elimina();
//                    if (((Proceso) aux2.getObj()).getNombre().equals(obj))
//                    {
//                        System.out.println("Se encontró el proceso y se eliminó");
//                    } else
//                    {
//                        cola.inserta(aux2);
//                    }
//                } while (((Prioridad) aux.getObj()).getCo().getAtras() != null);
//
//                ((Prioridad) aux.getObj()).setCo(cola);
//
//                if (((Prioridad) aux.getObj()).getCo().getAtras() == null)  //si se elimina el ultimo dato de una cola
//                {
//                    lc.eliminar(String.valueOf(((Prioridad) aux.getObj()).getNoPrioridad()));
//                    return lc;
//                }
//
//                if (lc.getR() == null)   //si se elimina el ultimo dato de la lista
//                {
//                    return lc;
//                }
//
//            } while (aux != lc.getR());
//
//        } else
//        {
//            System.out.println("Lista vacía");
//        }
//
//        return lc;
//    }
    public static ListaDLC elimina(String obj, ListaDLC lc)
    {
        if (lc != null)
        {
            NodoL aux = lc.getR();

            do
            {
                aux = aux.getSiguiente();

                ColaCircularD cola = new ColaCircularD();
//                Nodo aux2 = ((Prioridad) aux.getObj()).getCo().getAtras();
                do
                {
                    Nodo aux2 = ((Prioridad) aux.getObj()).getCo().elimina();
                    if (((Proceso) aux2.getObj()).getNombre().equals(obj))
                    {
                        System.out.println("Se encontró el proceso y se eliminó");
                    } else
                    {
                        cola.inserta(aux2);
                    }
                } while (((Prioridad) aux.getObj()).getCo().getAtras() != null);

                ((Prioridad) aux.getObj()).setCo(cola);

                if (((Prioridad) aux.getObj()).getCo().getAtras() == null)  //si se elimina el ultimo dato de una cola
                {
                    lc.eliminar(String.valueOf(((Prioridad) aux.getObj()).getNoPrioridad()));
                    return lc;
                }

                if (lc.getR() == null)   //si se elimina el ultimo dato de la lista
                {
                    return lc;
                }

            } while (aux != lc.getR());

        } else
        {
            System.out.println("Lista vacía");
        }

        return lc;
    }

    public static Nodo buscaEliminado(String obj, ListaDLC lc)   //busca datos por nombre
    {
        Nodo aux3 = null;
        if (lc != null)
        {
            NodoL aux = lc.getR();

            do
            {
                aux = aux.getSiguiente();

                ColaCircularD cola = new ColaCircularD();
                do
                {
                    Nodo aux2 = ((Prioridad) aux.getObj()).getCo().elimina();
                    if (((Proceso) aux2.getObj()).getNombre().equals(obj))
                    {
                        System.out.println("Se encontró el proceso");
                        aux3 = aux2;
                        cola.inserta(aux2);
                    } else
                    {
                        cola.inserta(aux2);
                    }

                } while (((Prioridad) aux.getObj()).getCo().getAtras() != null);

                ((Prioridad) aux.getObj()).setCo(cola);

                if (aux3 != null)
                {
                    break;
                }

            } while (aux != lc.getR());

        } else
        {
            System.out.println("Lista vacía");
        }

        return aux3;
    }

    public static void consultasTab(ListaDLC lc, JTable jTable, int prioridad)
    {
        if (lc != null)
        {
            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
            modelo.setRowCount(0); // limpia el modelo de la tabla
            String[] columnas =
            {
                "No. Prioridad", "Nombre", "Quantums"
            };
            modelo.setColumnIdentifiers(columnas);

            NodoL aux = lc.getR(); // recorro la lista de prioridades
            do
            {
                aux = aux.getSiguiente();

                if (((Prioridad) aux.getObj()).getNoPrioridad() == prioridad) //si la prioridad coincide con la prioridad deseada
                {
                    ColaCircularD cola = new ColaCircularD();

                    while (((Prioridad) aux.getObj()).getCo().getAtras() != null) // verifica si la cola tiene nodos
                    {
                        Nodo aux2 = ((Prioridad) aux.getObj()).getCo().elimina(); // eliminamos el primer nodo de la cola

                        String[] fila = ((Proceso) aux2.getObj()).toString().split("\t");   //agregamos del nodo eliminado sus datos
                        modelo.addRow(fila); //agregamos la fila
                        cola.inserta(aux2); // insertamos nodos eliminados en la nueva cola

                    }

                    ((Prioridad) aux.getObj()).setCo(cola); // actualiza la cola en la prioridad
                    break;
                }

            } while (aux != lc.getR());

        } else
        {
            System.out.println("Lista vacía");
        }

    }

    public static void consultaTabProx(ListaDLC lc, JTable jTable)
    {
        if (lc != null)
        {
            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
            modelo.setRowCount(0); // limpia el modelo de la tabla
            String[] columnas =
            {
                "No. Prioridad", "Nombre", "Quantums"
            };
            modelo.setColumnIdentifiers(columnas);

            NodoL aux = lc.getR().getSiguiente(); // me posiciono en la primer pos de la lista

            Nodo aux2 = ((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente(); //obtengo el primer dato de la cola

            String[] fila = ((Proceso) aux2.getObj()).toString().split("\t");   //agregamos del nodo eliminado sus datos
            modelo.addRow(fila);

        } else
        {
            System.out.println("Lista vacía");
        }

    }

    public static Nodo verPP(ListaDLC lc) //VER PRIMER PROCESO DE PRIORIDAD
    {
        if (lc != null)
        {
            NodoL aux = lc.getR().getSiguiente(); //empiezo en la primer prioridad

            Nodo aux2 = ((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente(); //obtenemos el primer proceso de la prioridad más alta

            System.out.println("Num p:" + ((Proceso) aux2.getObj()).getNoPrioridad());
            System.out.println("q " + ((Proceso) aux2.getObj()).getQuantums());
            System.out.println("Proceso " + ((Proceso) aux2.getObj()).getNombre());

            return aux2;

        } else
        {
            System.out.println("Lista vacía");
            return null;
        }

    }

    public static boolean verifEP(ListaDLC lc, int obj)  //verifica si existe esa prioridad
    {
        existePr = false;
        boolean b = true;

        if (lc == null || lc.getR() == null || String.valueOf(obj) == "")
        {
            return false;
        } else
        {
            NodoL aux = lc.getR().getSiguiente();

            while (b)
            {
                if (aux != lc.getR())
                {
                    if (((Prioridad) aux.getObj()).getNoPrioridad() == obj)
                    {
                        existePr = true;
                        b = false;
                    } else
                    {
                        aux = aux.getSiguiente();
                    }
                } else
                {
                    if (aux == lc.getR())
                    {
                        if (((Prioridad) aux.getObj()).getNoPrioridad() == obj)
                        {
                            existePr = true;
                            b = false;
                        } else
                        {
                            break;
                        }
                    }
                }
            }
        }
        return existePr;
    }

//    public static ListaDLC procesa(ListaDLC lc, String[] arre)  //para cargar los datos debo pasarlos como parametros y abajo en el codigo guardarlos como variables jejeej
//    {
//        if (lc != null)
//        {
//            NodoL aux = lc.getR().getSiguiente(); //empiezo en la primer prioridad
//
//            Nodo aux2 = ((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente(); //obtenemos el primer proceso de la prioridad más alta
//
//            if (((Proceso) aux2.getObj()).getQuantums() > 1) //si los quantums son mayores a 1, es decir, de 2 en adelante
//            {
//                if (((Proceso) aux2.getObj()).getNoPrioridad() > 1) //si la prio es de 2 en adelante
//                {
//                    elimina(((Proceso) aux2.getObj()).getNombre(), lc);
//
//                    ((Proceso) aux2.getObj()).setQuantums(((Proceso) aux2.getObj()).getQuantums() - 1);  //le restamos 1 a los quantums
//                    ((Proceso) aux2.getObj()).setNoPrioridad(((Proceso) aux2.getObj()).getNoPrioridad() - 1);//incremento su prioridad
//                    arre = bajaNom(arre, ((Proceso) aux2.getObj()).getNombre());
//                    //si la prioridad no existe, se crea. por lo q necesito verificar si existe la prioridad
//
//                    inserta((Proceso) aux2.getObj(), lc);  //finalmente se inserta el nuevo nodo
//                    insertaNom(arre, ((Proceso) aux2.getObj()).getNombre());
//
//                } else //si la prio es 1, entonces solo le restamos a los quantums y la prio se mantiene
//                {
//                    ((Proceso) aux2.getObj()).setQuantums(((Proceso) aux2.getObj()).getQuantums() - 1);  //le restamos 1 a los quantums
//                }
//
//            } else //si los quantums son 1
//            {
//                elimina(((Proceso) aux2.getObj()).getNombre(), lc); //elimino el nodo de la cola
//                ((Proceso) aux2.getObj()).setQuantums(((Proceso) aux2.getObj()).getQuantums() - 1);  //y luego le restamos 1 a los quantums
//                arre = bajaNom(arre, ((Proceso) aux2.getObj()).getNombre());
//            }
//
//        } else
//        {
//            System.out.println("Lista vacía");
//        }
//        return lc;
//    }
    
    
    public static Nodo procesa2(ListaDLC lc, String[] arre)  //para cargar los datos debo pasarlos como parametros y abajo en el codigo guardarlos como variables jejeej
    {
        if (lc != null)
        {
            NodoL aux = lc.getR().getSiguiente(); //empiezo en la primer prioridad

            Nodo aux2 = ((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente(); //obtenemos el primer proceso de la prioridad más alta

            System.out.println("ANTES");
            System.out.println("Num p:" + ((Proceso) aux2.getObj()).getNoPrioridad());
            System.out.println("q " + ((Proceso) aux2.getObj()).getQuantums());
            System.out.println("Proceso " + ((Proceso) aux2.getObj()).getNombre());
            System.out.println("");

            if (((Proceso) aux2.getObj()).getQuantums() > 1) //si los quantums son mayores a 1, es decir, de 2 en adelante
            {
                if (((Proceso) aux2.getObj()).getNoPrioridad() > 1) //si la prio es de 2 en adelante
                {
                    ((Proceso) aux2.getObj()).setQuantums(((Proceso) aux2.getObj()).getQuantums() - 1);  //le restamos 1 a los quantums
                    ((Proceso) aux2.getObj()).setNoPrioridad(((Proceso) aux2.getObj()).getNoPrioridad() - 1);//incremento su prioridad
                    return aux2;  //retorna el nodo con las modificaciones

                } else //si la prio es 1, entonces solo le restamos a los quantums y la prio se mantiene
                {
                    ((Proceso) aux2.getObj()).setQuantums(((Proceso) aux2.getObj()).getQuantums() - 1);  //le restamos 1 a los quantums
                    return aux2;
                }

            } else //si los quantums son 1
            {

                ((Proceso) aux2.getObj()).setQuantums(((Proceso) aux2.getObj()).getQuantums() - 1);  //y luego le restamos 1 a los quantums
                return aux2;
            }

        } else
        {
            System.out.println("Lista vacía");
            return null;
        }

    }

    public static Object[] insertaObj(Object[] arre, Object obj)
    {
        if (arre == null)
        {
            arre = new Object[1];
        } else
        {
            Object nvo[] = new Object[arre.length + 1];
            System.arraycopy(arre, 0, nvo, 0, arre.length);
            arre = nvo;
        }
        arre[arre.length - 1] = obj;
        return arre;
    }

}
