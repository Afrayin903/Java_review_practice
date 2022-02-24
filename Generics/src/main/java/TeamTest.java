public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer Jack = new FootballPlayer("Jack");
        BaseballPlayer Joe = new BaseballPlayer("Joe");
        SoccerPlayer Salah = new SoccerPlayer("Salah");

       // Team liverpool = new Team("Liverpool");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
     //   Team<String> brokenTeam = new Team<>("This wont work");


//        liverpool.addPlayer(Salah);
//        liverpool.addPlayer(Joe);
        liverpool.addPlayer(Jack);

        System.out.println(liverpool.runPlayers());
    }
}
