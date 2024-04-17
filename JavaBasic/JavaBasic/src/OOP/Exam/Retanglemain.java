package OOP.Exam;

import java.util.Scanner;

public class Retanglemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rg = new Rectangle();
        rg.width = sc.nextInt();
        rg.length = sc.nextInt();

        int area = rg.calculateArea();
        System.out.println("넓이: "+area);

        int perimeter = rg.calculatePerimeter();
        System.out.println("둘레 길이: "+perimeter);

        boolean square = rg.isSquare();
        System.out.println("정사각형 여부: "+square);
    }
}
