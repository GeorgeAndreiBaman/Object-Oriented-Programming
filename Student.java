package OOP_Journey;

public class Student {
	
			String firstName, lastName, course, section;
			int age;
			double prelim, midterm, prefi, finals;
			
			Student(String firstName, String lastName, String course, String section,
					int age, double prelim, double midterm, double prefi, double finals){
				
				this.firstName = firstName;
				this.lastName = lastName;
				this.course = course;
				this.section = section;
				this.age = age;
				this.prelim = prelim;
				this.midterm = midterm;
				this.prefi = prefi;
				this.finals = finals;
			
			}
			
			void introduce() {
				System.out.println("Name: " + firstName + " " + lastName);
				System.out.println("Course: " + course);
				System.out.println("Section: " + section);
			}
			
			void grade(){
				double average = (prelim + midterm + prefi + finals) / 4;
				System.out.println("Average: " + average);
				
				if(average < 0 || average > 100) {
					System.out.println("Invalid Grade");
				}
				else if(average >= 98) {
					System.out.println("With Highest Honor");
				}
				else if (average >= 95) {
					System.out.println("With High Honor");
				}
				else if (average >=90) {
					System.out.println("With Honor");
				}
				else if (average >= 75) {
					System.out.println("Passed");
				}
				else {
					System.out.println("Failed");
				}
				
			}
			
			
}
		
	
	

