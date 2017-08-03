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
 * Identifies travel insurance policies to be used with this collection of preferences.
 * 
 * <p>Java class for InsurancePrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsurancePrefType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StringLength1to64"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsurancePrefType", propOrder = {
    "value"
})
public class InsurancePrefType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Used for Character Strings, length 1 to 64
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
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
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
            String theRPH;
            theRPH = this.getRPH();
            strategy.appendField(locator, this, "rph", buffer, theRPH);
        }
        {
            PreferLevelType thePreferLevel;
            thePreferLevel = this.getPreferLevel();
            strategy.appendField(locator, this, "preferLevel", buffer, thePreferLevel);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InsurancePrefType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InsurancePrefType that = ((InsurancePrefType) object);
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
            String lhsRPH;
            lhsRPH = this.getRPH();
            String rhsRPH;
            rhsRPH = that.getRPH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rph", lhsRPH), LocatorUtils.property(thatLocator, "rph", rhsRPH), lhsRPH, rhsRPH)) {
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
            String theRPH;
            theRPH = this.getRPH();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rph", theRPH), currentHashCode, theRPH);
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
        if (draftCopy instanceof InsurancePrefType) {
            final InsurancePrefType copy = ((InsurancePrefType) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.rph!= null) {
                String sourceRPH;
                sourceRPH = this.getRPH();
                String copyRPH = ((String) strategy.copy(LocatorUtils.property(locator, "rph", sourceRPH), sourceRPH));
                copy.setRPH(copyRPH);
            } else {
                copy.rph = null;
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
        return new InsurancePrefType();
    }

}
