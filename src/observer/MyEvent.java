package observer;

import java.util.EventObject;

public class MyEvent extends EventObject {
	
	private int eventType;

	public MyEvent(Object arg0) {
		super(arg0);
		this.eventType = EventType.CLICK;
	}
	
	public MyEvent(Object arg0,int eventType) {
		super(arg0);
		this.eventType = eventType;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	
	

}
