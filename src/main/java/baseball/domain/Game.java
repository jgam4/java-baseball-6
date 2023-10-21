package baseball.domain;

public class Game {
    int strike;
    int ball;
    int numberOfTries;

    public Game() {
        strike = 0;
        ball = 0;
        numberOfTries = 0;
    }

    public void initBaseBall() {
        strike = 0;
        ball = 0;
        numberOfTries = 0;
    }

    public int getStrikes() {
        return strike;
    }

    public int getBalls() {
        return ball;
    }

    public void incrementStrike() {
        strike += 1;
    }

    public void incrementBall() {
        ball += 1;
    }
}
