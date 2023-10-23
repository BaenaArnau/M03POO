import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JuegoDeDados juegoDeDados = new JuegoDeDados();
        Scanner entrada = new Scanner(System.in);
        int seleccion, caras;
        boolean seguir_jugando = true;


        while (true){
            System.out.println("┌──────────────────────────────┐");
            System.out.println("│             MENU             │");
            System.out.println("├──────────────────────────────┤");
            System.out.println("│  (1)  Juego De Dados         │");
            System.out.println("│  (2)  Parchis                │");
            System.out.println("│  (3)  Ajedrez                │");
            System.out.println("│  (0)  Salir                  │");
            System.out.println("└──────────────────────────────┘");

            seleccion = entrada.nextInt();

            if (seleccion == 0){
                System.out.println("Saliendo...");
                break;
            } else if (seleccion == 1) {
                System.out.println("Numero de caras que tendra el dado");
                caras = entrada.nextInt();
                while (seguir_jugando != false){
                    juegoDeDados.Jugar(caras);
                    System.out.println();

                    System.out.println("Quieres seguir jugando? (true/false)");
                    seguir_jugando = entrada.nextBoolean();
                    System.out.println();

                    if (seguir_jugando == false){
                        System.out.println("Partidas jugadas == " + juegoDeDados.getPartidas_jugadas());
                        System.out.println("Partidas ganadas == " + juegoDeDados.getPartidas_ganadas());
                        System.out.println("Partidas perdidas == " + juegoDeDados.getPartidas_perdidas());
                        System.out.println();

                        juegoDeDados.setPartidas_ganadas(0);
                        juegoDeDados.setPartidas_jugadas(0);
                        juegoDeDados.setPartidas_perdidas(0);
                    }
                }
            } else if (seleccion == 2) {
                System.out.println("Working progres");
            } else if (seleccion == 3) {
                System.out.println("Working progres");
            } else {
                System.out.println("Pon una opcion correcta");
            }
        }
    }
}
