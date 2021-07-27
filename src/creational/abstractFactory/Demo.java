package creational.abstractFactory;

import creational.abstractFactory.factory.GUIFactory;
import creational.abstractFactory.factory.MacOSFactory;
import creational.abstractFactory.factory.WindowsFactory;

public class Demo {

    private static Application app;
    private static GUIFactory factory;

    public static void main(String[] args) {
        factory = new MacOSFactory();
        app = new Application(factory);
        app.paint();

        factory = new WindowsFactory();
        app = new Application(factory);
        app.paint();
    }
}
