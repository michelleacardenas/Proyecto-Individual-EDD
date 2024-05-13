/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edd;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import static edd.VtnAltas.arre;
import static edd.VtnAltas.lc;
import java.awt.Image;
import java.awt.Toolkit;
import poo.Archivos;

/**
 *
 * @author marip
 */
public class VtnProcesa extends javax.swing.JFrame
{

    public static boolean abierto;

    /**
     * Creates new form VtnProcesa
     */
    public VtnProcesa()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png")));
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel4 = new javax.swing.JLabel();
        priori = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        procesaB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        priori1 = new javax.swing.JTextField();
        nom1 = new javax.swing.JTextField();
        quant1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cargaB = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.png"))); // NOI18N
        jLabel4.setToolTipText("Regresar a Menú Principal");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        priori.setToolTipText("Prioridad más alta");
        priori.setEnabled(false);
        priori.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                prioriKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                prioriKeyTyped(evt);
            }
        });
        getContentPane().add(priori, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel3.setText("CAMBIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, 20));

        nom.setToolTipText("Nombre de prioridad más alta");
        nom.setEnabled(false);
        nom.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setText("Quantums");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, 20));

        quant.setToolTipText("Quantums de prioridad más alta");
        quant.setEnabled(false);
        quant.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                quantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                quantKeyTyped(evt);
            }
        });
        getContentPane().add(quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("No. Prioridad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, 20));

        procesaB.setBackground(new java.awt.Color(0, 0, 0));
        procesaB.setFont(new java.awt.Font("Roboto Medium", 1, 11)); // NOI18N
        procesaB.setForeground(new java.awt.Color(255, 255, 255));
        procesaB.setText("Procesar");
        procesaB.setToolTipText("");
        procesaB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                procesaBActionPerformed(evt);
            }
        });
        procesaB.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                procesaBKeyPressed(evt);
            }
        });
        getContentPane().add(procesaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel7.setText("PRIMER PROCESO DE PRIORIDAD MÁS ALTA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        priori1.setToolTipText("Prioridad luego del proceso");
        priori1.setEnabled(false);
        priori1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                priori1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                priori1KeyTyped(evt);
            }
        });
        getContentPane().add(priori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 150, -1));

        nom1.setToolTipText("Nombre del proceso que se llevó a cabo");
        nom1.setEnabled(false);
        nom1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nom1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                nom1KeyTyped(evt);
            }
        });
        getContentPane().add(nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 150, -1));

        quant1.setToolTipText("Quantums luego del proceso");
        quant1.setEnabled(false);
        quant1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quant1ActionPerformed(evt);
            }
        });
        quant1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                quant1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                quant1KeyTyped(evt);
            }
        });
        getContentPane().add(quant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 150, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("Quantums");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Nombre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 20));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("No. Prioridad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar próximo proceso");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 190, 30));

        cargaB.setBackground(new java.awt.Color(0, 0, 0));
        cargaB.setFont(new java.awt.Font("Roboto Medium", 1, 11)); // NOI18N
        cargaB.setForeground(new java.awt.Color(255, 255, 255));
        cargaB.setText("Cargar primer proceso");
        cargaB.setToolTipText("Carga el sig. proceso a ejecutar");
        cargaB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cargaBActionPerformed(evt);
            }
        });
        cargaB.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                cargaBKeyPressed(evt);
            }
        });
        getContentPane().add(cargaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        new VtnPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void prioriKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_prioriKeyPressed
    {//GEN-HEADEREND:event_prioriKeyPressed

    }//GEN-LAST:event_prioriKeyPressed

    private void prioriKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_prioriKeyTyped
    {//GEN-HEADEREND:event_prioriKeyTyped

    }//GEN-LAST:event_prioriKeyTyped

    private void nomKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomKeyPressed
    {//GEN-HEADEREND:event_nomKeyPressed

    }//GEN-LAST:event_nomKeyPressed

    private void nomKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomKeyTyped
    {//GEN-HEADEREND:event_nomKeyTyped

    }//GEN-LAST:event_nomKeyTyped

    private void quantKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_quantKeyPressed
    {//GEN-HEADEREND:event_quantKeyPressed

    }//GEN-LAST:event_quantKeyPressed

    private void quantKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_quantKeyTyped
    {//GEN-HEADEREND:event_quantKeyTyped

    }//GEN-LAST:event_quantKeyTyped

    private void priori1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_priori1KeyPressed
    {//GEN-HEADEREND:event_priori1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_priori1KeyPressed

    private void priori1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_priori1KeyTyped
    {//GEN-HEADEREND:event_priori1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_priori1KeyTyped

    private void nom1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nom1KeyPressed
    {//GEN-HEADEREND:event_nom1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom1KeyPressed

    private void nom1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nom1KeyTyped
    {//GEN-HEADEREND:event_nom1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nom1KeyTyped

    private void quant1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_quant1KeyPressed
    {//GEN-HEADEREND:event_quant1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quant1KeyPressed

    private void quant1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_quant1KeyTyped
    {//GEN-HEADEREND:event_quant1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_quant1KeyTyped

    private void quant1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quant1ActionPerformed
    {//GEN-HEADEREND:event_quant1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quant1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        if (VtnAltas.lc != null && VtnProcesa.abierto == true)
        {
            new VtnCProx().setVisible(true);
            dispose();
        } else
        {
            Mensajes.error(this, "No se ha procesado ningun dato aún");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        Archivos.guarda(this, VtnAltas.arre, "Arre.dat");
        Archivos.guarda(this, VtnAltas.lc, "Datos.dat");
    }//GEN-LAST:event_formWindowClosing

    private void procesaBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_procesaBActionPerformed
    {//GEN-HEADEREND:event_procesaBActionPerformed
        try
        {
            if (VtnAltas.lc != null || VtnAltas.lc.getR() != null)
            {
                NodoL aux = VtnAltas.lc.getR().getSiguiente();
                Nodo aux2 = Manipulacion.procesa2(VtnAltas.lc, VtnAltas.arre); //primer nodo modificado con prioridad mas alta 

                //datos antes de ser procesados
                if ((((Proceso) aux2.getObj()).getQuantums() + 1) > 1) //si los quantums son mayores a 1, es decir, de 2 en adelante
                {
                    if (((((Proceso) aux2.getObj()).getNoPrioridad()) == 1))
                    {
                        priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad())); //la prio es 1
                        nom.setText(((Proceso) aux2.getObj()).getNombre());
                        quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));
                    } else
                    {
                        if ((((Proceso) aux2.getObj()).getNoPrioridad() + 1) > 1) //si la prio es de 2 en adelante
                        {
                            priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad() + 1));
                            nom.setText(((Proceso) aux2.getObj()).getNombre());
                            quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));
                        }
                    }

                } else //si los quantums son 1
                {
                    if ((((Proceso) aux2.getObj()).getNoPrioridad() + 1) > 1) //si la prio es de 2 en adelante
                    {
                        priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad() + 1));
                        nom.setText(((Proceso) aux2.getObj()).getNombre());
                        quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));

                    } else //si la prio es 1
                    {
                        if (((((Proceso) aux2.getObj()).getNoPrioridad()) == 1))
                        {
                            priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad())); //la prio es 1
                            nom.setText(((Proceso) aux2.getObj()).getNombre());
                            quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));
                        }

                    }
                }

                //datos despues de ser procesados
                priori1.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad()));
                nom1.setText(((Proceso) aux2.getObj()).getNombre());
                quant1.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums()));

                System.out.println("DESPUES");
                System.out.println("Proceso " + ((Proceso) aux2.getObj()).getNombre());
                System.out.println("Num p:" + ((Proceso) aux2.getObj()).getNoPrioridad());
                System.out.println("q " + ((Proceso) aux2.getObj()).getQuantums());

                if (((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente() == aux2)  //si estan en la misma posicion (1)
                {
                    ((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente().setObj(aux2);  //colocamos el nuevo obj
                }

                if (((Proceso) aux2.getObj()).getQuantums() == 0)
                {
                    //si los quantums son cero
                    VtnAltas.lc = Manipulacion.elimina(((Proceso) aux2.getObj()).getNombre(), VtnAltas.lc);
                    VtnAltas.arre = Manipulacion.bajaNom(VtnAltas.arre, ((Proceso) aux2.getObj()).getNombre());
                }

                Archivos.guarda(this, VtnAltas.arre, "Arre.dat");
                Archivos.guarda(this, VtnAltas.lc, "Datos.dat");

                Mensajes.exito(this, "Datos guardados con éxito");
                CtrlInterfaz.limpia(priori, nom, quant, priori1, nom1, quant1);
                CtrlInterfaz.habilita(false, nom, quant, priori, priori1, nom1, quant1);
                CtrlInterfaz.cambia(procesaB);

                abierto = true;
            } else
            {
                Mensajes.error(this, "No existen datos por procesar");
                CtrlInterfaz.limpia(priori, nom, quant, priori1, nom1, quant1);
                CtrlInterfaz.habilita(false, nom, quant, priori, priori1, nom1, quant1);

                new VtnPrincipal().setVisible(true);
                dispose();
            }

        } catch (Exception e)
        {
            Mensajes.error(this, "No existen procesos registrados, ingresa primero datos");
            this.setVisible(false);
            new VtnAltas().setVisible(true);
        }
    }//GEN-LAST:event_procesaBActionPerformed

    private void procesaBKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_procesaBKeyPressed
    {//GEN-HEADEREND:event_procesaBKeyPressed
        try
        {
            if (VtnAltas.lc != null || VtnAltas.lc.getR() != null)
            {
                NodoL aux = VtnAltas.lc.getR().getSiguiente();
                Nodo aux2 = Manipulacion.procesa2(VtnAltas.lc, VtnAltas.arre); //primer nodo modificado con prioridad mas alta 

                //datos antes de ser procesados
                if ((((Proceso) aux2.getObj()).getQuantums() + 1) > 1) //si los quantums son mayores a 1, es decir, de 2 en adelante
                {
                    if (((((Proceso) aux2.getObj()).getNoPrioridad()) == 1))
                    {
                        priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad())); //la prio es 1
                        nom.setText(((Proceso) aux2.getObj()).getNombre());
                        quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));
                    } else
                    {
                        if ((((Proceso) aux2.getObj()).getNoPrioridad() + 1) > 1) //si la prio es de 2 en adelante
                        {
                            priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad() + 1));
                            nom.setText(((Proceso) aux2.getObj()).getNombre());
                            quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));
                        }
                    }

                } else //si los quantums son 1
                {
                    if ((((Proceso) aux2.getObj()).getNoPrioridad() + 1) > 1) //si la prio es de 2 en adelante
                    {
                        priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad() + 1));
                        nom.setText(((Proceso) aux2.getObj()).getNombre());
                        quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));

                    } else //si la prio es 1
                    {
                        if (((((Proceso) aux2.getObj()).getNoPrioridad()) == 1))
                        {
                            priori.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad())); //la prio es 1
                            nom.setText(((Proceso) aux2.getObj()).getNombre());
                            quant.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums() + 1));
                        }

                    }
                }

                //datos despues de ser procesados
                priori1.setText(String.valueOf(((Proceso) aux2.getObj()).getNoPrioridad()));
                nom1.setText(((Proceso) aux2.getObj()).getNombre());
                quant1.setText(String.valueOf(((Proceso) aux2.getObj()).getQuantums()));

                System.out.println("DESPUES");
                System.out.println("Proceso " + ((Proceso) aux2.getObj()).getNombre());
                System.out.println("Num p:" + ((Proceso) aux2.getObj()).getNoPrioridad());
                System.out.println("q " + ((Proceso) aux2.getObj()).getQuantums());

                if (((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente() == aux2)  //si estan en la misma posicion (1)
                {
                    ((Prioridad) aux.getObj()).getCo().getAtras().getSiguiente().setObj(aux2);  //colocamos el nuevo obj
                }

                if (((Proceso) aux2.getObj()).getQuantums() == 0)
                {
                    //si los quantums son cero
                    VtnAltas.lc = Manipulacion.elimina(((Proceso) aux2.getObj()).getNombre(), VtnAltas.lc);
                    VtnAltas.arre = Manipulacion.bajaNom(VtnAltas.arre, ((Proceso) aux2.getObj()).getNombre());
                }

                Archivos.guarda(this, VtnAltas.arre, "Arre.dat");
                Archivos.guarda(this, VtnAltas.lc, "Datos.dat");

                Mensajes.exito(this, "Datos guardados con éxito");
                CtrlInterfaz.limpia(priori, nom, quant, priori1, nom1, quant1);
                CtrlInterfaz.habilita(false, nom, quant, priori, priori1, nom1, quant1);
                CtrlInterfaz.cambia(procesaB);

                abierto = true;
            } else
            {
                Mensajes.error(this, "No existen datos por procesar");
                CtrlInterfaz.limpia(priori, nom, quant, priori1, nom1, quant1);
                CtrlInterfaz.habilita(false, nom, quant, priori, priori1, nom1, quant1);

                new VtnPrincipal().setVisible(true);
                dispose();
            }

        } catch (Exception e)
        {
            Mensajes.error(this, "No existen procesos registrados, ingresa primero datos");
            this.setVisible(false);
            new VtnAltas().setVisible(true);
        }
    }//GEN-LAST:event_procesaBKeyPressed

    private void cargaBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cargaBActionPerformed
    {//GEN-HEADEREND:event_cargaBActionPerformed
        try
        {
            Nodo aux3 = Manipulacion.verPP(VtnAltas.lc);

            //datos antes de ser procesados
            priori.setText(String.valueOf(((Proceso) aux3.getObj()).getNoPrioridad()));
            nom.setText(((Proceso) aux3.getObj()).getNombre());
            quant.setText(String.valueOf(((Proceso) aux3.getObj()).getQuantums()));

            CtrlInterfaz.cambia(cargaB);

        } catch (Exception e)
        {
            Mensajes.error(this, "No existen procesos registrados, ingresa primero datos");
            this.setVisible(false);
            new VtnAltas().setVisible(true);
        }
    }//GEN-LAST:event_cargaBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        VtnAltas.arre = (String[]) Archivos.cargaArr(this, "Arre.dat");
        VtnAltas.lc = (ListaDLC) Archivos.carga(this, "Datos.dat");
    }//GEN-LAST:event_formWindowOpened

    private void cargaBKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cargaBKeyPressed
    {//GEN-HEADEREND:event_cargaBKeyPressed
        try
        {
            Nodo aux3 = Manipulacion.verPP(VtnAltas.lc);

            //datos antes de ser procesados
            priori.setText(String.valueOf(((Proceso) aux3.getObj()).getNoPrioridad()));
            nom.setText(((Proceso) aux3.getObj()).getNombre());
            quant.setText(String.valueOf(((Proceso) aux3.getObj()).getQuantums()));

            CtrlInterfaz.cambia(cargaB);

        } catch (Exception e)
        {
            Mensajes.error(this, "No existen procesos registrados, ingresa primero datos");
            this.setVisible(false);
            new VtnAltas().setVisible(true);
        }
    }//GEN-LAST:event_cargaBKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnProcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnProcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnProcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnProcesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnProcesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargaB;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nom1;
    private javax.swing.JTextField priori;
    private javax.swing.JTextField priori1;
    private javax.swing.JButton procesaB;
    private javax.swing.JTextField quant;
    private javax.swing.JTextField quant1;
    // End of variables declaration//GEN-END:variables
}