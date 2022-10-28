package arrayAbstracts;

public class Main {

	public static void main(String[] args) {
		
		DatabaseManager databaseManager = new OracleDatabase();
		databaseManager.getData();
		
		CustomerManager customerManager= new CustomerManager();
		customerManager.baseDatabaseManager= new SqlServer();
		customerManager.getCustomers();
	}

}
