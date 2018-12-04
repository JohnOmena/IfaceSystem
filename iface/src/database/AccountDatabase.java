package database;
import java.util.ArrayList;
import iface.Account;

public class AccountDatabase {

	ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	public boolean serchAccount(String nickName) {
		
		for(Account account : this.accounts) {
			if(account.getNickName().equals(nickName)) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean validateAccount(Account account) {
		
		for(Account acc : this.accounts) {
			if(account.getPassword().equals(acc.getPassword()) && account.getUserAccount().equals(acc.getUserAccount())) {
				return true;
			}
		}
		
		return false;
	}
	
}
