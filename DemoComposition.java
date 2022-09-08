package bridgelabz.javapractice.Basics;
class Engine{
	void performance(){
		System.out.println("Engine is smooth");
	}
}
class Polo{
	Engine ob1;
	Polo(){
		ob1=new Engine();
	}
	void wheels() {
		ob1.performance();
		System.out.println("no of wheels = 4");
	}
}
public class DemoComposition {
	public static void main(String[] args) {
	Polo ob=new Polo();
	ob.wheels();
}}
