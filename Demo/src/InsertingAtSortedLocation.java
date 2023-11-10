import java.util.Arrays;

public class InsertingAtSortedLocation {
    public static void main(String[] args) {
        int length = 8;
        int i = 100;
        int arr[i] = {1,2,3};
        System.out.println(Arrays.toString(arr));
        int[] insertArr = insertAtEnd(18, arr);
        System.out.println(Arrays.toString(insertArr));
    }

    static int[] insertAtEnd(int ele, int[] arr)
    {
        int i = arr.length - 1;
        while(ele > arr[i])
        {
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = ele;
        return arr;
    }

}
