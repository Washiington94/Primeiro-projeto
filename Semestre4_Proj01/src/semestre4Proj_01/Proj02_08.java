package semestre4Proj_01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Proj02_08 extends JFrame {
    JLabel L1, L2;
    JButton B1, B2, B3;
    JTextField Tx1;
    JTable table;
    DefaultTableModel tableModel;

    public Proj02_08() {
        setTitle("Sistema de Controle Acadêmico");
        setResizable(false);
        setSize(1100, 500);
        setLocation(500, 290);
        getContentPane().setBackground(new Color(191, 239, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Ident_Prof");
        tableModel.addColumn("Nome_Prof");
        tableModel.addColumn("Endereco_Prof");
	    tableModel.addColumn("Data_nasc");
	    tableModel.addColumn("Numero_End");
	    tableModel.addColumn("Bairro");
	    tableModel.addColumn("Cidade");
	    tableModel.addColumn("Estado");
	    tableModel.addColumn("TelProf");
	    tableModel.addColumn("Espec_Prof");
	    tableModel.addColumn("Titulo_Prof");

        // Adicione mais colunas conforme necessário

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(40, 130, 1000, 250);
        add(scrollPane);

        L1 = new JLabel("PESQUISAR DADOS");
		L1.setLocation(400,30);
		L1.setSize(300,30);
		
		L2 = new JLabel("Identificação do Professor(Codigo):");
		L2.setLocation(50,90);
		L2.setSize(200,30);
		
		Tx1 = new JTextField("");
		Tx1.setLocation(280,90);
		Tx1.setSize(140,30);
		
		B1 = new JButton("PESQUISAR");
		B1.setLocation(250,400);
		B1.setSize(130,50);
		B1.setBackground(new Color(162,181,205));
	
		B2 = new JButton("EXCLUIR");
		B2.setLocation(430,400);
		B2.setSize(130,50);
		B2.setBackground(new Color(162,181,205));
	
		B3 = new JButton("SAIR");
		B3.setLocation(610,400);
		B3.setSize(130,50);
		B3.setBackground(new Color(162,181,205));

        add(B1);
        add(B2);
        add(B3);
        add(L1);
        add(L2);
        add(Tx1);

        ButtonHandler handler = new ButtonHandler();
        B1.addActionListener(handler);
        B2.addActionListener(handler);
        B3.addActionListener(handler);
    }

    public class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == B1) {
            	
          
                 
                try {
                    Connection conexao = Proj02_07.getConnection();
                    Statement stmt = conexao.createStatement();
                    
                  String codigoProfessor = Tx1.getText();           
              	  String sql = "SELECT* FROM cadprofessor WHERE Ident_Prof = '" + codigoProfessor + "'";
                    
                    
                    
                    
                    ResultSet rs = stmt.executeQuery(sql);
                    tableModel.setRowCount(0);

                    
                    
                    
           
                    while (rs.next()) {
                        Object[] rowData = new Object[11]; 
                        rowData[0] = rs.getString("Ident_Prof");
                        rowData[1] = rs.getString("Nome_Prof");
                        rowData[2] = rs.getString("Endereco_Prof");
                        rowData[3] = rs.getString("Data_nasc");
                        rowData[4] = rs.getString("Numero_End");
                        rowData[5] = rs.getString("Bairro");
                        rowData[6] = rs.getString("Cidade");
                        rowData[7] = rs.getString("Estado");
                        rowData[8] = rs.getString("TelProf");
                        rowData[9] = rs.getString("Espec_Prof");
                        rowData[10] = rs.getString("Titulo_Prof");
                        
                        tableModel.addRow(rowData);
                    }
                    
                
         
      
        	  
                	
                    
                    
                    rs.close();
                    stmt.close();
                    conexao.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            
            
            
        
        else if (e.getActionCommand().equals("EXCLUIR")) {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro com o código: " + Tx1.getText() + "?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            
            if (confirmacao == JOptionPane.YES_OPTION) {
                try {
                    Connection conexao = Proj02_07.getConnection();
                    Statement stmt = conexao.createStatement();
                    
                    String codigoProfessor = Tx1.getText(); 
                    
                  
                    String sql = "DELETE FROM cadprofessor WHERE Ident_Prof = '" + codigoProfessor + "'";
                    int rowsDeleted = stmt.executeUpdate(sql);
                    
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi excluído.");
                    }
                    stmt.close();
                    conexao.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
            if (e.getActionCommand().equals("SAIR")) {
                dispose();
            }
        }
    }
    
}