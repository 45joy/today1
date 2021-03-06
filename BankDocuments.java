package com.projhibernate.HibernateAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BankDocs")
public class BankDocuments {
	
	
	public BankDocuments() {
		super();
	}
	public BankDocuments(String panCard, String aadharCard, int voterid) {
		super();
		this.panCard = panCard;
		this.aadharCard = aadharCard;
		Voterid = voterid;
	}
	@	Column(name="panCard")
	private String panCard;
	@	Column(name="aadharCard")
	private String aadharCard;
	@	Column(name="Voterid")
	private int Voterid;
	public String getPanCard() {
		return panCard;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public int getVoterid() {
		return Voterid;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public void setVoterid(int voterid) {
		Voterid = voterid;
	}
	@Override
	public String toString() {
		return "BankDocuments [panCard=" + panCard + ", aadharCard=" + aadharCard + ", Voterid=" + Voterid + "]";
	}
	
	
}
