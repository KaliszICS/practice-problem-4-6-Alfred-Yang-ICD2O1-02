import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int intChecker(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer: ");
		while (!(input.hasNextInt())){
			System.out.println("Input an integer: ");
			input.nextLine();
		}
		return input.nextInt();
	}

	public static double doubleChecker(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number: ");
		while (!(input.hasNextDouble())){
			System.out.println("Input a number: ");
			input.nextLine();
		}
		return input.nextDouble();
	}

	public static boolean booleanChecker(){
		Scanner input = new Scanner(System.in);
		System.out.println("Input a boolean: ");
		while (!(input.hasNextBoolean())){
			System.out.println("Input a boolean: ");
			input.nextLine();
		}
		return input.nextBoolean();
	}


	public static boolean multipleIntChecker(){
		Scanner input = new Scanner(System.in);
		for (int buhm = 0; buhm < 4 ; buhm++){
		System.out.print("Input an integer: ");
		while (!(input.hasNextInt())){
			input.nextLine();
			System.out.print("Input an integer: ");
		}
		input.nextLine();
		}
		return true;
	}
}
