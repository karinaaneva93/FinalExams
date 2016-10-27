
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/**
	 * Потребителят трябва да може да въведе число от 2 до 9, което число
	 * представлява едната страна на квадратен двумерен масив (матрица).
	 * Програмата трябва да може да пресметне колко е броят на необходимите
	 * елементи, с който може да се попълни квадратният двумерен масив и да
	 * създаде едномерен масив с тази дължина. Потребителят трябва да може да
	 * въведе толкова стойности, че да попълни едномерния масив. След като
	 * едномерният масив е попълнен, той трябва да бъде обходен, за да се
	 * изчисли общата сума от всичките въведени стойности. Сумата да се изпише
	 * на екрана. В двумерния масив трябва да се попълнят стойностите от
	 * едномерния. Попълването на двумерния масив трябва да стане вертикално
	 * (колона по колона).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert the size of matrix");
		int size = sc.nextInt();
		while (size < 2 || size > 10) {
			System.out.print("Insert the number beetween 2- 9");
			size = sc.nextInt();
		}
		int sum = 0;
		int[][] twoDimArray = new int[size][size];
		int[] array = new int[size * size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		System.out.println("Sum is " + sum);
		for (int i = 0; i < twoDimArray.length; i++) {

			for (int j = 0; j < size; j++) {
				twoDimArray[i][j] = array[(j * size) + i];
			}
		}

		for (int r = 0; r < twoDimArray.length; r++) {
			for (int c = 0; c < twoDimArray[r].length; c++)
				System.out.print(twoDimArray[r][c] + " ");
			System.out.println();
		}
	}
}