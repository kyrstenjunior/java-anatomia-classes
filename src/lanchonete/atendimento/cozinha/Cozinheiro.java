package lanchonete.atendimento.cozinha;

public class Cozinheiro {
  // pode ser default
  public void adicionarLancheNoBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCÃO");
  }

  public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONANDO SUCO HAMBURGER NO BALCÃO");
  }

  public void adicionarComboNoBalcao() {
    prepararCombo();
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }
  
  private void prepararLanche() {
    selecionarIngredientesLanche();
    lavarIngredientes();
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
  }

  private void prepararVitamina() {
    selecionarIngredientesVitamina();
    lavarIngredientes();
    baterVitaminaLiquidificador();
    System.out.println("PREPARANDO SUCO");
  }

  private void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  private void selecionarIngredientesLanche() {
    System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
  }

  private void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
  }

  public void fritarIngredientesLanche() {
    System.out.println("FRTIANDO A CARNE E OVO PARA O HAMBURGER");
  }

  private void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }

  private void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
