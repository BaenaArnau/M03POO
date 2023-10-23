import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Llapis {
    private int color;
    private float gruix;

    public Llapis(int color, float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    @Override
    public String toString() {
        return "Llapis [color=" + color + ", gruix=" + gruix + "]";
    }

    public static void ordenarPorColor(List<Llapis> listaLlapis) {
        Collections.sort(listaLlapis, Comparator.comparing(Llapis::getColor));
    }
}