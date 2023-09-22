package Tempo;

import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Tempo {

    private static String[] saudacoes = {"Bom dia", "Boa tarde", "Boa noite"};
    private static String nome = "Guilherme Teixeira";
    private static int horas;
    private static int minutos;
    private static int dia;
    private static int diaDaSexta13;
    private static DayOfWeek diaDaSemana;
    private static int mes;
    private static int mesDaSexta13;
    private static String mesExt;
    private static int ano;
    private static int anoDaSexta13;
    private static int diaDaSemanaNUM;
    

    public static void getHoras() {
        LocalDateTime dataComputador = LocalDateTime.now();
        horas = dataComputador.getHour();
        minutos = dataComputador.getMinute();
    }

    public static void getData() {
        LocalDateTime dataComputador = LocalDateTime.now();
        dia = dataComputador.getDayOfMonth();
        mes = dataComputador.getMonthValue();
        ano = dataComputador.getYear();  
        diaDaSemana = dataComputador.getDayOfWeek();
        diaDaSemanaNUM = diaDaSemana.getValue();
    }

    public static String getMonthName(int mes) {
        String nomeMes = "";
        switch (mes) {
            case 1: nomeMes = "janeiro"; break;
            case 2: nomeMes = "fevereiro"; break;
            case 3: nomeMes = "março"; break;
            case 4: nomeMes = "abril"; break;
            case 5: nomeMes = "maio"; break;
            case 6: nomeMes = "junho"; break;
            case 7: nomeMes = "julho"; break;
            case 8: nomeMes = "agosto"; break;
            case 9: nomeMes = "setembro"; break;
            case 10: nomeMes = "outubro"; break;
            case 11: nomeMes = "novembro"; break;
            case 12: nomeMes = "dezembro"; break;
        }
        return nomeMes;
    }

    private static int periodoDia(int h) {
        return (h + 20) / 8 % 3;
    }

    public static void main(String args[]) {
        String nomeDoMes;   
        getHoras();
        getData();
        nomeDoMes = getMonthName(mes);
        System.out.println(saudacoes[periodoDia(horas)] + ", " + nome + ".");

        /*
        if(minutos == 0 || minutos == 60)
        {
            System.out.println("São "+ horas + " certas.");
        }
        else if(minutos > 0 && minutos < 30)
        {
             System.out.println("Passam " + minutos + " minutos das " + horas + " horas.");
        }
        else if(minutos > 30 && minutos <= 59)
        {
             System.out.println("Faltam " + (60-minutos) + " minutos para as " + (horas+1) + " horas.");
        }
         */
        String msg1, msg2;
        msg1 = (horas == 0) ? (horas + " em ponto.") : ((minutos > 30 ? horas + 1 : horas) + "hora" + (horas == 1 ? "" : "s"));
        msg2 = (minutos == 0) ? ("") : (minutos > 30 ? " menos " + (60 - minutos) + "minutos" : (" e "+(minutos) + "minuto" + (minutos == 1 ? "" : "s")));
        System.out.println("São " + msg1 + msg2 + ".");

        System.out.println("Data --> " + dia + "/" + mes + "/" + ano);
        System.out.println("Data --> " + dia + "/" + nomeDoMes + "/" + ano);
        System.out.println("Faltam "+ (6-diaDaSemanaNUM) + " dias para p fim de semana!");
        
        Contador c;
        Contador c1 = new Contador();
        DayOfWeek diaDaSemanaDoDia13;
        int diaDaSemanaValor;
        
        System.out.println("Datas das 13 próximas Sextas-Feiras 13:");
        //  Caso não colocassemos esta instrução, se estivessemos do dia 20 do mês 
        // e tivesse ocorrido uma sexta no dia 13, ele iria mostrar essa sexta no ecrã e nós n queremos isso
        if(dia>=13)
            mes++; 
        while(c1.getConta() < 13)
        {
            LocalDate sexta13 = LocalDate.of(ano, mes, 13);
            diaDaSemanaDoDia13 = sexta13.getDayOfWeek();
            diaDaSemanaValor = diaDaSemanaDoDia13.getValue();
            
            if(diaDaSemanaValor == 5)
            {
                System.out.println("13/"+mes+"/"+ano);
                c1.incConta();
            }
            mes++;
            if(mes > 12)
            {
                mes = 1;
                ano++;
            }
           
        }
    }
}
