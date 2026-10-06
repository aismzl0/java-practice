public class Expense {
    double amount;
    String category;
    String date;

    public Expense(double amount,String category,String date){
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public void printInfo(){
        System.out.println(date + " - " + category+"-$"+amount);
    }
}
