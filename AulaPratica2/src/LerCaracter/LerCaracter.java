package LerCaracter;

public class LerCaracter {
    public static void main(String[] args)
    {
        char c; int i;
        System.out.print("Introduza um caráter pelo teclado: ");
        i = System.in.read();
        System.out.println("O código ASII do caráter que introduziu é : " + i);
        c = (char)i;
        System.out.println("O caráter que introduziu foi: " + c);
    }
}
