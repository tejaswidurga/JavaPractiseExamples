package pk17JavaIfElseConditions;

public class Ex7SwitchCaseStatements {
//	public static void main(String[] args) {
//		int num1 = 2;
//		switch (num1) {
//			case 1:
//				System.out.println("I am 1");
//				break;
//			case 2:
//				System.out.println("I am 2");
//				break;
//			case 3:
//				System.out.println("I am 3");
//				break;
//			default:
//				System.out.println("I am not 1 or 2 or 3");
//		}
//	}
//
//}


//several values executing same code:

//public static void main(String [] args){ 
//	
//	int month = 4;
//	
//	switch (month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:				
//			System.out.println("No. of days are "+31);
//			break;
//		case 2:
//			System.out.println("No. of days are "+28);
//			break;
//		default:
//			System.out.println("No. of days are "+30);
//	}
//}
//}
	
	
	
	//using withoutbreakstatements:
public static void main(String [] args){ 
		
		String a = "three";
		
		switch (a) {
			case "one":
				System.out.println("I am 1");
				
			case "two":
				System.out.println("I am 2");
				
			case "three":
				System.out.println("I am 3");
				
			case "four":
				System.out.println("I am 4");
				
			case "five":
				System.out.println("I am 5");
				
			case "six":
				System.out.println("I am 6");
				
			default:
				System.out.println("I am not 1 or 2 or 3 or 4 or 5 or 6");
		}
}
}

