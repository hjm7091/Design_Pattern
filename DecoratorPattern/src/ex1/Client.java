package ex1;

public class Client {

	public static void main(String[] args) {
		EmailContent simple = new BasicEmailContent("Hello");
		System.out.println(simple.getContent());
		
		System.out.println();
		
		EmailContent external = new ExternalDecorator(simple);
		System.out.println(external.getContent());
		
		System.out.println();
		
		EmailContent secure = new SecureDecorator(simple);
		System.out.println(secure.getContent());
		
		System.out.println();
		
		EmailContent secureAfterExternal = new SecureDecorator(external);
		System.out.println(secureAfterExternal.getContent());
	}
	
}
