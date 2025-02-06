package CollectionsConcept;

import java.util.*;
public class Comparableex {
	public static void main(String args[]){
    List<Student2> students = new ArrayList<Student2>();
    students.add(new Student2("lohith",95));
    students.add(new Student2("pavan",97));
    students.add(new Student2("abc",92));
    students.add(new Student2("xyz",85));
    students.add(new Student2("lmn",99));
	Collections.sort(students);
	
	for (Student2 n : students) {
		System.out.println(n);
	}
	}
}
class Student2 implements Comparable<Student2>{
	String name;
	int marks;
	public Student2(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Student2 s) {
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
}
