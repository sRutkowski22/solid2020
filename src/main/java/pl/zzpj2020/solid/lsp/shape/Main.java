package pl.zzpj2020.solid.lsp.shape;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.calculateArea());
        System.out.println(square.calculateCircuit());
    }
}
