public class Test7 {
    public static void main(String[] args) {
        System.out.println(isParlindrome("aba"));
    }

    public static  boolean isParlindrome (final String str){
        boolean result =true;
        if (str == null ){
            result =false;
        }else{

            for (int i=0; i <str.length() /2 && result; i++){
                result =str.charAt(i) == str.charAt(str.length()-1-i);
            }
        }
        return result;
    }
}
