package lang;

import lang.ex.Child;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString() 은 Object 클래스의 메서드이다.
        System.out.println(child.toString());
    }
}
