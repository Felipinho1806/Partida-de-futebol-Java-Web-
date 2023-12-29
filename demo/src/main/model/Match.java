public class Match {
    private Team home;
    private Team visitor;
    private int homeScore;
    private int awayScore;
    private String date;

    public Team getHome() {
        return home;
    }
    public void setHome(Team home) {
        this.home = home;
    }
    public Team getVisitor() {
        return visitor;
    }
    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }
    public int getHomeScore() {
        return homeScore;
    }
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    public int getAwayScore() {
        return awayScore;
    }
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
    getResult(){
        if(homeScore > awayScore){
            return home;
        } else if(awayScore > homeScore) {
            return visitor;
        } else {
            return null;
        }
    }

    getResult(Team time){
        if(time == visitor) {
            if (awayScore > homeScore) {
                System.out.println("Visitante vence!");
            } else if(homeScore > awayScore) {
                System.out.println("Visitante perde!");
            } else {
                System.out.println("Empate");
            }
        } else {
            if (awayScore < homeScore) {
                System.out.println("Anfitriao vence!");
            } else if(homeScore < awayScore) {
                System.out.println("Anfitriao perde!");
            } else {
                System.out.println("Empate");
            }
        }
    }

}
