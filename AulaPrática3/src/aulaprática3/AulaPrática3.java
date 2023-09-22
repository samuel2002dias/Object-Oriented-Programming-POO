package aulaprática3;

import javax.swing.*;

public class AulaPrática3 {
    public static void main(String[] args) {
        Contador c1, c2;
        String s1, s2, StringNumEscolhido;
        int IntNumEscolhido, valorC1;

        c1 = new Contador();
        c2 = new Contador(10);
        
        s1 = c1.paraString();
        s2 = c2.paraString();
        
        System.out.println(s1);
        System.out.println(s2);
        
        StringNumEscolhido = JOptionPane.showInputDialog(null,"Incrementar c1 por: "); 
        IntNumEscolhido = Integer.parseInt(StringNumEscolhido);
        
        c1.incConta(IntNumEscolhido);
        s1 = c1.paraString();
        System.out.println(s1);
        
        c1.decConta();
        s1 = c1.paraString();
        System.out.println(s1);
        
        valorC1 = c1.getConta();
        System.out.println("O valor de c1 é: " + valorC1);
    }
}
