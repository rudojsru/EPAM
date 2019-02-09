public class Test17 {

    public static void main(String[] args) {
        System.out.println(getDecimalFromBinary(110));
    }
    public static int getDecimalFromBinary(int binary){
        int decimal =0; int power =1;
        while (true){
            if (binary ==0 ){
                break;
            }
            System.out.println(binary%10+"-----");
            decimal +=(binary %10) *power;
            System.out.println(decimal);
            binary =binary /10; power =power*2;
        }
        return decimal;
    }
}
