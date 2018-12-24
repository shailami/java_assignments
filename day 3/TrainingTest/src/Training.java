
public abstract class Training {
	protected int id;
	protected String subject;
	protected long fees;
	
	 Training(int id,String subject,long fees)
	{
		this.id=id;
		this.subject=subject;
		this.fees=fees;
	}
	 public abstract long getOrderValue();

}
