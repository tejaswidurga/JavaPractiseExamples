package pk15usingSuperKeyword;

public class Ex8Ex7SuperKeywordWhenMethodOverridingchild extends Ex7SuperKeywordWhenMethodOverridingParent {
	
		public void methodoverriding() {
			System.out.println("This method is overridden");
		}
		public void parentmethod() {
			super.methodoverriding();
		}
		public static void main(String[] args) {
			 Ex8Ex7SuperKeywordWhenMethodOverridingchild cl = new  Ex8Ex7SuperKeywordWhenMethodOverridingchild();
			cl.methodoverriding();
			cl.parentmethod();
}
}
