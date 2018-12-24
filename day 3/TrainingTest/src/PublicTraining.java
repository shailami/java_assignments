
public class PublicTraining extends Training {
	private int participants;

	PublicTraining(int id, String subject, long fees,int participants) {
		super(id, subject, fees);
		this.participants=participants;
		// TODO Auto-generated constructor stub
	}
	
	public long getOrderValue()	 	
	{
		return (this.fees * this.participants);
	}

}
