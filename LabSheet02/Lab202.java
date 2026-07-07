import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] intinal_number = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		for (int i=0; i<intinal_number.length; i++) {
			numbers.add(intinal_number[i]);
		}
		System.out.print("\nEnter number to add: ");
		int index_add=scan.nextInt();
		numbers.add(index_add);
		 System.out.println(numbers);
	}

}
