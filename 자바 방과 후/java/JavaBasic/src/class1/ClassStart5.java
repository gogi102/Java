package class1;

public class ClassStart5 {
	public static void main(String[] args) {
		// 리팩토링
		// 1. 선언 단일화(배열로만 접근)
		// 2. 츨략문구를 반복문을 통해 심플하게 변경
		Student[] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();
		
		students[0].stuname = "홍길동";
		students[0].stuage = 15;
		students[0].stugrade = 90;
		
		students[1].stuname = "장발장";
		students[1].stuage = 16;
		students[1].stugrade = 80;
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름: "+students[i].stuname+" 나이: "+students[i].stuage+"세 성적: "+students[i].stugrade+"점");
		}
		for(Student s : students) {
			System.out.println("이름: "+s.stuname+" 나이: "+s.stuage+"세 성적: "+s.stugrade+"점");
		}
		
	}
}