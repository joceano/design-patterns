package creational.builder;

public class FrameworkFullBuilder implements FrameworkBuilderInterface {

    private Framework framework;

    public FrameworkFullBuilder() {
        this.framework = new Framework();
        this.buildName();
        this.buildDb();;
        this.buildWebPack();
        this.buildTests();
        this.buildFull();
    }

    public void buildName() {
        this.framework.setName("My Project");
    }

    public void buildDb() {
        this.framework.setDb("mySQL");
        this.framework.setDbuser("root");
        this.framework.setDbpassword("root");
        this.framework.setDbhost("localhost");
    }

    public void buildWebPack() {
        this.framework.setWebpack(true);
    }

    public void buildTests() {
        this.framework.setTests(true);
    }

    public void buildFull() {
        this.framework.setFull(true);
    }

    public Framework getFramework() {
        return this.framework;
    }
}
