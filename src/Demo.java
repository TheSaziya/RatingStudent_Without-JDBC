import java.util.ArrayList;

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
		int testcount=0;
		int testAvg=0;
		int quizcount=0;
		int quizAvg=0;
		
		DemoFunction demo= new DemoFunction();
		
		for(int i=0;i<list.size();i++)
		{
			
			//For Correct Username
			if(list.get(i).getName().equals("Sajiya"))
			{
            String sub=list.get(i).getSubject();
			
			switch(sub)
			{
			case "ElectroFields":
			{
				
			}
			{
				//For Subject: Maths
				if(list.get(i).getSubject().equals("Maths"))
				{
					if(list.get(i).getAsscat().equals("Test"))
					{
						testcount++;
						 int Average= testAvg+demo.calculateTestAvg(i,list);
						  testAvg=Average/testcount;
						  
					
						
					}
					
					else if(list.get(i).getAsscat().equals("Quiz"))
					{
						quizcount++;
						 int Average= quizAvg+demo.calculateQuizAvg(i,list);
						  quizAvg=Average/quizcount;
						
						
					}
					
				}
				
				//For Subject: English
				
				else if(list.get(i).getSubject().equals("English"))
				{
					if(list.get(i).getAsscat().equals("Test"))
					{
						testcount++;
						 int Average= testAvg+demo.calculateTestAvg(i,list);
						  testAvg=Average/testcount;
						
					}
					
					else if(list.get(i).getAsscat().equals("Quiz"))
					{
						quizcount++;
						 int Average= quizAvg+demo.calculateQuizAvg(i,list);
						  quizAvg=Average/quizcount;
						
					}
				}
				
			}
		}
		System.out.println("Test Average :"+testAvg);
		System.out.println("Quiz Average :"+quizAvg);
	
	}
}
	
	

