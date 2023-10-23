import java.util.Objects;

public class Dado {
    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "resultado=" + resultado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dado dado = (Dado) o;
        return resultado == dado.resultado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultado);
    }

    public Dado() {
    }

    public void tirar (int caras){
        this.resultado = (int)(Math.random() * caras +1);
    }
}
