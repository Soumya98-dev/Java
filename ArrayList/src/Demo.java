import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //CREATING AN ARRAYLIST
        //INTEGER IS THE WRAPPER CLASS OF INT
        ArrayList<Integer> arrayList = new ArrayList<>();

        //TO ADD ELEMENTS IN THE ARRAYLIST
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        //TO ACCESS ELEMENTS FROM THE ARRAYLIST
        int val = arrayList.get(1);//WILL ASSIGN THE ELEMENT AT INDEX 1

        //TO SET ELEMENT
        arrayList.set(2, 5);

        //REMOVE ELEMENT FROM A INDEX
        int remVal = arrayList.remove(2);
    }
}
