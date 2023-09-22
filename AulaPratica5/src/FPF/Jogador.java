package FPF;

public class Jogador {
    private static int ultimo = 0;
    private int numero;
    private String nome;
    private double salario;
    private int[] golos;
    
    public Jogador(String nome){
        this.nome = nome;
        ultimo++;
        numero = ultimo;
        this.salario = 0.0;
        golos = new int[34];
    }
    
    public Jogador(String nome, double salario){
        this.nome = nome;
        ultimo++;
        numero = ultimo;
        this.salario = salario;
        golos = new int[34];
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public int[] getArrayGolos(){
        return golos;
    }
    
    public void setGolos(int[] golos){
        this.golos = golos;
    }
    
    public void aumentarSalario(double percentagem){
        if(percentagem>100 || percentagem <0)
            System.out.println("Erro ao aumentar salário.");
        else
            this.salario += (this.salario * percentagem/100);
    }
    
    public void setGolosJornada(int valor, int jornada){
        golos[jornada-1] = valor;
    }
    
    public int getGolosJornada(int jornada){
        return golos[jornada-1];       
    }
    
    public String toString(){
        String s;  
        s = "Nome: "+nome+ "// "+"Número: "+numero+" // Salário: "+salario+" // Golos --> ";
        for(int i = 0; i<golos.length; i++){
            s = s + this.golos[i];
            if(i < golos.length - 1)
                s = s + " / ";    
        }
        return s;
    }
    
    public int totalGolos(){
        int cont = 0;
        for(int i = 0; i<golos.length; i++){
            cont += golos[i];  
        }
        return cont;
    }
    
}
