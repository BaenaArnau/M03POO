import java.util.*;

public class MainLLapis {
    public static void main(String[] args) {
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Llapis llapis = new Llapis((int) (Math.random() * 8), 0);
            caixa1.add(llapis);
        }

        for (int i = 0; i < 10; i++) {
            caixa2.add(new Llapis((int) (Math.random() * 8), 0.1f + (float) (Math.random() * 2.9)));
        }

        System.out.println("Caixa 1:");
        for (Llapis llapis : caixa1) {
            System.out.println(llapis);
        }

        System.out.println("Caixa 2:");
        for (Llapis llapis : caixa2) {
            System.out.println(llapis);
        }

        Collections.sort(caixa2, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis llapis1, Llapis llapis2) {
                return Float.compare(llapis1.getGruix(), llapis2.getGruix());
            }
        });

        System.out.println("Lista de caixa2 ordenada");
        caixa2.forEach(System.out::println);

        LinkedList<Llapis> linkedList = new LinkedList<>(caixa1);
        linkedList.addAll(caixa2);
        LinkedHashSet<Llapis> caixaDeLlapissos = new LinkedHashSet<>(linkedList);

        Map<Integer,String> map_colors = new HashMap<>();
        //Afegim entrades al map
        map_colors.put(0,"Negre");
        map_colors.put(1,"Vermell");
        map_colors.put(2,"Groc");
        map_colors.put(3,"Verd");
        map_colors.put(4,"Verd");
        map_colors.put(3,"Blanc"); //Se remplaza por el ultimo valor (Eso quiere decir que el "3, verde" sera "3, blanco")

        for (Map.Entry<Integer, String> entry : map_colors.entrySet()) {
            int clave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Clau: " + clave + ", Valor: " + valor);
        }

        for (String valor : map_colors.values()) {
            System.out.println("Valor: " + valor);
        }
    }
}