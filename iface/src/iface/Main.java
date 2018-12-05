package iface;
import database.IfaceDatabase;
import interaction.HomeScreen;

public class Main {

	public static void main(String[] args) {	
	
		IfaceDatabase accData = new IfaceDatabase();
		HomeScreen home = new HomeScreen();
	
		home.homeScreen(accData);
		
		
	}
	
}
