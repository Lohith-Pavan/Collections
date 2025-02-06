package CollectionsConcept;

public class SchoolMain {
	public static void main(String args[]) {
	  School school = new School();
	  Student s1 = new Student("Lohith",21);
	  Student s2 = new Student("Pavan",22);
	  Student s3 = new Student("Hema",22);
	  Student s4 = new Student("Alekhya",21);
	  Student s5 = new Student("Naveen",23);
	  school.addStudent(s1);
	  school.addStudent(s2);
	  school.addStudent(s3);
	  school.addStudent(s4);
	  school.addStudent(s5);
	  Teacher t1 = new Teacher("palak","Core Java");
	  Teacher t2 = new Teacher("satya","Advanced Java");
	  Teacher t3 = new Teacher("ram","Bootstrap");
	  school.addTeacher(t1);
	  school.addTeacher(t2);
	  school.addTeacher(t2);
	  SchoolClass sc1 = new SchoolClass("Core Java",t1);
	  sc1.addStudent(s1);
	  sc1.addStudent(s2);
	  sc1.addStudent(s3);
	  sc1.addStudent(s4);
	  SchoolClass sc2 = new SchoolClass("Advanced Java",t2);
	  sc2.addStudent(s2);
	  sc2.addStudent(s3);
	  sc2.addStudent(s4);
	  sc2.addStudent(s5);
	  SchoolClass sc3 = new SchoolClass("Bootstrap",t3);
	  sc3.addStudent(s1);
	  sc3.addStudent(s2);
	  sc3.addStudent(s3);
	  sc3.addStudent(s4);
	  sc3.addStudent(s5);
	  school.addSchoolClass(sc1);
	  school.addSchoolClass(sc2);
	  school.addSchoolClass(sc3); 
	  System.out.println("Institute Information : ");
	  System.out.println("No of Students: "+ school.getStudents().size());
	  for(Student n : school.getStudents()) {
		  System.out.println(n);
	  }
	  System.out.println("No of Teachers: "+ school.getTeachers().size());
	  for(Teacher n : school.getTeachers()) {
		  System.out.println(n);
	  }
	  System.out.println("No of Classes: "+ school.getSchoolClass().size());
	  for(SchoolClass n : school.getSchoolClass()) {
		  System.out.println(n);
	  }
	  System.out.println();
	  System.out.println("Core Java class : ");
	  System.out.println("Class Name : "+ sc1.className);
	  System.out.println("Teacher : "+ sc1.getTeacher().name);
	  System.out.println("No of Students : "+sc1.getStudents().size());
	  for(Student n : sc1.getStudents()) {
		  System.out.println(n);
	  }
	  System.out.println();
	  System.out.println("Advanced Java class : ");
	  System.out.println("Class Name : "+ sc2.className);
	  System.out.println("Teacher : "+ sc2.getTeacher().name);
	  System.out.println("No of Students : "+sc2.getStudents().size());
	  for(Student n : sc2.getStudents()) {
		  System.out.println(n);
	  }
	  System.out.println();
	  System.out.println("Bootstrap class : ");
	  System.out.println("Class Name : "+ sc3.className);
	  System.out.println("Teacher : "+ sc3.getTeacher().name);
	  System.out.println("No of Students : "+sc3.getStudents().size());
	  for(Student n : sc3.getStudents()) {
		  System.out.println(n);
	  }
	  for(SchoolClass n : school.getSchoolClass()) {
		  System.out.println(n);
	  }
	  school.removeStudent(s2);
	  school.removeTeacher(t1);
	  school.removeSchoolClass(sc1);
	  System.out.println();
	  System.out.println("After deleting one student,teacher and class \nInstitute Information : ");
	  System.out.println("No of Students: "+ school.getStudents().size());
	  for(Student n : school.getStudents()) {
		  System.out.println(n);
	  }
	  System.out.println("No of Teachers: "+ school.getTeachers().size());
	  for(Teacher n : school.getTeachers()) {
		  System.out.println(n);
	  }
	  System.out.println("No of Classes: "+ school.getSchoolClass().size());
	  for(SchoolClass n : school.getSchoolClass()) {
		  System.out.println(n);
	  }
	}
}
