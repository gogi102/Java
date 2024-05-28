package poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new FacebookSender()};

        for (Sender sender : senders){
            sender.sendMessage("환영합니다!");
        }
    }
}
/*
다중 메세지 발송
- 한 번에 여러곳에 메시지를 발송하는 프로그램을 개발하자.
- 메인 코드를 보고 클래스를 완성하시오.

요구사항
1. 다형성을 활용할 것
2. Sender 인터페이스를 구현하고 사용해야 한다.
3. EmailSender.java, SmsSender.java, FacebookSender.java 를 구현하시오


 */
