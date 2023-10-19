// Método que simula o valor pretendido
import java.util.concurrent.ThreadLocalRandom;

// Método Random no range passado como parâmetro do método
import java.util.Random;

public class ProcessoSeletivo {
  public static void main(String[] args) {

    // CASE 01:
    // analisarCadidato(1900.00);
    // analisarCadidato(2200.00);
    // analisarCadidato(2000.00);

    // CASE 02:
    // selecaoCadidatos();

    // CASE 03:
    // imprimeSelecionados();

    // CASE 04:
    String [] listaSelecionados = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
    for (String candidato : listaSelecionados) {
      entrandoEmContato(candidato);
    }
  }

  // CASE 01:
  static void analisarCadidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if(salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contra proposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }
  // CASE 02:
  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }
  static void selecaoCadidatos() {
    // Array com candidatos
    String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Daniela", "Jorge"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou um salário de R$ " + salarioPretendido);
      if(salarioBase >= salarioPretendido){
        System.out.println("O candidato " + candidato + " foi selecionado(a) para a vaga");
        candidatosSelecionados++;
      } else {
        System.out.println("O candidato " + candidato + " não foi selecionado(a)");
      }
      candidatoAtual++;
    }
  }

  // CASE 3:
  static void imprimeSelecionados() {
    String [] listaSelecionados = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

    // 1ª Opção:
    // for (int i = 0; i < listaSelecionados.length; i++){
    //  System.out.println(listaSelecionados[i]);
    // }

    // 2ª Opção:
    for(String candidato: listaSelecionados){
      System.out.println(candidato + " foi selecionado para a vaga!");
    }
  }

  // CASE 4:
  static boolean atender() {
    return new Random().nextInt(3)==1;
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do{
      atendeu = atender();
      if(atendeu){
        continuarTentando = !atendeu;
      } else {
        tentativasRealizadas++;
      }
    } while (continuarTentando && tentativasRealizadas < 3);

    if(atendeu) {
      System.out.println("O candidato " + candidato + " atendeu a ligação na tentativa " + tentativasRealizadas);
    } else {
      System.out.println("Não conseguimos contato com o candidato " + candidato + ". Número de tentativas: " + tentativasRealizadas);
    }
  }
}
