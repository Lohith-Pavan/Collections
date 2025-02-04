package CollectionsConcept;
@FunctionalInterface
interface A{
	void fun(int i);
}
//class Abc implements A{
//	public void fun() {
//		System.out.println("hello");
//	}
//}
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj =  i -> System.out.println("hello" + i);		 
        obj.fun(6);
	}

}
