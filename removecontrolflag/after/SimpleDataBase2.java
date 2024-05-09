package removecontrolflag.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDataBase2 {
    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase2(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);

        boolean reading = false;
        String line;

        while (!reading) {
            line = br.readLine();
            if(line == null) {
                break;
            }

            int index = line.indexOf("=");

            if(index > 0){
                String key = line.substring(0,index);
                String value = line.substring(index+1,line.length());

                map.put(key,value);
            }
        }
    }

    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    public String getValue(String key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
