package class1;

public class ClassStart4 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 메모리에 학생클래스 생성하여 stu1에 담아둠.
		stu1.stuname = "홍길동";
		stu1.stuage = 15;
		stu1.stugrade = 90;
		
		Student stu2 = new Student();
		stu2.stuname = "장발장";
		stu2.stuage = 16;
		stu2.stugrade = 80;
		
		Student[] students = new Student[2];//Student 타입의 2칸짜리 배열 생성
		students[0] = stu1;
		students[1] = stu2;
		
		System.out.println(students[0].stuname);
	}
	
}
/*
 * System.out.println(students[0].stuname); 배열 접근 시작
 * System.out.println(005students[0].stuname); [0]을 사용해서 005배열의 0번 요소에 접근
 * System.out.println(001.stuname); .(dot)을 사용해서 참조값으로 객체에 접근
 * System.out.println("홍길동");
 */