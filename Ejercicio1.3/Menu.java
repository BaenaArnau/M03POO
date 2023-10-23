import java.util.*;
public class Menu {
    private Scanner entrada = new Scanner(System.in);
    private Game game;

    public void menuInicial(){
        int i = 0;
        while (i != 3) {
            System.out.println("┌──────────────────────────────┐");
            System.out.println("│             MENU             │");
            System.out.println("├──────────────────────────────┤");
            System.out.println("│  (1)  Play                   │");
            System.out.println("│  (2)  Settings               │");
            System.out.println("│  (3)  Exit                   │");
            System.out.println("└──────────────────────────────┘");
            switch (i = entrada.nextInt()){
                case 1:
                    game.jugar();
                    break;
                case 2:
                    this.menuSettings();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error debe elegir un numero valido");
            }
        }
    }
    public void menuSettings(){
        int i = 0;
        while (i != 3){
            System.out.println("┌──────────────────────────────┐");
            System.out.println("│             MENU             │");
            System.out.println("├──────────────────────────────┤");
            System.out.println("│  (1)  Players                │");
            System.out.println("│  (2)  Game                   │");
            System.out.println("│  (3)  Return                 │");
            System.out.println("└──────────────────────────────┘");
            switch (i = entrada.nextInt()) {
                case 1:
                    System.out.println("Numero de jugadores (MAX 4): ");
                    int j = entrada.nextInt();
                    if (j >= 5){
                        System.out.println("Error debe elegir un numero valido");
                    }else {
                        game.getConfigGame().setJugadores(j);
                    }
                    break;
                case 2:
                    System.out.println("Dificultad (1-5): ");
                    int k = entrada.nextInt();
                     if (k < 1 | k > 5){
                         System.out.println("Error debe elegir un numero valido");
                     }else {
                         game.getConfigGame().setDificulad(k);
                     }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error debe elegir un numero valido");
            }
        }
    }

    public Menu(Game game) {
        this.game = game;
    }
}
