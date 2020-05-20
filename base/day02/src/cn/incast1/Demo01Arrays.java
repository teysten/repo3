package cn.incast1;
import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intstr =Arrays.toString(intArray);
        System.out.println(intstr);

        int[] array1 ={2,6,4,9,1,3};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
