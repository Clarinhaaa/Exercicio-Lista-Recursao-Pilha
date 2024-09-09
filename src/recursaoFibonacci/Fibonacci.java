package recursaoFibonacci;

public class Fibonacci {
    private int num = 0;
    private int aux = 1;
    private int somaAnteriores = 0;

    public void FibonacciRecursivo() {
        System.out.print(num + ", ");

        if (num <= 100) {
            somaAnteriores = num + aux;
            num = aux;
            aux = somaAnteriores;
            this.FibonacciRecursivo();
        }
    }
}
