package contadorvarclasse;

public class Contador {
    // É tudo público, as variáveis são privadas. Se quisermos ter variáveis
    // de clasee e métodos de classe, adicionamos private
    
    // declarar uma variável de classe que vai conter o nº de objetos instanciados
    private static int contadores = 0;
    
    // método de classe
    public static int getContadores() {
        return (contadores);
    }
    
    // variável de instância
    private int conta;
    
    // reescrever os construtores
    public Contador() {
        conta = 0;
        contadores++;
    }

    public Contador(int conta) {
        this.conta = conta;
        contadores++;
    }
}
