/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edd;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import java.awt.Image;
import java.awt.Toolkit;
import poo.Archivos;

/**
 *
 * @author marip
 */
public class VtnBajas extends javax.swing.JFrame
{

    private boolean existe;
    public static Prioridad co;
    public static Proceso obj;

    /**
     * Creates new form VtnBajas
     */
    public VtnBajas()
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        quant = new javax.swing.JTextField();
        aceptarB = new javax.swing.JButton();
        cancelarB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        priori = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setText("Baja de Procesos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 160, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setText("Quantums");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 60, 20));

        nom.setToolTipText("Inserta el nombre del proceso a eliminar");
        nom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nomActionPerformed(evt);
            }
        });
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
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 140, -1));

        quant.setEnabled(false);
        getContentPane().add(quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, -1));

        aceptarB.setBackground(new java.awt.Color(0, 0, 0));
        aceptarB.setFont(new java.awt.Font("Roboto Medium", 1, 11)); // NOI18N
        aceptarB.setForeground(new java.awt.Color(255, 255, 255));
        aceptarB.setText("Aceptar");
        aceptarB.setToolTipText("Eliminar proceso");
        aceptarB.setEnabled(false);
        aceptarB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarBActionPerformed(evt);
            }
        });
        aceptarB.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                aceptarBKeyPressed(evt);
            }
        });
        getContentPane().add(aceptarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        cancelarB.setBackground(new java.awt.Color(0, 0, 0));
        cancelarB.setFont(new java.awt.Font("Roboto Medium", 1, 11)); // NOI18N
        cancelarB.setForeground(new java.awt.Color(255, 255, 255));
        cancelarB.setText("Cancelar");
        cancelarB.setToolTipText("Limpiar bloques");
        cancelarB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelarBActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setText("No. Prioridad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 20));

        priori.setEnabled(false);
        getContentPane().add(priori, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/baja.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        new VtnPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void cancelarBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarBActionPerformed
    {//GEN-HEADEREND:event_cancelarBActionPerformed
        CtrlInterfaz.limpia(nom, priori, quant);
        CtrlInterfaz.habilita(false, priori, quant);
        CtrlInterfaz.habilita(false, aceptarB);
        CtrlInterfaz.cambia(nom);
    }//GEN-LAST:event_cancelarBActionPerformed

    private void aceptarBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarBActionPerformed
    {//GEN-HEADEREND:event_aceptarBActionPerformed
        try
        {

            VtnAltas.lc = Manipulacion.elimina(nom.getText(), VtnAltas.lc);
            VtnAltas.arre = Manipulacion.bajaNom(VtnAltas.arre, nom.getText());

            Archivos.guarda(this, VtnAltas.arre, "Arre.dat");
            Archivos.guarda(this, VtnAltas.lc, "Datos.dat");

            Mensajes.exito(this, "Baja realizada con éxito");
            CtrlInterfaz.limpia(nom, priori, quant);
            CtrlInterfaz.habilita(false, priori, quant, aceptarB);
            CtrlInterfaz.cambia(nom);

        } catch (Exception e)
        {
            Mensajes.error(this, "Error: " + e.toString());
        }
    }//GEN-LAST:event_aceptarBActionPerformed

    private void nomKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomKeyPressed
    {//GEN-HEADEREND:event_nomKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, nom, aceptarB);
    }//GEN-LAST:event_nomKeyPressed

    private void nomKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomKeyTyped
    {//GEN-HEADEREND:event_nomKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, nom.getText());
    }//GEN-LAST:event_nomKeyTyped

    private void nomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nomActionPerformed
    {//GEN-HEADEREND:event_nomActionPerformed

        try
        {
            existe = Manipulacion.verifNR(VtnAltas.arre, nom.getText());
            if (existe == true)  //si existe el nombre
            {
                Nodo aux3 = Manipulacion.buscaEliminado(nom.getText(), VtnAltas.lc);
                priori.setText(String.valueOf(((Proceso) aux3.getObj()).getNoPrioridad()));
                quant.setText(String.valueOf(((Proceso) aux3.getObj()).getQuantums()));

                CtrlInterfaz.habilita(true, aceptarB);
            } else
            {
                Mensajes.error(this, "Nombre inexistente, Ingresa un nombre valido");
                CtrlInterfaz.limpia(nom, priori, quant);
                CtrlInterfaz.habilita(false, nom,priori, quant, aceptarB);
                CtrlInterfaz.cambia(nom);
            }
        } catch (Exception e)
        {
            Mensajes.error(this, "Error: " + e.toString());
        }

    }//GEN-LAST:event_nomActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        Archivos.guarda(this, VtnAltas.arre, "Arre.dat");
        Archivos.guarda(this, VtnAltas.lc, "Datos.dat");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        VtnAltas.arre = (String[]) Archivos.cargaArr(this, "Arre.dat");
        VtnAltas.lc = (ListaDLC) Archivos.carga(this, "Datos.dat");
    }//GEN-LAST:event_formWindowOpened

    private void aceptarBKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_aceptarBKeyPressed
    {//GEN-HEADEREND:event_aceptarBKeyPressed
        try
        {
            VtnAltas.lc = Manipulacion.elimina(nom.getText(), VtnAltas.lc);
            VtnAltas.arre = Manipulacion.bajaNom(VtnAltas.arre, nom.getText());

            Archivos.guarda(this, VtnAltas.arre, "Arre.dat");
            Archivos.guarda(this, VtnAltas.lc, "Datos.dat");

            Mensajes.exito(this, "Baja realizada con éxito");
            CtrlInterfaz.limpia(nom, priori, quant);
            CtrlInterfaz.habilita(false, priori, quant, aceptarB);
            CtrlInterfaz.cambia(nom);

        } catch (Exception e)
        {
            Mensajes.error(this, "Error: " + e.toString());
        }
    }//GEN-LAST:event_aceptarBKeyPressed

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
            java.util.logging.Logger.getLogger(VtnBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarB;
    private javax.swing.JButton cancelarB;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField priori;
    private javax.swing.JTextField quant;
    // End of variables declaration//GEN-END:variables
}
