package day2Topics;

public class Mobile 
{
	private String mobile_no;

	public String getMobile_no() {
		return mobile_no;
	}
	
	public void setMobileNo(String mobile_no)
	{
		this.mobile_no=mobile_no;
	}

	@Override
	public String toString() {
		return "[mobile_no=" + mobile_no + "]";
	}
	
	
}
