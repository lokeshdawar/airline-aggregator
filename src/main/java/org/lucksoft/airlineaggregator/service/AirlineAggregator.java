package org.lucksoft.airlineaggregator.service;

import org.lucksoft.airlineaggregator.domain.PricedItinerariesType;

public interface AirlineAggregator {
	
	public PricedItinerariesType getLowFareSearch();
}