package observer;

import java.util.EventListener;

public interface ButtonDoubleClickListener extends EventListener {
	
	void onDoubleClick(MyEvent e);

}
