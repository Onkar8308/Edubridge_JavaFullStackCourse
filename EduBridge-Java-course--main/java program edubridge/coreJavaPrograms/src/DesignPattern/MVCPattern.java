package DesignPattern;
class Student
{
    private String rollNo;
    private String name;
    
    public String getRollNo()
    {
        return rollNo;
    }
    
    public void setRollNo(String rollNo)
    {
        this.rollNo = rollNo;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
 
class StudentView
{
    public void printStudentDetails(String studentName, String studentRollNo)
    {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
 
class StudentController
{
    private Student model;
    private StudentView view;
 
    public StudentController(Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }
 
    public void setStudentName(String name)
    {
        model.setName(name);       
    }
 
    public String getStudentName()
    {
        return model.getName();       
    }
 
    public void setStudentRollNo(String rollNo)
    {
        model.setRollNo(rollNo);       
    }
 
    public String getStudentRollNo()
    {
        return model.getRollNo();       
    }
 
    public void updateView()
    {               
        view.printStudentDetails(model.getName(), model.getRollNo());
    }   
}
 
class MVCPattern
{
    public static void main(String[] args)
    {
        Student model  = retriveStudentFromDatabase();
 
        StudentView view = new StudentView();
 
        StudentController controller = new StudentController(model, view);
 
        controller.updateView();
 
        controller.setStudentName("Om Phand");
        controller.setStudentRollNo("452UC54");
 
        controller.updateView();
    }
 
    private static Student retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Onkar Katewal");
        student.setRollNo("1820AVC1512");
        return student;
    }
     
}
