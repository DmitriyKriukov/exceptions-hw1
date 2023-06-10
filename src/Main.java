import java.sql.Array;
import java.util.Arrays;

public class Main {
//    static String[][] array;
    public static void main(String[] args) {
        System.out.println(divisionByZero(4));
        System.out.println(nullPointer(null));
        int[] array = new int[4];
        System.out.println(arrayIndexOutOfBounds(array));
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        System.out.println(Arrays.toString(elementDifferences(arr1, arr2)));
    }
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static int divisionByZero(int a){
        return a/0;
    }

    public static int nullPointer(int[] array){
        return array[10];
    }

    public static int arrayIndexOutOfBounds(int[] array){
        return array[10];
    }


//    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//    1. NullPointerException
//    2. NumberFormatException
//    3. ArrayIndexOutOfBoundsException
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }


//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый
//    массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int [] elementDifferences(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
            return arr3;
        }
        else {
            throw new RuntimeException("Длины массивов не равны");
        }
    }
}