import java.util.ArrayList;

class DemoNew
{
	public String name;
	public int points;
	public String sub;
	
	public DemoNew(String name,String sub,int points)
	{
		this.name=name;
		this.sub=sub;
		this.points=points;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public String getSub() {
		return sub;
	}

}

public class CollectionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<DemoNew> list=new ArrayList<DemoNew>();
		
		DemoNew d0=new DemoNew("Sajiya","Maths",100);
		DemoNew d1=new DemoNew("Najiya","Maths",90);
		DemoNew d2=new DemoNew("Sajiya","English",100);
		DemoNew d3=new DemoNew("Riya","Maths",100);
		DemoNew d4=new DemoNew("Diksha","Maths",100);
		
		
		list.add(d0);
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		
		ArrayList sublist=new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i));
			if(list.get(i).getSub().equals("Maths"))
			
			{
			sublist.add(list.get(i));
			}
			
		}
		
		for(int i=0;i<sublist.size();i++)
		{
			System.out.println(((DemoNew) sublist.get(i)).getName()+"  "+((DemoNew) sublist.get(i)).getSub()+"  "+((DemoNew) sublist.get(i)).getPoints());
		}

	}

}
