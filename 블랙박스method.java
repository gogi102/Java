package blackbox;

import java.io.FilterOutputStream;

public class _04_Method {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelname = "까망이";


        b1.autoReport();
        Blackbox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수: "+fileCount+"개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수: "+fileCount+"개");

    }

}
