
public class Car {
	//attributes
	int gear = 1;
	int location;
	int speed = 0;
	final int destination = 250;
	
	//methods
	
	void reverseGear() {
		gear-- ;
	}
    void gearUp() {
    	if(gear >= 6){
    		System.out.println("Error: Gear cannot be increase.");
    	}
    	else { gear = gear++;}
    }
	void gearDown() {
		if(gear <= -1){
			System.out.print("Error: Gear is in the reverse gear; Can not decrease any further");
		}
		else {gear = gear--; }
	}
	int reportGear() {
		return gear;
	}
	int reportLocation() {
		return location;
	}
	int reportRemaining() {
		return destination - location;
		
	}
	void moveByTime(int x) {
		if(x >=0){
		// x = time
			speed = gear * 20;
			int delta = speed * x;
			location = location + delta;
		}
		
		else{
			System.out.println("Error: Time is should be positive.");
		}
		
		
		
	}
	boolean isArrived() {
		if (location >= destination ){
			return true;
		}
		else {
			return false;
		}
	}

}
