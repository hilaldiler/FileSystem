import java.util.List;

public class HtmlFile extends TextFile {

	ExecutableFile browser;
	List<HtmlFile> linksTo;

	public HtmlFile(ExecutableFile browser, List<HtmlFile> linksTo) {
		super();
		this.browser = browser;
		this.linksTo = linksTo;
	}
	
	public HtmlFile(ExecutableFile browser) {
		this.browser = browser;
	}

	public ExecutableFile getBrowser() {
		return browser;
	}

	public void setBrowser(ExecutableFile browser) {
		this.browser = browser;
	}

	public List<HtmlFile> getLinksTo() {
		return linksTo;
	}

	public void setLinksTo(List<HtmlFile> linksTo) {
		this.linksTo = linksTo;
	}

	@Override
	void onClick() {
		// TODO Auto-generated method stub

	}

}
