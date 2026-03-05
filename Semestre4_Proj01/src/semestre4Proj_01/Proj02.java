package semestre4Proj_01;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class Proj02 extends JFrame implements ActionListener {
	
private Connection conexao;
	
	JMenuBar bmenu; 
	JMenu menu1,menu2,menu3,menu4;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13;
	JButton B1;
	int vezes = 0;
	
	
	
public Proj02() {
	




	JFrame frame = new JFrame("");	
	
	setResizable(false);
	setSize(600,500);
	setLocation(400,250);
	getContentPane().setBackground(new Color(191,239,255));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	

	JMenu menu1 = new JMenu("Cadastro");
	
	
	menu1.add(m1 = new JMenuItem("Curso"));
	m1.addActionListener(this);
	menu1.add(m2 = new JMenuItem("Disciplina"));
	m2.addActionListener(this);
	menu1.add(m3 = new JMenuItem("Aluno"));
	m3.addActionListener(this);
	menu1.add(m4 = new JMenuItem("Professor"));
	m4.addActionListener(this);

	menu1.add(m1);
	menu1.add(m2);
	menu1.add(m3);
	menu1.add(m4);
	
	
	JMenu menu2 = new JMenu("Mostrar");
	
	menu2.add(m5 = new JMenuItem("Cursos"));
	m5.addActionListener(this);
	menu2.add(m6 = new JMenuItem("Disciplina"));
	m6.addActionListener(this);
	menu2.add(m7 = new JMenuItem("Aluno"));
	m7.addActionListener(this);
	menu2.add(m8 = new JMenuItem("Professores"));
	m8.addActionListener(this);
	menu2.add(m9 = new JMenuItem("Cursos/Professores"));
	m9.addActionListener(this);
	menu2.add(m10 = new JMenuItem("Cursos/Disciplinas"));
	m10.addActionListener(this);
	menu2.add(m11 = new JMenuItem("Professores/Disciplinas"));
	m11.addActionListener(this);
	

	
	
	menu2.add(m5);
	menu2.add(m6);
	menu2.add(m7);
	menu2.add(m8);
	
	menu2.add(m9);
	menu2.add(m10);
	menu2.add(m11);
	

	
	JMenu menu3 = new JMenu("SAIR");
	
	menu3.add(m12 = new JMenuItem("SAIR"));
	m12.addActionListener(this);
	
	menu3.add(m12);
	
	

	
	
	bmenu = new JMenuBar();
	bmenu.add(menu1);
	bmenu.add(menu2);
	bmenu.add(menu3);
	
	
	
	setJMenuBar(bmenu);
	

	
	}
	



public void actionPerformed(ActionEvent e) {


	int Num;
	String evento="";
	
	if(e.getActionCommand() == "SAIR") 
		dispose();

	
	else
		
	{	
		
	 if ( e.getSource() == m1 )
		{	
		evento = "Curso";
		new Proj02_02().setVisible(true);
		}
		else if (e.getSource() == m2)
	 	{ 	
		evento = "Disciplina";
		new Proj02_03().setVisible(true);
	 	}
		else if (e.getSource() == m3)
		{	
		evento = "Aluno";
		new Proj02_04().setVisible(true);
		}
		else if (e.getSource() == m4)
		{	
		evento = "Professor";
		new Proj02_05().setVisible(true);
		}
		else if (e.getSource() == m8)
		{	
		evento = "Professores";
		new Proj02_08().setVisible(true);
		}
		}
	}
}
