package Day4Topics;

public class ProductClass 
{
	private String productId;
	private String productName;
	private String productPrice;
	private String expiryDate;

	public String getProductId()
	{
		return productId;
	}

	public void setProductid(String s)
	{
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			boolean b=Character.isDigit(s.charAt(i));
           
			if (b) 
			{
				s1=s1+s.charAt(i);
			}
		}
		int size=s1.length();
		if (size==3) 
		{
			this.productId=s;
		}
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String s) 
	{
		int size = s.length();
		
		if (size>=1 & size<=15) 
		{
			this.productName=s;
		}
	
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String s)
	{
		int price=Integer.parseInt(s);
		if (price>0) 
		{
			this.productPrice=s;
		}
		
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}






