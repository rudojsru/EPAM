public class Test8 {

    public static void main(String[] args) {


        System.out.println(checkFunny("bcxz"));
    }

    public static boolean checkFunny(String s){
        if (s ==null || s.length() <2 ){
            throw new IllegalArgumentException(" Input string must be minimu 2 characters long, and cannot be null");
        }
        boolean isFunny =true;
        for (int i =1 ; i < s.length() && isFunny; i++){
            int sub1 =s.charAt(i)-s.charAt(i-1);
            int sub2 =s.charAt(s.length()-i-1) - s.charAt(s.length()-i);
            if (sub1 !=sub2 && sub1 != -sub2){
                isFunny =false;
            }

        }

        return  isFunny;
    }
}
