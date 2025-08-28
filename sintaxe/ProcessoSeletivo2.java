package sintaxe;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        selecaoCadidatos();
        imprimindoCandidatos();
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com: " + candidato + " tentativas: " + tentativasRealizadas);

        } else {
            System.out.println("Não conseguimos contato com: " + candidato + " tentativas: " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimindoCandidatos() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo candidatos:");
        for (int i = 0 ; i < candidatos.length ; i++) {
            System.out.println(candidatos[i]);
        }
    }

    static void selecaoCadidatos() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA",
        "DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int count = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5) {
            String candidato = candidatos[count];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato+" indicou o salário: "+ salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato: "+ candidato+" foi selecionado!!!");
                candidatosSelecionados++;
            }
            count++;
        }
    }

    //random number in a range
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioInformado) {
        double salarioBase = 2000.0;
        if (salarioInformado < salarioBase) {
            System.out.println("LIGAR Para candidato");
        } else if (salarioInformado == salarioBase) {
            System.out.println("CONTRAPROPOSTA Para candidato");
        } else {
            System.out.println("Aguardando novos candidatos");
        }
    }
}
