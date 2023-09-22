
package futebol;


public class Jogador {
    private int numJ;
    private static int ultimo;
    private String nome;
    private double salarioJ;
    private int[] ngolosJ;
    
    public Jogador(String nome){
        ultimo++;
        numJ = ultimo;
        this.nome = nome;
        salarioJ = 0.0;
        ngolosJ = new int[34];
        for(int i = 0; i < ngolosJ.length; i++){
            ngolosJ[i] = 0;
        }
    }
    
    public Jogador(String nome, double salarioJ){
        ultimo++;
        numJ = ultimo;
        this.nome = nome;
        this.salarioJ = salarioJ;
        ngolosJ = new int[34];
        for(int i = 0; i < ngolosJ.length; i++){
            ngolosJ[i] = 0;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salarioJ;
    }
    
    public void setSalario(double salarioJ){
        this.salarioJ = salarioJ;
    }
    
    public int[] getArrayGolos(){
        return ngolosJ;
    }
    
    public void setArrayGolos(int[] ngolosJ){
        for(int i = 0; i < ngolosJ.length; i++){
            this.ngolosJ[i] = ngolosJ[i];
        }
    }
    
    public void aumentaSal(int percentagem){
        int salJconv = (int) salarioJ;
        int novosal = (salJconv * percentagem) + salJconv;
        salarioJ = novosal;
    }
    
    public void setGolos(int pos, int numgolos){
        for(int i = 0; i < ngolosJ.length; i++){
            if(i == pos){
                ngolosJ[i] = numgolos;
            }
        }
        
    }
    
    public int getGolosJ(int pos){
        return ngolosJ[pos];
    }
    
    public String toString(){
        String s = "Último: " + ultimo + "\nNúmero: " + numJ + "\nNome: " + nome + "\nSalário: " + salarioJ + "$";
        for(int i = 0; i < ngolosJ.length; i++){
            s += "\n"+ i + "º Jornada: "+ ngolosJ[i];
        }
        return s;
    }
    
    public int totGolos(){
        int total = 0;
        for(int i = 0; i < ngolosJ.length; i++){
            total += ngolosJ[i];        
        }
        return total;
    }
    
}
