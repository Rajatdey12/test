import java.util.Scanner;

public class RepeatCharacters {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine(); // rohhhan
        char charToFind = s.next().charAt(1); // hh, ah, hhh, aha

        int counter = 0;
        char[] chars = sentence.toCharArray();
        // ['r','o','h']
        for(int i = 0; i<chars.length; i++) {
            if(sentence.charAt(i) == charToFind) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
