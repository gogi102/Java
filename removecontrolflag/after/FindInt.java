package removecontrolflag.after;

public class FindInt {

    public static boolean find(int [] data, int number){

        boolean found = false;

        for(int i = 0; i < data.length; i++){
            if(data[i] == number){
                found = true;
                //break;
                return found;
            }
        }

        return  found;
    }
}
