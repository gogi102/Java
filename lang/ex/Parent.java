package lang.ex;


// public class Parent extends Object {
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

/*
 클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클리스를 상속 받는다
 extends Ojbect는 생략하는 것을 권장함
 */
