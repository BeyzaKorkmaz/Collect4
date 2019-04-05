public class Player {
    private String username;
    private String password;
    private int id;
    private int score;
    private int number_of_games;
    private int session_id;
    private Boolean status;
    private Boolean game_status;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumber_of_games() {
        return number_of_games;
    }

    public void setNumber_of_games(int number_of_games) {
        this.number_of_games = number_of_games;
    }

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getGame_status() {
        return game_status;
    }

    public void setGame_status(Boolean game_status) {
        this.game_status = game_status;
    }
}
