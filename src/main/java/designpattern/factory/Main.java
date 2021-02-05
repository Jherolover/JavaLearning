package designpattern.factory;

public class Main {
    public static void main(String[] args) {
        Movable car = new Car();
        car.go();
        Movable plane = new Plane();
        plane.go();
    }
}
