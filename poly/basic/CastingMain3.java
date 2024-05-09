package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 =(Parent) child; //업캐스팅
        Parent parent2 = child; //업캐스팅은 생략 가능

        System.out.println(parent1);
        System.out.println(parent2);
    }
}
