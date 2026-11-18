import java.util.Scanner;

    public class MattressSalesApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
            int[][] salesData = new int[3][3];


            for (int i = 0; i < productNames.length; i++) {
                for (int month = 0; month < 3; month++) {
                    System.out.print("Enter number of sales for month " + (month+1) + " for " + productNames[i] + " mattress: ");
                    salesData[i][month] = sc.nextInt();
                }
                System.out.println();
            }

            Product product = new Product(salesData);
            PrintProduct printer = new PrintProduct();

            System.out.println("\nPRODUCT SALES REPORT - 2026\n");
            System.out.println("************************************************");


            printer.PrintTotalSales(product.GetTotalProductsSold());
            printer.PrintAverageSales(product.GetAverageProductSold());
            printer.PrintMostPopularProduct(product.GetMostPopularProduct());


        }
    }

