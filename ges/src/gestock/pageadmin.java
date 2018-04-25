package gestock;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author KINGBOURY
 */
public class pageadmin extends javax.swing.JFrame {

        public javax.swing.JLabel jLabel1;
    public JMenu jMenu1;
    public JMenu jMenu10;
    public JMenu jMenu2;
    public JMenu jMenu3;
    public JMenu jMenu4;
    public JMenu jMenu5;
    public JMenu jMenu6;
    public JMenu jMenu7;
    public JMenu jMenu8;
    public JMenu jMenu9;
    public javax.swing.JMenuBar jMenuBar1;
    public JMenuItem jMenuItem1;
    public JMenuItem jMenuItem10;
    public JMenuItem jMenuItem11;
    public JMenuItem jMenuItem12;
    public JMenuItem jMenuItem13;
    public JMenuItem jMenuItem14;
    public JMenuItem jMenuItem15;
    public JMenuItem jMenuItem16;
    public JMenuItem jMenuItem17;
    public JMenuItem jMenuItem18;
    public JMenuItem jMenuItem19;
    public JMenuItem jMenuItem2;
    public JMenuItem jMenuItem20;
    public JMenuItem jMenuItem21;
    public JMenuItem jMenuItem22;
    public JMenu jMenu23;
    public JMenuItem jMenuItem24;
    public JMenuItem jMenuItem3;
    public JMenuItem jMenuItem4;
    public JMenuItem jMenuItem5;
    public JMenuItem jMenuItem6;
    public JMenuItem jMenuItem7;
    public JMenuItem jMenuItem8;
    public JMenuItem jMenuItem9;
    public JMenu m10;
    public JMenuItem j10;
    public JMenuItem j11;
     public JMenuItem j12;
     public JMenuItem j13;
     public JMenuItem j14;
     public JMenuItem j15;
     public JMenuItem j16;
     public JMenu j90;
     public JMenuItem j17;
     public JMenuItem j18;
     public JMenuItem j19;
     public JMenuItem j20;
            


    public pageadmin() {
    
        jMenu4 = new JMenu();
        jMenu6 = new JMenu();
        jLabel1 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem24 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jMenu8 = new JMenu();
        jMenuItem7 = new JMenuItem();
        jMenuItem8 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenu3 = new JMenu();
        jMenuItem9 = new JMenuItem();
        jMenuItem10 = new JMenuItem();
        jMenuItem11 = new JMenuItem();
        jMenu9 = new JMenu();
        jMenuItem13 = new JMenuItem();
        jMenuItem14 = new JMenuItem();
        jMenuItem12 = new JMenuItem();
        jMenu5 = new JMenu();
        jMenuItem15 = new JMenuItem();
        jMenuItem16 = new JMenuItem();
        jMenuItem17 = new JMenuItem();
        jMenu10 = new JMenu();
        jMenuItem19 = new JMenuItem();
        jMenuItem20 = new JMenuItem();
        jMenuItem18 = new JMenuItem();
        jMenu7 = new JMenu();
        jMenuItem21 = new JMenuItem();
        jMenuItem22 = new JMenuItem();
        jMenu23 = new JMenu();
        jMenu4.setText("jMenu4");
        jMenu6.setText("jMenu6");
        m10=new JMenu();
        j10=new JMenuItem();
        j12=new JMenuItem();
        j13=new JMenuItem();
        j14=new JMenuItem();
        j15=new JMenuItem();
        j16=new JMenuItem();
        j17=new JMenuItem();
        j18=new JMenuItem();
        j19=new JMenuItem();
        j20=new JMenuItem();
        j90=new JMenu();
        j11= new JMenuItem();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setPreferredSize(new Dimension(600, 492));
        setResizable(false);
        setTitle("GESTOCK");

        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\fond1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 460);

        jMenu1.setText("Compte");

        jMenuItem1.setText("Personnel");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Utilisateur");
        jMenu1.add(jMenuItem2);

        jMenuItem24.setIcon(new javax.swing.ImageIcon("pieces\\home.jpg")); // NOI18N
        jMenuItem24.setText("Deconnection");
        jMenu1.add(jMenuItem24);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pieces detachees");

        jMenuItem3.setText("Ajouter");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Supprimer");
      
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Modifier");
        jMenu2.add(jMenuItem5);

        jMenu8.setText("Informations");

        jMenuItem7.setText("Quantite Vendu");
        jMenu8.add(jMenuItem7);

        jMenuItem8.setText("Stock disponible");
        jMenu8.add(jMenuItem8);

        jMenu2.add(jMenu8);

        jMenuItem6.setText("Vente");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Garnitures");

        jMenuItem9.setText("Ajouter");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Supprimer");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Modifier");
        jMenu3.add(jMenuItem11);

        jMenu9.setText("Informations");

        jMenuItem13.setText("Quantite Vendu");
        jMenu9.add(jMenuItem13);

        jMenuItem14.setText("Stock disponible");
        jMenu9.add(jMenuItem14);

        jMenu3.add(jMenu9);

        jMenuItem12.setText("Vente");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Autres");

        jMenuItem15.setText("Ajouter");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Supprimer");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Modifier");
        
        jMenu5.add(jMenuItem17);

        jMenu10.setText("Informations");

        jMenuItem19.setText("Quantite Vendu");
        jMenu10.add(jMenuItem19);

        jMenuItem20.setText("Stock disponible");
        jMenu10.add(jMenuItem20);

        jMenu5.add(jMenu10);

        jMenuItem18.setText("Vente");
        jMenu5.add(jMenuItem18);

        jMenuBar1.add(jMenu5);
        
        m10.setText("Partenaires");
        j10.setText("Ajouter");
        m10.add(j10);
        j11.setText("Bon");
        m10.add(j11);
        jMenuBar1.add(m10);

        jMenu7.setText("Comptabilte");

        jMenuItem21.setText("Facture");
        jMenu7.add(jMenuItem21);

        jMenuItem22.setText("Depense");
        jMenu7.add(jMenuItem22);
        j12.setText("Journaliere");
        jMenu23.add(j12);
        j13.setText("Hebdomodaire");
        jMenu23.add(j13);
        j15.setText("Mensuelle");
        jMenu23.add(j15);
        j16.setText("Annuelle");
        jMenu23.add(j16);
        

        jMenu23.setText("Resume");
        jMenu7.add(jMenu23);

        jMenuBar1.add(jMenu7);
        
        j17.setText("Journaliere");
        j90.add(j17);
        j18.setText("Hebdomodaire");
        j90.add(j18);
        j19.setText("Mensuelle");
        j90.add(j19);
        j20.setText("Annuelle");
        j90.add(j20);
        j90.setText("Evolution");
        jMenuBar1.add(j90);

        setJMenuBar(jMenuBar1);

        pack();
        
        setLocationRelativeTo(null);
        
   
    }

}
