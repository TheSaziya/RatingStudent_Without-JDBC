package DEMO;

import java.util.Scanner;

public class StartingOfProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Operations On Distribution List

		Distribution_List.DisplayDistributionTable();

		String ch = "yes";

		while (ch.equals("yes")) {

			System.out.println("Enter Your Choice To Perform Following Operations On Distribution List");
			System.out.println("1.Add Assignment Category");
			System.out.println("2.Remove Assignment Category");
			System.out.println("3.Display Assgnment Category");

			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			System.out.println("------------------------------------");

			switch (choice) {
			case 1: {
				System.out.println("Adding Category ");

				Distribution_List.addAssCat();
				break;
			}

			case 2: {
				System.out.println("Remove Category ");
				Distribution_List.deleteAssCat();
				break;

			}
			case 3: {
				Distribution_List.displayCat();
				break;
			}

			}

			System.out.println("Do You Wish to Continue ? yes/no");

			ch = sc.next();

		}

		// CRUD Operations On Student
		// LoadingData.loadData();

		// LoadingData.readData();

		LoadDataLogic.dataperstudent("Anant");

		LoadDataLogic.datapersubject("Electro Fields");

	}

}
