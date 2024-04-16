package OOP.Exam;

import java.util.Scanner;

public class Retanglemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rg = new Rectangle();
        rg.width = sc.nextInt();
        rg.length = sc.nextInt();
        squard();
    }
}
