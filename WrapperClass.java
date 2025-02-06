package CollectionsConcept;

public class WrapperClass {
    public static void main(String args[]) {
    	int a = 5;
    	Integer aa = new Integer(a); //Boxing
    	Integer jj = a; // AutoBoxing
    	int j = jj.intValue();  //UnBoxing
    	int k = jj; //AutoUnboxing
    	System.out.println(a);
    	System.out.println(aa);
    	System.out.println(jj);
    	System.out.println(j);
    	System.out.println(k);
    }
}
