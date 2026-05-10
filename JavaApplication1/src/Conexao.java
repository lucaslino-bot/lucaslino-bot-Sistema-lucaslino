import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/sistema",
                "root",
                ""
            );

            System.out.println("Conectado");

        } catch (Exception e) {

            System.out.println("Erro: " + e);

        }

        return conn;
    }
}