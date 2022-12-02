

public class App {
    public static void main(String[] args) {
        DBManager.connectionToDb();
        
        DBManager.createTable (null); //LA TABELLA è GIà ESISTENETE
        DBManager.insertRecord();
        DBManager.closeConnection();
    }





}