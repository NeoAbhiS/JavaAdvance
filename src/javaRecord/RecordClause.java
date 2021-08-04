package javaRecord;


public class RecordClause {
	
	public record Person(
		    String firstName,
		    String lastName,
		    int age,
		    String address
		){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Abhi","s",35,"IN");
		
		System.out.println(p1);
		System.out.println(p1.address());
		System.out.println(p1.age());
		

	}

}
