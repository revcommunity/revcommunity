package praca.inzynierska.i4.util;

/**
 * Class represents message with is sending to javaScript
 * @author tstraszewski
 *
 */
public class Message {
	
	private Object message;
	
	public Message(Object data) {	
		this.message = data;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}
	
}
