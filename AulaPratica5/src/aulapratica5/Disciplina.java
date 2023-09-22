package aulapratica5;

public class Disciplina {
    private int codigo;
    private String nome;
    private String prof;

    public Disciplina() {
        this.codigo = 0;
        this.nome = "";
        this.prof = "";
    }

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.prof = "";
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNomeDisc(String nomeDisc){
        this.nome = nomeDisc;
    }
    
    public void setProf(String prof){
        this.prof = prof;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getDisc(){
        return nome;
    }
    
    public String getProf(){
        return prof;
    }
    
    public String toString(){
        return("Código: "+codigo+", Disciplina: "+nome+", Professor: "+prof+"  ");
    }
    
    public boolean verificaNomeDisci(String substring){
        if(this.nome.contains(substring) == true)
            return true;
        else
           return false;
    }
    
    public boolean verificaCodigoNoIntervalo(int inicio, int fim){
        if(this.codigo >= inicio && this.codigo < fim)
            return true;
        else
            return false;
    }
}
