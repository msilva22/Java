package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.BDIntegrityException;
import db.DB;

public class Program {

	public static void main(String[] args) {
		//Atualizar dados.
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+"Id = ?");
			st.setInt(1, 2);

			int rowsAffected  = st.executeUpdate();
			System.out.println("Feito! " + "Linhas Afetadas" + rowsAffected );
		}
		catch(SQLException e) {
			throw new BDIntegrityException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	

	}

}
