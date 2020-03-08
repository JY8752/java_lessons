
public interface Foo {
	String say();

}

public class DefaultFoo implements Foo {
	
	private String message;
	
	public DefaultFoo(String message) {
		this.message = message;
	}
	
	@Override
	public String say() {
		return message;
	}
}

Foo foo = new DefaultFoo("Hello Foo!");

System.out.println(foo.say());

