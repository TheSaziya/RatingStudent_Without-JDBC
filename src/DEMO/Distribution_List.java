package DEMO;

import java.util.ArrayList;
import java.util.Scanner;

public class Distribution_List {
	static ArrayList<Distribution> dlist = new ArrayList<Distribution>();

	static Scanner sc = new Scanner(System.in);

	public static void DisplayDistributionTable() {

		Distribution d0 = new Distribution("Test", 40);
		Distribution d1 = new Distribution("Quiz", 20);
		Distribution d2 = new Distribution("Lab", 10);
		Distribution d3 = new Distribution("Project", 30);

		dlist.add(d0);
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);

		// for (int i = 0; i < dlist.size(); i++) {
		// System.out.println(dlist.get(i).getAssCat() + " " +
		// dlist.get(i).getWeight());
		// }

	}

	public static ArrayList<Distribution> getDistributionList() {
		return dlist;
	}

	public static void displayCat() {
		// DisplayDistributionTable();
		for (int i = 0; i < dlist.size(); i++) {
			System.out.println(dlist.get(i).getAssCat() + "  " + dlist.get(i).getWeight());
		}
	}

	public static void addAssCat() {
		System.out.println("Enter Assignment Category :");
		String cat = sc.next();

		System.out.println("Enter Weight :");
		int weight = sc.nextInt();

		Distribution dtemp = new Distribution(cat, weight);
		dlist.add(dtemp);

		System.out.println("Category Added Successfully !!");

	}

	public static void deleteAssCat() {
		System.out.println("Enter Assignment Category :");
		String cat = sc.next();

		// ArrayList list = DisplayDistributionTable();
		for (int i = 0; i < dlist.size(); i++) {
			if (dlist.get(i).getAssCat().equals(cat)) {
				dlist.remove(dlist.get(i));
			}

		}
		System.out.println("Category Removed Successfully");

	}

}
