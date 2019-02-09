public class Test16 {
    public static void main(String[] args) {

        String a="2*((5-2)/3)";
        System.out.println(isValid(a));
    }
    public static boolean isValid(String data){
        int value =0;
           if (data !=null) {
            for (int index = 0; index < data.length() && value >= 0; ++index) {
                if(data.charAt(index) == '('){
                    value++;
                }else  if (data.charAt(index) ==')'){
                    value--;
                }

            }
           }
         return value==0;
    }
}
