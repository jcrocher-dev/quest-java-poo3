public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    
    public void setAltitude(int meters){
	this.altitude = meters;
	}

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


	@Override
	public void takeOff(){
		if (!this.flying){		
			System.out.println(this.getName() + " takes off in the sky.");
		}
	}

	@Override
	public int ascends(int meters){
		this.altitude = this.altitude + meters;
		System.out.println(this.getName() + " fly upward, altitude : " + this.altitude);
		return this.altitude;
	}

	@Override
	public int descend(int meters){
		this.altitude = this.altitude - meters;
		System.out.println(this.getName() + " fly downward, altitude : " + this.altitude);
		return this.altitude;	
	}

	@Override
	public void land(){
		if (this.altitude > 1){
			System.out.println(this.getName() + "is too high, it can't lands.");
		}
		else {
			System.out.println(this.getName() + "lands on the ground.");
		}	
	}

}
