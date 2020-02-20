package pk4Methods;

public class Ex2PassingandReturning {
	public String concatenate(String str1, String str2) {
		String str3 = str1+" "+str2;
		return str3;
	}
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "programming";
        Ex2PassingandReturning par = new Ex2PassingandReturning ();
		String str3 = par.concatenate(str1, str2);
		System.out.println(str3);
}
}
