package removecontrolflag.after;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        SimpleDataBase simpleDataBase = new SimpleDataBase(new FileReader(".\\src\\datafile.txt"));

        Iterator<String> ir = simpleDataBase.iterator();

        while(ir.hasNext()) {
            String key = ir.next();
            System.out.println("key:" + key);
            System.out.println("value: " + simpleDataBase.getValue(key));
        }
    }
}
