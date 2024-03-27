import java.util.Scanner;

public class lista_ex_12_anexo_a {
    public static void main (String [] arg){
        Scanner teclado = new Scanner(System.in);
        String [] palavras = new String[5];

        for (int i=0; i < palavras.length; i++){
            System.out.print("Palavra "+ (i+1) +":");
            palavras[i] = teclado.nextLine();
        }

        int qde_palavras_menor_10_caracteres=0;
        
        for(int i=0; i < palavras.length; i++){
            if(palavras[i].length() < 10){
                qde_palavras_menor_10_caracteres++;
            }
        }

        System.out.println("Qde palavras < 10 caracteres:"+qde_palavras_menor_10_caracteres);

    }
}
