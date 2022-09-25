package DEMO;

import java.util.ArrayList;
import java.util.Scanner;

public class LoadingData {

	static ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();

	static Scanner sc = new Scanner(System.in);

	public static void loadData()

	{
		StudentInfo s0 = new StudentInfo("Anant", "Electro Fields", "Test_1", "21-July-16", 100);
		StudentInfo s1 = new StudentInfo("Bhagat", "Electro Fields", "Test_1", "21-July-16", 78);
		StudentInfo s2 = new StudentInfo("Chaya", "Electro Fields", "Test_1", "21-July-16", 68);
		StudentInfo s3 = new StudentInfo("Esharat", "Electro Fields", "Test_1", "21-July-16", 87);
		StudentInfo s4 = new StudentInfo("Bhagat", "Electro Fields", "Quiz_1", "22-July-16", 20);
		StudentInfo s5 = new StudentInfo("Chaya", "Electro Fields", "Lab_1", "23-July-16", 10);
		StudentInfo s6 = new StudentInfo("Anant", "Electro Fields", "Project_1", "21-July-16", 100);
		StudentInfo s7 = new StudentInfo("Dev", "Electro Fields", "Project_1", "24-July-16", 100);
		StudentInfo s8 = new StudentInfo("Bhagat", "Electro Fields", "Quiz_2", "25-July-16", 50);
		StudentInfo s9 = new StudentInfo("Anant", "Electro Fields", "Quiz_1", "26-July-16", 100);
		StudentInfo s10 = new StudentInfo("Bhagat", "Electro Fields", "Lab_1", "27-July-16", 10);
		StudentInfo s11 = new StudentInfo("Chaya", "Electro Fields", "project_1", "28-July-16", 100);
		StudentInfo s12 = new StudentInfo("Bhagat", "Electro Fields", "Project_1", "28-July-16", 100);
		StudentInfo s13 = new StudentInfo("Anant", "Computing Techniques", "Test_1", "29-July-16", 86);
		StudentInfo s14 = new StudentInfo("Anant", "Electro Fields", "Quiz_2", "29-July-16", 100);
		StudentInfo s15 = new StudentInfo("Bhagat", "Computing Techniques", "Project_1", "30-July-16", 100);
		StudentInfo s16 = new StudentInfo("Anant", "Electro Fields", "Lab_1", "30-July-16", 100);
		StudentInfo s17 = new StudentInfo("Chaya", "Computing Techniques", "Quiz_1", "31-July-16", 20);
		StudentInfo s18 = new StudentInfo("Anant", "Electro Fields", "Test_2", "31-July-16", 100);
		StudentInfo s19 = new StudentInfo("Chaya", "Electro Fields", "Test_2", "31-July-16", 92);

		list.add(s0);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		list.add(s11);
		list.add(s12);
		list.add(s13);
		list.add(s14);
		list.add(s15);
		list.add(s16);
		list.add(s17);
		list.add(s18);
		list.add(s19);

	}

	public static void readData() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSname() + "  " + list.get(i).getSub() + "  " + list.get(i).getAsscat()
					+ "  " + list.get(i).getDate() + "  " + list.get(i).getPoints());
		}
	}

	public static ArrayList<StudentInfo> getData() {
		return list;

	}

	public static void addStudentInfo() {
		System.out.println("Enter Student Name :");
		String name = sc.next();

		System.out.println("Enter Subject :");
		String sub = sc.next();

		System.out.println("Enter Assignment Category :");
		String asscat = sc.next();

		System.out.println("Enter Submission Date :");
		String date = sc.next();

		System.out.println("Enter Points :");
		int points = sc.nextInt();

		StudentInfo stemp = new StudentInfo(name, sub, asscat, date, points);
		list.add(stemp);

		System.out.println("Student Info added successfully !!");
	}

	public static void deleteStudentInfo() {
		System.out.println("Enter Student Name :");
		String name = sc.next();

		System.out.println("Enter Subject :");
		String sub = sc.next();

		System.out.println("Enter Assignment Category :");
		String asscat = sc.next();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSname().equals(name) && list.get(i).getSub().equals(sub)
					&& list.get(i).getAsscat().equals(asscat)) {
				list.remove(i);
			}
		}

		System.out.println("Student Info deleted successfully !!");

	}

}
