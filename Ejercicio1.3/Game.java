public class Game {
    private Menu menu = new Menu(this);
    private ConfigGame configGame = new ConfigGame();
    private Player player = new Player();

    public void jugar(){
        System.out.println("Nivel de juego: " + configGame.getDificulad());
        System.out.println("Jugando...");
        System.out.println("Hay " + configGame.getJugadores() + " jugadores");
        System.out.println("... Juego acabado");
    }

    public void menuDeJuego(){
        menu.menuInicial();
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ConfigGame getConfigGame() {
        return configGame;
    }

    public void setConfigGame(ConfigGame configGame) {
        this.configGame = configGame;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
