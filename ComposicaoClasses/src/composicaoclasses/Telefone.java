package composicaoclasses;

public class Telefone {

    private String tipo; // Casa | Emprego | Móvel | ...
    private int numero;

    public Telefone() {
        this.tipo = "";
        this.numero = 0;
    }

    public Telefone(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        //tipo é uma variável local ao método 
    }

    public void setNumero(int numero) {
        this.numero = numero;
        // numero é uma variável local ao método
    }

    public String toString() {
        String s = "Tipo: " + tipo + " Número: " + numero;
        return s;
    }
}
