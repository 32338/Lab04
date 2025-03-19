import java.sql.*;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Boa noite!");
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.mlfmvbhmbmirmmrhfzsv&password=Tresdfghjm,lkjh";
        Connection conexao = DriverManager.getConnection(url);
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = conexao.prepareStatement(sql);
        ResultSet rset = stm.executeQuery();
        while (rset.next()) {
            long nroConta = rset.getLong("nro_conta");
            double saldo = rset.getDouble("saldo");
            System.out.print("Número da conta: " + nroConta);
            System.out.println(" tem saldo de R$ " + saldo);
        }
        create();
    }
    public static void create() throws SQLException{
        System.out.print("Numero para a nova conta: ");
        long nro = Long.parseLong(System.console().readLine());
        System.out.print("Saldo da nova conta: ");
        BigDecimal saldo = new BigDecimal(System.console().readLine();
        

    }
}
