package Assignment;

import java.util.Date;

public class Account {
	
	private int id;
	private Double balance;
	private String ownerName;
	private Date createDate;
	private String type;
	private String status;
	public Account(int id, Double balance, String ownerName, Date createDate, String type,
			String status) {
		super();
		this.id = id;
		this.balance = balance;
		this.ownerName = ownerName;
		this.createDate = createDate;
		this.type = type;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Date getCreateDate() {
		return createDate;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}

class SavingsAccount extends Account{

	public SavingsAccount(int id, Double balance, String ownerName, Date createDate, String type, String status) {
		super(id, balance, ownerName, createDate, type, status);
	}
	
	
	
}

class CurrentAccount extends Account{
	
	private Double overdraftBalance;

	public CurrentAccount(int id, Double balance, String ownerName, Date createDate, String type, String status, Double overdraftBalance) {
		super(id, balance, ownerName, createDate, type, status);
		this.overdraftBalance = overdraftBalance;
		
	}

	public Double getOverdraftBalance() {
		return overdraftBalance;
	}
	
	
}