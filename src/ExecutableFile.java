
public class ExecutableFile extends BinaryFile {

	protected String platform;
	protected byte[] contents;
	
	public ExecutableFile(String platform) {
		this.platform = platform;
	}
	
	@Override
	BinaryFile getCopy() {
		return new ExecutableFile(getPlatform());
	}

	@Override
	void onClick() {
		// TODO Auto-generated method stub
		
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public byte[] getContents() {
		return contents;
	}

	public void setContents(byte[] contents) {
		this.contents = contents;
	}
	

}
