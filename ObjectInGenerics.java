package CollectionsConcept;
import java.util.*;
public class ObjectInGenerics {
	public static void main(String args[]){
    List<Student1> students = new ArrayList<Student1>();
    students.add(new Student1("lohith",95));
    students.add(new Student1("pavan",97));
    students.add(new Student1("abc",92));
    students.add(new Student1("xyz",85));
    students.add(new Student1("lmn",99));
	Collections.sort(students,(s1,s2)-> {return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;});
	
	for (Student1 n : students) {
		System.out.println(n);
	}
	}
}
class Student1{
	String name;
	int marks;
	public Student1(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}
