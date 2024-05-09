package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //다형적 참조
        Parent poly = new Child();

        // 다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly;// 강제로 Parent에서 Child로 형 변환

        child.childMethod();
    }
}
