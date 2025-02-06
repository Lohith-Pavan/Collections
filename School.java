package CollectionsConcept;

import java.util.*;

public class School {
     ArrayList<Student> students;
     ArrayList<Teacher> teachers;
     ArrayList<SchoolClass> schoolClass;
     School(){
    	 students = new ArrayList<Student>();
    	 teachers = new ArrayList<Teacher>();
    	 schoolClass = new ArrayList<SchoolClass>();
     }
     void addStudent(Student student) {
    	 
    	 students.add(student);
     }
     void removeStudent(Student student) {
    	 students.remove(student);
    	 for(SchoolClass n : schoolClass) {
    		 n.removeStudent(student);
    	 }
     }
     void addTeacher(Teacher teacher) {
    	 teachers.add(teacher);
     }
     void removeTeacher(Teacher teacher) {
    	 teachers.remove(teacher);
     }
     void addSchoolClass(SchoolClass Class) {
    	 schoolClass.add(Class);
     }
     void removeSchoolClass(SchoolClass Class) {
    	 schoolClass.remove(Class);
     }
     ArrayList<Student> getStudents(){
    	 return students;
     }
     ArrayList<Teacher> getTeachers(){
    	 return teachers;
     }
     ArrayList<SchoolClass> getSchoolClass(){
    	 return schoolClass;
     }
}
