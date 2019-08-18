package com.org;
//pojo -->Model

public class Kunde {
	String id;
	String vorname;
	String Nachname;
	
	
	
	public Kunde() {
		super();
	}
	public Kunde(String id, String vorname, String nachname) {
		super();
		this.id = id;
		this.vorname = vorname;
		Nachname = nachname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	

}
