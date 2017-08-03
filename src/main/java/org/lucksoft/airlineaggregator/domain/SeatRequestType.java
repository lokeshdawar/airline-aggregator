//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Object to hold a passengers' seat request
 * 
 * <p>Java class for SeatRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatRequestAttributes"/&gt;
 *       &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" /&gt;
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestType", propOrder = {
    "departureAirport",
    "arrivalAirport"
})
@XmlSeeAlso({
    org.lucksoft.airlineaggregator.domain.SpecialReqDetailsType.SeatRequests.SeatRequest.class
})
public class SeatRequestType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "DepartureAirport")
    protected LocationType departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected LocationType arrivalAirport;
    @XmlAttribute(name = "DepartureDate")
    protected String departureDate;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatPreference")
    protected String seatPreference;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureAirport(LocationType value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalAirport(LocationType value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the seatPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * Sets the value of the seatPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            LocationType theDepartureAirport;
            theDepartureAirport = this.getDepartureAirport();
            strategy.appendField(locator, this, "departureAirport", buffer, theDepartureAirport);
        }
        {
            LocationType theArrivalAirport;
            theArrivalAirport = this.getArrivalAirport();
            strategy.appendField(locator, this, "arrivalAirport", buffer, theArrivalAirport);
        }
        {
            String theDepartureDate;
            theDepartureDate = this.getDepartureDate();
            strategy.appendField(locator, this, "departureDate", buffer, theDepartureDate);
        }
        {
            String theFlightNumber;
            theFlightNumber = this.getFlightNumber();
            strategy.appendField(locator, this, "flightNumber", buffer, theFlightNumber);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            String theSeatNumber;
            theSeatNumber = this.getSeatNumber();
            strategy.appendField(locator, this, "seatNumber", buffer, theSeatNumber);
        }
        {
            String theSeatPreference;
            theSeatPreference = this.getSeatPreference();
            strategy.appendField(locator, this, "seatPreference", buffer, theSeatPreference);
        }
        {
            boolean theSmokingAllowed;
            theSmokingAllowed = ((this.smokingAllowed!= null)?this.isSmokingAllowed():false);
            strategy.appendField(locator, this, "smokingAllowed", buffer, theSmokingAllowed);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SeatRequestType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SeatRequestType that = ((SeatRequestType) object);
        {
            LocationType lhsDepartureAirport;
            lhsDepartureAirport = this.getDepartureAirport();
            LocationType rhsDepartureAirport;
            rhsDepartureAirport = that.getDepartureAirport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departureAirport", lhsDepartureAirport), LocatorUtils.property(thatLocator, "departureAirport", rhsDepartureAirport), lhsDepartureAirport, rhsDepartureAirport)) {
                return false;
            }
        }
        {
            LocationType lhsArrivalAirport;
            lhsArrivalAirport = this.getArrivalAirport();
            LocationType rhsArrivalAirport;
            rhsArrivalAirport = that.getArrivalAirport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arrivalAirport", lhsArrivalAirport), LocatorUtils.property(thatLocator, "arrivalAirport", rhsArrivalAirport), lhsArrivalAirport, rhsArrivalAirport)) {
                return false;
            }
        }
        {
            String lhsDepartureDate;
            lhsDepartureDate = this.getDepartureDate();
            String rhsDepartureDate;
            rhsDepartureDate = that.getDepartureDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departureDate", lhsDepartureDate), LocatorUtils.property(thatLocator, "departureDate", rhsDepartureDate), lhsDepartureDate, rhsDepartureDate)) {
                return false;
            }
        }
        {
            String lhsFlightNumber;
            lhsFlightNumber = this.getFlightNumber();
            String rhsFlightNumber;
            rhsFlightNumber = that.getFlightNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flightNumber", lhsFlightNumber), LocatorUtils.property(thatLocator, "flightNumber", rhsFlightNumber), lhsFlightNumber, rhsFlightNumber)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            String lhsSeatNumber;
            lhsSeatNumber = this.getSeatNumber();
            String rhsSeatNumber;
            rhsSeatNumber = that.getSeatNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatNumber", lhsSeatNumber), LocatorUtils.property(thatLocator, "seatNumber", rhsSeatNumber), lhsSeatNumber, rhsSeatNumber)) {
                return false;
            }
        }
        {
            String lhsSeatPreference;
            lhsSeatPreference = this.getSeatPreference();
            String rhsSeatPreference;
            rhsSeatPreference = that.getSeatPreference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatPreference", lhsSeatPreference), LocatorUtils.property(thatLocator, "seatPreference", rhsSeatPreference), lhsSeatPreference, rhsSeatPreference)) {
                return false;
            }
        }
        {
            boolean lhsSmokingAllowed;
            lhsSmokingAllowed = ((this.smokingAllowed!= null)?this.isSmokingAllowed():false);
            boolean rhsSmokingAllowed;
            rhsSmokingAllowed = ((that.smokingAllowed!= null)?that.isSmokingAllowed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "smokingAllowed", lhsSmokingAllowed), LocatorUtils.property(thatLocator, "smokingAllowed", rhsSmokingAllowed), lhsSmokingAllowed, rhsSmokingAllowed)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            LocationType theDepartureAirport;
            theDepartureAirport = this.getDepartureAirport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departureAirport", theDepartureAirport), currentHashCode, theDepartureAirport);
        }
        {
            LocationType theArrivalAirport;
            theArrivalAirport = this.getArrivalAirport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arrivalAirport", theArrivalAirport), currentHashCode, theArrivalAirport);
        }
        {
            String theDepartureDate;
            theDepartureDate = this.getDepartureDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departureDate", theDepartureDate), currentHashCode, theDepartureDate);
        }
        {
            String theFlightNumber;
            theFlightNumber = this.getFlightNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flightNumber", theFlightNumber), currentHashCode, theFlightNumber);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            String theSeatNumber;
            theSeatNumber = this.getSeatNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatNumber", theSeatNumber), currentHashCode, theSeatNumber);
        }
        {
            String theSeatPreference;
            theSeatPreference = this.getSeatPreference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatPreference", theSeatPreference), currentHashCode, theSeatPreference);
        }
        {
            boolean theSmokingAllowed;
            theSmokingAllowed = ((this.smokingAllowed!= null)?this.isSmokingAllowed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "smokingAllowed", theSmokingAllowed), currentHashCode, theSmokingAllowed);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SeatRequestType) {
            final SeatRequestType copy = ((SeatRequestType) draftCopy);
            if (this.departureAirport!= null) {
                LocationType sourceDepartureAirport;
                sourceDepartureAirport = this.getDepartureAirport();
                LocationType copyDepartureAirport = ((LocationType) strategy.copy(LocatorUtils.property(locator, "departureAirport", sourceDepartureAirport), sourceDepartureAirport));
                copy.setDepartureAirport(copyDepartureAirport);
            } else {
                copy.departureAirport = null;
            }
            if (this.arrivalAirport!= null) {
                LocationType sourceArrivalAirport;
                sourceArrivalAirport = this.getArrivalAirport();
                LocationType copyArrivalAirport = ((LocationType) strategy.copy(LocatorUtils.property(locator, "arrivalAirport", sourceArrivalAirport), sourceArrivalAirport));
                copy.setArrivalAirport(copyArrivalAirport);
            } else {
                copy.arrivalAirport = null;
            }
            if (this.departureDate!= null) {
                String sourceDepartureDate;
                sourceDepartureDate = this.getDepartureDate();
                String copyDepartureDate = ((String) strategy.copy(LocatorUtils.property(locator, "departureDate", sourceDepartureDate), sourceDepartureDate));
                copy.setDepartureDate(copyDepartureDate);
            } else {
                copy.departureDate = null;
            }
            if (this.flightNumber!= null) {
                String sourceFlightNumber;
                sourceFlightNumber = this.getFlightNumber();
                String copyFlightNumber = ((String) strategy.copy(LocatorUtils.property(locator, "flightNumber", sourceFlightNumber), sourceFlightNumber));
                copy.setFlightNumber(copyFlightNumber);
            } else {
                copy.flightNumber = null;
            }
            if (this.status!= null) {
                String sourceStatus;
                sourceStatus = this.getStatus();
                String copyStatus = ((String) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus));
                copy.setStatus(copyStatus);
            } else {
                copy.status = null;
            }
            if (this.seatNumber!= null) {
                String sourceSeatNumber;
                sourceSeatNumber = this.getSeatNumber();
                String copySeatNumber = ((String) strategy.copy(LocatorUtils.property(locator, "seatNumber", sourceSeatNumber), sourceSeatNumber));
                copy.setSeatNumber(copySeatNumber);
            } else {
                copy.seatNumber = null;
            }
            if (this.seatPreference!= null) {
                String sourceSeatPreference;
                sourceSeatPreference = this.getSeatPreference();
                String copySeatPreference = ((String) strategy.copy(LocatorUtils.property(locator, "seatPreference", sourceSeatPreference), sourceSeatPreference));
                copy.setSeatPreference(copySeatPreference);
            } else {
                copy.seatPreference = null;
            }
            if (this.smokingAllowed!= null) {
                boolean sourceSmokingAllowed;
                sourceSmokingAllowed = ((this.smokingAllowed!= null)?this.isSmokingAllowed():false);
                boolean copySmokingAllowed = strategy.copy(LocatorUtils.property(locator, "smokingAllowed", sourceSmokingAllowed), sourceSmokingAllowed);
                copy.setSmokingAllowed(copySmokingAllowed);
            } else {
                copy.smokingAllowed = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SeatRequestType();
    }

}
