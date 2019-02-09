import java.lang.reflect.Array;
import java.util.Arrays;

public class Test13 {
// Nie DZIALA!!!!!!!!!!!!!!!!!!!!!!!!!!Nie DZIALA!!!!!!!!!!!!!!!!!!!!!!!!!!!!1

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Nie DZIALA
    public static void main(String[] args) {
        int a[] ={3,1,2,3,6};
        int b[] ={5,10,15,20,25};
         int k[] = solution(a);
         int g[] = solution(b);


        for (int v : k)
            System.out.print(v);

        System.out.println();

        for (int n : g)
            System.out.print(n);
}

    public static int [] solution (int a[]){
        if (a == null){
            throw new IllegalArgumentException("Null parameter is not allowed");
        }
        int [] result =new int [a.length];
        for (int i=0; i< a.length; ++i){
          for (int j = i+1; j < a.length; ++j) {
                      if (a[i] % a[j] !=0 ) {
                      result[i]++;
                      if (a[j] % a[i] != 0) {
                  }
                  result[j]++;
              }
          }
      }
      return result;
    }
}
