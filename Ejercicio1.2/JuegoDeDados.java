public class JuegoDeDados {
    Dado d1 = new Dado();
    Dado d2 = new Dado();
    Dado d3 = new Dado();
    int partidas_jugadas = 0, partidas_ganadas = 0, partidas_perdidas = 0;

    public JuegoDeDados() {
    }

    public int getPartidas_ganadas() {
        return partidas_ganadas;
    }

    public int getPartidas_perdidas() {
        return partidas_perdidas;
    }

    public int getPartidas_jugadas() {
        return partidas_jugadas;
    }

    public void setPartidas_jugadas(int partidas_jugadas) {
        this.partidas_jugadas = partidas_jugadas;
    }

    public void setPartidas_ganadas(int partidas_ganadas) {
        this.partidas_ganadas = partidas_ganadas;
    }

    public void setPartidas_perdidas(int partidas_perdidas) {
        this.partidas_perdidas = partidas_perdidas;
    }

    public void Jugar(int caras){
        d1.tirar(caras);
        d2.tirar(caras);
        d3.tirar(caras);

        if (d1.equals(d2) & d2.equals(d3)){
            System.out.println("Has ganado");

            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);

            partidas_jugadas++;
            partidas_ganadas++;

        }else {
            System.out.println("Has perdido");

            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);

            partidas_jugadas++;
            partidas_perdidas++;
        }

    }
}
