package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_ComplimentaryTenders")
public class ComplimentaryTender {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ComplimentaryTenderID")
	private Integer complimentaryTenderId;

	@Column(name = "Account")
	private String account;

	@Column(name = "Purchaser")
	private String purchaser;

	@Column(name = "RequestedBy")
	private String requestedBy;

	@Column(name = "Department")
	private String department;

	@Column(name = "Reason")
	private String Reason;

	@Column(name = "EmployeeID")
	private String employeeID;

	public ComplimentaryTender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getComplimentaryTenderId() {
		return complimentaryTenderId;
	}

	public void setComplimentaryTenderId(Integer complimentaryTenderId) {
		this.complimentaryTenderId = complimentaryTenderId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

}
