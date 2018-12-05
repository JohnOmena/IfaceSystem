package iface;
import java.util.ArrayList;
import java.util.Scanner;
import database.IfaceDatabase;

public class Account {

	String userAccount;
	String password;
	String nickName;
	ArrayList<Friendship> friendship = new ArrayList<Friendship>();
	ArrayList<Community> mycommunities = new ArrayList<Community>();
	
	Scanner input = new Scanner(System.in);
	
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
	public String getUserAccount() {
		return this.userAccount;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return this.nickName;
	}

	public Account createAccount(IfaceDatabase accData) {
			
		Account account = new Account();
		account = account.nickAndUserNameInfo(accData);
		
		System.out.println("What is the password?");
		String password = input.nextLine();
		account.setPassword(password);
		
		return account;
		
	}

	public Account nickAndUserNameInfo(IfaceDatabase accData) {
		
		Account account = new Account();
		
		String nickName, userAccount;
		
		do {
			
			System.out.println("What is the nickName?");
			nickName = input.nextLine();
			System.out.println("What is the userAccount?");
			userAccount = input.nextLine();
			
		} while(accData.validateNickName(nickName) && accData.validateUserAccount(userAccount));
		
		account.setNickName(nickName);
		account.setUserAccount(userAccount); 
		
		return account;
		
	}
	
	public Account userAccountAndPasswordInfo() {
		
		Account account = new Account();
		
		System.out.println("What is the userAccount?");
		String userAccount = input.nextLine();
		System.out.println("What is the password?");
		String password = input.nextLine();
		
		account.setUserAccount(userAccount);
		account.setPassword(password);
		
		return account;
		
	}
	
}
