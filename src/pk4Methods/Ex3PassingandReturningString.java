package pk4Methods;
public class Ex3PassingandReturningString {
	public String concatenate(String str1, String str2) {
		String str3 = str1+" "+str2;
		return str3;
	}
	public static void main(String[] args) {
		String str1 = "Subbu";
		String str2 = "Selenium";
		Ex3PassingandReturningString prs = new Ex3PassingandReturningString();
		String str3 = prs.concatenate(str1, str2);
		System.out.println(str3);
	}
}
