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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Web site address, in IETF specified format.
 * 
 * <p>Java class for URL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="URL_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DefaultIndGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "URL_Type", propOrder = {
    "value"
})
public class URLType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            boolean theDefaultInd;
            theDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
            strategy.appendField(locator, this, "defaultInd", buffer, theDefaultInd);
        }
        {
            String theShareSynchInd;
            theShareSynchInd = this.getShareSynchInd();
            strategy.appendField(locator, this, "shareSynchInd", buffer, theShareSynchInd);
        }
        {
            String theShareMarketInd;
            theShareMarketInd = this.getShareMarketInd();
            strategy.appendField(locator, this, "shareMarketInd", buffer, theShareMarketInd);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof URLType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final URLType that = ((URLType) object);
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
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
        {
            String lhsShareSynchInd;
            lhsShareSynchInd = this.getShareSynchInd();
            String rhsShareSynchInd;
            rhsShareSynchInd = that.getShareSynchInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shareSynchInd", lhsShareSynchInd), LocatorUtils.property(thatLocator, "shareSynchInd", rhsShareSynchInd), lhsShareSynchInd, rhsShareSynchInd)) {
                return false;
            }
        }
        {
            String lhsShareMarketInd;
            lhsShareMarketInd = this.getShareMarketInd();
            String rhsShareMarketInd;
            rhsShareMarketInd = that.getShareMarketInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shareMarketInd", lhsShareMarketInd), LocatorUtils.property(thatLocator, "shareMarketInd", rhsShareMarketInd), lhsShareMarketInd, rhsShareMarketInd)) {
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
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            boolean theDefaultInd;
            theDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultInd", theDefaultInd), currentHashCode, theDefaultInd);
        }
        {
            String theShareSynchInd;
            theShareSynchInd = this.getShareSynchInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shareSynchInd", theShareSynchInd), currentHashCode, theShareSynchInd);
        }
        {
            String theShareMarketInd;
            theShareMarketInd = this.getShareMarketInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shareMarketInd", theShareMarketInd), currentHashCode, theShareMarketInd);
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
        if (draftCopy instanceof URLType) {
            final URLType copy = ((URLType) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.type!= null) {
                String sourceType;
                sourceType = this.getType();
                String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.defaultInd!= null) {
                boolean sourceDefaultInd;
                sourceDefaultInd = ((this.defaultInd!= null)?this.isDefaultInd():false);
                boolean copyDefaultInd = strategy.copy(LocatorUtils.property(locator, "defaultInd", sourceDefaultInd), sourceDefaultInd);
                copy.setDefaultInd(copyDefaultInd);
            } else {
                copy.defaultInd = null;
            }
            if (this.shareSynchInd!= null) {
                String sourceShareSynchInd;
                sourceShareSynchInd = this.getShareSynchInd();
                String copyShareSynchInd = ((String) strategy.copy(LocatorUtils.property(locator, "shareSynchInd", sourceShareSynchInd), sourceShareSynchInd));
                copy.setShareSynchInd(copyShareSynchInd);
            } else {
                copy.shareSynchInd = null;
            }
            if (this.shareMarketInd!= null) {
                String sourceShareMarketInd;
                sourceShareMarketInd = this.getShareMarketInd();
                String copyShareMarketInd = ((String) strategy.copy(LocatorUtils.property(locator, "shareMarketInd", sourceShareMarketInd), sourceShareMarketInd));
                copy.setShareMarketInd(copyShareMarketInd);
            } else {
                copy.shareMarketInd = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new URLType();
    }

}
