package org.lucksoft.airlineaggregator.web;

import java.util.List;

import org.lucksoft.airlineaggregator.domain.PricedItinerariesType.PricedItinerary;
import org.lucksoft.airlineaggregator.service.AirlineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirlineAggregatoRestController {
	
	@Autowired
	AirlineAggregator aaSvc;
	
	@GetMapping("/avail/{ori}/{dest}/{date}")
	public ResponseEntity getPricedItineraries(@PathVariable("ori") String origin,@PathVariable("dest") String destination,@PathVariable("date") String date){
		if(origin==null || destination ==null || date == null){
			return new ResponseEntity("Params cannot be null ", HttpStatus.NOT_FOUND);
		}
		List<PricedItinerary> pi = aaSvc.getLowFareSearch().getPricedItinerary();
		return new ResponseEntity(pi, HttpStatus.OK);
	}
}
