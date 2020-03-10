package pl.zzpj2020.solid.lsp.shape;

public class Rectangle implements ShapeOperations {

    private int a;
    private int b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double calculateArea() {
        return (2*a)+(2*b);
    }

    @Override
    public double calculateCircuit() {
        return a*b;
    }
}
