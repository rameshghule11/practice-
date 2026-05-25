package encapsulation;
class Student{
	private int id;
	private String name;
	private int age;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
public class Demo {
public static void main(String args []) {
	
	Student obj=new Student();
	
	obj.setAge(23);
	obj.setId(1);
	obj.setName("Banti");
	
	System.out.println(obj.getId());
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
}
}
