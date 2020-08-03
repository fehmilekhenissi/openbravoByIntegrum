package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_CreditDebits")
public class CreditDebit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CreditDebitID")
	private Integer creditDebitId;

	@Column(name = "CardType")
	private String cardType;

	public CreditDebit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCreditDebitId() {
		return creditDebitId;
	}

	public void setCreditDebitId(Integer creditDebitId) {
		this.creditDebitId = creditDebitId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}