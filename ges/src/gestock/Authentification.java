/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestock;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author KINGBOURY
 */
public class Authentification extends JFrame{
      private javax.swing.JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPasswordField jPasswordField1;
    private JSeparator jSeparator2;
    private JTextField jTextField1;
    
    public Authentification(){
    
        initComponents();
 
    
    }
     private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jLabel7 = new JLabel();
        jLabel6 = new JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new JSeparator();
        jPanel3 = new JPanel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);
        setPreferredSize(new Dimension(730, 635));
        setResizable(false);
        setTitle("GESTOCK");


        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(null);
       
        jLabel1.setIcon(new javax.swing.ImageIcon("pieces\\logo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Application de Gestion de Stock");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 60, 310, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIENVENUE SUR GESTOCK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 10, 350, 29);
       
        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Identiiant");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(170, 90, 70, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mot de Passe");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(150, 140, 100, 16);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(250, 90, 160, 22);
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(250, 140, 160, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon("pieces\\authe.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(300, 10, 50, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon("pieces\\util.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 60, 100, 100);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Valider");
        jPanel2.add(jButton1);
        jButton1.setBounds(320, 190, 90, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(110, 170, 470, 240);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 102, 730, 10);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Derniere mise a jour 24 avril 2018");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 10, 230, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Technologie JAVA");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 36, 130, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Version1.0");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 70, 80, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Developpée par:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(400, 10, 130, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amad Said NDIAYE");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(530, 10, 130, 16);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Diadioula BAL");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(530, 40, 90, 16);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Elhadji Babacar DIALLO");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(530, 70, 160, 16);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 490, 690, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 600);

        pack();
        
         setLocationRelativeTo(null);
         
         jButton1.addActionListener(new Acces());
         
            jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        
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
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }
    class Acces implements ActionListener{
    
            public void actionPerformed(ActionEvent e){
                
                String s= "Administrateur";
                
                String log="";
                
                String pass="";
                
          
                
               try{

                Class.forName("com.mysql.jdbc.Driver");
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
            
                java.sql.Connection c1 =DriverManager.getConnection(url, user, pass1);
            
                Statement a = c1.createStatement();
                 
                ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Travail='"+s+"'");
                
                b.first();
                 
                log=b.getString("Login");
                 
                pass=b.getString("Password");
          
               }catch(Exception el){
               el.printStackTrace();
               
               }
               
                    if(jTextField1.getText().equals(log) && jPasswordField1.getText().equals(pass)){
                    
                        setVisible(false);
                        
                        pageadmin page = new pageadmin();
                        
                        page.setVisible(true);
                        
                        JOptionPane po = new JOptionPane();
                        po.showMessageDialog(null,"Bienvenue","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        
                         jPasswordField1.setText("");
                       jTextField1.setText("");
               
                        
                        log="";
                        
                        pass="";
                   
                    }
                    
                    else{
                    
                        
               try{

                Class.forName("com.mysql.jdbc.Driver");
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
                
                String tr="";
            
                java.sql.Connection c1 =DriverManager.getConnection(url, user, pass1);
            
                Statement a = c1.createStatement();
                 
                ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Login='"+jTextField1.getText()+"'");
                
                b.first();
                 
                log=b.getString("Login");
                 
                pass=b.getString("Password");
//          
               }catch(Exception el){
              
               
               }
               
               if(jTextField1.getText().equals(log) && jPasswordField1.getText().equals(pass)){
                    
                        setVisible(false);
                        
                        pagesec pag = new pagesec();
                        
                        pag.setVisible(true);
                        
                        log="";
                        
                        pass="";
                        
                        
                       JOptionPane.showMessageDialog(null,"Bienvenue","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        jPasswordField1.setText("");
                       jTextField1.setText("");
               
                   
               }
               else{
               
                   
                       JOptionPane.showMessageDialog(null,"Informations incorrectes","Confirmation",JOptionPane.ERROR_MESSAGE);
                       
                       jPasswordField1.setText("");
                       jTextField1.setText("");
               
               }
                    
                    
             }
                  
                    
                    
               
             
            }
            
    }
    
               private void   jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
                   if((evt.getKeyCode()==10 || evt.getKeyCode()==13) && jPasswordField1.getText().isEmpty()==false){
                   
                          
                String s= "Administrateur";
                
                String log="";
                
                String pass="";
                
               try{

                Class.forName("com.mysql.jdbc.Driver");
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
            
                java.sql.Connection c1 =DriverManager.getConnection(url, user, pass1);
            
                Statement a = c1.createStatement();
                 
                ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Travail='"+s+"'");
                
                b.first();
                 
                log=b.getString("Login");
                 
                pass=b.getString("Password");
          
               }catch(Exception el){
               
               }
               
                    if(jTextField1.getText().equals(log) && jPasswordField1.getText().equals(pass)){
                    
                        setVisible(false);
                        
                        pageadmin page = new pageadmin();
                        
                        page.setVisible(true);
                        
                    
                        JOptionPane.showMessageDialog(null,"Bienvenue","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        
                         jPasswordField1.setText("");
                       jTextField1.setText("");
               
                        
                        log="";
                        
                        pass="";
                   
                    }
                    
                    else{
                    
                        
               try{

                Class.forName("com.mysql.jdbc.Driver");
                
                String url= "jdbc:mysql://localhost:3306/gestion";
            
                String user="root"; 
            
                String pass1="";
                
                String tr="";
            
                java.sql.Connection c1 =DriverManager.getConnection(url, user, pass1);
            
                Statement a = c1.createStatement();
                 
                ResultSet b = a.executeQuery("SELECT * FROM connection WHERE Login='"+jTextField1.getText()+"'");
                
                b.first();
                 
                log=b.getString("Login");
                 
                pass=b.getString("Password");
//          
               }catch(Exception el){
              
               
               }
               
               if(jTextField1.getText().equals(log) && jPasswordField1.getText().equals(pass)){
                    
                        setVisible(false);
                        
                        pagesec pag = new pagesec();
                        
                        pag.setVisible(true);
                        
                         jPasswordField1.setText("");
                       jTextField1.setText("");
               
                        
                        log="";
                        
                        pass="";
                        
                        
                       JOptionPane.showMessageDialog(null,"Bienvenue","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                   
               }
               else{
               
                   
                       JOptionPane.showMessageDialog(null,"Informations incorrectes","Confirmation",JOptionPane.ERROR_MESSAGE);
                       jPasswordField1.setText("");
                       jTextField1.setText("");
               
               
               }
                    
                    
             }
                   
                   
                   }
                       
                 }      

    
}
