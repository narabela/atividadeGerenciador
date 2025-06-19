package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorConexao {

    private static final String URL_DB = "jdbc:mysql://localhost:3306/turmas";
    private static final String USER_DB = "root";
    private static final String PWD_DB = "nara123";

    public static Connection getConnection() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_DB, USER_DB, PWD_DB);
            return conexao;
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

}
