package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}

/*
참조형 변수들은 같은 참조값을 통해 같은 인스턴스를 참조할 수 있다.
b = a 라고 하면 a에 있는 참조값(주소값) x001을 복사해서 b에 전달한다.
  - 자바에서 모든 값 대입(=) 가지고 있는 값을 복사해서 전달한다.
참조값을 복사해서 전달하므로 결과적으로 a, b는 같은 x001 인스턴스를 참조한다.

사이드 이펙트
사이드 이펙트는 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 보수 효과를 일으키는 것을 말한다.
위의 코드로 풀어보면
개발자는 b의 주소값을 서울에서 부산으로 변경할 의도로 값 변경을 시도했다.
다만 a, b는 같은 인스턴스를 참조하기 때문에 a의 값도 함께 부산으로 변경되어 버렸다
이렇게 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 사이트 이펙트라고 한다.
프로그래밍에 사이드 이펙트는 보통 부정적인 의미로 사용되는데
사이드 이펙트는 프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치기 때문이다
이로 인해 디버깅이 어려워지고 코드의 안정성이 저하된다
 */
