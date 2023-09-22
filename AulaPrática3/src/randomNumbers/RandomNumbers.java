package randomNumbers;

import myinputs.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Contador contaNegativos, contaPositivos;
        int N, num, i, totalPositivos, totalNegativos;
        int[] gerados;
       
        System.out.print("Quantos números pretende gerar? --> ");
        N = Ler.umInt();
        
        gerados = new int[N];
        
        // Gera aleatoriamente os N números, ao mesmo tempo que os mostra e adiciona ao array gerados
        System.out.println("Os números gerados foram: ");
        for(i=0; i<N; i++)
        {
            num = (int) (-100 + (Math.random() * 200));
            gerados[i] = num;
            if(i == N- 1)
                System.out.print(num);
            else
                System.out.print(num+"/");
        }
        
        contaNegativos = new Contador();
        contaPositivos = new Contador();
        
        // Percorre o array e contabiliza o número total de negativos e positivos presentes no mesmo
        for(i=0; i<N; i++)
        {
            if(gerados[i] < 0)
                contaNegativos.incConta();
            else if(gerados[i] > 0)
                contaPositivos.incConta();
        }
        
        totalPositivos = contaPositivos.getConta();
        totalNegativos = contaNegativos.getConta();
        
        System.out.println("\nHá "+totalPositivos+" números positivos e "+totalNegativos+" números negativos no conjunto dos números gerados.");
    }
}
