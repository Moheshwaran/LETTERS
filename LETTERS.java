package letters;
import java.util.Scanner;
public class patternLettersMOHESH {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int a=sc.nextInt();
		for(int i=1;i<=a*2-1;i++) {
			for(int j=1;j<=a*2-1;j++) { 
				if((i==j && j<=a) || (i+j==a*2 && j>=a || j==1 || j==a*2-1))
				System.out.print("*"+" ");
				else	
					System.out.print(" "+" ");
		}
				for(int j=1;j<=a*2-1;j++) 
					if(i==1 || j==1 || j==a*2-1 || i==a*2-1) 
						System.out.print("*"+" ");
					else
						System.out.print(" "+" ");	
			
		for(int j=1;j<=a*2-1;j++) {
			if(j==1 || j==a*2-1 || i==a) 
				System.out.print("*"+" ");
			else
				System.out.print(" "+" ");
			
	}
		for(int j=1;j<=a*2-1;j++) {
			if(i==1 || j==1 || i==a*2-1 || i==a) 
				System.out.print("*"+" ");
			else
				System.out.print(" "+" ");
		
		}
			for(int j=1;j<=a*2-1;j++) {
				if(i==1 || i==a || i==a*2-1 || (j==1 && i<=a) || (j==a*2-1 && i>=a)) 
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
	}
			for(int j=1;j<=a*2-1;j++) {
				if(j==1 || j==a*2-1 || i==a) 
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
				
			
}
				for(int j=1;j<=a*2-1;j++) {
					if((i==j && j>=a) || (i+j==a*2 && j<=a || j==1 || j==a*2-1))
					System.out.print("*"+" ");
					else			
						System.out.print(" "+" ");
			
		}
				for(int j=1;j<=a*2-1;j++) {
					if(j==1 || j==a*2-1 || i==1 || i==a){
					System.out.print("*"+" ");
					}
					else			
						System.out.print(" "+" ");
				}
				for(int j=1;j<=a*2-1;j++) {
					if(j==1 || i==1 || (j==a*2-1 && i<=a) || i==a ||(i==j && j>=a))
					System.out.print("*"+" ");
					else			
						System.out.print(" "+" ");
				}
				for(int j=1;j<=a*2-1;j++) {
					if(j==1 || j==a*2-1 || i==1 || i==a)
					System.out.print("*"+" ");
					else			
						System.out.print(" "+" ");
				}
					for(int j=1;j<=a*2-1;j++) {
						if(j==1 || j==a*2-1 || i==j)
						System.out.print("*"+" ");
						else			
							System.out.print(" "+" ");
					}
				System.out.println();
}
	}
}


// MOHESHWARAN
	
	


