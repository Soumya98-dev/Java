public class Demo {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        for (int charToInt : letters) {
            System.out.println(charToInt);
            System.out.println((char)charToInt);
        }
        char target = 'a';
        int tar = target;
        System.out.println(tar);
    }
}
