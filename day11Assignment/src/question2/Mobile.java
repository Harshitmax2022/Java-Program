package question2;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String mobile) {
		int count=0;
		
		for(String m: outdatedModels) {
			if(m.equals(mobile)) {
				count++;
				System.out.println("--------------------------------------");
				System.out.println("outdated Phone");
			}
			
		}
		
		if(count==0) {
			System.out.println("------------------------------------");
			System.out.println(mobile+": is a new model  in market");
		}
		
		
	}
	
}
