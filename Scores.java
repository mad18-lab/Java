class cricket implements java.io.Serializable {
    public cricket() {}
    int score1, score2;

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore2() {
        return score2;
    }
}

public class Scores {
    public static void main(String[] args) {
        cricket c1 = new cricket();
        c1.setScore1(250);
        c1.setScore2(230);
        System.out.println("\nTeam 1 score: " + c1.getScore1());
        System.out.println("\nTeam 2 score: " + c1.getScore2());
    }
}