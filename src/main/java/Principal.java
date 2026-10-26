
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //] variáveis }
        int qtde = 20;
        int vetor[] = new int[qtde];
        Scanner leitor = new Scanner(System.in);
        
        // Entrada 

        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite o valor (" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());

        }
        //Processamento
        double soma = 0;
        for (int i = 0; i < qtde;i++){
            soma = soma + vetor [i]; 
        }
        double media = soma/qtde;
        
        //saida 
        System.out.println("A soma e:" + soma + "\nA media e:" + media);
        
    }
}
