package ClimbingCLub;

public class Harness {
	private String make;
	private int modelNumber;
	private int timesUsed;
	private String lastInstructorCheck;
	private boolean onLoan;
	private String borrowingMember;
	public static final int MAXTIMESUSED = 25;
	
	public Harness(String make, int modelNumber, int timesUsed, String lastInstructorCheck,
			boolean onLoan, String borrowingMember) {
		this.make = make;
		this.modelNumber = modelNumber;
		this.timesUsed = timesUsed;
		this.lastInstructorCheck = lastInstructorCheck;
		this.onLoan = onLoan;
		this.borrowingMember = borrowingMember;
	}
	public Harness(String make, int modelNumber, String lastInstructorCheck){
		//Setting timesUsed=0, onLoan=false and borrowingmember=null
		this(make,modelNumber,0,lastInstructorCheck,false,"");
	}
	public void checkHarness(String climbingInstructor){
		if(!onLoan){
			this.timesUsed = 0;
			this.lastInstructorCheck = climbingInstructor;
		}
	}
	public boolean canHarnessBeLoaned(){
		if(!isHarnessOnLoan()&&this.timesUsed<MAXTIMESUSED){
			return true;
		}
		return false;
	}
	public void loanHarness(String clubMember){
		if(canHarnessBeLoaned()){
			this.borrowingMember = clubMember;
		}
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getTimesUsed() {
		return timesUsed;
	}
	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}
	public String getLastInstructorCheck() {
		return lastInstructorCheck;
	}
	public void setLastInstructorCheck(String lastInstructorCheck) {
		this.lastInstructorCheck = lastInstructorCheck;
	}
	public boolean isHarnessOnLoan() {
		return onLoan;
	}
	public void setOnLoan(boolean onLoan) {
		this.onLoan = onLoan;
	}
	public String getBorrowingMember() {
		return borrowingMember;
	}
	public void setBorrowingMember(String borrowingMember) {
		this.borrowingMember = borrowingMember;
	}
	
	
	
}
