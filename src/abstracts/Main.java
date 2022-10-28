package abstracts;

public class Main {

	public static void main(String[] args) {

		UserScreen userScreen = new KidsUser();
		userScreen.login("bahar");
		userScreen.signOut();


	}

}
