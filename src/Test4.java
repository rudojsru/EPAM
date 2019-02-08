public class Test4 {

    public static void main(String[] args) {
        System.out.println(reverseWords("Klara u Karla ukrala"));
    }

    public static String reverseWords(String input){
      if(input == null || input.length() ==0 ){
          return "";
      }
      String[] arr= input.trim().split(" ");
      StringBuilder sb= new StringBuilder();
      for (int i= arr.length -1; i>=0; --i){
          sb.append(arr[i]);
          sb.append(" ");

      }
        return sb.length() == 0 ? "" : sb.substring(0,sb.length()-1);
    }
}
