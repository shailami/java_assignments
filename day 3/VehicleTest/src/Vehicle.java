
public class Vehicle {
	private static int vehicleIdentificationNumber;
	private int currentSpeed=0;
	private int currentDirection=0;
	private String ownerName;
	private int vehicleIdNumber;
	enum Direction{North,East,West,South,NorthEast,NorthWest,SouthEast,SouthWest};
	static{
		vehicleIdentificationNumber=101;
	}
	{
		vehicleIdentificationNumber++;
	}
	public Vehicle()
	{
		this.vehicleIdNumber=vehicleIdentificationNumber;
	}
	public Vehicle(String ownerName)
	{
		this.vehicleIdNumber=vehicleIdentificationNumber;
		this.ownerName=ownerName;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getVehicleIdNumber()
	{
		return this.vehicleIdNumber;
	}
	public int changeCurrentSpeed(int newSpeed) {
		this.currentSpeed=newSpeed;
		return this.currentSpeed;
	}
	public int stop() {
		this.currentSpeed=0;
		return this.currentSpeed;
	}
	public String twoTurn(String vehicleDirection, int degree) {
		Direction d1=Direction.East;
		if(vehicleDirection=="left"){
		this.currentDirection=this.currentDirection+degree;
		}
		else
		{
		this.currentDirection=this.currentDirection-degree;	
		System.out.println(this.currentDirection);
		}
		if((this.currentDirection>0 && this.currentDirection<90 )||(this.currentDirection<-270 && this.currentDirection>-360))
		{
			d1=Direction.NorthEast;
		}
		else if((this.currentDirection>90 && this.currentDirection<180 )||(this.currentDirection<-180 && this.currentDirection>-270))
		{
			d1=Direction.NorthWest;
		}
		else if((this.currentDirection>180 && this.currentDirection<270)||(this.currentDirection<-90 && this.currentDirection>-180))
		{
			d1=Direction.SouthWest;
		}
		else if((this.currentDirection>180 && this.currentDirection<360)||(this.currentDirection<0 && this.currentDirection>-90))
		{
			d1=Direction.SouthEast;
		}
		else if(this.currentDirection==90||this.currentDirection==-90)
		{
			d1=Direction.North;
		}
		else if(this.currentDirection==180||this.currentDirection==-180)
		{
			d1=Direction.West;
		}
		else if(this.currentDirection==270||this.currentDirection==-270)
		{
			d1=Direction.South;
		}
		
		return d1.toString();
	}
	

}
