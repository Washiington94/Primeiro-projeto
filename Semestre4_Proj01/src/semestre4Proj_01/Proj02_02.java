package semestre4Proj_01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Proj02_02 extends JFrame {
	
	
	JLabel L1,L2,L3,L4,L5,L6;
	JTextField Tx1,Tx2,Tx3;
	JButton B1,B2,B3,B4;
	List Li;
	Choice Ch;
	JRadioButton Rb1,Rb2,Rb3;
	
	
	
	String cadastro[] = new String[100];
	{
		
	}
	public Proj02_02() {
	
		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		getContentPane().setBackground(new Color(191,239,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		Li = new List(5,false);
		Li.setLocation(370,140);
		Li.setSize(200,130);
		Li.addItem("Administração de Empresas");
		Li.addItem("Bio Medicina");
		Li.addItem("Ciências Biologicas");
		Li.addItem("Ciência da Computação");
		Li.addItem("Direito");
		Li.addItem("Educação Física");
		Li.addItem("Farmacologia");
		Li.addItem("Rede de Computadores");
		Li.addItem("Sistema de Informações");
		
	    Ch = new Choice();
		Ch.setLocation(370,140);
		Ch.setSize(200,240);
	    Ch.addItem("Administração de Empresas");
	    Ch.addItem("Bio Medicina");
	    Ch.addItem("Ciências Biologicas");
	    Ch.addItem("Ciência da Computação");
	    Ch.addItem("Direito");
	    Ch.addItem("Educação Física");
	    Ch.addItem("Farmacologia");
	    Ch.addItem("Rede de Computadores");
	    Ch.addItem("Sistema de Informações");
	    
		
		Rb1 = new JRadioButton("Bacharel",false);
		Rb1.setLocation(50,260);
		Rb1.setSize(80,30);
		Rb1.setBackground(new Color(191,239,255));
		
		
		
		Rb2 = new JRadioButton("Gestão",false);
		Rb2.setLocation(50,280);
		Rb2.setSize(80,30);
		Rb2.setBackground(new Color(191,239,255));
		
		
		
		Rb3 = new JRadioButton("Outros",false);
		Rb3.setLocation(50,300);
		Rb3.setSize(80,30);
		Rb3.setBackground(new Color(191,239,255));
		
	
		B1 = new JButton("INCLUIR");
		B1.setLocation(70,400);
		B1.setSize(130,50);
		B1.setBackground(new Color(162,181,205));
	
		B2 = new JButton("LIMPAR");
		B2.setLocation(220,400);
		B2.setSize(130,50);
		B2.setBackground(new Color(162,181,205));
	
		B3 = new JButton("SAIR");
		B3.setLocation(370,400);
		B3.setSize(130,50);
		B3.setBackground(new Color(162,181,205));
		
		B4 = new JButton("TEMA");
		B4.setLocation(450,50);
		B4.setSize(80,20);
		B4.setBackground(new Color(162,181,205));
		
	
		Tx1 = new JTextField("");
		Tx1.setLocation(200,110);
		Tx1.setSize(140,30);
	
		Tx2 = new JTextField("");
		Tx2.setLocation(200,150);
		Tx2.setSize(140,30);
	
		Tx3 = new JTextField("");
		Tx3.setLocation(200,190);
		Tx3.setSize(140,30);
		
		L1 = new JLabel("CADASTRAMENTO DOS CURSOS");
		L1.setLocation(200,50);
		L1.setSize(200,30);
	
		L2 = new JLabel("Codigo do Curso:");
		L2.setLocation(50,110);
		L2.setSize(120,30);

		L3 = new JLabel("Carga Horaria:");
		L3.setLocation(50,150);
		L3.setSize(120,30);
	
		L4 = new JLabel("Codigo do instituto:");
		L4.setLocation(50,190);
		L4.setSize(120,30);
	
		L5 = new JLabel("Tipo do Curso:");
		L5.setLocation(50,230);
		L5.setSize(120,30);
	
		L6 = new JLabel("Nome Do Curso");
		L6.setLocation(390,110);
		L6.setSize(120,30);
	
	
		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(L5);
		add(L6);
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		add(Tx1);
		add(Tx2);
		add(Tx3);
		add(Li);
		add(Ch);
		add(Rb1);
		add(Rb2);
		add(Rb3);
	
		
		
		 ButtonHandler handler = new
				 ButtonHandler();
				 B1.addActionListener(handler);
				 B2.addActionListener(handler);
				 B3.addActionListener(handler);
				 B4.addActionListener(handler);
				
				}
	
	 public class ButtonHandler implements ActionListener
	 {
			public void actionPerformed(ActionEvent e) {
			
				
			
				
				int Num;
				 String praia,distancia,avaliacao;
				
				
				
				if (e.getActionCommand() == "SAIR") 
					dispose(); 
					
				else 
				
						if (e.getActionCommand() == "TEMA") {
							
							  Color corAtual = B4.getBackground();
							   Color NovaCor = JColorChooser.showDialog(Proj02_02.this, "Escolha a cor", corAtual);
							   getContentPane().setBackground(NovaCor);

							}
		    }
	
}
	 }
