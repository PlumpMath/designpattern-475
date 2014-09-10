package observer;

public class MyTest {

	public static void main(String[] args) {
		
		MyButton btn1 = new MyButton();
		btn1.setName("btn1");
		
		btn1.addListener(new ButtonClickListener() {
			@Override
			public void onClick(MyEvent e) {
				System.out.println(((MyButton)e.getSource()).getName()+",click");
			}
		});
		
		btn1.addListener(new ButtonDoubleClickListener() {
			@Override
			public void onDoubleClick(MyEvent e) {
				System.out.println(((MyButton)e.getSource()).getName()+",double click");
			}
		});
		
		btn1.addListener(new MyListener() {
			@Override
			public void onHandler(MyEvent e) {
				switch (e.getEventType()) {
				case EventType.CLICK:
					System.out.println(((MyButton)e.getSource()).getName() + " ,click ," + EventType.CLICK);
					break;
				case EventType.DOUBLE_CLICK:
					System.out.println(((MyButton)e.getSource()).getName() + " ,DOUBLE_CLICK ," + EventType.DOUBLE_CLICK);
					break;
				case EventType.PRESS:
					System.out.println(((MyButton)e.getSource()).getName() + " ,PRESS ," + EventType.PRESS);
					break;
				case EventType.RELEASE:
					System.out.println(((MyButton)e.getSource()).getName() + " ,RELEASE ," + EventType.RELEASE);
					break;

				default:
					break;
				}
			}
		});
		
		btn1.click();
		btn1.doubleClick();
		btn1.handler();
	}
}
