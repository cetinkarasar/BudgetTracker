import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    // Bağlantı için gerekli bilgiler

    private static final String URL = "jdbc:mysql://localhost:3306/budget_tracker?useSSL=false";

    private static final String USER = "root"; // MySQL kullanıcı adı
    private static final String PASSWORD = "cetin12345"; // MySQL şifresi

    // Veritabanı bağlantısını döndüren metot
    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Veritabanına başarıyla bağlanıldı!");
        } catch (SQLException e) {
            System.out.println("Veritabanına bağlanılamadı: " + e.getMessage());
        }
        return connection;

    }
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver bulunamadı: " + e.getMessage());
        }
    }

}
