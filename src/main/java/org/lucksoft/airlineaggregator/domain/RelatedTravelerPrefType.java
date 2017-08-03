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
 * Name(s) of related travelers to be used with this collection of preferences.
 * 
 * <p>Java class for RelatedTravelerPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedTravelerPrefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTravelerPrefType", propOrder = {
    "uniqueID"
})
public class RelatedTravelerPrefType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "UniqueID", required = true)
    protected UniqueIDType uniqueID;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
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
            UniqueIDType theUniqueID;
            theUniqueID = this.getUniqueID();
            strategy.appendField(locator, this, "uniqueID", buffer, theUniqueID);
        }
        {
            PreferLevelType thePreferLevel;
            thePreferLevel = this.getPreferLevel();
            strategy.appendField(locator, this, "preferLevel", buffer, thePreferLevel);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelatedTravelerPrefType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RelatedTravelerPrefType that = ((RelatedTravelerPrefType) object);
        {
            UniqueIDType lhsUniqueID;
            lhsUniqueID = this.getUniqueID();
            UniqueIDType rhsUniqueID;
            rhsUniqueID = that.getUniqueID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueID", lhsUniqueID), LocatorUtils.property(thatLocator, "uniqueID", rhsUniqueID), lhsUniqueID, rhsUniqueID)) {
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
            UniqueIDType theUniqueID;
            theUniqueID = this.getUniqueID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uniqueID", theUniqueID), currentHashCode, theUniqueID);
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
        if (draftCopy instanceof RelatedTravelerPrefType) {
            final RelatedTravelerPrefType copy = ((RelatedTravelerPrefType) draftCopy);
            if (this.uniqueID!= null) {
                UniqueIDType sourceUniqueID;
                sourceUniqueID = this.getUniqueID();
                UniqueIDType copyUniqueID = ((UniqueIDType) strategy.copy(LocatorUtils.property(locator, "uniqueID", sourceUniqueID), sourceUniqueID));
                copy.setUniqueID(copyUniqueID);
            } else {
                copy.uniqueID = null;
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
        return new RelatedTravelerPrefType();
    }

}