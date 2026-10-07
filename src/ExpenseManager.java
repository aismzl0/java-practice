import java.io.*;
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


    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
        for (RunExpense e : expenses) {
                writer.write(e.amount + "," + e.category + "," + e.date);
                writer.newLine();
            }
        } catch(IOException e) {
            System.out.println("保存失败："+e.getMessage());
        }
    }

    public void loadFromFile(String filename){
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                double amount = Double.parseDouble(parts[0]);       //文件里读出来的永远是字符串，要转回double类型，必须手动转换
                String category = parts[1];
                String date = parts[2];
                expenses.add(new RunExpense(amount,category,date));
            }
            }catch(IOException e){
                System.out.println("文件不存在，将创建新纪录");
        }
    }

}
