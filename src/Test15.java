public class Test15 {
    public static void main(String[] args) {

        int a [] = {110,120,60,80};
        System.out.println( solution(a));
    }


    public static int solution(int [] array){
        if (array == null){
            throw new IllegalArgumentException("Given array must not be null");
        }
        int max=0, result=0;

        for (int i = array.length-1; i >0; --i) {
            if(array[i] > max){
                max=array[i];
            } else  if(max -array[i] > result){
                result =max -array[i];
            }
        }
        return result;
    }
}
