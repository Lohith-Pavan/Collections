package CollectionsConcept;
import java.util.*;
public class SchoolClass {
    String className;
    Teacher teacher;
    ArrayList<Student> students;
	public SchoolClass(String className, Teacher teacher) {
		this.className = className;
		this.teacher = teacher;
		students = new ArrayList<Student>();
	}
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	void addStudent(Student student) {
    	students.add(student);
    }
    void removeStudent(Student student) {
    	students.remove(student);
    }
	@Override
	public String toString() {
		return "className=" + className + ", teacher=" + teacher + ", students=" + students;
	}
}
