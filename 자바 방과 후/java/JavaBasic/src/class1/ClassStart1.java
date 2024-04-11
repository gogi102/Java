package class1;

public class ClassStart1 {
	public static void main(String[] args) {
		
		String studentname = "홍길동";
		int stuAge = 15;
		int stuGrade = 90;
		
		String studentname2 = "장발장";
		int stuAge2 = 16;
		int stuGrade2 = 80;
		
		System.out.println("이름: "+studentname+" 나이: "+stuAge+"세 성적: "+stuGrade+"점");
		System.out.println("이름: "+studentname2+" 나이: "+stuAge2+"세 성적: "+stuGrade2+"점");
		//위 방식은 학생이 늘어날 때 마다 변수와 출력하는 코드를 추가해야 하는 문제점이 있다
		//위 문제점 해결을 위해 배열을 사용하여보자(class2)
		
		
		
	}
}
