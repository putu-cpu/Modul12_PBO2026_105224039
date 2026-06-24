package database;

public class sqlDatabase implements Database {

    @Override
    public void saveKRS(String data) {
        System.out.println("Data disimpan ke MySQL : " + data);
    }
}