public class Printpattern {

    public static void pattern(int n) {

        int i, j, counter;

        for(i=0; i<n; i++) {
            counter = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Printpattern.pattern(8);
    }
}
