package OOP_Journey;
public class ObjectOrientedProgramming {
	public static void main(String[] args) {

		Student student1 = new Student("George Andrei" , "Baman", "BSIT", "BSIT 302P", 20, 97.88,
				98.99, 95.00, 97.65);
		
		Student student2 = new Student("Random" , "Person", "BSIT", "BSIT 301E", 18, 91.88,
				92.99, 93.00, 95);
		
		student1.introduce();
		student1.grade();
		
		System.out.println();
		
		student2.introduce();
		student2.grade();
		
		
		
		
	}
	
}
