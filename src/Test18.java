public class Test18 {

    public static void main(String[] args) {
        int a[] ={5,3,4,6,7,8,4,3,7,9};

        System.out.println(getMaxBenefit(a));

    }

    public static int getMaxBenefit (int[] stockPrices){
        if(stockPrices ==null || stockPrices.length ==0){
            throw new IllegalArgumentException("Stock prices cannot be null nor empty");
        }
        int maxBenefit =0, minPrice =stockPrices[0];
        for (int currentPrice: stockPrices){
            int benefit =currentPrice-minPrice;
            if(benefit >maxBenefit){
                maxBenefit = benefit;
            }
            if (currentPrice < minPrice){
                minPrice=currentPrice;
            }

        }
        return maxBenefit;
    }

}
