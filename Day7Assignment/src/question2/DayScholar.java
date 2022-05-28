package question2;

public class DayScholar extends Student {
  private	double	transportFee;
  
  
  
  
     public double getTransportFee() {
	return transportFee;
}




public void setTransportFee(double transportFee) {
	this.transportFee = transportFee;
}




	public DayScholar(double fee) {
        this.transportFee=fee;
	}

}
