import java.util.ArrayList;
import java.util.Scanner;

class StudentExample
{
  String name;
  String subject;
  String ass_cat;
  String ass_cat_no;
  String date;
  int points;
  
  StudentExample(String name,String subject,String ass_cat,String ass_cat_no,String date,int points)
  {
	  this.name=name;
	  this.subject=subject;
	  this.ass_cat=ass_cat;
	  this.ass_cat_no=ass_cat_no;
	  this.date=date;
	  this.points=points;
  }

public String getName() {
	return name;
}

/*public void setName(String name) {
	this.name = name;
}*/

public String getSubject() {
	return subject;
}

/*public void setSubject(String subject) {
	this.subject = subject;
}*/

public String getAss_cat() {
	return ass_cat;
}

public String getAss_Cat_No()
{
	return ass_cat_no;
}
/*public void setAss_cat(String ass_cat) {
	this.ass_cat = ass_cat;
}*/

public String getDate() {
	return date;
}

/*public void setDate(String date) {
	this.date = date;
}*/

public int getPoints() {
	return points;
}

/*public void setPoints(int points) {
	this.points = points;
}*/
  
  	
}

public class Student 
{

	public static void main(String[] args) 
	{
	  ArrayList<StudentExample> list= new ArrayList<StudentExample>();
	  
	  Scanner sc=new Scanner(System.in);
	  
	  String choice="yes";
	  
	  while(choice.equals("yes"))
	  {
		 System.out.println("Enter Following Details  :");
		 System.out.println("---------------------------------------------------------");
		 
		 System.out.println("Enter Name :");
		 String name=sc.next();
		 
		 System.out.println("Enter Subject :");
		 String subject=sc.next();
		 
		 System.out.println("Enter Assignment Category :");
		 String ass_cat=sc.next();
		 
		 System.out.println("Enter Assignment Category No :");
		 String ass_cat_no=sc.next();
		 
		 System.out.println("Enter date Of Submission :");
		 String date=sc.next();
		 
		 System.out.println("Enter Points :");
		 int points=sc.nextInt();
		 
		 StudentExample student=new StudentExample(name,subject,ass_cat,ass_cat_no,date,points);
		 
		 list.add(student);
		 
		 System.out.println("Do you wish to add students ? Please enter yes/no");
		  choice=sc.next();
		  
		 
	  }
	  System.out.println("Out of Loop!");
	  
	  System.out.println("Output By Name :");
	  System.out.println("-------------------------------------------");
	  
	  System.out.println("Enter Student Name :");
	  
	  String studentName=sc.next();
	  int testcount =0;
	  int quizcount=0;
	  int projectcount=0;
	  int labcount=0;
	  float testAvg=0;
	  float quizAvg=0;
	  float projectAvg=0;
	  float labAvg=0;
	  for(int i=0;i<list.size();i++)
	  {
		  if(list.get(i).getName().equals(studentName))
		  {
			  if(list.get(i).getSubject().equals("ElectroFields"))
			  {
				  
			  if(list.get(i).getAss_cat().equals("Test") )
			  {
				  testcount++;
				  float avg= testAvg+list.get(i).getPoints()*40/100;
				   testAvg=avg/testcount;
				  System.out.println("Test Avg = "+testAvg);
			  }
			  
			  
			  else if(list.get(i).getAss_cat().equals("Quiz") )
			  {
				  quizcount++;
				   float avg=quizAvg+list.get(i).getPoints()*(20/100);
				   quizAvg=avg/quizcount;
				  System.out.println("Quiz Avg ="+quizAvg);
			  }
			  else if(list.get(i).getAss_cat().equals("Project") )
			  {
				  projectcount++;
				   float avg=projectAvg+list.get(i).getPoints()*(30/100);
				   projectAvg=avg/projectcount;
				  System.out.println("Quiz Avg ="+projectAvg);
			  }
			  else if(list.get(i).getAss_cat().equals("LabWork") )
			  {
				  labcount++;
				   float avg=labAvg+list.get(i).getPoints()*(10/100);
				   labAvg=avg/labcount;
				  System.out.println("Quiz Avg ="+labAvg);
			  }
			  
			  
			  
			  }
			  
			 
				  
			  }
			  
		  }
	  System.out.println("Subject : ElectroFields"+" "+"Test Score :"+testAvg+" "+"Quiz Score :"+quizAvg+" "+"Lab Score :"+labAvg+" "+"Project Score :"+projectAvg);
		  
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	  
	 for(int i=0;i<list.size();i++)
	  {
		  System.out.println(list.get(i).getName()+" "+list.get(i).getSubject()+" "+list.get(i).getAss_cat());
	  }

	}

}
