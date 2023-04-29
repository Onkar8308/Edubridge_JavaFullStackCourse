package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Student{
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}




public class ArraylistSort {

	public static void main(String[] args) {
		
		Student s1=new Student(21,"Sachin",6543);
		Student s2=new Student(10,"Akash",6431);
		Student s3=new Student(5,"Zeeba",8543);
		Student s4=new Student(23,"Muthu",5431);
		
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		System.out.println("list before sorting");

		//iterate using iterator
		
		Iterator<Student>siter=slist.iterator();
		System.out.println("Sid\tsname\tsfees");
		
		while(siter.hasNext()) {
			Student sob=siter.next();
			System.out.println(sob.sid+"\t"+sob.sname+"\t"+sob.sfees);
		}
		
		//sorting list based on ID
		
		SortStudentBasedOnId obj = new SortStudentBasedOnId();	
		Collections.sort(slist,obj);
		
		System.out.println("'list after sorting based on ID");
		
		Iterator<Student>siter1=slist.iterator();
		System.out.println("Sid\tsname\tsfees");
			
		while(siter1.hasNext()) {
			Student sob=siter1.next();
			System.out.println(sob.sid+"\t"+sob.sname+"\t"+sob.sfees);
		}
		
		
		//sorting list based on fees
		System.out.println("list after sorting based on fees");
		SortStudentBasedOnFees sof= new SortStudentBasedOnFees();
		Collections.sort(slist,sof);
		
		Iterator<Student> siter2=slist.iterator();
		System.out.println("Sid\tsname\tsfees");
		
		while(siter2.hasNext()) {
			Student sob=siter2.next();
			System.out.println(sob.getSid()+"\t"+sob.sname+"\t"+sob.sfees);
		}
		
		//sorting list based on name
		System.out.println("list after sorting based on name ");
		SortStudentBasedOnName son =new SortStudentBasedOnName();
		Collections.sort(slist,son);
		
		Iterator<Student> siter3=slist.iterator();
		System.out.println("Sid\tsname\tsfees");
		
		while(siter3.hasNext()) {
			Student sob=siter3.next();
			System.out.println(sob.sid+"\t"+sob.sname+"\t"+sob.sfees);
		}
		
		
	}
	
}

 class SortStudentBasedOnId  implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getSid()>o2.getSid()) {
			return 1;
		}
		else if (o1.sid<o2.sid) {
			return -1;
		}
		else {
		return 0;
		}
	}
}
 
 class SortStudentBasedOnFees implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
	if(o1.sfees>o2.sfees)
		return 1;
	else if(o1.sfees<o2.sfees)
		return -1;
	else
		return 0;
	}
	 
 }
 
 class SortStudentBasedOnName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sname.compareTo(o2.sname);
	}
	 
 }




	