package question2;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String name,String...mobile) {
		int count=0;
	
		for(String s:mobile) {
			boolean flag=false;
			for(String e:outdatedModels) {
				
				if(e.equals(s)) {
					flag=true;
					System.out.println(s+"_OUTDATED");
					break;
				}
			}
			 if(!flag) {
				   System.out.println(s+" is latest");
			   }
		}
		
		
		
		
	}
	
}
