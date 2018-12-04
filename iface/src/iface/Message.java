package iface;

public class Message {
	
	int messageNumber;
	String text;
	
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	
	public int getMessageNumber() {
		return this.messageNumber;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
}
