package example.code.openclosed;

import example.code.Video;

public class FoodEarningsCalculator implements IEarningsCalculator{
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.009 + video.getViews() * 0.009;
    }
}
