/**
 * 
 */
package org.lucksoft.airlineaggregator.service;

import org.lucksoft.airlineaggregator.domain.PricedItinerariesType;
import org.lucksoft.airlineaggregator.util.LowFareSearchCannedDataUtil;
import org.springframework.stereotype.Service;

/**
 * @author lucky
 *
 */
@Service
public class AirlineAggregatorImpl implements AirlineAggregator {

	/* (non-Javadoc)
	 * @see org.lucksoft.airlineaggregator.service.AirlineAggregator#getLowFareSearch()
	 */
	@Override
	public PricedItinerariesType getLowFareSearch() {
		LowFareSearchCannedDataUtil lu = new LowFareSearchCannedDataUtil();
		return lu.getCannedDataForLowFareSearch();
	}

}
