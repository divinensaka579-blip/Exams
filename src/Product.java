public class Product implements IProduct {

    private String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    private int[][] sales;
    public Product(int[][] sales) {
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int totalEntries = sales.length * sales[0].length; // 3*3 = 9
        return (double) GetTotalProductsSold() / totalEntries;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxTotal = 0;
        int maxIndex = 0;
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                maxIndex = i;
            }
        }

        return products[maxIndex] + "(" + maxTotal + ")";
    }

    public String[] getProducts() {
        return products;
    }
}

