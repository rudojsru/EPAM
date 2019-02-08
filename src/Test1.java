import static java.lang.System.out;

public class Test1 {

    public static void main(String[] args) throws IllegalAccessException {

       int x[] = {1};


    System.out.println(searchMinValue(x));

    }
    public static int searchMinValue(int[] array) throws IllegalAccessException {
        if(array == null){
            throw new IllegalAccessException("The Array must not be null");
        }

        if(array.length == 0){
            throw new IllegalAccessException("Array cannot be empty");
        }

         int min =array[0];
         for( int i =1; i <array.length; i++){
            if(array[i] <min){
               min = array[i];
           }
       }
       return min;
    }
}
