package question3;

public class Main {

	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		
		int[] res= new int[40];
		
		int k=0;
		for(int i=0; i<inputArray.length; i++) {
			
			int count=0;
			for(int j=1; j<=inputArray[i]; j++) {
				if(inputArray[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				res[k++]=inputArray[i];
			}
			
			
			
			
			
		}
		
		return res;
		}
	
	
	
	
		public static void main(String[] args){
			
			Main m1=new Main();
		
		int[] arr = {10,12,5,50,11,14,15};
		
		int[] result=   m1.findAndReturnPrimeNumbers(arr);
		
		for(int i=0; i<result.length; i++) {
			if(result[0]==0) {
				System.out.println("Prime number not found in the supplied Array");
				break;
			}
			else if(result[i]!=0) {
				System.out.println(result[i]);
			}
			else {
				break;
			}
			
		}
		
		}
	
	
	
}
