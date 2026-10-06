import java.util.Scanner;
import java.util.ArrayList;
public class RunExpense {
    double amount;
    String category;
    String date;




    public RunExpense(double amount,String category,String date){
        this.amount = amount;
        this.category = category;
        this.date = date;
    }


    public void printInfo(){
        System.out.println(date + " - " + category+"-$"+amount);
    }




}
