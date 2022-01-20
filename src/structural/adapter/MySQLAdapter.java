package structural.adapter;

public class MySQLAdapter implements DBAdapter {

    private final MySQLCommands mySQLCommands;

    public MySQLAdapter(MySQLCommands mySQLCommands) {
        this.mySQLCommands = mySQLCommands;
    }

    @Override
    public void insert() {
        this.mySQLCommands.insertMySQL();
    }

    @Override
    public void update() {
        this.mySQLCommands.updateMySQL();
    }

    @Override
    public void delete() {
        this.mySQLCommands.deleteMySQL();
    }
}
