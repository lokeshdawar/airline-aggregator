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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Code and optional string to describe a location point.
 * 
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.lucksoft.airlineaggregator.domain.ConnectionType.ConnectionLocation.class,
    org.lucksoft.airlineaggregator.domain.ItemSearchCriterionType.CodeRef.class,
    org.lucksoft.airlineaggregator.domain.OriginDestinationInformationType.OriginLocation.class,
    org.lucksoft.airlineaggregator.domain.OriginDestinationInformationType.DestinationLocation.class,
    org.lucksoft.airlineaggregator.domain.VerificationType.StartLocation.class,
    org.lucksoft.airlineaggregator.domain.VerificationType.EndLocation.class,
    AirportPrefType.class
})
public class LocationType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        if (codeContext == null) {
            return "IATA";
        } else {
            return codeContext;
        }
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theLocationCode;
            theLocationCode = this.getLocationCode();
            strategy.appendField(locator, this, "locationCode", buffer, theLocationCode);
        }
        {
            String theCodeContext;
            theCodeContext = this.getCodeContext();
            strategy.appendField(locator, this, "codeContext", buffer, theCodeContext);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LocationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LocationType that = ((LocationType) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsLocationCode;
            lhsLocationCode = this.getLocationCode();
            String rhsLocationCode;
            rhsLocationCode = that.getLocationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationCode", lhsLocationCode), LocatorUtils.property(thatLocator, "locationCode", rhsLocationCode), lhsLocationCode, rhsLocationCode)) {
                return false;
            }
        }
        {
            String lhsCodeContext;
            lhsCodeContext = this.getCodeContext();
            String rhsCodeContext;
            rhsCodeContext = that.getCodeContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeContext", lhsCodeContext), LocatorUtils.property(thatLocator, "codeContext", rhsCodeContext), lhsCodeContext, rhsCodeContext)) {
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
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theLocationCode;
            theLocationCode = this.getLocationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationCode", theLocationCode), currentHashCode, theLocationCode);
        }
        {
            String theCodeContext;
            theCodeContext = this.getCodeContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeContext", theCodeContext), currentHashCode, theCodeContext);
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
        if (draftCopy instanceof LocationType) {
            final LocationType copy = ((LocationType) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.locationCode!= null) {
                String sourceLocationCode;
                sourceLocationCode = this.getLocationCode();
                String copyLocationCode = ((String) strategy.copy(LocatorUtils.property(locator, "locationCode", sourceLocationCode), sourceLocationCode));
                copy.setLocationCode(copyLocationCode);
            } else {
                copy.locationCode = null;
            }
            if (this.codeContext!= null) {
                String sourceCodeContext;
                sourceCodeContext = this.getCodeContext();
                String copyCodeContext = ((String) strategy.copy(LocatorUtils.property(locator, "codeContext", sourceCodeContext), sourceCodeContext));
                copy.setCodeContext(copyCodeContext);
            } else {
                copy.codeContext = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LocationType();
    }

}