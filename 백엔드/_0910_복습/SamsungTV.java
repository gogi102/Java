package _0910;

public class SamsungTV implements TV{

    private boolean pairing = false;
    private boolean checkPower = false;
    private int channel;
    private final String name;

    public void setPairing(boolean pairing) {
        this.pairing = pairing;
    }

    public SamsungTV() {
        this.name = "삼성TV";
    }

    @Override
    public void power() {
        if (pairing){
            if(!checkPower){
                System.out.println("TV전원을 켭니다");
                checkPower = true;
            }else{
                System.out.println("TV전원을 종료합니다");
                checkPower = false;
            }
        }else {
            System.out.println("TV가 연결되어 있지 않습니다");
        }
        
    }

    @Override
    public void changeChannel(int channel) {
        if (pairing && checkPower){
            this.channel = channel;
            System.out.println("채널이 "+channel+"번으로 바뀌었습니다");
        }else {
            System.out.println("TV가 연결되어 있지 않습니다");
        }
    }

    @Override
    public void checkChannel() {
        if (pairing && checkPower){
            System.out.println("현재 채널은 "+channel+"입니다");
        }else {
            System.out.println("TV가 연결되어 있지 않습니다");
        }
    }

    @Override
    public String returnName() {
        return name;
    }

    @Override
    public void streaming() {
        if (pairing && checkPower){
            System.out.println("넷플릭스를 시청합니다");
        }else {
            System.out.println("TV가 연결되어 있지 않습니다");
        }
    }
}
