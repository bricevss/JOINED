package entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="creditCardPayment")
@PrimaryKeyJoinColumn(name="id_payment")
public class CreditCardPayment extends Payment {
	
	
	private String cardNumber;
	private String expirationDate;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public CreditCardPayment() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "CreditCardPayment [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + "]";
	}

}
