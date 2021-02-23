public class StringUtils {

    //transforma un array de int en una de string
    public static String[] toStringArray(int[] array){
        String[] stringArray = new String[array.length];
        for(int i=0; i<array.length; i++){
            stringArray[i] = Integer.toString(array[i]);
        }
        return stringArray;
    }

    //completa los caracteres restantes (menos del mas largo de ellos) de los strings del array con el string pasado
    //hasta que todos midan como el string mas largo del array
    public static String[] normalize(String[] array, String complete){

        String[] completeArray = new String[array.length];
        int max = maxLength(array);

        for(int i=0; i<array.length; i++){
            completeArray[i] = lpad(array[i], max - array[i].length(), complete);
        }
        return completeArray;
    }
    
    public static String lpad(String s, int zeroes, String complete) {
        return replicate(zeroes, complete) + s;
    }

    public static String replicate(int repetition, String character){
        String myString = "";
        for(int i=0; i<repetition; i++){
            myString += character;
        }
        return myString;
    }

    public static int maxLength(String[] arr){
        int max = 0;
        for(String number: arr){
            if(number.length() > max){
                max = number.length();
            }
        }
        return max;
    }

    public static int[] toIntArray(String arr[]) {
        int[] intArray = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            intArray[i] = Integer.parseInt(arr[i]);
        }
        return intArray;
    }

}
