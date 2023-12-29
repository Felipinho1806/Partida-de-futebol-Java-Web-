public class myApp {
    public static void main(String[] args) {
        Player jogador1 = new Player();
        jogador1.setName("Roy");
        jogador1.setSurname("Kent");
        jogador1.setNumber(6);
        jogador1.setPosition("Meio-campo");

        Player jogador2 = new Player();
        jogador2.setName("Dani");
        jogador2.setSurname("Rojas");
        jogador2.setNumber(4);
        jogador2.setPosition("Atacante");

        Player jogador3 = new Player();        
        jogador3.setName("Jamie");
        jogador3.setSurname("Tartt");
        jogador3.setNumber(9);
        jogador3.setPosition("Atacante");

        Team time1 = new Team("Richmond", "Azul, branco e amarelo", players);
        time1.getPlayers().add(jogador1);
        time1.getPlayers().add(jogador2);
        time1.getPlayers().add(jogador3);
    }
}
