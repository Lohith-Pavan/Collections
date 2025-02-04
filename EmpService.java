package CollectionsConcept;
import java.util.*;
public class EmpService {
	 Scanner sc = new Scanner(System.in);
     Set<EmpEntity> s1 = new HashSet<EmpEntity>();
     EmpEntity e1 = new EmpEntity("Lohith",1);
     EmpEntity e2 = new EmpEntity("Pavan",2);
     EmpEntity e3 = new EmpEntity("Dunga",3);
     EmpService(){
    	 s1.add(e1);
    	 s1.add(e2);
    	 s1.add(e3); 	 
     }
     void display() {
    	 for(EmpEntity d : s1) {
    		 System.out.println(d);
    	 }
     }
     void addEmp() {
    	 System.out.print("Enter Name: ");
    	 String name = sc.next();
    	 System.out.print("Enter Id: ");
    	 int id = sc.nextInt();
    	 EmpEntity obj = new EmpEntity(name,id);
    	 s1.add(obj);
     }
     void search() {
    	 System.out.print("Enter Id:");
    	 int id = sc.nextInt();
    	 for (EmpEntity x : s1) {
    		 if(x.id == id) {
    			 System.out.println(x);
    			 break;
    		 }
    	 }
     }
     void delete() {
    	 System.out.print("Enter Id: ");
    	 int id = sc.nextInt();
    	 for (EmpEntity x : s1) {
    		 if(x.id == id) {
    			 s1.remove(x);
    			 break;
    		 }
    	 }
     }
     void update() {
    	 System.out.print("Enter Id:");
    	 int id = sc.nextInt();
    	 sc.nextLine();
    	 System.out.println("Enter Name: ");
    	 String name = sc.nextLine();
    	 for (EmpEntity x : s1) {
    		 if(x.id == id) {
    			 x.setName(name);
    			 break;
    		 }
    	 }
     }
}
