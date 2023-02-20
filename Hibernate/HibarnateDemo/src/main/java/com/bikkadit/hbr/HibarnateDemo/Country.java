package com.bikkadit.hbr.HibarnateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="CountryData")
public class Country {
	
	@Column(name="C_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="C_Name")
	private String name;
	@Column(name="National_Lang")
	private String lang;
	@Column(name="Prime_Minister")
	private String pm;
	@Transient
	private int stateCount;
	
//	Prametrized constructor or getter/setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	
	
	public int getStateCount() {
		return stateCount;
	}
	public void setStateCount(int stateCount) {
		this.stateCount = stateCount;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", lang=" + lang + ", pm=" + pm + "]";
	}
	
}