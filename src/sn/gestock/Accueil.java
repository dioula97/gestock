package sn.gestock;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Accueil extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 943169218783356979L;
	private JLabel label,label1,login,mdp,label2,label3,label4;
	private JTextField login1;
	private JPasswordField mdp1;
	private JButton valider;
	private JPanel pan,pan1,pan2;
	private Separator trait;

	
	public String login2 ="";
	
//	Frame[] fen = Accueil.getFrames();
	
	public String mdp2="";
	
	public Accueil(){
		
		pan = new JPanel();
		pan.setLayout(null);
		pan.setBackground(new Color(242, 255, 250));
        pan.setBounds(0, 0, 660, 400);
        
		
		
		label = new JLabel("LOGO");
//		label.setIcon(new ImageIcon("logo.jpg"));
		label.setBounds(1, 1, 50, 50);
		pan.add(label);
		
		label1 = new JLabel("Bienvenue sur GESTOCK TPG");
		label1.setFont(new Font("Tahoma", 1, 16));
		label1.setBounds(100, 1, 300, 50);
		pan.add(label1);
		
		label2 = new JLabel("Application de Gestion de Stock");
		label2.setFont(new Font("Tahoma", 1, 18));
		label2.setForeground(Color.blue);
		label2.setBounds(100, 40, 400, 50);
		pan.add(label2);
		
		trait = new Separator();
		trait.setForeground(Color.blue);
		trait.setBounds(1, 95, 550, 10);
		pan.add(trait);
		
		label3 = new JLabel("Authentification");
		label3.setFont(new Font("Tahoma", 1, 13));
		label3.setBounds(5, 110, 300, 50);
		pan.add(label3);
		

		label4 = new JLabel("Veuillez saisir votre identifiant et votre mot de passe pour se connecter à l'application");
		label4.setFont(new Font("Tahoma", 1, 13));
		label4.setBounds(5, 140, 650, 50);
		pan.add(label4);
		
		pan1 = new JPanel();
		pan1.setLayout(null);
		pan1.setBackground(Color.PINK);
        pan1.setBounds(120, 230, 300, 130);
        pan.add(pan1);
		
		
        login = new JLabel("Identifiant");
        login.setFont(new Font("Tahoma", 1, 14));
        login.setForeground(Color.BLACK);
        login.setBounds(2, 10, 120, 20);
        pan1.add(login);
        
        login1 = new JTextField();
        login1.setBounds(130, 10, 110, 20);
        pan1.add(login1);
        
		mdp = new JLabel("Mot de passe");
		mdp.setFont(new Font("Tahoma", 1, 14));
		mdp.setForeground(Color.BLACK);
		mdp.setBounds(2, 50, 120, 20);
		pan1.add(mdp);
		
		mdp1 = new JPasswordField();
		mdp1.setBounds(130, 50, 110, 20);
		pan1.add(mdp1);
		
		
		valider = new JButton("Valider");
        valider.setForeground(Color.BLACK);
        valider.setFont(new Font("Tahoma", 1, 13)); // NOI18N
        valider.setText("Valider");
        pan1.add(valider);
        valider.setBounds(100, 90, 90, 20);
        
        pan2 = new JPanel();
        pan2.setLayout(null);
		pan2.setBackground(Color.blue);
        pan2.setBounds(0, 400, 660, 100);
        this.getContentPane().add(pan2);
        
       
		
		this.setTitle("Gestock TGP");
		this.setPreferredSize(new Dimension(660, 500));
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(pan);
		this.setLocationRelativeTo(null);
		
		valider.addActionListener(new access());
        
       

         pack();
	}
	
	
	
	
	
	class access implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			 try {
			Connection con = Connexion.Connecter();
			
            	Statement a = con.createStatement();
                ResultSet b = a.executeQuery("SELECT * FROM connection where Identifiant='"+1+"'");
				b.first();
				login2 = b.getString("Login");
				mdp2 = b.getString("Password");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			 if (login1.getText().equals(login2) && mdp1.getText().equals(mdp2)) {
				 
				 
				
				 JOptionPane jop1 = new JOptionPane();
                 JOptionPane.showMessageDialog(null, "Bienvenue", "Acces",JOptionPane.INFORMATION_MESSAGE);
                 jop1.setVisible(true); 
				 
				
			}
			 else {
				 JOptionPane jop1 = new JOptionPane();
                 JOptionPane.showMessageDialog(null, "Informations Eronnées", "Acces Denied",JOptionPane.ERROR_MESSAGE);
                 jop1.setVisible(true); 
				
			}
		
			
		}
		
	}
	static class Connexion{
		public static Connection Connecter() {
			Connection con = null ;
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            String url= "jdbc:mysql://localhost:3306/gestock";
            
            String user="root"; 
            
            String pass="test";
            
            try {
				 con =DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            System.out.println("Connection bien etablie");
			return con;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accueil accueil = new Accueil();
		accueil.setVisible(true);

		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

	}

}
