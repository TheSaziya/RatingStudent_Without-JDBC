import java.util.ArrayList;
import java.util.Scanner;

class Demo_collection
{
	public String name;
	public String subject;
	public String asscat;
	public int points;
	
  public Demo_collection(String name, String subject, String asscat,int points)
	{
		this.name=name;
		this.subject=subject;
		this.asscat=asscat;
		this.points=points;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public String getSubject() {
		return subject;
	}
	
	public String getAsscat()
	{
		return asscat;
	}
	
	public int getPoints() {
		return points;
	}
	
}
public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Demo_collection> list=new ArrayList<Demo_collection>();
		
		Demo_collection d1=new Demo_collection("Sajiya","Maths","Test",100);
		Demo_collection d2=new Demo_collection("Sajiya","Maths","Quiz",100);
		Demo_collection d3=new Demo_collection("Najiya","Maths","Test",100);
		Demo_collection d4=new Demo_collection("Sajiya","Maths","Test",100);
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		
		
	for(int i=0;i<list.size();i++)
	{
		System.out.println("Name :"+list.get(i).getName()+" "+"Subject :"+list.get(i).getSubject()+" "+"Assignment category :"+list.get(i).getAsscat() +" "+"Points :"+list.get(i).getPoints());
	}
	
	System.out.println("----------------------------------------------------------------------");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name :");
	String usrname=sc.next();
	int count=0;
	int testAvg=0;
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getName().equals(usrname))
		{
			if(list.get(i).getSubject().equals("Maths"))
			{
				if(list.get(i).getAsscat().equals("Test"))
				{
					count++;
					
					int avg=testAvg+list.get(i).getPoints()*40/100;
					testAvg=avg/count;
				}
				
			}
		}
		
		
	}
	System.out.println(testAvg);
	}
	

	}


