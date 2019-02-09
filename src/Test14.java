public class Test14 {
    public static void main(String[] args) {
        System.out.println(coinsNeededFor(750));
    }

    public static int coinsNeededFor(int amount){
        if(amount <0){
            throw new IllegalArgumentException("amount must be a positive number");
        }
        final int[] coins ={200,100, 50, 20, 5,2,1};
        int count =0, currentCoint =0;
        while (amount >0 && currentCoint <coins.length){
            int needAmount = amount/coins[currentCoint];
            count = count +needAmount;
            amount=amount -coins[currentCoint]*needAmount;
            currentCoint++;
        }
        return count;
    }
}
