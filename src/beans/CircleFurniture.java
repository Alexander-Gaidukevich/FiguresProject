package beans;

public class CircleFurniture extends Figuare implements IPerimeter {

    public CircleFurniture(int a) {
        super(a);
}

    @Override
    public double getSquareFiguare() {
        return getA()*getA()*Math.PI;  //S = Pi * R * R
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getA();  //P = 2 * Pi * R
    }
}
