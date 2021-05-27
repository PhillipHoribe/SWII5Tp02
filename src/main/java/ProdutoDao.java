import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDao {
	private static Connection myConn = null;
	private static Statement myStmt = null;
	private static ResultSet myRs = null;

	public static Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:sqlserver://localhost:1433;databaseName=AulaJava;user=test;password=Miguel2021";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public void insert(String nome, int unidadeCompra, String descricao, float qtdPrevistoMes, float precoMaxComprado)
			throws SQLException {
		getConnection();
		String sql = "insert into tbprod(nome, unidadeCompra, descricao, qtdPrevistoMes, precoMaxComprado) values ('"
				+ nome + "', '" + unidadeCompra + ", '" + descricao + "', " + qtdPrevistoMes + ", " + precoMaxComprado
				+ ");";
		try {
			myStmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getCause());
		} finally {
			close();
		}
	}

	public void update(int id, String nome, int unidadeCompra, String descricao, float qtdPrevistoMes,
			float precoMaxComprado) throws SQLException {
		getConnection();

		String sql = "update tbprod set nome = '" + nome + "', unidadeCompra = " + unidadeCompra + ", descricao = '"
				+ descricao + "', qtdPrevistoMes = " + qtdPrevistoMes + ", precoMaxComprado = " + precoMaxComprado
				+ " where id = " + id + ";";

		try {
			myStmt.executeUpdate(sql);
		} catch (SQLException e) {
		} finally {
			close();
		}
	}

	public void delete(int id) throws SQLException {
		getConnection();

		String sql = "delete from tbprod where id = " + id + ";";

		try {
			myStmt.executeUpdate(sql);
		} catch (SQLException e) {
		} finally {
			close();
		}
	}

	@SuppressWarnings("finally")
	public ResultSet select() throws SQLException {
		getConnection();

		String sql = "select * from tbprod;";

		try {
			myRs = myStmt.executeQuery(sql);
		} catch (SQLException e) {
		} finally {
			return myRs;
		}
	}

	@SuppressWarnings("finally")
	public ResultSet select(int id) throws SQLException {
		getConnection();

		String sql = "select * from tbprod where id = " + id + ";";

		try {
			myRs = myStmt.executeQuery(sql);
		} catch (SQLException e) {
		} finally {
			return myRs;
		}
	}

	public void close() throws SQLException {
		if (myRs != null)
			myRs.close();

		if (myStmt != null)
			myStmt.close();

		if (myConn != null)
			myConn.close();
	}
}
