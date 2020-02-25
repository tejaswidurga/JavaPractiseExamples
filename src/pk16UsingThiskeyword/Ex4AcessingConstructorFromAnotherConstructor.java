package pk16UsingThiskeyword;
public class Ex4AcessingConstructorFromAnotherConstructor {
int a = 10;
	Ex4AcessingConstructorFromAnotherConstructor(){
		this("Subbus Selenium Tutorials");
		System.out.println("Normal Constructor");
		}
	public Ex4AcessingConstructorFromAnotherConstructor(String string) {
	
}
	void ThisExample(String str){
		System.out.println("Parameterized constructor and paramenter is "+str);
}
	public static void main(String[] args) {	
		Ex4AcessingConstructorFromAnotherConstructor te = new Ex4AcessingConstructorFromAnotherConstructor();
}
}
