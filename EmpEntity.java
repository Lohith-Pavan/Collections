package CollectionsConcept;

public class EmpEntity {
      String name;
      int id;
      EmpEntity(String name,int id){
    	  this.name = name;
    	  this.id = id;
      }
      void setName(String name) {
    	  this.name = name;
      }
      void setId(int id) {
    	  this.id = id;
      }
      String getName() {
    	  return name;
      }
      int getId() {
    	  return id;
      }
      public String toString() {
    	  return "Name : "+name+ " id : "+id;
      }
}
