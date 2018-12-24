
public class CorporateTraining extends Training {
	private int days;
	
	CorporateTraining(int id,String subject,long fees, int days)
	{
		super(id,subject,fees);
		this.days=days;
	}
	 
	public long getOrderValue()
	{
		return (this.fees * this.days);
	}


}
