package designpattern.factory.abstractfactory;

public class LowCarFactory extends AbstractFactory {
    @Override
    public ICar createFactory() {
        return new LowCar();
    }
}
