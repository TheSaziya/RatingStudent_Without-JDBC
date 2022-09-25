package DEMO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LoadDataLogic {
	public static void dataperstudent(String name) {
		LoadingData.loadData();

		ArrayList<StudentInfo> newlist = LoadingData.getData();

		// Distribution_List.DisplayDistributionTable();

		ArrayList<Distribution> newdlist = Distribution_List.getDistributionList();

		int points = 0;
		int weight = 0;

		ArrayList<Double> scorelist = new ArrayList<Double>();

		HashSet<String> subhs = new HashSet<String>();

		for (StudentInfo d : LoadingData.getData()) {
			subhs.add(d.getSub());

		}

		String[] sublist = subhs.toArray(new String[subhs.size()]);
		System.out.println(name);

		for (int i = 0; i < sublist.length; i++)

		{

			String tempSub = sublist[i];

			System.out.println("subject :" + tempSub);

			for (int j = 0; j < newdlist.size(); j++) {
				int count = 0;
				double score = 0.0;
				double finalscore = 0.0;
				double tempscore = 0.0;

				for (int k = 0; k < newlist.size(); k++)

				{

					if (newlist.get(k).getSname().equals(name) && newlist.get(k).getSub().equals(tempSub)) {
						String tempCat[] = newlist.get(k).getAsscat().split("_");

						if (newdlist.get(j).getAssCat().equals(tempCat[0])) {
							weight = newdlist.get(j).getWeight();

							points = newlist.get(k).getPoints();

							count++;

							tempscore = weight / 1 * points / 100;

							score = score + tempscore;

							finalscore = score / count;

						}

					}

				}

				scorelist.add(finalscore);
			}

			double sum = 0.0;
			for (int l = 0; l < scorelist.size(); l++) {
				sum = sum + scorelist.get(l);

				System.out.println(newdlist.get(l).getAssCat() + " : " + scorelist.get(l));

			}
			System.out.println("Overall Rating :" + sum);

			for (int l = 0; l < scorelist.size(); l++) {
				scorelist.removeAll(scorelist);
			}

			System.out.println("-----------------------");

		}

	}

	public static void datapersubject(String sub) {

		LoadingData.loadData();
		System.out.println("Hello");
		ArrayList<StudentInfo> newlist = LoadingData.getData();
		// System.out.println(newlist.get(10).getSname());

		// Distribution_List.DisplayDistributionTable();

		ArrayList<Distribution> newdlist = Distribution_List.getDistributionList();

		// System.out.println(newdlist.get(1).getAssCat());

		int points = 0;
		int weight = 0;

		ArrayList<Double> scorelist = new ArrayList<Double>();

		HashSet<String> studhs = new HashSet<String>();
		for (StudentInfo d : LoadingData.getData()) {
			studhs.add(d.getSname());
		}
		String[] sublist = studhs.toArray(new String[studhs.size()]);
		Arrays.sort(sublist);

		for (int i = 0; i < sublist.length; i++) {
			String tempstud = sublist[i];
			// System.out.println(tempstud);

			for (int j = 0; j < newdlist.size(); j++) {
				int count = 0;
				double score = 0.0;
				double finalscore = 0.0;
				double tempscore = 0.0;

				for (int k = 0; k < newlist.size(); k++) {
					if (newlist.get(k).getSname().equals(tempstud) && newlist.get(k).getSub().equals(sub)) {
						String tempCat[] = newlist.get(k).getAsscat().split("_");

						if (newdlist.get(j).getAssCat().equals(tempCat[0])) {
							weight = newdlist.get(j).getWeight();
							points = newlist.get(k).getPoints();
							count++;

							// ystem.out.println(count);

							tempscore = weight / 1 * points / 100;
							// System.out.println("TempScore :" + tempscore);
							score = score + tempscore;
							// System.out.println("Score :" + score);
							finalscore = score / count;
							// System.out.println("FinalScore :" + finalscore);
						}
					}
				}
				scorelist.add(finalscore);

			}
			double sum = 0.0;
			System.out.println(sublist[i]);
			for (int l = 0; l < scorelist.size(); l++) {
				sum = sum + scorelist.get(l);

				System.out.println(newdlist.get(l).getAssCat() + " : " + scorelist.get(l));

			}
			System.out.println("Overall Rating :" + sum);

			for (int l = 0; l < scorelist.size(); l++) {
				scorelist.removeAll(scorelist);
			}

			System.out.println("-----------------------");

		}

	}
}
