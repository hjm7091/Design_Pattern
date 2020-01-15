package ex1;

public abstract class ContentDecorator extends EmailContent{

	private EmailContent decoratedContent;
	
	public ContentDecorator(EmailContent decoratedContent) {
		this.decoratedContent = decoratedContent;
	}
	
	@Override
	public String getContent() {
		return decoratedContent.getContent();
	}
	
}
