package question2;

public class Main {
       
	int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
	
	
	public static void main(String[] argus) {
		
		Main m1= new Main();
		
		
		for(int j=0; j<m1.array.length; j++) {
			int value=0;
			
			for(int i=0; i<m1.array.length; i++) {
				int num= m1.array[i][j];
				if(num%2==0) {
					value +=num;
				}
			}
			System.out.println("Coloum:"+j+"   "+":"+value);
			
		
			
		}
	}
}
