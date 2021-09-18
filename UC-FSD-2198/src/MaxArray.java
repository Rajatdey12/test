public class MaxArray {

    public static void main(String[] args) {

        int[] newArr = new int[]{23, 54,65,1, 4,6, 70, 66};

        int max = newArr[0];

        for(int i = 0; i < newArr.length; i++) {
            if(newArr[i] > max) {
                max = newArr[i];
            }
        }
        System.out.println(max);
    }

}
