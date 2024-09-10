package _0910;

public class UniversalRemote {

    private TV typetv;;
    private boolean pairing;
    
    public void setPairing(TV tv){
        if (!pairing){
            typetv = tv;
            pairing = true;
            tv.setPairing(true);
            String tvName = tv.returnName();
            System.out.println(tvName + "와 연결되었습니다");
        }else {
            System.out.println("다른 TV와 연결되어 있습니다");
        }
    }
    
    public void offPairing(){
        typetv.setPairing(false);
        pairing = false;
        System.out.println("TV 연결이 해제되었습니다");
    }
}
