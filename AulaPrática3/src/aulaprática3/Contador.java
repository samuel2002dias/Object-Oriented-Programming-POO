package aulaprática3;

public class Contador {
   int i;

    public Contador(){
        i = 0;
    }
   
    public Contador(int numUtilizador) {
        i = numUtilizador;
    }

    public void incConta() {
        i++;
    }

    public void incConta(int uti) {
        i += uti;
    }

    public void decConta() {
        i--;
    }

    public void decConta(int uti) {
        i -= uti;
    }

    public int getConta() {
        return i;
    }

    public String paraString() {
        return ("Contador = " + i);
    } 
}
