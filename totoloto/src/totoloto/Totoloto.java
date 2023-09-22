package totoloto;

public class Totoloto {
    public static void main(String[] args) {
        
        System.out.println("*Totoloto*");
        
        int[] chave = new int[6];
        int num, i, j, n;
        boolean repetido;
        
        for(i=0; i<6; i++)
        {
            repetido = false;
            
            if(i == 0)
            {
                // Calcula o primeiro número entra 1 e 49 e adiciona logo ao array 'chave'.
                num = (int) (1 + (Math.random() * 49));
                chave[i] = num;
            }
            else
            {
                //  Para as seguintes posições do array, temos de verificar se
                // nenhuma das  posições que se encontra atrás da mesma, 
                // contém o mesmo número que foi calculado para ela.
                do
                {
                    num = (int) (1 + (Math.random() * 49));
                    repetido = false;
                    
                    //  Percorre as posições anteriores do array e caso 
                    // encontre um número coincidente com o que foi 
                    // calculado, calcula um novo número.
                    for(j=0; j<i && repetido == false; j++)
                    {
                        if(num == chave[j])
                            repetido = true;
                        else
                            chave[i] = num;
                    }
                }while(repetido == true);
            }
        }
        // Mostra o array 'chave', que contém os números de 1 a 49 não repetidos.
        System.out.print("CHAVE --> ");
        for(n=0; n< chave.length; n++)
            System.out.print(chave[n] + " ");       
    }
}
