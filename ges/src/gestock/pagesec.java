/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author KINGBOURY
 */
public class pagesec extends JFrame{
    
    public JLabel jLabel5;
    public JMenu jMenu1;
    public JMenu jMenu2;
    public JMenu jMenu3;
    public JMenu jMenu4;
    public JMenu jMenu5;
    public javax.swing.JMenuBar jMenuBar1;
    public JMenuItem jMenuItem1;
    public JMenuItem jMenuItem10;
    public JMenuItem jMenuItem2;
    public JMenuItem jMenuItem3;
    public JMenuItem jMenuItem4;
    public JMenuItem jMenuItem5;
    public JMenuItem jMenuItem6;
    public JMenuItem jMenuItem7;
    public JMenuItem jMenuItem8;
    public JMenuItem jMenuItem9;
    
    public pagesec(){
    
    
        jLabel5 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu5 = new JMenu();
        jMenuItem10 = new JMenuItem();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem8 = new JMenuItem();
        jMenuItem9 = new JMenuItem();
        jMenu3 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);
        setResizable(false);
        setPreferredSize(new Dimension(652, 603));
        setTitle("GESTOCK");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\£NRON\\Documents\\GESTOCK\\pieces\\fond.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 650, 580);

        jMenu5.setText("Compte");

        jMenuItem10.setText("Deconnection");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Vente");

        jMenuItem1.setText("Nouveau");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Informations");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Depense");

        jMenuItem3.setText("Nouveau");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Informations");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Bon");

        jMenuItem8.setText("Nouveau");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Informations");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Inventaire");

        jMenuItem5.setText("Facture");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Depense");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Resume");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        
        setLocationRelativeTo(null);
    
    
    
    
    }
      public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pageadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagesec().setVisible(true);
            }
        });
    }

    
}
