public class Test20 {


    public static void main(String[] args) {
        System.out.println(solution(10,30));
    }
    public static boolean solution (int a, int b){
        if(a <1 || b <1 ){
            throw new IllegalArgumentException("Both inputs must be an integer greater than 0.");
        }

        return (calculateInvariant(a) == calculateInvariant(b));
    }

    private static int calculateInvariant(int number){
        int result =number;
        for (int i = 2; i < Math.sqrt(result); i++) {
            while (result % (i *i )== 0){
                result /=i;
            }
        }
        return result;
    }
}
