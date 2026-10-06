public class ScoreAnalyzer {
    public static double calculateAverage(int[] scores){
        int sum = 0;
        double target;
        for (int score : scores) {
            sum += score;
        }
        target = (double) sum / (scores.length);
        return target;
    }
    public static int calculatemax(int[] scores){
        int k=scores[0];
        for (int score : scores) {
            if (k < score) {
                k = score;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] scores = {88, 92, 76, 65, 100};
        System.out.println(calculateAverage(scores));
        System.out.println(calculatemax(scores));

    }
}
