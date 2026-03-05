package semestre4Proj_01;
import javax.swing.*;
import semestre4.exercicio04_04.ButtonHandler;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Proj02_04 extends JFrame {
	
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12;
	JTextField Tx1,Tx2,Tx3,Tx4,Tx5,Tx6,Tx7,Tx8,Tx9,Tx10;
	List Li;
	JButton B1,B2,B3;
	
	String cadastro[] = new String[100];
	{
	}
	
	
	public Proj02_04() {
		
		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		getContentPane().setBackground(new Color(191,239,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		Li = new List(5,false);
		Li.setLocation(370,140);
		Li.setSize(200,170);
		
		L1 = new JLabel("CADASTRAMENTO DOS CURSOS");
		L1.setLocation(200,50);
		L1.setSize(250,30);
		
		L2 = new JLabel("Matricula:");
		L2.setLocation(40,110);
		L2.setSize(80,30);
		
		L3 = new JLabel("Nome:");
		L3.setLocation(40,150);
		L3.setSize(50,30);
		
		L4 = new JLabel("Data Nascimento:");
		L4.setLocation(40,190);
		L4.setSize(100,30);
		
		L5 = new JLabel("Codigo do Curso:");
		L5.setLocation(40,230);
		L5.setSize(100,30);

		L6 = new JLabel("Nome do Curso:");
		L6.setLocation(40,270);
		L6.setSize(100,30);
		
		L7 = new JLabel("Nota NP1:");
		L7.setLocation(40,310);
		L7.setSize(65,30);
		
		L8 = new JLabel("Nota NP2:");
		L8.setLocation(160,310);
		L8.setSize(65,30);
		
		L9 = new JLabel("Média:");
		L9.setLocation(40,350);
		L9.setSize(50,30);
		
		L10 = new JLabel("Faltas:");
		L10.setLocation(160,350);
		L10.setSize(50,30);
		
		L11 = new JLabel("Cod.Disciplina");
		L11.setLocation(370,110);
		L11.setSize(100,30);
		
		L12 = new JLabel("Nome Disciplina");
		L12.setLocation(480,110);
		L12.setSize(140,30);
		
		

		
		Tx2 = new JTextField("");
		Tx2.setLocation(110,110);
		Tx2.setSize(70,25);
		

		Tx3 = new JTextField("");
		Tx3.setLocation(100,150);
		Tx3.setSize(200,25);
		

		Tx4 = new JTextField("");
		Tx4.setLocation(150,190);
		Tx4.setSize(70,25);
		

		Tx5 = new JTextField("");
		Tx5.setLocation(150,230);
		Tx5.setSize(70,25);
		

		Tx6 = new JTextField("");
		Tx6.setLocation(150,270);
		Tx6.setSize(150,25);
		
		Tx7 = new JTextField("");
		Tx7.setLocation(110,310);
		Tx7.setSize(40,25);
		
		Tx8 = new JTextField("");
		Tx8.setLocation(230,310);
		Tx8.setSize(40,25);
		
		Tx9 = new JTextField("");
		Tx9.setLocation(110,350);
		Tx9.setSize(40,25);
		
		Tx10 = new JTextField("");
		Tx10.setLocation(230,350);
		Tx10.setSize(40,25);
		
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
		add(L6);
		add(L7);
		add(L8);
		add(L9);
		add(L10);
		add(L11);
		add(L12);
		add(B1);
		add(B2);
		add(B3);
		
		add(Tx2);
		add(Tx3);
		add(Tx4);
		add(Tx5);
		add(Tx6);
		add(Tx7);
		add(Tx8);
		add(Tx9);
		add(Tx10);
		add(Li);
		
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
			public void actionPerformed(ActionEvent e) 
			{
			
				int Num;
				 String praia,distancia,avaliacao;

				if (e.getActionCommand() == "SAIR")
					dispose(); 
			
			}
	

}}
