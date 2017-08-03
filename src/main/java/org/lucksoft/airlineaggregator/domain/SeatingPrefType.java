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
 * Seating preferences to be used with this collection of preferences.
 * 
 * <p>Java class for SeatingPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatingPrefType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StringLength0to64"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
 *       &lt;attribute name="SeatDirection" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *       &lt;attribute name="SeatLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeatPosition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeatRow" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatingPrefType", propOrder = {
    "value"
})
public class SeatingPrefType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "SeatDirection")
    protected String seatDirection;
    @XmlAttribute(name = "SeatLocation")
    protected String seatLocation;
    @XmlAttribute(name = "SeatPosition")
    protected String seatPosition;
    @XmlAttribute(name = "SeatRow")
    protected String seatRow;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Used for Character Strings, length 0 to 64
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
     * Gets the value of the seatDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatDirection() {
        return seatDirection;
    }

    /**
     * Sets the value of the seatDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatDirection(String value) {
        this.seatDirection = value;
    }

    /**
     * Gets the value of the seatLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatLocation() {
        return seatLocation;
    }

    /**
     * Sets the value of the seatLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatLocation(String value) {
        this.seatLocation = value;
    }

    /**
     * Gets the value of the seatPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPosition() {
        return seatPosition;
    }

    /**
     * Sets the value of the seatPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPosition(String value) {
        this.seatPosition = value;
    }

    /**
     * Gets the value of the seatRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatRow() {
        return seatRow;
    }

    /**
     * Sets the value of the seatRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatRow(String value) {
        this.seatRow = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
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
            String theSeatDirection;
            theSeatDirection = this.getSeatDirection();
            strategy.appendField(locator, this, "seatDirection", buffer, theSeatDirection);
        }
        {
            String theSeatLocation;
            theSeatLocation = this.getSeatLocation();
            strategy.appendField(locator, this, "seatLocation", buffer, theSeatLocation);
        }
        {
            String theSeatPosition;
            theSeatPosition = this.getSeatPosition();
            strategy.appendField(locator, this, "seatPosition", buffer, theSeatPosition);
        }
        {
            String theSeatRow;
            theSeatRow = this.getSeatRow();
            strategy.appendField(locator, this, "seatRow", buffer, theSeatRow);
        }
        {
            PreferLevelType thePreferLevel;
            thePreferLevel = this.getPreferLevel();
            strategy.appendField(locator, this, "preferLevel", buffer, thePreferLevel);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SeatingPrefType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SeatingPrefType that = ((SeatingPrefType) object);
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
            String lhsSeatDirection;
            lhsSeatDirection = this.getSeatDirection();
            String rhsSeatDirection;
            rhsSeatDirection = that.getSeatDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatDirection", lhsSeatDirection), LocatorUtils.property(thatLocator, "seatDirection", rhsSeatDirection), lhsSeatDirection, rhsSeatDirection)) {
                return false;
            }
        }
        {
            String lhsSeatLocation;
            lhsSeatLocation = this.getSeatLocation();
            String rhsSeatLocation;
            rhsSeatLocation = that.getSeatLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatLocation", lhsSeatLocation), LocatorUtils.property(thatLocator, "seatLocation", rhsSeatLocation), lhsSeatLocation, rhsSeatLocation)) {
                return false;
            }
        }
        {
            String lhsSeatPosition;
            lhsSeatPosition = this.getSeatPosition();
            String rhsSeatPosition;
            rhsSeatPosition = that.getSeatPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatPosition", lhsSeatPosition), LocatorUtils.property(thatLocator, "seatPosition", rhsSeatPosition), lhsSeatPosition, rhsSeatPosition)) {
                return false;
            }
        }
        {
            String lhsSeatRow;
            lhsSeatRow = this.getSeatRow();
            String rhsSeatRow;
            rhsSeatRow = that.getSeatRow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seatRow", lhsSeatRow), LocatorUtils.property(thatLocator, "seatRow", rhsSeatRow), lhsSeatRow, rhsSeatRow)) {
                return false;
            }
        }
        {
            PreferLevelType lhsPreferLevel;
            lhsPreferLevel = this.getPreferLevel();
            PreferLevelType rhsPreferLevel;
            rhsPreferLevel = that.getPreferLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferLevel", lhsPreferLevel), LocatorUtils.property(thatLocator, "preferLevel", rhsPreferLevel), lhsPreferLevel, rhsPreferLevel)) {
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
            String theSeatDirection;
            theSeatDirection = this.getSeatDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatDirection", theSeatDirection), currentHashCode, theSeatDirection);
        }
        {
            String theSeatLocation;
            theSeatLocation = this.getSeatLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatLocation", theSeatLocation), currentHashCode, theSeatLocation);
        }
        {
            String theSeatPosition;
            theSeatPosition = this.getSeatPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatPosition", theSeatPosition), currentHashCode, theSeatPosition);
        }
        {
            String theSeatRow;
            theSeatRow = this.getSeatRow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seatRow", theSeatRow), currentHashCode, theSeatRow);
        }
        {
            PreferLevelType thePreferLevel;
            thePreferLevel = this.getPreferLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferLevel", thePreferLevel), currentHashCode, thePreferLevel);
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
        if (draftCopy instanceof SeatingPrefType) {
            final SeatingPrefType copy = ((SeatingPrefType) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.seatDirection!= null) {
                String sourceSeatDirection;
                sourceSeatDirection = this.getSeatDirection();
                String copySeatDirection = ((String) strategy.copy(LocatorUtils.property(locator, "seatDirection", sourceSeatDirection), sourceSeatDirection));
                copy.setSeatDirection(copySeatDirection);
            } else {
                copy.seatDirection = null;
            }
            if (this.seatLocation!= null) {
                String sourceSeatLocation;
                sourceSeatLocation = this.getSeatLocation();
                String copySeatLocation = ((String) strategy.copy(LocatorUtils.property(locator, "seatLocation", sourceSeatLocation), sourceSeatLocation));
                copy.setSeatLocation(copySeatLocation);
            } else {
                copy.seatLocation = null;
            }
            if (this.seatPosition!= null) {
                String sourceSeatPosition;
                sourceSeatPosition = this.getSeatPosition();
                String copySeatPosition = ((String) strategy.copy(LocatorUtils.property(locator, "seatPosition", sourceSeatPosition), sourceSeatPosition));
                copy.setSeatPosition(copySeatPosition);
            } else {
                copy.seatPosition = null;
            }
            if (this.seatRow!= null) {
                String sourceSeatRow;
                sourceSeatRow = this.getSeatRow();
                String copySeatRow = ((String) strategy.copy(LocatorUtils.property(locator, "seatRow", sourceSeatRow), sourceSeatRow));
                copy.setSeatRow(copySeatRow);
            } else {
                copy.seatRow = null;
            }
            if (this.preferLevel!= null) {
                PreferLevelType sourcePreferLevel;
                sourcePreferLevel = this.getPreferLevel();
                PreferLevelType copyPreferLevel = ((PreferLevelType) strategy.copy(LocatorUtils.property(locator, "preferLevel", sourcePreferLevel), sourcePreferLevel));
                copy.setPreferLevel(copyPreferLevel);
            } else {
                copy.preferLevel = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SeatingPrefType();
    }

}
