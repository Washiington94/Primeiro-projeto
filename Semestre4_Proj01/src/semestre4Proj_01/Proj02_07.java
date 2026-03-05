package semestre4Proj_01;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Proj02_07  extends JFrame  {
	
    private static final String URL = "jdbc:mysql://localhost:3306/proj";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";

	public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection(URL,USERNAME,PASSWORD);
			}
	
	public static void main(String[]args) throws SQLException{
		Connection conexao = getConnection();
		
		new Proj02_06().setVisible(true);
		
		try{
		System.out.println(getConnection());
		}catch (Exception e) {
		e.printStackTrace();
	}
		
		
		
		if(conexao != null) {
			JOptionPane.showMessageDialog(null, "Banco de Dados Conectado");
			System.out.println("Banco de Dados Conectado(Online)");
			}
		else {
			if (conexao == null)
			JOptionPane.showMessageDialog(null,  "Erro ao Conectar banco de dados");
			System.out.println("Erro ao Conectar banco de dados");

		}
		}
}


		

