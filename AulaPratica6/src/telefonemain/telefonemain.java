package telefonemain;

public class telefonemain {
    public static void main(String[] args) {
        Telefone t1 = new Telefone("Móvel", 966734532);
        Telefone t2 = new Telefone("Casa", 275678932);
        
        Telefone t3 = t1.clone();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        boolean iguais;
        
        iguais = t1.equals(t3);
        System.out.println(iguais);
        
        iguais = t1.equals(t2);
        System.out.println(iguais);    
    }
}
