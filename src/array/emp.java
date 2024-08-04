package array;
import java.util.Scanner;
public class emp {


	int empid []=new int[5];
	String empname;
	double sal;
	int deptno;
	String job;
	int []emp=new int[5];
	Scanner sc=new Scanner(System.in);
	public emp(int empid,String empName,double sal,int deptno,String job)
	{
	
		this.empname=empname;
		this.sal=sal;
		this.deptno=deptno;
		this.job=job;
		isstore();
	}
	public  void isstore()
	{
		System.out.println("enre empid");
		for(int i=0;i<empid.length;i++)
		{
			empid[i]=sc.nextInt();
			
		}
	}
public String toString()
{
	return deptno+" "+empname+" "+sal+" "+job;
}
	
}

