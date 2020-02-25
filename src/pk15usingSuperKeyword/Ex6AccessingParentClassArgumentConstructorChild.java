package pk15usingSuperKeyword;


	public class Ex6AccessingParentClassArgumentConstructorChild extends Ex5AccessingParentClassArgumentConstructorParent{
		Ex6AccessingParentClassArgumentConstructorChild(){
			super(100);
			System.out.println("I am child class constructor");
		}
		public static void main(String[] args) {
			Ex6AccessingParentClassArgumentConstructorChild cl = new Ex6AccessingParentClassArgumentConstructorChild();
		}


}
