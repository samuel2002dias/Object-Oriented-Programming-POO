package testarjar;
import myinputs.*;

public class TestarJar {
    public static void main(String[] args) {
        int n1, n2, n3, maior;
        
        n1 = Ler.umInt();
        n2 = Ler.umInt();
        n3 = Ler.umInt();
        
        if(n1 > n2 && n1 > n3)
            maior = n1;
        else if(n2 > n1 && n2 > n3)
            maior = n2;
        else
            maior = n3;
        
        System.out.println("O maior número é: " + maior);
    }
}
