package exc2;

public class Espetaculo {
    String nome;
    int capacidade, espetadores;
    double custo;
    
    public Espetaculo(String n, int cap, double cus){
        this.nome = n;
        this.capacidade = cap;
        this.custo = cus;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getCapacidade(){
        return this.capacidade;
    }
    
    public int getEspetadores(){
        return this.espetadores;
    }
    
    public double getCusto(){
        return this.custo;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setCapacidade(int cap){
        this.capacidade = cap;
    }
    
    public void setEspetadores(int esp){
        this.espetadores = esp;
    }
    
    public void setCusto(int c){
        this.custo = c;
    }
    
    public String toString(){
        return ("Nome: "+this.nome+"//Capacidade: "+this.capacidade+"//Espetadores: "+this.espetadores+"//Custo: "+this.custo);
    }
    
    public String comprarBilhete(){
        if(this.espetadores < this.capacidade)
        {
            this.espetadores += 1;
            return ("COMPRAR BILHETE --> Tem de pagar "+this.custo+"$.");
        }
        else
            return ("COMPRAR BILHETE --> Espetáculo esgotado!!");
    }
}
