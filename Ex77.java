package bookExercises;

import javax.swing.JOptionPane;

public class Ex77 {

	public static void main(String[] args) {

		String userAnswer;

		Ex77methods x = new Ex77methods();

		int a, b, c;

		do {

			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first number: "));

			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second number: "));

			c = Integer.parseInt(JOptionPane.showInputDialog(null, "Input third number: "));

			x.orderedArray(a, b, c);

			int[] ordered = x.orderedArray(a, b, c);

			System.out.print("Ordered Array:");

			System.out.println();

			for (int i = 0; i < ordered.length; i++) {

				System.out.print(ordered[i] + " ");
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
