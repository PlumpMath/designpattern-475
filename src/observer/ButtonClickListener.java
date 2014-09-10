package observer;

import java.util.EventListener;

public interface ButtonClickListener extends EventListener{

	void onClick(MyEvent e);
}
