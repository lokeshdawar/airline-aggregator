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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * The RelativePosition object contains information about the direction, distance and travel time to/from a facility (hotel, car rental location, or airport) or to/from a designated location.
 * 
 * <p>Java class for RelativePositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativePositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TransportationsType"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RelativePositionGroup"/&gt;
 *       &lt;attribute name="Nearest" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IndexPointCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" /&gt;
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ToFrom"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="ToFacility"/&gt;
 *             &lt;enumeration value="FromFacility"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ApproximateDistanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePositionType")
public class RelativePositionType
    extends TransportationsType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlAttribute(name = "Nearest")
    protected Boolean nearest;
    @XmlAttribute(name = "IndexPointCode")
    protected String indexPointCode;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "PrimaryIndicator")
    protected Boolean primaryIndicator;
    @XmlAttribute(name = "ToFrom")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String toFrom;
    @XmlAttribute(name = "ApproximateDistanceInd")
    protected Boolean approximateDistanceInd;
    @XmlAttribute(name = "Direction")
    protected String direction;
    @XmlAttribute(name = "Distance")
    protected String distance;
    @XmlAttribute(name = "DistanceUnitName")
    protected DistanceUnitNameType distanceUnitName;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;

    /**
     * Gets the value of the nearest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearest() {
        return nearest;
    }

    /**
     * Sets the value of the nearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearest(Boolean value) {
        this.nearest = value;
    }

    /**
     * Gets the value of the indexPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexPointCode() {
        return indexPointCode;
    }

    /**
     * Sets the value of the indexPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexPointCode(String value) {
        this.indexPointCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * Gets the value of the toFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToFrom() {
        return toFrom;
    }

    /**
     * Sets the value of the toFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToFrom(String value) {
        this.toFrom = value;
    }

    /**
     * Gets the value of the approximateDistanceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateDistanceInd() {
        return approximateDistanceInd;
    }

    /**
     * Sets the value of the approximateDistanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateDistanceInd(Boolean value) {
        this.approximateDistanceInd = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the distanceUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getDistanceUnitName() {
        return distanceUnitName;
    }

    /**
     * Sets the value of the distanceUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setDistanceUnitName(DistanceUnitNameType value) {
        this.distanceUnitName = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            Boolean theNearest;
            theNearest = this.isNearest();
            strategy.appendField(locator, this, "nearest", buffer, theNearest);
        }
        {
            String theIndexPointCode;
            theIndexPointCode = this.getIndexPointCode();
            strategy.appendField(locator, this, "indexPointCode", buffer, theIndexPointCode);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean thePrimaryIndicator;
            thePrimaryIndicator = this.isPrimaryIndicator();
            strategy.appendField(locator, this, "primaryIndicator", buffer, thePrimaryIndicator);
        }
        {
            String theToFrom;
            theToFrom = this.getToFrom();
            strategy.appendField(locator, this, "toFrom", buffer, theToFrom);
        }
        {
            Boolean theApproximateDistanceInd;
            theApproximateDistanceInd = this.isApproximateDistanceInd();
            strategy.appendField(locator, this, "approximateDistanceInd", buffer, theApproximateDistanceInd);
        }
        {
            String theDirection;
            theDirection = this.getDirection();
            strategy.appendField(locator, this, "direction", buffer, theDirection);
        }
        {
            String theDistance;
            theDistance = this.getDistance();
            strategy.appendField(locator, this, "distance", buffer, theDistance);
        }
        {
            DistanceUnitNameType theDistanceUnitName;
            theDistanceUnitName = this.getDistanceUnitName();
            strategy.appendField(locator, this, "distanceUnitName", buffer, theDistanceUnitName);
        }
        {
            String theUnitOfMeasureCode;
            theUnitOfMeasureCode = this.getUnitOfMeasureCode();
            strategy.appendField(locator, this, "unitOfMeasureCode", buffer, theUnitOfMeasureCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelativePositionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RelativePositionType that = ((RelativePositionType) object);
        {
            Boolean lhsNearest;
            lhsNearest = this.isNearest();
            Boolean rhsNearest;
            rhsNearest = that.isNearest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nearest", lhsNearest), LocatorUtils.property(thatLocator, "nearest", rhsNearest), lhsNearest, rhsNearest)) {
                return false;
            }
        }
        {
            String lhsIndexPointCode;
            lhsIndexPointCode = this.getIndexPointCode();
            String rhsIndexPointCode;
            rhsIndexPointCode = that.getIndexPointCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexPointCode", lhsIndexPointCode), LocatorUtils.property(thatLocator, "indexPointCode", rhsIndexPointCode), lhsIndexPointCode, rhsIndexPointCode)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            Boolean lhsPrimaryIndicator;
            lhsPrimaryIndicator = this.isPrimaryIndicator();
            Boolean rhsPrimaryIndicator;
            rhsPrimaryIndicator = that.isPrimaryIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryIndicator", lhsPrimaryIndicator), LocatorUtils.property(thatLocator, "primaryIndicator", rhsPrimaryIndicator), lhsPrimaryIndicator, rhsPrimaryIndicator)) {
                return false;
            }
        }
        {
            String lhsToFrom;
            lhsToFrom = this.getToFrom();
            String rhsToFrom;
            rhsToFrom = that.getToFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toFrom", lhsToFrom), LocatorUtils.property(thatLocator, "toFrom", rhsToFrom), lhsToFrom, rhsToFrom)) {
                return false;
            }
        }
        {
            Boolean lhsApproximateDistanceInd;
            lhsApproximateDistanceInd = this.isApproximateDistanceInd();
            Boolean rhsApproximateDistanceInd;
            rhsApproximateDistanceInd = that.isApproximateDistanceInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approximateDistanceInd", lhsApproximateDistanceInd), LocatorUtils.property(thatLocator, "approximateDistanceInd", rhsApproximateDistanceInd), lhsApproximateDistanceInd, rhsApproximateDistanceInd)) {
                return false;
            }
        }
        {
            String lhsDirection;
            lhsDirection = this.getDirection();
            String rhsDirection;
            rhsDirection = that.getDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "direction", lhsDirection), LocatorUtils.property(thatLocator, "direction", rhsDirection), lhsDirection, rhsDirection)) {
                return false;
            }
        }
        {
            String lhsDistance;
            lhsDistance = this.getDistance();
            String rhsDistance;
            rhsDistance = that.getDistance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distance", lhsDistance), LocatorUtils.property(thatLocator, "distance", rhsDistance), lhsDistance, rhsDistance)) {
                return false;
            }
        }
        {
            DistanceUnitNameType lhsDistanceUnitName;
            lhsDistanceUnitName = this.getDistanceUnitName();
            DistanceUnitNameType rhsDistanceUnitName;
            rhsDistanceUnitName = that.getDistanceUnitName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanceUnitName", lhsDistanceUnitName), LocatorUtils.property(thatLocator, "distanceUnitName", rhsDistanceUnitName), lhsDistanceUnitName, rhsDistanceUnitName)) {
                return false;
            }
        }
        {
            String lhsUnitOfMeasureCode;
            lhsUnitOfMeasureCode = this.getUnitOfMeasureCode();
            String rhsUnitOfMeasureCode;
            rhsUnitOfMeasureCode = that.getUnitOfMeasureCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasureCode", lhsUnitOfMeasureCode), LocatorUtils.property(thatLocator, "unitOfMeasureCode", rhsUnitOfMeasureCode), lhsUnitOfMeasureCode, rhsUnitOfMeasureCode)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Boolean theNearest;
            theNearest = this.isNearest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nearest", theNearest), currentHashCode, theNearest);
        }
        {
            String theIndexPointCode;
            theIndexPointCode = this.getIndexPointCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexPointCode", theIndexPointCode), currentHashCode, theIndexPointCode);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Boolean thePrimaryIndicator;
            thePrimaryIndicator = this.isPrimaryIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIndicator", thePrimaryIndicator), currentHashCode, thePrimaryIndicator);
        }
        {
            String theToFrom;
            theToFrom = this.getToFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toFrom", theToFrom), currentHashCode, theToFrom);
        }
        {
            Boolean theApproximateDistanceInd;
            theApproximateDistanceInd = this.isApproximateDistanceInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approximateDistanceInd", theApproximateDistanceInd), currentHashCode, theApproximateDistanceInd);
        }
        {
            String theDirection;
            theDirection = this.getDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "direction", theDirection), currentHashCode, theDirection);
        }
        {
            String theDistance;
            theDistance = this.getDistance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distance", theDistance), currentHashCode, theDistance);
        }
        {
            DistanceUnitNameType theDistanceUnitName;
            theDistanceUnitName = this.getDistanceUnitName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distanceUnitName", theDistanceUnitName), currentHashCode, theDistanceUnitName);
        }
        {
            String theUnitOfMeasureCode;
            theUnitOfMeasureCode = this.getUnitOfMeasureCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasureCode", theUnitOfMeasureCode), currentHashCode, theUnitOfMeasureCode);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof RelativePositionType) {
            final RelativePositionType copy = ((RelativePositionType) draftCopy);
            if (this.nearest!= null) {
                Boolean sourceNearest;
                sourceNearest = this.isNearest();
                Boolean copyNearest = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nearest", sourceNearest), sourceNearest));
                copy.setNearest(copyNearest);
            } else {
                copy.nearest = null;
            }
            if (this.indexPointCode!= null) {
                String sourceIndexPointCode;
                sourceIndexPointCode = this.getIndexPointCode();
                String copyIndexPointCode = ((String) strategy.copy(LocatorUtils.property(locator, "indexPointCode", sourceIndexPointCode), sourceIndexPointCode));
                copy.setIndexPointCode(copyIndexPointCode);
            } else {
                copy.indexPointCode = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.primaryIndicator!= null) {
                Boolean sourcePrimaryIndicator;
                sourcePrimaryIndicator = this.isPrimaryIndicator();
                Boolean copyPrimaryIndicator = ((Boolean) strategy.copy(LocatorUtils.property(locator, "primaryIndicator", sourcePrimaryIndicator), sourcePrimaryIndicator));
                copy.setPrimaryIndicator(copyPrimaryIndicator);
            } else {
                copy.primaryIndicator = null;
            }
            if (this.toFrom!= null) {
                String sourceToFrom;
                sourceToFrom = this.getToFrom();
                String copyToFrom = ((String) strategy.copy(LocatorUtils.property(locator, "toFrom", sourceToFrom), sourceToFrom));
                copy.setToFrom(copyToFrom);
            } else {
                copy.toFrom = null;
            }
            if (this.approximateDistanceInd!= null) {
                Boolean sourceApproximateDistanceInd;
                sourceApproximateDistanceInd = this.isApproximateDistanceInd();
                Boolean copyApproximateDistanceInd = ((Boolean) strategy.copy(LocatorUtils.property(locator, "approximateDistanceInd", sourceApproximateDistanceInd), sourceApproximateDistanceInd));
                copy.setApproximateDistanceInd(copyApproximateDistanceInd);
            } else {
                copy.approximateDistanceInd = null;
            }
            if (this.direction!= null) {
                String sourceDirection;
                sourceDirection = this.getDirection();
                String copyDirection = ((String) strategy.copy(LocatorUtils.property(locator, "direction", sourceDirection), sourceDirection));
                copy.setDirection(copyDirection);
            } else {
                copy.direction = null;
            }
            if (this.distance!= null) {
                String sourceDistance;
                sourceDistance = this.getDistance();
                String copyDistance = ((String) strategy.copy(LocatorUtils.property(locator, "distance", sourceDistance), sourceDistance));
                copy.setDistance(copyDistance);
            } else {
                copy.distance = null;
            }
            if (this.distanceUnitName!= null) {
                DistanceUnitNameType sourceDistanceUnitName;
                sourceDistanceUnitName = this.getDistanceUnitName();
                DistanceUnitNameType copyDistanceUnitName = ((DistanceUnitNameType) strategy.copy(LocatorUtils.property(locator, "distanceUnitName", sourceDistanceUnitName), sourceDistanceUnitName));
                copy.setDistanceUnitName(copyDistanceUnitName);
            } else {
                copy.distanceUnitName = null;
            }
            if (this.unitOfMeasureCode!= null) {
                String sourceUnitOfMeasureCode;
                sourceUnitOfMeasureCode = this.getUnitOfMeasureCode();
                String copyUnitOfMeasureCode = ((String) strategy.copy(LocatorUtils.property(locator, "unitOfMeasureCode", sourceUnitOfMeasureCode), sourceUnitOfMeasureCode));
                copy.setUnitOfMeasureCode(copyUnitOfMeasureCode);
            } else {
                copy.unitOfMeasureCode = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RelativePositionType();
    }

}