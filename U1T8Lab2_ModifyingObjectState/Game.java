public class Game {
    private String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players){
        this.gameName = gameName;
        this.players = players;
        score = 0;
    }

    public String getGameName(){
        return gameName;
    }

    public int getPlayers(){
        return players;
    }

    public int getScore(){
        return score;
    }

    public void addPlayer(){
        players += 1;
    }

    public void increaseScore(int increase){
        score += increase;
    }

    public double averageScorePerPlayer(){
        return score*1.0/players;
    }

    public boolean isGameOver(){
        if (score > 9){
            return true;
        } else {
            return false;
        }
    }
}