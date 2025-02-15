package example.code.ocp.solution;

import example.code.ocp.Video;

public class BeverageEarningsCalculator implements IEarningsCalculator {
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.011 + video.getViews() * 0.0011;
    }
}
