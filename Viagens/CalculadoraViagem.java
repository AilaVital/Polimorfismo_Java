public class CalculadoraViagem {

    public double calcularCusto(double passagem) {
        return passagem;
    }

    public double calcularCusto(double passagem, double alimentacao) {
        return passagem + alimentacao;
    }

    public double calcularCusto(double passagem, double alimentacao, double hospedagem) {
        return passagem + alimentacao + hospedagem;
    }
}