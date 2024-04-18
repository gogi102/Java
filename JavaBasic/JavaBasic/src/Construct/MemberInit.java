package Construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //기본 생성자 - 개발자가 생성자를 만들지 않을 경우에는 자가바 직접 만들어줌.
    public MemberInit(){

    }
    //메서드 추가
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
