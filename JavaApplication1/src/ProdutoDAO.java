import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {

    private Connection conn;

    public ProdutoDAO() {
        conn = Conexao.conectar();
    }

    public void inserir(Produto p) {

        String sql = "INSERT INTO produto(nome, valor) VALUES (?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getValor());

            stmt.execute();

            System.out.println("Produto salvo com sucesso");

        } catch (Exception e) {

            System.out.println("Erro ao salvar produto: " + e.getMessage());
        }
    }
}