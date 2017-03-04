package beans;

public class SquareFurniture extends Figuare implements IPerimeter {

    private int b;

    public SquareFurniture(int a, int b) {//контсруктор с двумя полями, поле А из супер класса.
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getSquareFiguare() {
        return getA()*b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SquareFurniture that = (SquareFurniture) o;

        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "SquareFurniture{" +
                "b=" + b +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (getA()+b)*2;
    }
}
