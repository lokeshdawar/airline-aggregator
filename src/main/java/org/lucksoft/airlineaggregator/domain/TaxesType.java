//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * A collection of taxes.
 * 
 * <p>Java class for TaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}TaxType" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxesType", propOrder = {
    "tax"
})
public class TaxesType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
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
            List<TaxType> theTax;
            theTax = (((this.tax!= null)&&(!this.tax.isEmpty()))?this.getTax():null);
            strategy.appendField(locator, this, "tax", buffer, theTax);
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
        if (!(object instanceof TaxesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxesType that = ((TaxesType) object);
        {
            List<TaxType> lhsTax;
            lhsTax = (((this.tax!= null)&&(!this.tax.isEmpty()))?this.getTax():null);
            List<TaxType> rhsTax;
            rhsTax = (((that.tax!= null)&&(!that.tax.isEmpty()))?that.getTax():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tax", lhsTax), LocatorUtils.property(thatLocator, "tax", rhsTax), lhsTax, rhsTax)) {
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
            List<TaxType> theTax;
            theTax = (((this.tax!= null)&&(!this.tax.isEmpty()))?this.getTax():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tax", theTax), currentHashCode, theTax);
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
        if (draftCopy instanceof TaxesType) {
            final TaxesType copy = ((TaxesType) draftCopy);
            if ((this.tax!= null)&&(!this.tax.isEmpty())) {
                List<TaxType> sourceTax;
                sourceTax = (((this.tax!= null)&&(!this.tax.isEmpty()))?this.getTax():null);
                @SuppressWarnings("unchecked")
                List<TaxType> copyTax = ((List<TaxType> ) strategy.copy(LocatorUtils.property(locator, "tax", sourceTax), sourceTax));
                copy.tax = null;
                if (copyTax!= null) {
                    List<TaxType> uniqueTaxl = copy.getTax();
                    uniqueTaxl.addAll(copyTax);
                }
            } else {
                copy.tax = null;
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
        return new TaxesType();
    }

}
