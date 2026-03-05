package semestre4Proj_01;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;






public class Proj02_06 extends JFrame implements ActionListener {
	
	

	JLabel L1,L2,L3;
	JTextField Tx1;
	JButton B1,B2;
	 JPasswordField Senha;
	

	
	int Vezes = 0;
	


	public Proj02_06() {
	
	JFrame frame = new JFrame("LOGIN");	
	
	
	setResizable(false);
	setSize(600,500);
	setLocation(400,250);
	getContentPane().setBackground(new Color(191,239,255));
	getContentPane().setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	 
	 L1 = new JLabel("LOGIN");
	 L1.setLocation(250,50);
	 L1.setSize(250,30);
	
	 L2 = new JLabel("NOME:");
     L2.setLocation(50,110);
	 L2.setSize(120,30);

     L3 = new JLabel("SENHA:");
	 L3.setLocation(50,150);
	 L3.setSize(120,30);
	 
	
	 Tx1 = new JTextField("");
	 Tx1.setLocation(200,110);
	 Tx1.setSize(140,30);
	 
	 
	 JPasswordField Sx = new JPasswordField();
	 
     this.Senha = Sx ;
     Sx.setEchoChar('*');
     Sx.setLocation(200,150);
     Sx.setSize(140,30);
     Sx.addActionListener(this);
	 
	
	 B1 = new JButton("ENTRAR");
	 B1.setLocation(70,300);
	 B1.setSize(160,50);
	 B1.setBackground(new Color(162,181,205));

	 
	 B2 = new JButton("SAIR");
	 B2.setLocation(340,300);
	 B2.setSize(160,50);
	 B2.addActionListener(this);
	 B2.setBackground(new Color(162,181,205));
	 
	
	 getContentPane().setLayout(null);
	add(L1);
	add(L1);
	add(L2);
	add(L3);
	add(Tx1);
	add(B1);
	add(B2);
	 getContentPane().add(Sx);
	 setVisible(true);
		 
	 ButtonHandler handler = new
			 ButtonHandler();
			 B1.addActionListener(handler);
			 B2.addActionListener(handler);
		

				 }


 public class ButtonHandler implements ActionListener
 
 {
	public void actionPerformed(ActionEvent e) {
		 
			int num;
			String evento=""; 
	        Vezes = Vezes + 1;
			
			
		if (e.getSource() == B2)
				System.exit(0); 

			
	   if(Tx1.getText().equals("cccc") && Senha.getText().equals("123")) {
		   evento = "Senha";
           new Proj02().setVisible(true);
		   JOptionPane.showMessageDialog(null, "Bem Vindo");
		   dispose();  
		   
	   }
	  
	   
	   else 
	   
	   {
		   if(Vezes == 3) 
		   {
		   JOptionPane.showMessageDialog(null, "Acesso Negado");
		   System.exit(0);
		   
		}
           else
	        JOptionPane.showMessageDialog(null,"Senha incorreta.");
        }
		}}


public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}}



 



 
