package ex1;

public class ExternalDecorator extends ContentDecorator{

	public ExternalDecorator(EmailContent decoratedContent) {
		super(decoratedContent);
	}
	
	@Override
	public String getContent() {
		String content = super.getContent();
		String externalContent = addDisclaimer(content);
		return externalContent;
	}
	
	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}

}
