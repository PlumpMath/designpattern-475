package observer;

import java.util.EventListener;

public interface MyListener extends EventListener{

	void onHandler(MyEvent e);
}
