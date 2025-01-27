import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDAO {
    // Veritabanına işlem ekleme
    public void addTransaction(String type, String category, double amount, String date) {
        String query = "INSERT INTO transactions (type, category, amount, date) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, type);
            preparedStatement.setString(2, category);
            preparedStatement.setDouble(3, amount);
            preparedStatement.setString(4, date);

            int rows = preparedStatement.executeUpdate();
            if (rows > 0) {
                System.out.println("İşlem başarıyla eklendi!");
            }
        } catch (SQLException e) {
            System.out.println("İşlem eklenirken hata oluştu: " + e.getMessage());
        }
    }

    // İşlemleri listeleme
    public void listTransactions() {
        String query = "SELECT * FROM transactions";

        try (Connection connection = DatabaseConnector.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                String category = resultSet.getString("category");
                double amount = resultSet.getDouble("amount");
                String date = resultSet.getString("date");

                System.out.println("ID: " + id + ", Tür: " + type + ", Kategori: " + category +
                        ", Miktar: " + amount + ", Tarih: " + date);
            }
        } catch (SQLException e) {
            System.out.println("Veriler listelenirken hata oluştu: " + e.getMessage());
        }
    }
}

