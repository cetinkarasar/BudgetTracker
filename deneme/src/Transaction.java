import java.security.PublicKey;
import java.util.HashMap;
import java.sql.Connection;

public class Transaction {

    private String type;
    private String category;
    private double amount;
    private String date;

    public  Transaction(String type,String category,double amount,String date){
        this.amount= amount;
        this.date=date;
        this.category=category;
        this.type=type;
  }
  public String getType(){
        return type;
  }
  public void setType(String type){
        this.type=type;
  }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public String toString(){
        return "Transection [Type="+ type + ",Amount="+ amount + ",Date="+ date + ",Category="+ category + "]";
    }


}


