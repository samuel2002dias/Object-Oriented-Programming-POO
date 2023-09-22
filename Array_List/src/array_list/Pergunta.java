package array_list;

public class Pergunta {
    private static int ultimo = 0;
    private int numero;
    private String texto;
    private double valor;

    public Pergunta(){
        ultimo++;
        numero = ultimo;
        texto = "";
        valor = 0;
    }
    
    public static int getUltimo(){
        return ultimo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getTexto(){
        return texto;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public static void setUltimo(int ultimo){
        Pergunta.ultimo = ultimo;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public String toString(){
        return("// Nº:"+numero+"; Pergunta -> "+texto+"; Valor->"+valor);
    }
}
