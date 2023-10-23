public class ConfigGame {
    private int dificulad = 1;
    private int jugadores = 1;

    public void jugar(){
        System.out.println("Nivel de juego: " + dificulad);
        System.out.println("Jugando...");
        System.out.println("Hay " + jugadores + " jugadores");
        System.out.println("... Juego acabado");
    }

    public int getDificulad() {
        return dificulad;
    }

    public void setDificulad(int dificulad) {
        this.dificulad = dificulad;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }
}
