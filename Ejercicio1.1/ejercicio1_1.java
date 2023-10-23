import java.util.Scanner;

public class ejercicio1_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tiradas,dado1,dado2;
        int[] resutados = new int[11];
        //hola git
        System.out.println("Cuantas veces quieres tirar los dados");
        tiradas = entrada.nextInt();

        for (int i = 0; i < tiradas; i++){
            dado1 = (int)(Math.random() * 6 + 1);
            dado2 = (int)(Math.random() * 6 + 1);

            switch (dado1 + dado2){
                case 2:
                    resutados[0]++;
                    break;
                case 3:
                    resutados[1]++;
                    break;
                case 4:
                    resutados[2]++;
                    break;
                case 5:
                    resutados[3]++;
                    break;
                case 6:
                    resutados[4]++;
                    break;
                case 7:
                    resutados[5]++;
                    break;
                case 8:
                    resutados[6]++;
                    break;
                case 9:
                    resutados[7]++;
                    break;
                case 10:
                    resutados[8]++;
                    break;
                case 11:
                    resutados[9]++;
                    break;
                case 12:
                    resutados[10]++;
                    break;
            }
        }
        for (int i = 0; i < resutados.length; i++){
            System.out.println((i+2) + "  -----> " + resutados[i]);
        }
    }
}