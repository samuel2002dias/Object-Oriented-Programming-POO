package main;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int respostaFinal = 0;
        ArrayList<Empregado> empresa = new ArrayList<Empregado>();
        do{
            System.out.print("---------------------------------------\n1- Criar Empregado\n2- Consultar todos os empregados\n3- Modificar um empregado\n4- Apagar um empregado\n5- Terminar\nOpção --> ");
            respostaFinal = Ler.umInt();
            switch(respostaFinal){
                case 1:
                    long nss;
                    String nome;
                    double salario;
                    long telefones[];
                    int quantidadeTel;
                    System.out.print("\nNome --> ");
                    nome = Ler.umaString();
                    System.out.print("NSS --> ");
                    nss = Ler.umLong();
                    System.out.print("Salário --> ");
                    salario = Ler.umFloat();
                    System.out.print("Quantos telefones pretende adicionar? --> ");
                    quantidadeTel = Ler.umInt();
                    telefones = new long[quantidadeTel];
                    for(int i=0; i<quantidadeTel; i++){
                        System.out.print((i+1)+"º contacto: ");
                        telefones[i] = Ler.umLong();
                    }
                    Empregado novo = new Empregado(nss, nome);
                    novo.setSalario(salario);
                    novo.setTelefones(telefones);
                    empresa.add(novo);
                    break;
                case 2:
                    // No trabalho podemos mostrar os dados de uma forma mais bonita
                    System.out.println(empresa);    
                    break;
                case 3:
                    // No trabalho podemos perguntar especificamente o que é que se pretende modificar.
                    int pos;
                    System.out.print("\nPosição do empregado que pretende modificar --> ");
                    pos = Ler.umInt();
                    long nss1;
                    String nome1;
                    double salario1;
                    long telefones1[];
                    int quantidadeTel1;
                    System.out.print("\nNome --> ");
                    nome1 = Ler.umaString();
                    System.out.print("NSS --> ");
                    nss1 = Ler.umLong();
                    System.out.print("Salário --> ");
                    salario1 = Ler.umFloat();
                    System.out.print("Quantos telefones pretende adicionar? --> ");
                    quantidadeTel1 = Ler.umInt();
                    telefones1 = new long[quantidadeTel1];
                    for(int i=0; i<quantidadeTel1; i++){
                        System.out.print((i+1)+"º contacto: ");
                        telefones1[i] = Ler.umLong();
                    }
                    empresa.get(pos).setNome(nome1);
                    empresa.get(pos).setNss(nss1);
                    empresa.get(pos).setSalario(salario1);
                    empresa.get(pos).setTelefones(telefones1);
                    break;
                case 4:
                    int pos1;
                    System.out.print("\nPosição do empregado que pretende remover --> ");
                    pos = Ler.umInt();
                    empresa.remove(pos);
                    break;      
            }
        }while(respostaFinal != 5);
        System.out.println("O utlizador saiu do programa.");
    }
}
