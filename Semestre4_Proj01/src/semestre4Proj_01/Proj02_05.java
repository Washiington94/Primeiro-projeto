package semestre4Proj_01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;




public class Proj02_05 extends JFrame {
	
	
	
	
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12;
	JTextField Identi_Prof,Nome_Professor,End_Prof,data,c_Numero_End,c_Bairro,c_Cidade,c_Estado,c_Telprof;
	JCheckBox Cb1,Cb2,Cb3,Cb4,Cb5,Cb6,Cb7,Cb8;
	JButton B1,B2,B3,B4;
	ButtonGroup Ab,Ab2;
	
	
	
	String cadastro[] = new String[100];

	public Proj02_05() {
		
		
		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(600,500);
		setLocation(400,250);
		getContentPane().setBackground(new Color(191,239,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		Cb1 = new JCheckBox("Direito",false);
		Cb1.setLocation(380,130);
		Cb1.setSize(80,30);
		Cb1.setBackground(new Color(191,239,255));
		
		
		
		Cb2 = new JCheckBox("Informatica",false);
		Cb2.setLocation(380,150);
		Cb2.setSize(100,30);
		Cb2.setBackground(new Color(191,239,255));
		
		
		Cb3 = new JCheckBox("Matematica",false);
		Cb3.setLocation(380,170);
		Cb3.setSize(100,30);
		Cb3.setBackground(new Color(191,239,255));
	
		Cb4 = new JCheckBox("Medicina",false);
		Cb4.setLocation(380,190);
		Cb4.setSize(80,30);
		Cb4.setBackground(new Color(191,239,255));
		
		Cb5 = new JCheckBox("Bacharel",false);
		Cb5.setLocation(380,260);
		Cb5.setSize(80,30);
		Cb5.setBackground(new Color(191,239,255));
		
		Cb6 = new JCheckBox("Especialista Lato Sensu",false);
		Cb6.setLocation(380,280);
		Cb6.setSize(170,30);
		Cb6.setBackground(new Color(191,239,255));
		
		Cb7 = new JCheckBox("Mestrado",false);
		Cb7.setLocation(380,300);
		Cb7.setSize(80,30);
		Cb7.setBackground(new Color(191,239,255));
		
		Cb8 = new JCheckBox("Doutorado",false);
		Cb8.setLocation(380,320);
		Cb8.setSize(100,30);
		Cb8.setBackground(new Color(191,239,255));
		
		 Ab = new ButtonGroup();
	     Ab.add(Cb1);
	     Ab.add(Cb2);
	     Ab.add(Cb3);
	     Ab.add(Cb4);
	     
	     Ab2 = new ButtonGroup();
	     Ab2.add(Cb5);
	     Ab2.add(Cb6);
	     Ab2.add(Cb7);
	     Ab2.add(Cb8);
	  
		
		B1 = new JButton("INCLUIR");
		B1.setLocation(20,400);
		B1.setSize(130,50);
		B1.setBackground(new Color(162,181,205));
	
		B2 = new JButton("LIMPAR");
		B2.setLocation(160,400);
		B2.setSize(130,50);
		B2.setBackground(new Color(162,181,205));
	
		B3 = new JButton("SAIR");
		B3.setLocation(440,400);
		B3.setSize(130,50);
		B3.setBackground(new Color(162,181,205));
		
		B4 = new JButton("ALTERAR");
		B4.setLocation(300,400);
		B4.setSize(130,50);
		B4.setBackground(new Color(162,181,205));
		
		L1 = new JLabel("CADASTRAMENTO DOS CURSOS");
		L1.setLocation(200,50);
		L1.setSize(250,30);
		
		L2 = new JLabel("IdentProf:");
		L2.setLocation(40,110);
		L2.setSize(120,30);
		
		L3 = new JLabel("Nome do Professor:");
		L3.setLocation(40,150);
		L3.setSize(120,30);
		
		L4 = new JLabel("Endereço.do Prof(Rua/Av):");
		L4.setLocation(40,190);
		L4.setSize(150,30);
		
		L5 = new JLabel("Numero:");
		L5.setLocation(40,230);
		L5.setSize(120,30);
		
		L6 = new JLabel("Bairro:");
		L6.setLocation(40,270);
		L6.setSize(45,30);
		
		L7 = new JLabel("Cidade:");
		L7.setLocation(40,310);
		L7.setSize(45,30);
		
		L8 = new JLabel("Estado:");
		L8.setLocation(240,270);
		L8.setSize(45,30);
		
		L9 = new JLabel("Tel(Fixo/Cel):");
		L9.setLocation(175,310);
		L9.setSize(140,30);
		
		L10 = new JLabel("Data de Nascimento:");
		L10.setLocation(40,350);
		L10.setSize(120,30);
		
		L11 = new JLabel("Especificação do Professor");
		L11.setLocation(380,110);
		L11.setSize(160,30);
		
		L12 = new JLabel("Titulo do Professor");
		L12.setLocation(380,230);
		L12.setSize(160,30);
		
		Identi_Prof = new JTextField("");
		Identi_Prof.setLocation(200,110);
		Identi_Prof.setSize(140,25);
		
		Nome_Professor = new JTextField("");
		Nome_Professor.setLocation(200,150);
		Nome_Professor.setSize(140,25);
		
		End_Prof = new JTextField("");
		End_Prof.setLocation(200,190);
		End_Prof.setSize(140,25);
		
		c_Numero_End = new JTextField("");
		c_Numero_End.setLocation(200,230);
		c_Numero_End.setSize(140,25);
		
		c_Bairro = new JTextField("");
		c_Bairro.setLocation(90,270);
		c_Bairro.setSize(140,25);
		
		c_Estado = new JTextField("");
		c_Estado.setLocation(90,310);
		c_Estado.setSize(80,25);
		
		c_Cidade = new JTextField("");
		c_Cidade.setLocation(290,270);
		c_Cidade.setSize(50,25);
		
		c_Telprof = new JTextField("");
		c_Telprof.setLocation(250,310);
		c_Telprof.setSize(90,25);
	
		data = new JTextField("");
		data.setLocation(200,350);
		data.setSize(140,25);
		
		
		getContentPane().setLayout(null);
		getContentPane().add(L1);
		getContentPane().add(L2);
		getContentPane().add(L3);
		getContentPane().add(L4);
		getContentPane().add(L5);
		getContentPane().add(L6);
		getContentPane().add(L7);
		getContentPane().add(L8);
		getContentPane().add(L9);
		getContentPane().add(L10);
		getContentPane().add(L11);
		getContentPane().add(L12);
		getContentPane().add(Identi_Prof);
		getContentPane().add(Nome_Professor);
		getContentPane().add(End_Prof);
		getContentPane().add(c_Numero_End);
		getContentPane().add(c_Bairro);
		getContentPane().add(c_Cidade);
		getContentPane().add(c_Estado);
		getContentPane().add(c_Telprof);
		getContentPane().add(data);
		getContentPane().add(Cb1);
		getContentPane().add(Cb2);
		getContentPane().add(Cb3);
		getContentPane().add(Cb4);
		getContentPane().add(Cb5);
		getContentPane().add(Cb6);
		getContentPane().add(Cb7);
		getContentPane().add(Cb8);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
		getContentPane().add(B4);
		

		
		 ButtonHandler handler = new ButtonHandler();
				 
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
				
			if (e.getActionCommand().equals("INCLUIR"))
			{
				
		try
		{
		
		
			
		  int Ident_Prof = Integer.parseInt(Identi_Prof.getText());
		  String Nome_Prof = Nome_Professor.getText();
		  String Endereco_Prof = End_Prof.getText();
		  String Data_nasc = "2023-10-28";
		  String Numero_End = c_Numero_End.getText();
		  String Bairro = c_Bairro.getText();
		  String Cidade = c_Cidade.getText();
		  String Estado = c_Estado.getText();
		  String Telprof = c_Telprof.getText();;
		  String Espec_Prof = "";
		  String Titulo_Prof = "";
		  
		  
		  if (Cb1 != null) 
			  {
		  if  (Cb1.isSelected()) 
          
			  Espec_Prof = "Direito";
          } 
           if (Cb2 != null)
        	   if (Cb2.isSelected())
          {
        	  Espec_Prof = "Informatica";
          } 
           if (Cb3 != null)
        	  if (Cb3.isSelected()) 
          {
        	  Espec_Prof = "Matematica";
          } 
           if (Cb4 != null)
        	   if (Cb4.isSelected()) 
          {
        	  Espec_Prof = "Medicina";
          } 
           if (Cb5 != null)
        	   if (Cb5.isSelected()) 
          {
        	  Titulo_Prof = "Bacharel";
          } 
           if (Cb6 != null)
        	   if (Cb6.isSelected()) 
          {
        	  Titulo_Prof = "Esp_LatoSensu";
          }
           if (Cb7 != null)
        	   if (Cb7.isSelected()) 
          {
        	  Titulo_Prof = "Mestrado";
          }
           if (Cb8 != null) 
        	  if (Cb8.isSelected()) 
          {
        	  Titulo_Prof = "Doutorado";
          }
          
          
        	 
  
         
			  
		  
		
				 Connection conexao = Proj02_07.getConnection();
				 
				 PreparedStatement stmt = conexao.prepareStatement("CALL cad_professor(?,?,?,?,?,?,?,?,?,?,?)");
				 stmt.setInt(1,Ident_Prof);
				 stmt.setString(2,Nome_Prof);
				 stmt.setString(3,Endereco_Prof);
				 stmt.setString(4,Data_nasc);
				 stmt.setString(5,Numero_End);
				 stmt.setString(6,Bairro);
				 stmt.setString(7,Cidade);
				 stmt.setString(8,Estado);
				 stmt.setString(9,Telprof);
				 stmt.setString(10,Espec_Prof);
				 stmt.setString(11,Titulo_Prof);
			
				 
				 stmt.executeUpdate();

				 JOptionPane.showMessageDialog(null,"Dados cadastrado com sucesso");
				
				 conexao.close();
           
		}
		
		
		
		catch (SQLException | NumberFormatException ex)
			{
			ex.printStackTrace();
                 }     
			}
			
			 else if (e.getActionCommand().equals("LIMPAR")) 
			 {
				 Identi_Prof.setText("");
				 Nome_Professor.setText("");
				 End_Prof.setText("");
				 data.setText("");
				 c_Numero_End.setText("");
				 c_Bairro.setText("");
				 c_Cidade.setText("");
				 c_Estado.setText("");
				 c_Telprof.setText("");
				 Ab.clearSelection();
				 Ab2.clearSelection();
			 }
		
			 
			 else if (e.getActionCommand() == "SAIR")
			 {
				 dispose(); 
			}
			}
	 }
	 }
			 
