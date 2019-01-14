package com.projhibernate.HibernateAnnotation;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="LoanDocuments")
public class LoanDocuments {


public LoanDocuments() 

  {
		super();
	}


public LoanDocuments(Blob salarySlip, Blob lOA, Blob nOC, Blob agreementtoSale) {
		super();
		this.salarySlip = salarySlip;
		LOA = lOA;
		NOC = nOC;
		AgreementtoSale = agreementtoSale;
	}
@Column(name="salarySlip")
private Blob salarySlip;
@Column(name="LOA")
private Blob LOA;
@Column(name="NOC")
private Blob NOC;
@Column(name="AgreementtoSale")
private Blob AgreementtoSale;

public Blob getSalarySlip() {
	return salarySlip;
}
public Blob getLOA() {
	return LOA;
}
public Blob getNOC() {
	return NOC;
}
public Blob getAgreementtoSale() {
	return AgreementtoSale;
}
public void setSalarySlip(Blob salarySlip) {
	this.salarySlip = salarySlip;
}
public void setLOA(Blob lOA) {
	LOA = lOA;
}
public void setNOC(Blob nOC) {
	NOC = nOC;
}
public void setAgreementtoSale(Blob agreementtoSale) {
	AgreementtoSale = agreementtoSale;
}

@Override
public String toString() {
	return "LoanDocuments [salarySlip=" + salarySlip + ", LOA=" + LOA + ", NOC=" + NOC + ", AgreementtoSale="
			+ AgreementtoSale + "]";
}
}

