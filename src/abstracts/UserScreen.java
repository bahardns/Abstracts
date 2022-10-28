package abstracts;

public  abstract class UserScreen {
	//abstract kullanan metotlar override ederek kendi içerisini doldurmak zorunda.
		public abstract void login(String isim);
		
	 final void signOut() {
		 //final metodu ile tanımlanan bloklar değiştirlemez. olduğu gibi kullanılmak zorundadır.
		 System.out.println("çıkış yapıldı.");
		
	}

}
