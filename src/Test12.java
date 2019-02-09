import java.io.OutputStream;

public class Test12 {

    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }
    public static int reverseNumber(int number){
        int reversed =0;
        while ( number !=0 ){
            reversed = (reversed*10)+(number %10);
            System.out.println("number  " + number%10+"  / reversed  " +reversed);
            number = number / 10;
        }
        return reversed;
    }
}
