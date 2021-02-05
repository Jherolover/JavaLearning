package designpattern.factory.abstractfactory;

public class MediaCarFactory extends AbstractFactory {
    @Override
    public ICar createFactory() {
        return new MediCar();
    }
}
