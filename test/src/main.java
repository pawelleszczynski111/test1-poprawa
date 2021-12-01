
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuffer;
import static java.lang.Math.sqrt;


public class main {


    public static void main(String[] args) {




//zad1




//zad2
        String str = "middle";
        System.out.println(modify(str));

    }

    public static String modify(String str){
        StringBuffer sb = new StringBuffer(str);
        String odp="";
        StringBuffer sb2 = new StringBuffer(str);
        int a,b,c,i;
        a=sb.length();
        if(a%2==0) {
            b = a / 2;
            c = b + 1;
            for (i = 0; i < a; i++) {
                if (sb.charAt(i) == a) str.toUpperCase().charAt(i);
                if (sb.charAt(i) == b) str.toUpperCase().charAt(i);
            }
        }
        else{
            for (i=0;i<a;i++){
                sb.charAt(i)=sb2.charAt(a-i);
            }
        }

        odp = sb.toString();
        return odp;
    }
}
