package org.lucksoft.airlineaggregator.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.lucksoft.airlineaggregator.domain.OTAAirLowFareSearchRS;
import org.lucksoft.airlineaggregator.domain.PricedItinerariesType;

public class LowFareSearchCannedDataUtil {

	private static final String XML_FILE = "samples/OTA_AirLowFareSearchRS2.xml";
	private static final String XML_FILE1 = "samples/OTA_AirLowFareSearchRS3.xml";

	public PricedItinerariesType getCannedDataForLowFareSearch() {

		PricedItinerariesType ps1 = null;

		try {
			
			JAXBContext context = JAXBContext.newInstance(OTAAirLowFareSearchRS.class);

			System.out.println("<!---------------Generating the Java objects from XML Input-------------->");

			Unmarshaller um = context.createUnmarshaller();

			OTAAirLowFareSearchRS response = (OTAAirLowFareSearchRS) um.unmarshal(getClass().getClassLoader().getResourceAsStream(XML_FILE));
			ps1=response.getPricedItineraries();
			response = (OTAAirLowFareSearchRS) um.unmarshal(getClass().getClassLoader().getResourceAsStream(XML_FILE1));
			PricedItinerariesType ps2=response.getPricedItineraries();
			
			ps1.getPricedItinerary().addAll(ps2.getPricedItinerary());

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ps1;
	}
	
//	public static void main(String[] args) {
//		LowFareSearchCannedDataUtil lu = new LowFareSearchCannedDataUtil();
//		System.out.println(lu.getCannedDataForLowFareSearch());
//	}

}
