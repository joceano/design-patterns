package creational.builder;

public class Demo {

    public static void main(String[] args) {

        Framework framework = new FrameworkFullBuilder().getFramework();
        framework.run();
    }
}
