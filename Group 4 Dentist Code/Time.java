/*

 * This class represents the time in military format

 */

public class Time {

    // Attributes

	// hours in range 0 to 23.

	private int hour;

	// minutes in range to 0 to 59 always

	private int minute;



	// Default contructor followed by single and two argument constructors
    Time(){
        hour = 0;
        minute = 0;
    }

	public void time(int hour) {
        if( hour > 23 ){
            this.hour = hour % 24;
        }
        else{
            this.hour = hour;
        }
        this.minute = 0;
	}

	public void time(int hour, int minute) {

		//if (hour < 0 || hour > 23) {

		//	hour = 23;

		//}

		//if (minute < 0 || minute > 59) {

		//	minute = 59;

		//}

        if( minute >= 60 ){
            this.hour += minute / 60;
            this.minute = minute % 60;
            
        }
        else{
            this.minute = minute;
        }
        if( hour > 23 ){
            this.hour = hour % 24;
        }
        else{
            this.hour = hour;
        }
    }


    // Getters
    public int getHour() {
		return hour;
	}


	public int getMinute() {
		return minute;
	}



	// display time of current object

	public void displayTime() {

		System.out.printf("%d:%02d", hour, minute);

	}



	public void addMinutes(int m) {
	//	minute += m;

	//	if (minute >= 60) {

	//		hour += 1;

	//		minute -= 60;

	//		if (hour >= 24) {

	//			hour = 0;

	//		}

	//	}
        int addhour = m / 60;
        int addmin = m % 60;
        hour += addhour;
        minute += addmin;
        if( minute >= 60 ){
            addhour = minute /60;
            minute = minute % 60;
            hour += addhour;
        }
        else{}
        if( hour > 23 ){
            hour = hour % 24;
        }
        else{}
    }

	
    public String toString() {

		return String.format("%d:%02d", hour, minute);

	}

	

	public static void main(String args[]) {

        Time one = new Time();
        one.time(23,59);
        one.displayTime();
        System.out.println("");
        one.addMinutes(2);
        one.displayTime();
		//Time timeObjs[] = {

		//	new Time(0),

		//	new Time(10),

		//	new Time(20, 10),

		//	new Time(10,60),

		//	new Time(24,-3),

		//	new Time(-23,-3)

		//};

		//for(Time t: timeObjs) {

		//	System.out.println(t);

		//	t.addMinutes(1);

		//	System.out.println("After adding a minute: " + t);

		//	System.out.println();

		//}

	}

}