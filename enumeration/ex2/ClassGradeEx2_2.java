package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

//       ClassGrade classGrade = new ClassGrade(); // 생성자를 private 처리 해서 막아준다
//        int result = discountService.discount(classGrade,price);
//        System.out.println("result = " + result);
    }
}
/*
타입 안전 열겨형 패턴(Type-Safe Enum Pattern) 장점
- 타입 안정성 향상: 정해진 객체만 사용할 수 있기 때문에 잘못된 값을 입력하는 문젤ㄹ 근본적으로 방지할 수 있다.
- 데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.

단점
- 많은 코드를 작성해야 한다
- 생성자를 private 처리 해줘야 한다.
 */

