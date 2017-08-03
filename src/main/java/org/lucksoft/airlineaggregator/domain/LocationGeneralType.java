//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Provides high-level information regarding a location.
 * 
 * <p>Java class for LocationGeneralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationGeneralType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CityName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" minOccurs="0"/&gt;
 *         &lt;element name="StateProv" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.opentravel.org/OTA/2003/05}CountryNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGeneralType", propOrder = {
    "cityName",
    "stateProv",
    "countryName"
})
public class LocationGeneralType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "StateProv")
    protected String stateProv;
    @XmlElement(name = "CountryName")
    protected CountryNameType countryName;

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link CountryNameType }
     *     
     */
    public CountryNameType getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNameType }
     *     
     */
    public void setCountryName(CountryNameType value) {
        this.countryName = value;
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
            String theCityName;
            theCityName = this.getCityName();
            strategy.appendField(locator, this, "cityName", buffer, theCityName);
        }
        {
            String theStateProv;
            theStateProv = this.getStateProv();
            strategy.appendField(locator, this, "stateProv", buffer, theStateProv);
        }
        {
            CountryNameType theCountryName;
            theCountryName = this.getCountryName();
            strategy.appendField(locator, this, "countryName", buffer, theCountryName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LocationGeneralType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LocationGeneralType that = ((LocationGeneralType) object);
        {
            String lhsCityName;
            lhsCityName = this.getCityName();
            String rhsCityName;
            rhsCityName = that.getCityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityName", lhsCityName), LocatorUtils.property(thatLocator, "cityName", rhsCityName), lhsCityName, rhsCityName)) {
                return false;
            }
        }
        {
            String lhsStateProv;
            lhsStateProv = this.getStateProv();
            String rhsStateProv;
            rhsStateProv = that.getStateProv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateProv", lhsStateProv), LocatorUtils.property(thatLocator, "stateProv", rhsStateProv), lhsStateProv, rhsStateProv)) {
                return false;
            }
        }
        {
            CountryNameType lhsCountryName;
            lhsCountryName = this.getCountryName();
            CountryNameType rhsCountryName;
            rhsCountryName = that.getCountryName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryName", lhsCountryName), LocatorUtils.property(thatLocator, "countryName", rhsCountryName), lhsCountryName, rhsCountryName)) {
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
            String theCityName;
            theCityName = this.getCityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cityName", theCityName), currentHashCode, theCityName);
        }
        {
            String theStateProv;
            theStateProv = this.getStateProv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateProv", theStateProv), currentHashCode, theStateProv);
        }
        {
            CountryNameType theCountryName;
            theCountryName = this.getCountryName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryName", theCountryName), currentHashCode, theCountryName);
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
        if (draftCopy instanceof LocationGeneralType) {
            final LocationGeneralType copy = ((LocationGeneralType) draftCopy);
            if (this.cityName!= null) {
                String sourceCityName;
                sourceCityName = this.getCityName();
                String copyCityName = ((String) strategy.copy(LocatorUtils.property(locator, "cityName", sourceCityName), sourceCityName));
                copy.setCityName(copyCityName);
            } else {
                copy.cityName = null;
            }
            if (this.stateProv!= null) {
                String sourceStateProv;
                sourceStateProv = this.getStateProv();
                String copyStateProv = ((String) strategy.copy(LocatorUtils.property(locator, "stateProv", sourceStateProv), sourceStateProv));
                copy.setStateProv(copyStateProv);
            } else {
                copy.stateProv = null;
            }
            if (this.countryName!= null) {
                CountryNameType sourceCountryName;
                sourceCountryName = this.getCountryName();
                CountryNameType copyCountryName = ((CountryNameType) strategy.copy(LocatorUtils.property(locator, "countryName", sourceCountryName), sourceCountryName));
                copy.setCountryName(copyCountryName);
            } else {
                copy.countryName = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LocationGeneralType();
    }

}