class Solution {
    public int maxProfit(int[] prices) {
        int secondPoint = prices.length - 1;
        int buyingPrice = 0;
        int sellingPrice = 0;

        for (int i = 0; i< prices.length ; i++) {
            for (int j = prices.length - 1; j>i ; j--) {
                if (prices[i] > prices[j]) continue;
                else {
                    buyingPrice = prices[i];
                    while (i<secondPoint) {
                        if (prices[i] > prices[secondPoint]) {
                            sellingPrice = prices[i];
                            secondPoint--;
                        } else {
                            sellingPrice = prices[secondPoint];
                            i++;
                        }
                    }
                    break;
                }
            }
        }

        if (buyingPrice == 0) return 0;

        return sellingPrice - buyingPrice;
    }


    public static void main (String[] arg) {

        int[] findingProfit = {7,1,5,3,6,4};

        Solution solution = new Solution();

        System.out.println(solution.maxProfit(findingProfit));
    }
}