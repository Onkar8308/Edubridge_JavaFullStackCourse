package DoSelectAssignments;

import java.util.Scanner;
class Elevator{
	static int recentFloor = 0;
	public void selectFloor(int selectedFloor) {
		 
		
		if(selectedFloor>recentFloor) {
			System.out.print("going up..");
			for(int j=recentFloor+1;j<=selectedFloor;j++) {
				System.out.print(j+"..");
				recentFloor=j;
				}
			System.out.println("ding"	);
		}
		else if(selectedFloor<recentFloor) {
			System.out.print("going down..");
			for(int k=recentFloor-1;k>=selectedFloor;k--) {
				System.out.print(k+"..");
				recentFloor=k;
				}
			System.out.println("ding"	);
		}
		else 
			System.out.println("you are on same floor");

	}
	public void fireAlarm() {
		System.out.println("Danger! You must exit the building now! ");
		recentFloor=1;	
	}
	
}

class InvalidSelection extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvalidSelection(String msg){
		super();
		
	}
}

public class ElevatorMain {
	public static void main(String[] args) throws InvalidSelection{
		String choice;
		while(true){
		System.out.println("option: (s) Select Floor,(f)Fire alarm,(q)Quit");
		Scanner sc = new Scanner(System.in);
		choice=sc.next().toLowerCase();
		Elevator e= new Elevator();
		switch(choice) {
		case "s":
			System.out.println("Enter the floor that you'd like to go ==>");
			int floorNumber=sc.nextInt();
			if(floorNumber>=0&&floorNumber<=10) {
			e.selectFloor(floorNumber);
			}
			else
				throw new InvalidSelection("invalid selection");
			break;
		case "f":
			e.fireAlarm();
			break;
		case "q":
				System.out.println("Terminated!!");
				System.exit(0);
				break;
		default:
			System.out.println("wrong choice please select appropriate choice");
			break;
			
		}
		}
		
	}

}
