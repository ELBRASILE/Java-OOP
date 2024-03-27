import java.util.Scanner;

public class lista_ex_03_anexo_a_v02 {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra:");
        String palavra = teclado.nextLine();
        
        System.out.print("Quantiade caracteres para imprimir:");
        int N = teclado.nextInt();

        if(N <= palavra.length()){

            System.out.println(palavra.substring(0,N));
        
        } else {
            System.out.println("N maior que a quantidade de caracteres da palavra.");
        }
    }
}
