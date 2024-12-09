package bookExercises;

public class Ex77methods {

	public int[] orderedArray(int a, int b, int c) {

		int[] array = new int[3];

		int swap;

		array[0] = a;

		array[1] = b;

		array[2] = c;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					swap = array[i];

					array[i] = array[j];

					array[j] = swap;
				}

			}
		}

		return array;

	}
}
