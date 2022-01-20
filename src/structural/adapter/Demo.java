package structural.adapter;

public class Demo {

    public static void main(String[] args) {

        var oracle = new OracleCommands();
        oracle.insert();

        var mysql = new MySQLAdapter(new MySQLCommands());
        mysql.insert();
    }
}
