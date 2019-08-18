package com.org;

import java.io.Serializable;
import java.util.List;



public class KundenService {
	
	public List<Kunde> alleKunden() {
		List<Kunde> kunden = new KundenRepository().kundeErzeugen();
	return kunden;
	}

}
