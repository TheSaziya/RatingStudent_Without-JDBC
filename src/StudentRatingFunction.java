import java.util.ArrayList;

public class StudentRatingFunction 
{

	public float calculateTestAvg(int i, ArrayList list)
	{
		float avg=((StudentDemo)list.get(i)).getPoints()*40/100;
		return avg;
	}
	
	
	public float calculateQuizAvg(int i, ArrayList list)
	{
		float avg=((StudentDemo)list.get(i)).getPoints()*20/100;
		return avg;
	}
	
	
	public float calculateProjectAvg(int i, ArrayList list)
	{
		float avg=((StudentDemo)list.get(i)).getPoints()*30/100;
		return avg;
	}
	
	
	public float calculateLabAvg(int i, ArrayList list)
	{
		float avg=((StudentDemo)list.get(i)).getPoints()*10/100;
		return avg;
	}
}
