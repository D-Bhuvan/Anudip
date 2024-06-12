package Activity;

public class BankCustomer {
	int acNo;
	String acType;
	int amt;
	
	public BankCustomer(int acNo, String acType) {
		this.acNo = acNo;
		this.acType = acType;
		
}

	public BankCustomer(int acNo, String acType, int amt) {
		this.acNo = acNo;
		this.acType = acType;
		this.amt = amt;
		
}
	
	void display() {
		System.out.println(acNo +" "+acType+" "+amt);
	}
    public static void main(String[] args) {
    	BankCustomer c1 = new BankCustomer(12345, "savings");
    	BankCustomer c2 =new BankCustomer(43234, "current", 32443);
    	
    	c1.display();
    	c2.display();
    }
}