import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
//        System.out.println("Hello");
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        System.out.println(number);

        int[] arr = arrCreate();

        System.out.println(Arrays.toString(arr));// TO PRINT THE ELEMENTS OF THE ARRAY

//        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 4));
        int[] rev = revArr(arr);
        System.out.println(Arrays.toString(rev));// TO PRINT THE ELEMENTS OF THE ARRAY
     }

    static int[] arrCreate()
    {
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++)
        {
            arr[i] = i + 1;
        }
        return arr;
    }

    static int binarySearch(int[] arr, int key)
    {
        int high = arr.length - 1;
        int low = 0;

        while(low <= high) {
            int mid = Math.abs((high + low)/2);
            if (key > arr[mid]) {
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int[] revArr(int[] arr)
    {
        for(int i = 0,j = arr.length - 1 ; i < j; i++, j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}