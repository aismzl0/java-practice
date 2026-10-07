import java.util.Scanner;

public class AccountEntry {
    public static void main(String[] args) {

        boolean running = true;
        String filename = "expense.text";
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();


        while (running){
            manager.loadFromFile(filename);
            System.out.println("""
                ===== 记账本 =====
                1.添加一笔支出
                2. 查看所有支出
                3. 查看支出总额
                4. 退出
                请输入选项：""");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("你选了添加支出，请输入金额，种类，日期");
                    double amount1 = scanner.nextDouble();
                    String category1 = scanner.next();
                    String date1 = scanner.next();
                    manager.addExpense(amount1,category1,date1);
                    break;
                case 2:
                    System.out.println("你选了查看支出");
                    manager.printAll();
                    break;
                case 3:
                    System.out.println("你选了查看支出总额");
                    System.out.println("$"+manager.getTotal());
                    break;
                case 4:
                    manager.saveToFile(filename);
                    System.out.println("再见");
                    running = false;
                    break;
            }
        }
    }
}
