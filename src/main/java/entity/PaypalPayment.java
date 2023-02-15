package entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="paypalPayment")
@PrimaryKeyJoinColumn(name="id_payment")
public class PaypalPayment extends Payment {
	
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public PaypalPayment(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public PaypalPayment() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "PaypalPayment [accountNumber=" + accountNumber + "]";
	}
	
}
