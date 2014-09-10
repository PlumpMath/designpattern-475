package observer;

import java.util.Enumeration;
import java.util.EventListener;
import java.util.Vector;

public class MyButton extends MySource{
	
	private String icon;
	
	public MyButton() {
		super();
	}

	public MyButton(String icon) {
		super();
		this.icon = icon;
	}
	
	
	

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public void click(){
		Enumeration enu = listeners.elements();     
        while(enu.hasMoreElements()) {     
        	EventListener l =  (EventListener) enu.nextElement();
        	if(l instanceof ButtonClickListener){
        		ButtonClickListener clickListener = (ButtonClickListener) l;
        		clickListener.onClick(new MyEvent(this, EventType.CLICK));
        	}
        }    
	}
	
	public void doubleClick(){
		Enumeration enu = listeners.elements();     
        while(enu.hasMoreElements()) {     
        	EventListener l =  (EventListener) enu.nextElement();
        	if(l instanceof ButtonDoubleClickListener){
        		ButtonDoubleClickListener clickListener = (ButtonDoubleClickListener) l;
        		clickListener.onDoubleClick(new MyEvent(this, EventType.DOUBLE_CLICK));
        	}
        }  
	}
	
	public void handler(){
		handler(EventType.CLICK);
	}
	
	public void handler(int eventType){
		Enumeration enu = listeners.elements();     
        while(enu.hasMoreElements()) {     
        	EventListener l =  (EventListener) enu.nextElement();
        	if(l instanceof MyListener){
        		MyListener ml = (MyListener) l;
        		ml.onHandler(new MyEvent(this, eventType));
        	}
        } 
	}
	
	public void doHandler(int eventType){
		switch (eventType) {
		case EventType.CLICK:
			
			break;
		
		case EventType.DOUBLE_CLICK:
			break;
		
		case EventType.PRESS:
			break;
			
		case EventType.RELEASE:
			break;

		default:
			break;
		}
	}
	
	private EventListener getListener(int eventType){
		Enumeration enu = listeners.elements();
        while(enu.hasMoreElements()) {     
        	EventListener l =  (EventListener) enu.nextElement();
        	if(l instanceof ButtonDoubleClickListener){
        		ButtonDoubleClickListener clickListener = (ButtonDoubleClickListener) l;
        		clickListener.onDoubleClick(new MyEvent(this, EventType.DOUBLE_CLICK));
        	}
        }  
		return null;
	}
	
}
