package composicaoclasses;

public class Pessoa {
    private Telefone tel;
    private String nome;
    
    public Pessoa (String nome){
    this.nome = nome;
    tel = new Telefone();
    }
    
    public void setTelefone(Telefone t){
        tel = t; // O que acontece ???
    }
    
    public String toString (){
        return "Nome : " + nome + "\nTelefone - " + tel ; 
    }
}
