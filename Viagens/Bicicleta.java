public class Bicicleta extends Transporte {

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Bicicleta: transporte terrestre movido por força humana.");
    }
}