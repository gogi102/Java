package Construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    //생성자를 직접 하나라도 만든 경우에는 더 이상 자바가 기본생성자를 자동을 만들어주지 않는다
    //따라서 기본생성자가 필요할 경우 직접 작성해야 한다.

    MemberConstruct(){}

    MemberConstruct(String name,int age){
        this(name,age,50);
    }
    //생성자
    public MemberConstruct(String name, int age, int grade){
            this.name = name;
            this.age = age;
            this.grade = grade;
    }
}
