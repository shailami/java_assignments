
public class Television {
	private String state;
	private int currentChannel;
	private int currentVolume;
	
	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state=state;
	}

	public int getCurrentChannel() {
		return this.currentChannel;
	}

	public int getCurrentVolume() {
		return this.currentVolume;
	}

	public void setCurrentChannel(int channel) {
		this.currentChannel=channel;	
	}

	public void setCurrentVolume(int volume) {
		this.currentVolume=volume;
	}

	public int AddVolume(int addVolume) {
		this.currentVolume+=addVolume;
		return currentVolume;
	}

	public int decreaseVolume(int decreaseVolume) {
		this.currentVolume-=decreaseVolume;
		return this.currentVolume;
	}

	public int changeChannel(int newChannel) {
		this.currentChannel=newChannel;
		return this.currentChannel;
	}

	public String changeState(String newState) {
		this.state=newState;
		return this.state;
	}

}
