package mavenproject;

public class Student {
	
	String Name="Barani";
	
    int rollnumb=1234;
    
    public int college() {
    	System.out.println("College method");
    	int deptcode=1;
    	return deptcode;
    	
    }

    public static void main(String[] args) {
		Student obj=new Student();
		int output=obj.college();
		System.out.println(output);
		
		
	}
}
