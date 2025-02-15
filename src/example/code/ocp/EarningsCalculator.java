package example.code.ocp;

public class EarningsCalculator {
    public double calculateEarnings(Video video) {
        return switch (video.getCategory()) {
            case FOOD -> calculateFoodEarning(video);
            case BEVERAGE -> calculateBeverageEarning(video);
            case TOOLS -> calculateToolsEarning(video);
            case UTILITIES -> calculateUtilitiesEarning(video);
        };
    }

    private double calculateUtilitiesEarning(Video video) {
        return video.getLikes() * 0.013 + video.getViews() * 0.0013;
    }

    private double calculateToolsEarning(Video video) {
        return video.getLikes() * 0.012 + video.getViews() * 0.0012;
    }

    private double calculateBeverageEarning(Video video) {
        return video.getLikes() * 0.011 + video.getViews() * 0.0011;
    }

    private double calculateFoodEarning(Video video) {
        return video.getLikes() * 0.009 + video.getViews() * 0.009;
    }
}
