package contagemdevariaveis;

public class ContagemDeVariaveis {

    public static void main(String[] args) {
        int i1 = 3;
        int i2 = i1;
        i2 = 4;

        System.out.println("i1 = " + i1);
        System.out.println(" mas i2 = " + i2);

        Valor v1 = new Valor();
        Valor v2 = new Valor();
        
        v1.setVal(5);
        
        v2 = v1; // v2 e v1 passam a ter o mesmo valor, ou seja, quando alteramos v1/v2 estamos tmb a alterar v2/v1
        //v2 aponta para o valor de v1

        v2.setVal(6); // Alterámos v2 e consequentemente v1

        System.out.println(" v1.val " + v1.getVal());
        System.out.println(" v2.val " + v2.getVal());
    }
}
