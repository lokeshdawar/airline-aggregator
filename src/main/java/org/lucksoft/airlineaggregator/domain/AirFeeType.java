//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * 
 * 	Defines the data fields available for the fees.
 * 	
 * 
 * <p>Java class for AirFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirFeeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;ShortDescriptionType"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
 *       &lt;attribute name="FeeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirFeeType", propOrder = {
    "value"
})
public class AirFeeType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "FeeCode", required = true)
    protected String feeCode;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

    /**
     * A textual description.
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
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCode(String value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
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
            String theFeeCode;
            theFeeCode = this.getFeeCode();
            strategy.appendField(locator, this, "feeCode", buffer, theFeeCode);
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount);
        }
        {
            String theCurrencyCode;
            theCurrencyCode = this.getCurrencyCode();
            strategy.appendField(locator, this, "currencyCode", buffer, theCurrencyCode);
        }
        {
            BigInteger theDecimalPlaces;
            theDecimalPlaces = this.getDecimalPlaces();
            strategy.appendField(locator, this, "decimalPlaces", buffer, theDecimalPlaces);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirFeeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirFeeType that = ((AirFeeType) object);
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
            String lhsFeeCode;
            lhsFeeCode = this.getFeeCode();
            String rhsFeeCode;
            rhsFeeCode = that.getFeeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeCode", lhsFeeCode), LocatorUtils.property(thatLocator, "feeCode", rhsFeeCode), lhsFeeCode, rhsFeeCode)) {
                return false;
            }
        }
        {
            BigDecimal lhsAmount;
            lhsAmount = this.getAmount();
            BigDecimal rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount)) {
                return false;
            }
        }
        {
            String lhsCurrencyCode;
            lhsCurrencyCode = this.getCurrencyCode();
            String rhsCurrencyCode;
            rhsCurrencyCode = that.getCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyCode", lhsCurrencyCode), LocatorUtils.property(thatLocator, "currencyCode", rhsCurrencyCode), lhsCurrencyCode, rhsCurrencyCode)) {
                return false;
            }
        }
        {
            BigInteger lhsDecimalPlaces;
            lhsDecimalPlaces = this.getDecimalPlaces();
            BigInteger rhsDecimalPlaces;
            rhsDecimalPlaces = that.getDecimalPlaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decimalPlaces", lhsDecimalPlaces), LocatorUtils.property(thatLocator, "decimalPlaces", rhsDecimalPlaces), lhsDecimalPlaces, rhsDecimalPlaces)) {
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
            String theFeeCode;
            theFeeCode = this.getFeeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeCode", theFeeCode), currentHashCode, theFeeCode);
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount);
        }
        {
            String theCurrencyCode;
            theCurrencyCode = this.getCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyCode", theCurrencyCode), currentHashCode, theCurrencyCode);
        }
        {
            BigInteger theDecimalPlaces;
            theDecimalPlaces = this.getDecimalPlaces();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decimalPlaces", theDecimalPlaces), currentHashCode, theDecimalPlaces);
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
        if (draftCopy instanceof AirFeeType) {
            final AirFeeType copy = ((AirFeeType) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.feeCode!= null) {
                String sourceFeeCode;
                sourceFeeCode = this.getFeeCode();
                String copyFeeCode = ((String) strategy.copy(LocatorUtils.property(locator, "feeCode", sourceFeeCode), sourceFeeCode));
                copy.setFeeCode(copyFeeCode);
            } else {
                copy.feeCode = null;
            }
            if (this.amount!= null) {
                BigDecimal sourceAmount;
                sourceAmount = this.getAmount();
                BigDecimal copyAmount = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "amount", sourceAmount), sourceAmount));
                copy.setAmount(copyAmount);
            } else {
                copy.amount = null;
            }
            if (this.currencyCode!= null) {
                String sourceCurrencyCode;
                sourceCurrencyCode = this.getCurrencyCode();
                String copyCurrencyCode = ((String) strategy.copy(LocatorUtils.property(locator, "currencyCode", sourceCurrencyCode), sourceCurrencyCode));
                copy.setCurrencyCode(copyCurrencyCode);
            } else {
                copy.currencyCode = null;
            }
            if (this.decimalPlaces!= null) {
                BigInteger sourceDecimalPlaces;
                sourceDecimalPlaces = this.getDecimalPlaces();
                BigInteger copyDecimalPlaces = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "decimalPlaces", sourceDecimalPlaces), sourceDecimalPlaces));
                copy.setDecimalPlaces(copyDecimalPlaces);
            } else {
                copy.decimalPlaces = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AirFeeType();
    }

}
