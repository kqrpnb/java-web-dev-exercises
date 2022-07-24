package exercises.chapter3;

public class ArrayPractice1_2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,8};

        for (int j : arr) {
            if ((j % 2) == 1) {
                System.out.println(j);
            }
        }
    }
}
