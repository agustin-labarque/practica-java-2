import java.util.Arrays;

public class RadixSort {

    public static void radixSort(String[] array){
        for(int j=0; j<array[0].length(); j++){
            //generate 10 lists
            String[][] lists = new String[10][array.length];
            //locate them in the lists
            for(int i=0; i<array.length; i++){
                String number = array[i];
                int digit = Character.digit(number.charAt(number.length()-(j+1)), 10);
                lists[digit][i] = number; //el i esta mal
            }
            //merge the lists back into the array
            int location = 0;
            for (String[] list : lists) {
                for (String s : list) {
                    if (s != null) {
                        array[location] = s;
                        location++;
                    }
                }
            }
        }


    }

}
