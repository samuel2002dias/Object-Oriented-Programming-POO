package composicaoclasses;

public class ComposicaoClasses {
    public static void main(String[] args) {
       Telefone t1 = new Telefone ("Casa", 275123456);
        Pessoa p = new Pessoa ( "Marco António");
        p.setTelefone(t1);
        System.out.println(p.toString());
        // Ao alterarmos o telefone, alteramos também o telefone da pessoa
        t1.setTipo("Emprego");
        t1.setNumero(111111111);
        System.out.println(p.toString());
        
        // Em Java os parâmetros são passados por valor.
        // É criada uma variável local com valor igual a uma cópia do argumento.
       
        // Se o parâmetro é um tipo referenciado (objecto ou array), equivale à passagem por referência. 
        // O argumento é a referência de um objecto ou array.
    }
}
