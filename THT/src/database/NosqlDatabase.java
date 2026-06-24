package database;

public class NosqlDatabase implements Database {

    @Override
    public void saveKRS(String data) {
        System.out.println("Data disimpan ke Cloud NoSQL : " + data);
    }
}
