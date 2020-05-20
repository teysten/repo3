package cn.incast1;
import java.util.Arrays;

public class Demo02Arrays {
    public static void main(String[] args) {
        String str ="fdasdfsdagsrdfvdsfsd1254dfgergrsdavgf";
        char[] chars= str.toCharArray();
        Arrays.sort(chars);
      /*  for (int i =chars.length-1;i>=0;i--) {
            System.out.println(chars[i]);
        }
        /*
       */
        for (int i = 0; i <chars.length; i++) {
            System.out.println(chars[i]);

        }
    }
}
