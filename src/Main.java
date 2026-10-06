import java.util.ArrayList;
public class Main{
    public static void main(String[] args){

        Expense e1 = new Expense(25.5,"food","2006-09-30");
        Expense e2 = new Expense(21,"clothes","2006-08-30");
        Expense e3 = new Expense(98,"go out","2006-09-11");
        Expense e4 = new Expense(11,"shop","2006-09-23");

        ArrayList<Expense> expenses = new ArrayList<>();
        expenses.add(e1);
        expenses.add(e2);
        expenses.add(e3);
        expenses.add(e4);


        for (Expense e : expenses){
            e.printInfo();
        }
        System.out.println(expenses.size());
    }
}