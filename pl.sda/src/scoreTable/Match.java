package scoreTable;

/**
 * 19.10.2018
 **/
public class Match {
    private Team teamA;
    private Team teamB;
    private int goalTeamA;
    private int goalTeamB;

    public Match(Team teamA, Team teamB, int goalTeamA, int goalTeamB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.goalTeamA = goalTeamA;
        this.goalTeamB = goalTeamB;
    }

    public int getGoalTeamA() {
        return goalTeamA;
    }

    public void setGoalTeamA(int goalTeamA) {
        this.goalTeamA = goalTeamA;
    }

    public int getGoalTeamB() {
        return goalTeamB;
    }

    public void setGoalTeamB(int goalTeamB) {
        this.goalTeamB = goalTeamB;
    }
}
