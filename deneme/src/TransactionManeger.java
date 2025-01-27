import java.util.ArrayList;
import java.util.List;

public class TransactionManeger {
    private List<Transaction> transactions;

    public TransactionManeger(){
        this.transactions=new ArrayList<>();

    }
    public void addTransection(Transaction transaction){
        transactions.add(transaction);
        System.out.println("Transaction is added: " + transaction);
    }
    public void listTransaction(){
        if (transactions.isEmpty()){
            System.out.println("liste boş");
        }else System.out.println("bütün transaction");{
            for(Transaction t:transactions){
                System.out.println(t);
            }
        }
    }
//toplam gelir gider ekleme,
    public void calculuteTotal(){
        double totalIncome=0;
        double totalExpense=0;
        for (Transaction t:transactions){
            if (t.getType().equalsIgnoreCase("İncome")){
                totalIncome+=t.getAmount();
            } else if (t.getType().equalsIgnoreCase("Expense")) {
                totalExpense+=t.getAmount();

            }
        }
        System.out.println("Total Expense:" + totalExpense);
        System.out.println("Total İncome:" + totalIncome);
        System.out.println("Net balance:"+ (totalIncome-totalExpense));


    }

}
