package DEMO;

import java.util.Scanner;

public class StartingOfProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Operations On Distribution List

		Distribution_List.DisplayDistributionTable();
//
//		String ch = "yes";
//
//		while (ch.equals("yes")) {
//
//			System.out.println("Enter Your Choice To Perform Following Operations On Distribution List");
//			System.out.println("1.Add Assignment Category");
//			System.out.println("2.Remove Assignment Category");
//			System.out.println("3.Display Assgnment Category");
//			System.out.println("4:Exit");
//
//			System.out.println("Enter Your Choice");
//			int choice = sc.nextInt();
//			System.out.println("------------------------------------");
//
//			switch (choice) {
//			case 1: {
//				System.out.println("Adding Category ");
//
//				Distribution_List.addAssCat();
//				break;
//			}
//
//			case 2: {
//				System.out.println("Remove Category ");
//				Distribution_List.deleteAssCat();
//				break;
//
//			}
//			case 3: {
//				Distribution_List.displayCat();
//				break;
//			}
//
//			}
//
//			System.out.println("Do You Wish to Continue ? yes/no");
//
//			ch = sc.next();
//
//		}
//		System.out.println("-------------------------------------------------------");
//
//		// CRUD Operations On Student
//
//		LoadingData.loadData();
//
//		String ch1 = "yes";
//		while (ch1.equals("yes")) {
//			System.out.println("Enter Your Choice To Perform Following Operations On StudentInfo");
//
//			System.out.println("1.Add Student Information");
//			System.out.println("2.Remove Student Information");
//			System.out.println("3.Display Student Infromation");
//			System.out.println("4.Exit");
//
//			System.out.println("Enter Your Choice");
//			int choice = sc.nextInt();
//
//			switch (choice) {
//			case 1: {
//				LoadingData.addStudentInfo();
//				break;
//			}
//			case 2: {
//				LoadingData.deleteStudentInfo();
//				break;
//			}
//			case 3: {
//				LoadingData.readData();
//				break;
//			}
//
//			}
//			System.out.println("Do You Wish TO Continue ? yes/no");
//			ch1 = sc.next();
//
//		}
//
//		System.out.println("-----------------------------");
//
//		// Output
//
		// System.out.println("Enter Student Name :");
//		String name = sc.next();
//		LoadDataLogic.dataperstudent(name);

		System.out.println("Enter Subject :");

		String sub = sc.nextLine();
		LoadDataLogic.datapersubject(sub);

	}

}
