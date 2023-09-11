package app;

//Bubble sort
public class Main {
    public static void main(String[] args) {
        double[] price = {9.99, 15.50, 7.25, 1.99, 18.97, 2.5, 10.99};

        //Сортування цін в зростаючому порядку
        for (int i = 0; i < price.length; i++) {
            for (int j = 1; j < (price.length - i); j++) {
                if (price[j - 1] > price[j]) {
                    double temp = price[j - 1];
                    price[j - 1] = price[j];
                    price[j] = temp;
                }
            }
        }
        System.out.println("The price of a product:");
        for (double priceSort : price)
            System.out.print(priceSort + " ");

        //Розрахунок середньої ціни за весь період.
        double sum = 0;
        for (double num : price)
            sum += num;
        // difference - (Також реалізуйте функціонал, який розраховує середню ціну
        //за весь період.)
        double difference = sum/price.length;
            System.out.printf("%n%nThe average price of the product:%n%.2f",difference);

    }
}

