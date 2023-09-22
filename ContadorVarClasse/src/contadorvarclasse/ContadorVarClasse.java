package contadorvarclasse;

public class ContadorVarClasse {

    public static void main(String[] args) {
        // Para que servem?
        // Usam-se variáveis de classe para armazenar valores que digam 
        // “respeito” a todos os objectos da classe.
        
        // Variáveis de classe 
        // podem ser usadas mesmo que nunca tenha sido 
        // instanciado um objeto da classe.
        
        // Métodos de classe 
        // são acessíveis às instâncias da classe, isto é, um método 
        // de instância pode invocar um método de classe.
        
        System.out.println("Número de objetos do tipo Contador: ");
        System.out.println(Contador.getContadores());

        Contador c1 = new Contador();
        Contador c2 = new Contador(10);
        
        System.out.println("Número de objetos do tipo Contador: ");
        System.out.println(Contador.getContadores()); 
        // Contador: Nome da Classe
        // getCOntadores(): Método de Classe
    }
}
