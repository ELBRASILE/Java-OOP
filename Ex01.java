
class Pessoa {
    private String nome;
    private int idade;
    public float peso;
    private float altura;

    public float iMC(){
        return  peso/((float)Math.pow(altura,2));
    }

    //métodos gets e sets

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso(){
        return peso;
    }

    public void setNome(String n){
        nome=n;
    }
    public void setIdade(int i) throws Exception {
        if(i < 0) {throw new Exception("Valor da idade não pode ser negativo.");}
        idade = i;
    }

    public void setPeso(float p) throws Exception{
        if(p <= 0) {throw new Exception("Valor do peso não pode ser zero ou negativo.");}
        peso = p;
    }

    public void setAltura(float a){
        altura = a;
    }
}

public class Main /*lista_ex_01_anexo_b*/ {
    public static void main(String [] args) {
        Pessoa p = new Pessoa();

        p.nome = "Jarbas";
        p.setNome("Jarbas");
        p.idade = 30;
        
        //p.altura = (float) 1.70;
        p.setAltura((float) 1.70);
        p.peso = (float) 80;
        try {
            p.setIdade(30);
            p.setPeso(0);
            float imc = p.iMC();
            System.out.println("IMC = " + imc);
        } catch (Exception e) {
          System.out.println(e.getMessage());  
        }
        
        
    }
}

 
