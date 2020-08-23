
public class Driver {
	// Declare an initializes an int array variable
	static int[] newArray = { 1, 7, 3, 4, 9, 2 };

	public static void main(String[] args) {
		// Instantiate objects
		ArrayStack array = new ArrayStack();
		LinkedStack list = new LinkedStack();

		// Loop through and add values into the array list.
		for (int index = 0; index < newArray.length; index++) {
			array.push(newArray[index]);
		}

		// Loop through and remove values from the array list and print each value
		while (!(array.isEmpty())) {
			System.out.println(array.pop());
		}

		// Loop through and add values into the linked list.
		for (int index = 0; index < newArray.length; index++) {
			list.push(newArray[index]);
		}

		// Loop through and remove values from the array list and print each value
		for (int index = newArray.length - 1; index >= 0; index--) {
			System.out.println(list.pop());
		}

	}

}
