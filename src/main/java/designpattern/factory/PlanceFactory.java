package designpattern.factory;

public class PlanceFactory {

    public Movable createPlance(){
        return new Plane();
    }
}
