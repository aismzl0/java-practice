import  java.util.Scanner;
import  java.util.Random;

public class GuessNumber {
    public static void checkGuwss(int guess, int target){

        if (guess > target){
            System.out.println("大了");
        }
        else {
            System.out.println("小了");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int guess = scanner.nextInt();
        int target = random.nextInt(100);

        while (target != guess){
            checkGuwss(guess,target);
            guess = scanner.nextInt();
        }
        System.out.println("恭喜猜对了");


    }
}
