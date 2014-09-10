package adapter.clazz;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("Adapter method2");

	}

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();

	}

}
