package pk15usingSuperKeyword;

public class Ex4AccessingParentClassNoArgConstructorClass extends Ex3AccessingParentClassNoArgConstructorParent {
	
	Ex4AccessingParentClassNoArgConstructorClass(){
			super(100);
			System.out.println("I am child class constructor");
		}
		public static void main(String[] args) {
			Ex4AccessingParentClassNoArgConstructorClass c1 = new Ex4AccessingParentClassNoArgConstructorClass();


}
}
