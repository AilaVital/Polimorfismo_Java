public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Carro();
        Transporte t2 = new Bicicleta();
        Transporte t3 = new Aviao();
        Transporte t4 = new Transporte();

        t1.mover();
        t2.mover();
        t3.mover();
        t4.mover();

        System.out.println();

        t1.exibirInformacoes();
        t2.exibirInformacoes();
        t3.exibirInformacoes();

        System.out.println();

        CalculadoraViagem calc = new CalculadoraViagem();
        System.out.println(calc.calcularCusto(50));
        System.out.println(calc.calcularCusto(50, 30));
        System.out.println(calc.calcularCusto(50, 30, 120));

        System.out.println();

        Transporte[] transportes = {
            new Carro(),
            new Bicicleta(),
            new Aviao()
        };

        for (Transporte transporte : transportes) {
            transporte.mover();
        }
    }
}