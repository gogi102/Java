package poly.basic;

public class CastingMain4 {
    // 다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다
    public static void main(String[] args) {
        Parent parent1 = new Child(); // 부모와 자식 생성
        Child child1 = (Child)parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); // 부모만 생성
        Child child2 = (Child) parent2; // 부모만 생성하였기 때문에 Child를 찾을 수 없음
        child2.childMethod();// 그래서 childMethod가 불러와지지 않음
    }
}
