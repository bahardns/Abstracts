package arrayAbstracts;

public class CustomerManager {

	//customerManager sınıfı bir veritabanı ile çalışacak ve tek bir veritabanına bağımlı olmaması için Base sınıfa bağlanılır ve hangi veri tabanı sistemi kullanılmak isteniyorsa onun getDAtası çalışır.  
	DatabaseManager baseDatabaseManager;
	public void getCustomers() {
		baseDatabaseManager.getData();
	}
}
