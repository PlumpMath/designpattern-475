package observer;

import java.util.Enumeration;
import java.util.EventListener;
import java.util.EventObject;
import java.util.Vector;

public abstract class MySource {

	protected Vector<EventListener> listeners = new Vector<>();

	private String name;
	public MySource() {
		super();
	}
	
	protected void addListener(EventListener l){
		listeners.add(l);
	}
	
	protected void notifyDemoEvent(EventObject e, Vector<EventListener> l){
		
	}
	
	/*protected void notifyDemoEvent() { 
        Enumeration enu = listeners.elements();     
        while(enu.hasMoreElements()) {     
        	ButtonDoubleClickListener l = (ButtonDoubleClickListener) enu.nextElement();
        	l.handler(new MyEvent(this));
        }     
	}     */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*protected abstract void onClick();
	protected abstract void onDoubleClick();
	protected abstract void onRightClick();
	protected abstract void onPress();
	protected abstract void onRealease();*/
}
