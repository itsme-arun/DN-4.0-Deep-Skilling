public class Main{

    public static int maxProfitInWindow(int[] profits, int k) {
        if (profits.length < k) {
            return -1; 
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += profits[i];
        }

        int maxProfit = windowSum;

        for (int i = k; i < profits.length; i++) {
            windowSum = windowSum - profits[i - k] + profits[i];
            maxProfit = Math.max(maxProfit, windowSum);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] profits = {3, -2, 5, -1, 6, -3, 2, 7};
        int k = 4;

        int result = maxProfitInWindow(profits, k);
        System.out.println("Maximum profit in any " + k + " consecutive days: " + result);
    }
}
