package iface;
import java.util.ArrayList;

public class Friendship {

	String nameFriend;
	ArrayList<Message> messages = new ArrayList<Message>();
	
	public void setNameFriend(String nameFriend) {
		this.nameFriend = nameFriend;
	}
	
	public String getFriend() {
		return this.nameFriend;
	}
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}
	
}
