package example.code.openclosed;

import example.code.Video;

public class TestOpenClosedPrinciple {
    public static void main(String[] args) {
        // Open for extension, closed for modification
        EarningsCalculator earningsCalculator = new EarningsCalculator();
        System.out.println("Without OCP " + earningsCalculator.calculateEarnings(new Video(12, 100, 34, Category.FOOD)));

        FoodEarningsCalculator foodCalculator = new FoodEarningsCalculator();
        System.out.println("With OCP " + foodCalculator.calculateEarnings(new Video(100, 34)));
    }

}
