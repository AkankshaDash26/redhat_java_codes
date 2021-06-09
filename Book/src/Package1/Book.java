package Package1;

public class Book {

	private String AuthorName;
	private String Title;
	private double CostPrice;
	private double SellPrice;
	private int Pages;
	
    public Book() {
    	
    }
    
    public Book(String AuthorName, String Title, double CostPrice, double SellPrice)
    {
    	this.AuthorName = AuthorName;
		this.Title = Title;
		this.CostPrice = CostPrice;
		this.SellPrice = SellPrice;
		this.Pages=Pages;
    }
    
    public String getAuthorName() {
    	return AuthorName;
    }
    
    public void setAuthorName(String AuthorName) {
    	this.AuthorName = AuthorName;
    }
    
    public String getTitle() {
    	return Title;
    }
    
    public void setTitle(String Title) {
    	this.Title = Title;
    }
    
    public double getCostPrice() {
    	return CostPrice;
    }
    
    public void setCostPrice() {
    	this.CostPrice = CostPrice;
    }
    
    public double getSellPrice() {
    	return SellPrice;
    }
    
    public void setSellPrice() {
    	this.SellPrice = SellPrice;
    }
    
    public int getPages() {
    	return Pages;
    }
    
    public void setPages(int pages) {
    	this.Pages = Pages;
    }
	
	public double netProfit()
	{
		return Math.round(this.SellPrice - this.CostPrice);
	}
	
	public double getTax()
	{
		return netProfit()*1.15;
	}

}
