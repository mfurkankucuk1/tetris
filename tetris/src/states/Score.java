package states;

public class Score {

    private Integer score = 0;
    private static Score instance = null;

    public static Score getInstance() {
        if (instance == null)
            instance = new Score();

        return instance;
    }

    public void scoreCounter() {
        score = score + 10;
        System.out.println(score);
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
