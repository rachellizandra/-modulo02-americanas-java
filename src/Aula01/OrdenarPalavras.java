package Aula01;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

public class OrdenarPalavras {
    public static void main(String[] args) {

        Pessoa aluno = new Pessoa("Rachel");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as palavras: (*use virgula para mais de uma palavra)\n");
        String palavra = entrada.next();

        for (String nome : aluno.ordenarPalavras(palavra)) {
            System.out.println(nome);
        }

//        Calendar calendar = Calendar.getInstance ();
//
//        //formatando a data em dia/mes/ano
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String format1 = dateFormat.format (new Date ();
//        System.out.println("Data formatada. Modelo 1: " + format1);
//
//        Date date = calendar.setData(1999, Month.DECEMBER, 23);
//        System.out.println("Date: " + date);
//        String format2 = dateFormat.format (date);
//        System.out.println("Data formata: Modelo 2: " + format2);

    }
}
