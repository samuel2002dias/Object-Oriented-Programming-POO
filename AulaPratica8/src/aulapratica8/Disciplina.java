package aulapratica8;

public class Disciplina {
    private int codigo;
    private String designacao;
    private int nota;
    
    public Disciplina(int codigo, String designacao){
        this.codigo = codigo;
        this.designacao = designacao;
    }
    
    public Disciplina(Disciplina disc){
        this.codigo = disc.getCodigo();
        this.designacao = disc.getDesignacao();
        this.nota = disc.getNota();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public int getNota() {
        return nota;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", designacao=" + designacao + ", nota=" + nota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public boolean equals(Object obj) {
        boolean ig = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Disciplina e = (Disciplina) obj;
            ig = (this.codigo == e.codigo)&&(this.designacao.equals(e.designacao))&&(this.nota == e.nota);
        }
        else
            ig = false;
        return ig;  
    }
    
    public Object clone(){
        /*Disciplina copia = new Disciplina(0, "");
        copia.codigo = this.codigo;
        copia.designacao = this.designacao;
        copia.nota = this.nota;*/
        Disciplina copia = new Disciplina(this);
        return copia;
    }
        
    
    
}
