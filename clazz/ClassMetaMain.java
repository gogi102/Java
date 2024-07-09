package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {

        Class clazz = String.class; // 클래스엣 조회

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println("Field: "+field.getType()+" "+field.getName());
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method);
        }

        // 상위 클래스 정보 출력
        System.out.println("SuperClass: "+clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();

        for (Class i : interfaces){
            System.out.println(i.getName());
        }
    }
}
/*
Class 클래스의 주요 기능
1. 타입 정보 얻기: 클래스의 이름, 슈퍼클래스, 인터페이스, 접근 제한자 등과 같은 정보를 조화할 수 있다.
2. 리플렉션: 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나
            메서드를 호출하는 등의 작업을 할 수 있다.
3. 동적 로딩과 생성: Class.forName() 메서드를 사용하여 클래스를 동적으로 로드하고, newInstance() 메서드를 통해
                   새로운 인스턴스를 생성할 수 있다.
   참고(동적 로딩) - 런타임에 클래스를 로드하는 프로세스를 말함
4. 에노테이션 처리: 클래스에 적용된 애노테이션을 조회하고 처리하는 기능을 제공한다

Class 클래스의 주요 기능
getDeclaredFields() : 클래스의 모든 내용 조회
getDeclaredMethods() : 클래스의 모든 메서드를 조회
getSuperclass() : 클래스의 부모 클래스를 조회한다
getInterfaces() : 클래스의 인터페이스를 조회한다
 */
