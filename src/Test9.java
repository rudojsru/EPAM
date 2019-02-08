public class Test9 {

    public static void main(String[] args) {

        int x[] = null;
        int y =5;
        System.out.println(isNumberInArray(x,y));
    }

    public static boolean isNumberInArray(int [] numbers, int number){

        if (numbers !=null && numbers.length >0 ){
            for (int index = 0; index <numbers.length; index++){

                if (numbers[index] == number){
                    return true;
                }
            }
        }
        return  false;
    }
}
