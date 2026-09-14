public class Aviao extends Transporte {

    @Override
    public void mover() {
        System.out.println("O avião está voando.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Avião: transporte aéreo.");
    }
}