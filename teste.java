import java.util.Scanner;
//import java.io.*;

public class teste {

  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    String nome;
    System.out.print("Qual a cadeia: ");
    nome = ler.next();
    String[] nome_vetor = new String[3];
    String[] cadeias = new String[5];
    int i = 0;

    // separando a string em caracteres e colocando cada letra em uma posição do
    // vetor
    String[] nomeComSplit = nome.split("");
    for (String s : nomeComSplit) {
      nome_vetor[i] = s;
      i++;
      System.out.println(s);
    }
    // System.out.println("Valor de i" + i);

    // montando as cadeias

    if (nome_vetor[0].equals("0") && !nome_vetor[1].equals("*")) {
      cadeias[0] = nome_vetor[0];
    }

    int w = 1;
    String aux = cadeias[0];
    do {
      cadeias[w] = aux + nome_vetor[1];
      aux = cadeias[w];
      w++;
    } while (w <= 4);

    for (int x = 0; x <= 5; x++) {
      System.out.println("Cadeia " + x + ": " + cadeias[x]);
    }

  }

}
