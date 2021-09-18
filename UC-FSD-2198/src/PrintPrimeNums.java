public class PrintPrimeNums {

    public static void main(String[] args) {

        int i,num;

        String pNums = "";

        for(i = 1; i <= 1000; i++) {
            int counter = 0;
            for(num =i; num >=1; num--) {
                if(i%num==0)
                {
                    counter +=1;
                }
            }
            if(counter == 2) {
                pNums = pNums + i + " ";
            }
        }
        System.out.println("Prime nums from 1 to 1000 ");
        System.out.println(pNums);
    }
}
