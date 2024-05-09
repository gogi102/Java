package removecontrolflag.before;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDataBase {
    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);

        boolean flag = false;
        String temp;

        while (!flag) {
            temp = br.readLine();
            if(temp == null) {
                flag = true;
            } else {
                boolean flag2 = true;

                StringBuffer sb1 = new StringBuffer();
                StringBuffer sb2 = new StringBuffer();

                for (int i=0; i<temp.length(); i++) {
                    char temp2 = temp.charAt(i);

                    if(flag2) {
                        if(temp2 == '=') {
                            flag2 = false;
                        } else {
                            sb1.append(temp2);
                        }
                    } else {
                        sb2.append(temp2);
                    }
                }
                String ss1 = sb1.toString();
                String ss2 = sb2.toString();
                map.put(ss1, ss2);
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
