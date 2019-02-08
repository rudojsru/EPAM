public class Test2 {

    public static void main(String[] args) throws IllegalAccessException {

        System.out.println(reverseString("Kot"));
    }

      public static  String reverseString( final String str) throws IllegalAccessException {
          if (str == null){
              throw new IllegalAccessException("String can not be null");
          }
          String result=str;
          if(str.length() >1){
              result = str.charAt(str.length()-1)+ reverseString(str.substring(0,str.length()-1));
          }
          return result;
      }

}
