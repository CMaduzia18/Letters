
public class Letters {
	public static void main(String[] args){
		sister();
		brother();
		mother();
		
	}
	public static void dear(String name){
		System.out.println("Dear " + name +",");
	}
	public static void from(){
		System.out.println("From,");
		System.out.println("Connor\n \n");
	}
	public static void paragraph(){
		System.out.println("\tThank you very very much for the thing.");
		System.out.println("I thoroughly enjoyed recieving what you sent to me.");
		System.out.println("I await seeing you again in person");
	}
	public static void sister(){
		dear("sister");
		paragraph();
		System.out.println("How is college?\n");
		from();
		
	}
	public static void brother(){
		dear("brother");
		paragraph();
		System.out.println("How is elementary school?\n");
		from();
		
	}
	public static void mother(){
		dear("mother");
		paragraph();
		System.out.println("How are the adult education classes?\n");
		from();
		
	}
}
