package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int f1=0,f2=1,sum,i,range=8;  
		 System.out.println(f1);
		 System.out.println(f2);
		
		 for(i=2;i<range;i++)  
		 {  
		  sum=f1+f2;  
		  System.out.println(sum);  
		  f1=f2;  
		  f2=sum;  
		 }  


	}

}
