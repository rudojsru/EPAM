import static java.lang.StrictMath.sqrt;

public class Test3 {
    public static void main(String[] args) {


        System.out.println(solution(1));
    }

    public static int solution(int n){
        if (n <=0 ){
            throw new IllegalArgumentException("The area of the rectangle must be positive");
        }

        int result =0;
        for (int i = (int) sqrt(n); i>0 && result ==0; i--){
            result =2*(n/i +i);
        }
        return result;
    }

}
