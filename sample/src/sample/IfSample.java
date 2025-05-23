package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = 20; // 成績

        if (score == 20) {
            System.out.println("満点です！");
        } else if (score >= 16) {
            System.out.println("よくできました！");
        } else if (score >= 12) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です。。。");
        }
    }

}