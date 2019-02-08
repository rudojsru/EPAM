public class Test6 {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(8));
    }
    public static  boolean isPerfectNumber(int number){
        if (number <1 ){
            return false;
        }
        int temp =0;
        for (int i=1 ; i <= number/2; i++){
            if (number % i==0){
                temp +=i;
            }

        }
        return temp == number;
    }

}
