import java.util.*;

public class Main {

    public static void main(String[] args){
        int[] numbers = scanNumbers();

        String[] stringArray = sortRadix(numbers);

        System.out.println(Arrays.toString(StringUtils.toIntArray(stringArray)));
    }

    public static String[] sortRadix(int[] numbers) {
        String[] stringArray = StringUtils.toStringArray(numbers);

        stringArray = StringUtils.normalize(stringArray, "0");

        RadixSort.radixSort(stringArray);

        return stringArray;
    }

    public static int[] scanNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de numeros: ");
        int totalNumbers = scanner.nextInt();

        int[] numbers = new int[totalNumbers];

        System.out.println("ingrese los numeros: ");

        for(int i=0;i < totalNumbers; i++){
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        return numbers;
    }

}
