import java.util.ArrayList;

public class DemoFunction 
{
	public  int calculateTestAvg(int i,ArrayList list)
	{
		int avg= ((Demo_collection) list.get(i)).getPoints()*40/100;
		return avg;
	}
	
	public  int calculateQuizAvg(int i,ArrayList list)
	{
		int avg= ((Demo_collection) list.get(i)).getPoints()*40/100;
		return avg;
	}
}
