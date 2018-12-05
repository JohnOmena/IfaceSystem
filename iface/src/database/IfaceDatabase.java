package database;
import java.util.ArrayList;
import java.util.Scanner;
import iface.Account;
import iface.Community;
import interaction.ProfileScreen;

public class IfaceDatabase {

	ArrayList<Account> accounts = new ArrayList<Account>();
	ArrayList<Community> communities = new ArrayList<Community>();
	Scanner input = new Scanner(System.in);
	
	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	public boolean serchProfile(String nickName) {
		
		for(Account account : this.accounts) {
			if(account.getNickName().equals(nickName)) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean validateUserAccount(String userAccount) {
		
		for(Account acc : this.accounts) {
			if(acc.getUserAccount().equals(userAccount)) {
				return true;
			}
		}
		
		System.out.println("This userAccount already exists, try again.");
		
		return false;
		
	}
	
	public boolean validateNickName(String nickName) {
		
		for(Account acc : this.accounts) {
			if(acc.getNickName().equals(nickName)) {
				return true;
			}
		}
		
		System.out.println("This nickname already exists, try again.");
		
		return false;		
		
	}
	
	public boolean validateAccount(Account account) {
		
		for(Account acc : this.accounts) {
			if(acc.getUserAccount().equals(account.getUserAccount()) && acc.getPassword().equals(account.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	public Account getAccount(Account account) {
		
		for(Account acc : this.accounts) {
			if(acc.getUserAccount().equals(account.getUserAccount())) {
				account = acc;
			}
		}
		
		return account;
		
	}
	
	public void acessAccount(AccountDatabase accData) {
		
		Account account = new Account();
		account = account.userAccountAndPasswordInfo();
		
		if (accData.validateAccount(account)) {
			
			ProfileScreen profileScreen = new ProfileScreen();
			profileScreen.profileScreen(accData, accData.getAccount(account));
			
			
		} else {
			
			System.out.println("This account is not registered in our system.");
			
		}
		
	}
	
	public void addCommunity(Community community) {
		this.communities.add(community);
	}
	
	
	
}
