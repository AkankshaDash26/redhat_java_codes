package Package1;

public class EBook extends Book {
	
	private String downloadSite;
	private double sizeMB;
	
	
	
	
	public Ebook() {
		super();
	}
	
	public Ebook(String downloadSite, double sizeMB) {
		super();
		this.downloadSite = downloadSite;
		this.sizeMB = sizeMB;
	}
	
	public String getDownloadSite() {
		return downloadSite;
	}
	
	public void setDownloadSize(String downloadSite) {
		this.downloadSite = downloadSite;
	}
	
	public double getSizeMB() {
		return sizeMB;
	}
	
	public void setSizeMB(double sizeMB) {
		this.sizeMB = sizeMB;
	}
	
	public double pageSize()
	{
		return getSizeMB()/getPages();
	}
	
	public String printTitle()
	{
		return getTitle();
	}
	@Override
	public double getTax() {
		return super .getTax();
	}


}
