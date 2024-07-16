package enumeration.test.ex1;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades){
            printDiscount(grade);
        }

    }
    private static void printDiscount(AuthGrade grade){
        System.out.println(grade.name() + " 등급의 레벨: "+ grade.getLevel() + "설명: "+grade.getDescription());
    }
}
