package person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String jobTitle;
    
    public Person() {}
    
    public Person(String firstName, String lastName, int age, String jobTitle) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    	this.jobTitle = jobTitle;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    
    public String getJobTitle() {
    	return jobTitle;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if ((age<0)||(age>100)){
            this.age=0;
        } else {
            this.age=age;
        }
    }
    
    public void setJobTitle(String jobTitle) {
    	this.jobTitle = jobTitle;
    }
	
    @Override
	public String toString() {
		return "Person [firstName= " + firstName + ", lastName= " + lastName + ", age= " + age + ", jobTitle= " + jobTitle
				+ "]";
	}
    
    
}