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
 * Information about an address that identifies a location for a specific purposes.
 * 
 * <p>Java class for AddressInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DefaultIndGroup"/&gt;
 *       &lt;attribute name="UseType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType")
@XmlSeeAlso({
    org.lucksoft.airlineaggregator.domain.CustomerType.Address.class
})
public class AddressInfoType
    extends AddressType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlAttribute(name = "UseType")
    protected String useType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseType(String value) {
        this.useType = value;
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
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultInd() {
        if (defaultInd == null) {
            return false;
        } else {
            return defaultInd;
        }
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
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
            String theUseType;
            theUseType = this.getUseType();
            strategy.appendField(locator, this, "useType", buffer, theUseType);
        }
        {
            String theRPH;
            theRPH = this.getRPH();
            strategy.appendField(locator, this, "rph", buffer, theRPH);
        }
        {
            boolean theDefaultInd;
            theDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
            strategy.appendField(locator, this, "defaultInd", buffer, theDefaultInd);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AddressInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AddressInfoType that = ((AddressInfoType) object);
        {
            String lhsUseType;
            lhsUseType = this.getUseType();
            String rhsUseType;
            rhsUseType = that.getUseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useType", lhsUseType), LocatorUtils.property(thatLocator, "useType", rhsUseType), lhsUseType, rhsUseType)) {
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
            boolean lhsDefaultInd;
            lhsDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
            boolean rhsDefaultInd;
            rhsDefaultInd = ((that.defaultInd!= null)?that.isDefaultInd():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultInd", lhsDefaultInd), LocatorUtils.property(thatLocator, "defaultInd", rhsDefaultInd), lhsDefaultInd, rhsDefaultInd)) {
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
            String theUseType;
            theUseType = this.getUseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useType", theUseType), currentHashCode, theUseType);
        }
        {
            String theRPH;
            theRPH = this.getRPH();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rph", theRPH), currentHashCode, theRPH);
        }
        {
            boolean theDefaultInd;
            theDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultInd", theDefaultInd), currentHashCode, theDefaultInd);
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
        if (draftCopy instanceof AddressInfoType) {
            final AddressInfoType copy = ((AddressInfoType) draftCopy);
            if (this.useType!= null) {
                String sourceUseType;
                sourceUseType = this.getUseType();
                String copyUseType = ((String) strategy.copy(LocatorUtils.property(locator, "useType", sourceUseType), sourceUseType));
                copy.setUseType(copyUseType);
            } else {
                copy.useType = null;
            }
            if (this.rph!= null) {
                String sourceRPH;
                sourceRPH = this.getRPH();
                String copyRPH = ((String) strategy.copy(LocatorUtils.property(locator, "rph", sourceRPH), sourceRPH));
                copy.setRPH(copyRPH);
            } else {
                copy.rph = null;
            }
            if (this.defaultInd!= null) {
                boolean sourceDefaultInd;
                sourceDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
                boolean copyDefaultInd = strategy.copy(LocatorUtils.property(locator, "defaultInd", sourceDefaultInd), sourceDefaultInd);
                copy.setDefaultInd(copyDefaultInd);
            } else {
                copy.defaultInd = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AddressInfoType();
    }

}