package semestre4Proj_01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Proj02_03 extends JFrame {
	
	JLabel L1,L2,L3,L4,L5;
	JRadioButton Rb1,Rb2,Rb3,Rb4,Rb5,Rb6;
	JButton B1,B2,B3;
	JTextField Tx1,Tx2,Tx3;
	String cadastro[] = new String[100];
	{
	}
	
	public Proj02_03() {
		
		
		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		getContentPane().setBackground(new Color(191,239,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
	
		Rb1 = new JRadioButton("1",false);
		Rb1.setLocation(50,260);
		Rb1.setSize(40,30);
		Rb1.setBackground(new Color(191,239,255));
		
		
		Rb2 = new JRadioButton("2",false);
		Rb2.setLocation(90,260);
		Rb2.setSize(40,30);
		Rb2.setBackground(new Color(191,239,255));
		
		
		Rb3 = new JRadioButton("3",false);
		Rb3.setLocation(130,260);
		Rb3.setSize(40,30);
		Rb3.setBackground(new Color(191,239,255));
		
	
		Rb4 = new JRadioButton("4",false);
		Rb4.setLocation(170,260);
		Rb4.setSize(40,30);
		Rb4.setBackground(new Color(191,239,255));
		
		
		
		Rb5 = new JRadioButton("5",false);
		Rb5.setLocation(210,260);
		Rb5.setSize(40,30);
		Rb5.setBackground(new Color(191,239,255));
		
		Rb6 = new JRadioButton("6",false);
		Rb6.setLocation(250,260);
		Rb6.setSize(40,30);
		Rb6.setBackground(new Color(191,239,255));
		
		L1 = new JLabel("CADASTRAMENTO DOS CURSOS");
		L1.setLocation(200,50);
		L1.setSize(250,30);
		
		L2 = new JLabel("Codigo Disciplina:");
		L2.setLocation(50,110);
		L2.setSize(120,30);
		
		L3 = new JLabel("Nome Disciplina:");
		L3.setLocation(50,150);
		L3.setSize(120,30);
		
		L4 = new JLabel("Carga Horária");
		L4.setLocation(50,190);
		L4.setSize(120,30);
		
		L5 = new JLabel("Aulas por Semana");
		L5.setLocation(50,230);
		L5.setSize(120,30);
		
		Tx1 = new JTextField("");
		Tx1.setLocation(200,110);
		Tx1.setSize(140,30);
		
		Tx2 = new JTextField("");
		Tx2.setLocation(200,150);
		Tx2.setSize(140,30);
		
		Tx3 = new JTextField("");
		Tx3.setLocation(200,190);
		Tx3.setSize(140,30);
		
		
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
		
		
		

	add(L1);
	add(L2);
	add(L3);
	add(L4);
	add(L5);
	add(Tx1);
	add(Tx2);
	add(Tx3);
	add(Rb1);
	add(Rb2);
	add(Rb3);
	add(Rb4);
	add(Rb5);
	add(Rb6);
	add(B1);
	add(B2);
	add(B3);
	add(Rb1);
	add(Rb2);
	add(Rb3);
	add(Rb4);
	add(Rb5);
	add(Rb6);
	
	 ButtonHandler handler = new
			 ButtonHandler();
			 B1.addActionListener(handler);
			 B2.addActionListener(handler);
			 B3.addActionListener(handler);
			}
	public boolean handleEvent(Event e)
	{
       if (e.id == Event.WINDOW_DESTROY) 
    	   dispose();           
       return (super.handleEvent(e));    
       }
	
	 public class ButtonHandler implements ActionListener
	 {
			public void actionPerformed(ActionEvent e) {
				
			
					if (e.getActionCommand() == "SAIR")
						dispose(); 
				
	
}}}
