package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zigpolicy")
public class Policy {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPolicyType() {
		return PolicyType;
	}

	public void setPolicyType(String policyType) {
		PolicyType = policyType;
	}

	public String getPolicyName() {
		return PolicyName;
	}

	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}

	public String getPolicyTo() {
		return PolicyTo;
	}

	public void setPolicyTo(String policyTo) {
		PolicyTo = policyTo;
	}

	@Column(name = "PolicyType")
    private String PolicyType;

    @Column(name = "PolicyName")
    private String PolicyName;

    @Column(name = "PolicyTo")
    private String PolicyTo;
	
    public Policy()
	{
		
	}

    public Policy(long id, String Policy_Type, String Policy_Name, String Policy_To) {
		// TODO Auto-generated constructor stub
    	this.id=id;this.PolicyType=Policy_Type;this.PolicyName=Policy_Name;this.PolicyTo=Policy_To;
	}



	
}
	

	