package pl.zzpj2020.solid.lsp.shape;

public class Circle implements ShapeOperations {

    public Circle(double r, double d){
        this.r=r;
        this.d=d;
    }

    private double d;
    private double r;
    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculateCircuit() {
        return d*Math.PI;
    }
}
