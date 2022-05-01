public class Student {
    
    void displayStudentDetails(int roll, String name, int marks)
    {

        System.out.println("Roll no: "+roll);
        System.out.println("Name : "+name);
        System.out.println("Marks: "+marks);

    }

    public static void main(String[] args) {

        Student s1 = new Student();

        
        s1.displayStudentDetails(01,"Abhinandan",350);
	System.out.println(s1);


        Student s2 = new Student();

        
        s2.displayStudentDetails(10, "Aman", 349);
	
	System.out.println(s2);

        s1 = null;
	s2=null;
	System.out.println(s1);
	System.out.println(s2);	

        




    }
}