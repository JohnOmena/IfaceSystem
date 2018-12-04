package iface;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {

	String userAccount;
	String password;
	String nickName;
	ArrayList<Friendship> friendship = new ArrayList<Friendship>();
	
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

	public Account createAccount() {
			
		Account account = new Account();
		
		System.out.println("What is the userAccount?");
		String userAccount = input.nextLine();
		account.setUserAccount(userAccount);
		
		System.out.println("What is the password?");
		String password = input.nextLine();
		account.setPassword(password);
		
		System.out.println("What is the nickName?");
		String nickName = input.nextLine();
		account.setNickName(nickName);
		
		return account;
		
	}

}
