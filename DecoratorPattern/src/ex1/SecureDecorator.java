package ex1;

public class SecureDecorator extends ContentDecorator{

	public SecureDecorator(EmailContent decoratedContent) {
		super(decoratedContent);
	}

	@Override
	public String getContent() {
		String content = super.getContent();
		String encryptedContent = encrypt(content);
		return encryptedContent;
	}
	
	private String encrypt(String content) {
		return content + " Encrypted";
	}
}
