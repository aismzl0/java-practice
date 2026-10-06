import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseManager {

    private ArrayList<RunExpense> expenses = new ArrayList<>();

    public  void addExpense(double amount,String category,String date) {
        RunExpense e = new RunExpense(amount,category,date);
        expenses.add(e);
    }


    public void printAll(){
        for(RunExpense e1 :expenses){
            e1.printInfo();
        }
    }


    public double getTotal(){
        double total = 0;
        for(RunExpense expen:expenses){
            total = total + expen.amount;
        }
        return total;
    }
}
