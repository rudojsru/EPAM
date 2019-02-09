public class Test11 {

    public static void main(String[] args) {
        System.out.println(sumOfDigitsNonRecursive(-12345));
    }
    public static Integer sumOfDigitsNonRecursive(int number){
        int sum =0;
        while (number !=0){
            sum +=Math.abs(number)%10;
            number =number/10;
        }
        return sum;
    }
}
