package Aula01;

import java.util.*;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public List<String> ordenarPalavras(String palavras) {

        if (palavras != null) {

            String arrayPalavras[] = palavras.split(",");

            //pego o array de palavras e converto em lista de palavras
            List<String> listaPalavras = new ArrayList<String>(Arrays.asList(arrayPalavras));

            Collections.sort(listaPalavras, new Comparator<String>() {
                @Override
                public int compare(String palavra1, String palavra2) {
                    return palavra1.toString().compareTo(palavra2.toString());
                }
            });
            return listaPalavras;
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
