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
		
			//ADD
			System.out.print("\nEnter number to add: ");
			int index_add=scan.nextInt();
			numbers.add(index_add);
			System.out.println(numbers);
		 
			//INSERT
			System.out.print("\nEnter element to insert: ");
	        numbers.add(9, scan.nextInt());
	        System.out.println(numbers);
	        
			//REMOVE
			System.out.print("\nEnter index to remove: ");
			int index_remove = scan.nextInt();

			numbers.remove(index_remove);
			System.out.println(numbers);
		 
			//UPDATE
			System.out.print("\nEnter index to update: ");
			int index_update=scan.nextInt();
			System.out.print("\nEnter element to update: ");
			int element_update=scan.nextInt();
		 
			numbers.set(index_update, element_update);
			System.out.println(numbers);
	}

}