public class Test5 {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }



 public static   boolean isPrime(int number){
     if (number <2 ){
         throw new IllegalArgumentException("The investigated number must be greater than 1.");
     }
     boolean isPrime =true;
     int iterateUntil = number/2;

     for (int i =2; i<= iterateUntil && isPrime; ++i){
         isPrime = number %i !=0;
     }


   return isPrime;

 }
}
