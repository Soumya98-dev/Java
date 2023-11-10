import java.util.ArrayList;
import java.util.Scanner;

public class InsertAtASortedPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> aL = new ArrayList<>();
        for(int i = 0; i < 8; i++)
        {
            aL.add(input.nextInt());
        }
        System.out.println(aL);
    }
}
