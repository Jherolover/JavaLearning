package designpattern.factory.abstractfactory;

public class TopFactory extends AbstractFactory {
    @Override
    public ICar createFactory() {
        return new TopCar();
    }
}
