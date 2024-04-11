package class1;

public class ClassStart3 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 메모리에 학생클래스 생성하여 stu1에 담아둠.
		stu1.stuname = "홍길동";
		stu1.stuage = 15;
		stu1.stugrade = 90;
		
		Student stu2 = new Student();
		stu2.stuname = "장발장";
		stu2.stuage = 16;
		stu2.stugrade = 80;
		
		System.out.println(stu1);
		System.out.println(stu2);
		
		System.out.println("이름: "+stu1.stuname+" 나이: "+stu1.stuage+"세 성적: "+stu1.stugrade+"점");
		System.out.println("이름: "+stu2.stuname+" 나이: "+stu2.stuage+"세 성적: "+stu2.stugrade+"점");
	}
}
/*
클래스와 사용자 정의 타입
- 타입은 데이터의 종류나 형태를 나타냄
- int는 정수 타입, String은 문자열 타입
- 학생(Student)라는 타입을 만들면 좋지 않을까?
- 클래스를 사용하면 int, String과 같은 타입을 직접 생성할 수 있음.
- 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하고, 이 설계도가 클래스이다.
- 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 개체 또는 인스턴스라 함.
- 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있음.
*/
// 참조값을 변수에 보관하는 이유
// 객체를 생성하는 new Student()코드 자체에는 이름이 없음.
// 이 코드는 단순히 Student 클래스를 기반으로 메모리에
// 실제 객체를 만드는 기능만 함.
// 따라서 생성한 객체에 접근할 방법이 필요함.
// 객체를 생성할 때 반환되는 참조값(주소)를 알면
// 객체에 접근할 수 있음        
// 따라서 반환되는 참조값을저장할변수가필요하며
//앞서 student stu1로 선언한 변수에 참조값을   
//저장하여 필요할 때 객체에 접근할 수 있음 