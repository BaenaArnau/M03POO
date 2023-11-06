package Expressions.regulars;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader lectorDeArchivos = new BufferedReader(new FileReader(new File("santako.txt")));
        String lectorArchivo;
        System.out.println();
        System.out.println("----Metodos String----");
        System.out.println();
        while ((lectorArchivo = lectorDeArchivos.readLine()) != null){
            int noel = contarOcurrencias(lectorArchivo, "*<]:-DOo", null);
            int rens = contarOcurrencias(lectorArchivo, ">:o)", null);
            int follets = contarOcurrencias(lectorArchivo, "<]:-D", '*');

            if (noel != 0 & rens != 0){
                System.out.println("Pare Noel (" + noel + ") Ren (" + rens + ")");
            } else if (follets != 0 & rens != 0) {
                System.out.println("Ren (" + rens + ") Follet (" + follets +")");
            } else if (noel != 0) {
                System.out.println("Pare Noel (" + noel + ")");
            } else if (rens != 0) {
                System.out.println("Ren (" + rens + ")");
            } else if (follets != 0) {
                System.out.println("Follet (" + follets +")");
            }else {
                System.out.println();
            }
        }
        lectorArchivo = null;
        lectorDeArchivos.close();

        BufferedReader lectorDeArchivo = new BufferedReader(new FileReader(new File("santako.txt")));
        Pattern patternNoel = Pattern.compile("\\*<]:-DOo");
        Pattern patternRens = Pattern.compile(">:o\\)");
        Pattern patternFollet = Pattern.compile("^(?!.*\\*<]:-DOo).*<]:-D");
        System.out.println();
        System.out.println("----Expressions regulars----");
        System.out.println();

        while ((lectorArchivo = lectorDeArchivo.readLine()) != null){
            Matcher matcherNoel = patternNoel.matcher(lectorArchivo);
            Matcher matcherRens = patternRens.matcher(lectorArchivo);
            Matcher matcherFollet = patternFollet.matcher(lectorArchivo);
            int noel = 0;
            int rens = 0;
            int follets = 0;

            while (matcherNoel.find()){noel++;}
            while (matcherRens.find()){rens++;}
            while (matcherFollet.find()){follets++;}

            if (noel != 0 & rens != 0 & follets != 0){
                System.out.println("Pare Noel (" + noel + ") Ren (" + rens + ") Follet (" + follets + ")");
            } else if (noel != 0 & rens != 0) {
                System.out.println("Pare Noel (" + noel + ") Ren (" + rens + ")");
            } else if (noel != 0 & follets != 0) {
                System.out.println("Pare Noel (" + noel + ") Follet (" + follets + ")");
            } else if (follets != 0 & rens != 0) {
                System.out.println("Ren (" + rens + ") Follet (" + follets +")");
            } else if (noel != 0) {
                System.out.println("Pare Noel (" + noel + ")");
            } else if (rens != 0) {
                System.out.println("Ren (" + rens + ")");
            } else if (follets != 0) {
                System.out.println("Follet (" + follets +")");
            }else {
                System.out.println();
            }
        }
        lectorDeArchivo.close();
    }
    public static int contarOcurrencias(String texto, String cadena, Character caracterExcluir) {
        int contador = 0;
        int indice = texto.indexOf(cadena);

        while (indice != -1) {
            if (caracterExcluir == null || indice == 0 || texto.charAt(indice - 1) != caracterExcluir) {
                contador++;
            }
            indice = texto.indexOf(cadena, indice + 1);
        }

        return contador;
    }
}
