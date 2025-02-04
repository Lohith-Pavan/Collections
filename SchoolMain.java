package CollectionsConcept;

public class SchoolMain {
	  public static void main(String args[]) {
	  School school = new School();
      Student s1 = new Student("Lohith",21);
      Student s2 = new Student("Hema",22);
      Student s3 = new Student("Alekhya",21);
      Student s4 = new Student("Sunitha",21);
      Student s5 = new Student("Naveen",23);
      school.addStudent(s1);
      school.addStudent(s2);
      school.addStudent(s3);
      school.addStudent(s4);
      school.addStudent(s5);
      Teacher t1 = new Teacher("palak","Core Java");
      Teacher t2 = new Teacher("satya","Advanced Java");
      Teacher t3 = new Teacher("Ram","BootsTrap");
      school.addTeacher(t1);
      school.addTeacher(t2);
      school.addTeacher(t3);
      SchoolClass coreJava = new SchoolClass("core Java",t1);
      coreJava.addStudent(s1);
      coreJava.addStudent(s2);
      coreJava.addStudent(s3);
      coreJava.addStudent(s4);
      SchoolClass advancedJava = new SchoolClass("Advanced Java",t2);
      advancedJava.addStudent(s2);
      advancedJava.addStudent(s3);
      advancedJava.addStudent(s4);
      advancedJava.addStudent(s5);
      SchoolClass bootstrap = new SchoolClass("Bootstrap",t3);
      bootstrap.addStudent(s1);
      bootstrap.addStudent(s2);
      bootstrap.addStudent(s3);
      bootstrap.addStudent(s4);
      bootstrap.addStudent(s5);
      school.addSchoolClass(coreJava);
      school.addSchoolClass(advancedJava);
      school.addSchoolClass(bootstrap);
      System.out.println("School Information:");
      System.out.println("No of Students : "+school.getStudent().size());
      System.out.println("No of Teachers : "+school.getTeacher().size());
      System.out.println("No of Classes : "+school.getSchoolClass().size());
      System.out.println("core Java class Information : ");
      System.out.println("Class Name : "+coreJava.getClassName());
      System.out.println("Teacher Name : "+coreJava.getTeacher().name);
      System.out.println("No of Students : "+coreJava.getStudents().size());
      System.out.println("Advanced Java class Information : ");
      System.out.println("Class Name : "+advancedJava.getClassName());
      System.out.println("Teacher Name : "+advancedJava.getTeacher().name);
      System.out.println("No of Students : "+advancedJava.getStudents().size());
      System.out.println("Bootstrap class Information : ");
      System.out.println("Class Name : "+bootstrap.getClassName());
      System.out.println("Teacher Name : "+bootstrap.getTeacher().name);
      System.out.println("No of Students : "+bootstrap.getStudents().size());
      school.removeSchoolClass(bootstrap);
      school.removeTeacher(t3);
      school.removeStudent(s5);
      System.out.println("School Information:");
      System.out.println("No of Students : "+school.getStudent().size());
      System.out.println("No of Teachers : "+school.getTeacher().size());
      System.out.println("No of Classes : "+school.getSchoolClass().size());

	  }
}
