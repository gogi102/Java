package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a){
        // super(); 사용하면 안됨
        //super();는 한번만 사용함
        this(a,0);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a = "+ a + "b = "+ b);
    }
}
