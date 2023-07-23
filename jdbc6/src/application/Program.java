package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		//Atualizar dados.
		Connection conn = null;
		Statement st = null;
		
		try {
			
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentID = 1");
			
			/*int x = 1;
			
			if(x < 2) {
				throw new SQLException("Falso Erro");
			}*/
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentID = 2");
			
			conn.commit();
			
			System.out.println("Linha 1 " + rows1);
			System.out.println("Linha 2 " + rows2);
			
		}
		catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transação não concluída " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao tentar voltar a transação " + e1.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	

	}

}
