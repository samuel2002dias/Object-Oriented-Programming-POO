package exemplo;

public class Telefone {

    private String tipo; // Casa | Emprego | Móvel | ...
    private long numero;

    public Telefone() {
        this.tipo = "";
        this.numero = 0;
    }

    public Telefone(String tipo,long numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public long getNumero() {
        return numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String toString() {
        String s;
        if(!this.tipo.equals("") && this.numero != 0)
            s = "Tipo:" + tipo + ",Número:"+ numero;
        else
            s = "";
        return s;
    }
    
    public boolean equals(Object obj){
        boolean ig = false;
        if(obj != null && obj.getClass() == this.getClass()){
            Telefone e = (Telefone) obj;
            ig = ((this.numero == e.numero) && (this.tipo.equals(e.tipo)));
        }
        else
            ig = false;
        return ig;
    }
    
    public Telefone clone(){
        Telefone copia = new Telefone();
        copia.numero = this.numero;
        copia.setTipo(this.getTipo());
        
        return copia;
    }
}


