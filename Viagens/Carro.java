public class Carro extends Transporte {

    @Override
    public void mover() {
        System.out.println("O carro está andando pela estrada.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro: transporte terrestre motorizado.");
    }
}