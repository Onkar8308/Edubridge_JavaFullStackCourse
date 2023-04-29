
import java.util.Scanner;
public class ArrayOfObject {
public static void main(String[] args) {
	Employee[] emp=new Employee[2];   //class_name objname[]=new class_name[size];
	 
	//create object
    for(int i=0;i<emp.length;i++) {
    	emp[i]=new Employee();
    	
    }
    
    //for input
    for(int i=0;i<emp.length;i++) {
    	
    	emp[i].inputData();
    }

    //display
    System.out.println("Employee Details");

for(int i=0;i<emp.length;i++)
{
	emp[i].displayData();
}
}
}
class Employee{
	public int age;	
	public String name;
	
	public void inputData() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter age and name");
	age=sc.nextInt();
	name=sc.next();
	}
	
	public void displayData() {
		System.out.println("name ="+name +" age ="+age);
	}
}
