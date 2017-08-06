
public class DataFile extends BinaryFile {

	protected String compressionFormat;
	protected ExecutableFile opensWith;
	protected boolean[] bits;

	DataFile(String compressionFormat, ExecutableFile opensWith) {
		this.compressionFormat = compressionFormat;
		this.opensWith = opensWith;
	}

	@Override
	BinaryFile getCopy() {

		return new DataFile(getCompressionFormat(), getOpensWith());
	}

	@Override
	void onClick() {
		// TODO Auto-generated method stub

	}

	public String getCompressionFormat() {
		return compressionFormat;
	}

	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}

	public ExecutableFile getOpensWith() {
		return opensWith;
	}

	public void setOpensWith(ExecutableFile opensWith) {
		this.opensWith = opensWith;
	}

	public boolean[] getBits() {
		return bits;
	}

	public void setBits(boolean[] bits) {
		this.bits = bits;
	}

}
