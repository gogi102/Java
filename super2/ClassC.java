package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10, 20);// 파라미터 값 때문에 생략 불가능
        System.out.println("ClassC 생성자");
    }
}
