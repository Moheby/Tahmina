package com.org;

import java.util.ArrayList;
import java.util.List;


public class KundenRepository { 

	public List<Kunde> kundeErzeugen() {
 List <Kunde> kundenList = new ArrayList<>(); 
 kundenList.add(new Kunde("78", "hjk", "hjk"));
 kundenList.add(new Kunde("78", "hjk", "hjk"));
 return kundenList;
	} 
}
