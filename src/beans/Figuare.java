package beans;
/*1.Создать абстрактный класс Figure с полем a - сторона. (для класса CircleFurniture это значение подразумевается - радиус)/*
/*2.Создать конструктор с параметром.(get, set, equals, hashcode, toString).*/
/*3.Cоздать классы SquareFurniture, CircleFurniture, которые наследуются от Figure.*/
/*4.Добавить в SquareFurniture поле – b – вторая сторона. */
/*5.Создать абстрактный метод в Figure для подсчета площади getSquareFigure(), соответственно переопределить в потомках.*/
/*6.Создать интерфейс с методом getPerimeter(), возвращающий периметр фигуры.Реализовать интерфейс у классов потомков.*/
/*7.Создать по 1 объекту классов потомков. Вывести всю информацию (объект, площадь, периметр).*/

public abstract class Figuare {

    private int a;

    public Figuare(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public abstract double getSquareFiguare();//не имееет реализайции

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figuare figuare = (Figuare) o;

        return a == figuare.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return "Figuare{" +
                "a=" + a +
                '}';
    }
}
