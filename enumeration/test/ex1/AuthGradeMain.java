package enumeration.test.ex1;

public class AuthGradeMain {
    public static void main(String[] args) {
        int price = 10000;

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades){
            printDiscount(grade,price);
        }

    }
    private static void printDiscount(AuthGrade grade, int price){
        System.out.println(grade.name() + " 등급의 레벨: "+ grade.getLevel() + "설명: "+grade.getDescription());
    }
}
