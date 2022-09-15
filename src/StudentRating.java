import java.util.ArrayList;
import java.util.Scanner;

class StudentDemo
{
	public String name,subject,ass_cat,date;
	public int points;
	
	public StudentDemo(String name, String subject,String ass_cat,String date,int points)
	{
		this.name=name;
		this.subject=subject;
		this.ass_cat=ass_cat;
		this.date=date;
		this.points=points;
		
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public String getAss_cat() {
		return ass_cat;
	}

	public String getDate() {
		return date;
	}

	public int getPoints() {
		return points;
	}	
	
}

//MAIN FUNCTION

public class StudentRating 
{

	public static void main(String[] args)
	{
		ArrayList<StudentDemo> list = new ArrayList<StudentDemo>();
		
		StudentDemo d0=new StudentDemo("Anant","Electro Fields","Test","21-July-16",100);
		StudentDemo d1=new StudentDemo("Bhagat","Electro Fields","Test","21-July-16",78);
		StudentDemo d2=new StudentDemo("Chaya","Electro Fields","Test","21-July-16",68);
		StudentDemo d3=new StudentDemo("Esharat","Electro Fields","Test","21-July-16",87);
		StudentDemo d4=new StudentDemo("Bhagat","Electro Fields","Quiz","22-July-16",20);
		StudentDemo d5=new StudentDemo("Chaya","Electro Fields","Lab","23-July-16",10);
		StudentDemo d6=new StudentDemo("Anant","Electro Fields","Project","21-July-16",100);
		StudentDemo d7=new StudentDemo("Dev","Electro Fields","Project","24-July-16",100);
		StudentDemo d8=new StudentDemo("Bhagat","Electro Fields","Quiz","25-July-16",50);
		StudentDemo d9=new StudentDemo("Anant","Electro Fields","Quiz","26-July-16",100);
		StudentDemo d10=new StudentDemo("Bhagat","Electro Fields","Lab","27-July-16",10);
		StudentDemo d11=new StudentDemo("Chaya","Electro Fields","project","28-July-16",100);
		StudentDemo d12=new StudentDemo("Bhagat","Electro Fields","Project","28-July-16",100);
		StudentDemo d13=new StudentDemo("Anant","Computing Techniques","Test","29-July-16",86);
		StudentDemo d14=new StudentDemo("Anant","Electro Fields","Quiz","29-July-16",100);
		StudentDemo d15=new StudentDemo("Bhagat","Computing Techniques","Project","30-July-16",100);
		StudentDemo d16=new StudentDemo("Anant","Electro Fields","Lab","30-July-16",100);
		StudentDemo d17=new StudentDemo("Chaya","Computing Techniques","Quiz","31-July-16",20);
		StudentDemo d18=new StudentDemo("Anant","Electro Fields","Test","31-July-16",100);
		StudentDemo d19=new StudentDemo("Chaya","Electro Fields","Test","31-July-16",92);
		
		list.add(d0);
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
		list.add(d7);
		list.add(d8);
		list.add(d9);
		list.add(d10);
		list.add(d11);
		list.add(d12);
		list.add(d13);
		list.add(d14);
		list.add(d15);
		list.add(d16);
		list.add(d17);
		list.add(d18);
		list.add(d19);
		
		
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getName()+"  "+list.get(i).getSubject()+"  "+list.get(i).getAss_cat()+"  "+list.get(i).getDate()+"  "+list.get(i).getPoints());
		}*/
		
		int ElectroCount []=new int[4]; // ElectroFields Counter
		
		int ComputingCount []=new int[4]; //Computing Techniques Counter
		
		float ElectroAvg []=new float[4]; 
		
		float ComputingAvg []=new float[4];
		
		
		System.out.println("Output by Names");
		System.out.println("--------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name :");
		String studentName=sc.next();
		
		StudentRatingFunction demo=new StudentRatingFunction();
		
		for(int i=0;i<list.size();i++)
		{
			
			if(list.get(i).getName().equals(studentName))
			{
				String sub=list.get(i).getSubject();
				
				switch(sub)
				{
				
				case "Electro Fields":
				{
					
					if(list.get(i).getAss_cat().equals("Test"))
					{
						ElectroCount[0]++;
						float avg=ElectroAvg[0]+demo.calculateTestAvg(i,list);
						ElectroAvg[0]=avg/ElectroCount[0];
						break;
							
					}
					
					if(list.get(i).getAss_cat().equals("Quiz"))
					{
						ElectroCount[1]++;
						float avg=ElectroAvg[1]+demo.calculateQuizAvg(i,list);
						ElectroAvg[1]=avg/ElectroCount[1];
						break;
							
					}
					

					if(list.get(i).getAss_cat().equals("Project"))
					{
						ElectroCount[2]++;
						float avg=ElectroAvg[1]+demo.calculateProjectAvg(i,list);
						ElectroAvg[2]=avg/ElectroCount[2];
						break;
					
					}
					

					if(list.get(i).getAss_cat().equals("Lab"))
					{
						ElectroCount[3]++;
						float avg=ElectroAvg[3]+demo.calculateLabAvg(i,list);
						ElectroAvg[3]=avg/ElectroCount[3];
						break;
							
					}
					
					
					
				}
				
				case "Computing Techniques":
				{
					
					if(list.get(i).getAss_cat().equals("Test"))
					{
						ComputingCount[0]++;
						float avg=ComputingAvg[0]+demo.calculateTestAvg(i,list);
						ComputingAvg[0]=avg/ComputingCount[0];
						break;
							
					}
					
					if(list.get(i).getAss_cat().equals("Quiz"))
					{
					    ComputingCount[1]++;
						float avg=ComputingAvg[1]+demo.calculateQuizAvg(i,list);
						ElectroAvg[1]=avg/ComputingCount[1];
						break;
							
					}
					

					if(list.get(i).getAss_cat().equals("Project"))
					{
						ComputingCount[2]++;
						float avg=ComputingAvg[1]+demo.calculateProjectAvg(i,list);
						ElectroAvg[2]=avg/ComputingCount[2];
						break;
							
					}
					

					if(list.get(i).getAss_cat().equals("Lab"))
					{
						ComputingCount[3]++;
						float avg=ComputingAvg[3]+demo.calculateLabAvg(i,list);
						ElectroAvg[3]=avg/ComputingCount[3];
						break;
							
					}
					
					
				}
				
				}
			}
		}
		
		for(int i=0;i<ElectroAvg.length;i++)
		{
			System.out.println(ElectroAvg[i]);
		}
		
		System.out.println("------------------------");
		for(int i=0;i<ComputingAvg.length;i++)
		{
			System.out.println(ComputingAvg[i]);
		}


	}

}
