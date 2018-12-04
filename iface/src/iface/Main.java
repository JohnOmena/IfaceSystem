package iface;
import database.AccountDatabase;
import interaction.HomeScreen;

public class Main {

	public static void main(String[] args) {	
	
		AccountDatabase accData = new AccountDatabase();
		HomeScreen home = new HomeScreen();
	
		home.homeScreen(accData);
		
		
	}
	
}
