package tiDo.Transaction;

public class Transaction {
	private String transactionID;
	private String cardOwener;
	private int transactionAmount;
	private String transactionMessage;
	private int balance;
	private String transactionDate;
	private boolean approvalCondition;
	
	public Transaction(String transactionID, 
				String cardOwener, 
				int transactionAmount, 
				String transactionMessage,
				int balance,
				String transactionDate) {
		this.transactionID = transactionID;
		this.cardOwener = cardOwener;
		this.transactionAmount = transactionAmount;
		this.transactionMessage = transactionMessage;
		this.balance = balance;
		this.transactionDate = transactionDate;
		this.approvalCondition = false;
	}
	
	public String getTransactionID() {
		return transactionID;
	}

	public String getCardOwener() {
		return cardOwener;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public String getTransactionMessage() {
		return transactionMessage;
	}

	public int getBalance() {
		return balance;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public boolean isApprovalCondition() {
		return approvalCondition;
	}

	public void setApprovalCondition(boolean approvalCondition) {
		this.approvalCondition = approvalCondition;
	}

	public void display() {
		System.out.println("transactionID: " + this.transactionID + "\n" + 
							"cardOwener: " + this.cardOwener + "\n" + 
							"transactionAmount: " + this.transactionAmount + "\n" + 
							"transactionMessage: " + this.transactionMessage + "\n" + 
							"balance: " + this.balance + "\n" + 
							"transactionDate: " + this.transactionDate + "\n" + 
							"approvalCondition: " + this.approvalCondition + "\n");
	}
}
