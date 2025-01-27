public class Main {
    public static void main(String[] args) {
        TransactionDAO transactionDAO = new TransactionDAO();

        // Yeni işlem ekleme
        transactionDAO.addTransaction("Income", "Salary", 5000, "2025-01-01");
        transactionDAO.addTransaction("Expense", "Food", 200, "2025-01-02");

        // İşlemleri listeleme
        System.out.println("Tüm İşlemler:");
        transactionDAO.listTransactions();
    }
}
