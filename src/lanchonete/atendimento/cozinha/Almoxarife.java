package lanchonete.atendimento.cozinha;

public class Almoxarife {

  private void controlarEntrada() {
    System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
  }

  private void controlarSaida() {
    System.out.println("CONTROLANDO A SAIDA DOS ITENS");
  }

  void entregarIngredientes() {
    // o void é visão default, ou seja, visível apenas para o Almoxarife e Cozinha
    System.out.println("ENTREGANDO INGREDIENTES");
    controlarSaida();
  }

  void trocarGas() {
    // o void é visão default, ou seja, visível apenas para o Almoxarife e Cozinha
    System.out.println("ALMOXARIFE TROCANDO O GAS");
  }
}
