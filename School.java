package CollectionsConcept;

import java.util.*;

public class School {
     ArrayList<Student> students;
     ArrayList<Teacher> teachers;
     ArrayList<SchoolClass> Class;
     School(){
    	 this.students = new ArrayList<Student>();
    	 this.teachers = new ArrayList<Teacher>();
    	 this.Class = new ArrayList<SchoolClass>();
     }
     void addStudent(Student student) {
    	 students.add(student);
     }
     void removeStudent(Student student) {
    	 students.remove(student);
     }
     void addTeacher(Teacher teacher) {
    	 teachers.add(teacher);
     }
     void removeTeacher(Teacher teacher) {
    	 teachers.remove(teacher);
     }
     void addSchoolClass(SchoolClass schoolClass) {
    	 Class.add(schoolClass);
     }
     void removeSchoolClass(SchoolClass schoolClass) {
    	 Class.remove(schoolClass);
     }
     ArrayList<Student> getStudent(){
    	 return students;
     }
     ArrayList<Teacher> getTeacher(){
    	 return teachers;
     }
     ArrayList<SchoolClass> getSchoolClass(){
    	 return Class;
     }
}
