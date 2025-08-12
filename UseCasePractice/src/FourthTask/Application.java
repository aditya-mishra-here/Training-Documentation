package FourthTask;

public class Application {

	public static void main(String[] args) {
		
		Authenticator auth = new Authenticator();
		auth.loadUsers("users.txt");
		
		auth.authenticate("user1", "pass@123");
	}

}
