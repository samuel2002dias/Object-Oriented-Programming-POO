package aulapratica9;

import java.io.IOException;

public class AulaPratica9 {

    private static String leStr() {
        int ch;
        String r = "";
        boolean fim = false;
        while (!fim) {
            try {
                ch = System.in.read();
                if (ch < 0 || (char) ch == '\n') {
                    fim = true;
                } else {
                    r = r + (char) ch;
                }
            } catch (java.io.IOException e) {
                fim = true;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int index=0;
        boolean valid = true;

        String palavra = " ";
        String[] tabPal = new String[10];

        System.out.print("Introduza uma palavra: ");

        palavra = leStr();

        while (!palavra.equals("fim")) {
            do{
                System.out.print("Introduza um índice (int): ");
                valid = true;
                try {
                    index = Integer.valueOf(leStr().trim()).intValue();
                } catch (NumberFormatException e) {
                    valid = false;
                    System.out.println(" o índice tem de ser um inteiro");
                }

                try {
                    tabPal[index] = palavra;
                } catch (ArrayIndexOutOfBoundsException e) {
                    valid = false;
                    System.out.println(" 0 <= índice <= 9");
                }
            }while(valid == false);;
            
            System.out.print("Introduza uma palavra");
            System.out.println("(para terminar escreva fim): ");
            palavra = leStr();
        }
    }
}
