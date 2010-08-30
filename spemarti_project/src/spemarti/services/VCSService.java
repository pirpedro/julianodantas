package spemarti.services;

import spemarti.SimpleInformationElement;

public interface VCSService {

	public void checkIn(SimpleInformationElement simpleInfoElm, String comment);
	
	public SimpleInformationElement checkOut(String versionId);
}
