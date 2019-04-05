public class Game {

    private int game_id;
    private int number_of_players;
    private int winner;
    private boolean game_status;

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getNumber_of_players() {
        return number_of_players;
    }

    public void setNumber_of_players(int number_of_players) {
        this.number_of_players = number_of_players;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public boolean isGame_status() {
        return game_status;
    }

    public void setGame_status(boolean game_status) {
        this.game_status = game_status;
    }
}
