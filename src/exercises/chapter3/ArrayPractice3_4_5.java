package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice3_4_5 {
    public static void main(String[] args) {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arr = str.split(" ");
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].contains(",")) {
                arr[k] = arr[k].substring(0, (arr[k].length() -1)); //trim trailing comma
            }
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(str);

//        String str2 = Arrays.toString(arr);
        String[] arr2 = str.split("\\.");
        System.out.println(Arrays.toString(arr2));
    }
}
