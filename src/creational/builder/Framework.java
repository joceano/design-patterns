package creational.builder;

public class Framework {

    private String name;
    private String db;
    private String dbuser;
    private String dbpassword;
    private String dbhost;
    private Boolean tests;
    private Boolean webpack;
    private Boolean full;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public String getDbpassword() {
        return dbpassword;
    }

    public void setDbpassword(String dbpassword) {
        this.dbpassword = dbpassword;
    }

    public String getDbhost() {
        return dbhost;
    }

    public void setDbhost(String dbhost) {
        this.dbhost = dbhost;
    }

    public Boolean getTests() {
        return tests;
    }

    public void setTests(Boolean tests) {
        this.tests = tests;
    }

    public Boolean getWebpack() {
        return webpack;
    }

    public void setWebpack(Boolean webpack) {
        this.webpack = webpack;
    }

    public Boolean getFull() {
        return full;
    }

    public void setFull(Boolean full) {
        this.full = full;
    }

    public void run() {
        System.out.println("Framework criado.");
    }
}

