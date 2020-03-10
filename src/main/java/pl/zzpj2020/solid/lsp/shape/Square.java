package pl.zzpj2020.solid.lsp.shape;

public class Square implements ShapeOperations {

    public Square(int a){
        this.a=a;
    }
    private int a;

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculateCircuit() {
        return 4*a;
    }
}
