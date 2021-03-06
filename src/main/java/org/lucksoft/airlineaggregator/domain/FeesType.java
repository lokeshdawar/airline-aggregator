//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import java.util.ArrayList;
import java.util.List;
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
 * A collection of fees.
 * 
 * <p>Java class for FeesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeesType", propOrder = {
    "fee"
})
public class FeesType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Fee", required = true)
    protected List<FeeType> fee;

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
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
            List<FeeType> theFee;
            theFee = (((this.fee!= null)&&(!this.fee.isEmpty()))?this.getFee():null);
            strategy.appendField(locator, this, "fee", buffer, theFee);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeesType that = ((FeesType) object);
        {
            List<FeeType> lhsFee;
            lhsFee = (((this.fee!= null)&&(!this.fee.isEmpty()))?this.getFee():null);
            List<FeeType> rhsFee;
            rhsFee = (((that.fee!= null)&&(!that.fee.isEmpty()))?that.getFee():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fee", lhsFee), LocatorUtils.property(thatLocator, "fee", rhsFee), lhsFee, rhsFee)) {
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
            List<FeeType> theFee;
            theFee = (((this.fee!= null)&&(!this.fee.isEmpty()))?this.getFee():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fee", theFee), currentHashCode, theFee);
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
        if (draftCopy instanceof FeesType) {
            final FeesType copy = ((FeesType) draftCopy);
            if ((this.fee!= null)&&(!this.fee.isEmpty())) {
                List<FeeType> sourceFee;
                sourceFee = (((this.fee!= null)&&(!this.fee.isEmpty()))?this.getFee():null);
                @SuppressWarnings("unchecked")
                List<FeeType> copyFee = ((List<FeeType> ) strategy.copy(LocatorUtils.property(locator, "fee", sourceFee), sourceFee));
                copy.fee = null;
                if (copyFee!= null) {
                    List<FeeType> uniqueFeel = copy.getFee();
                    uniqueFeel.addAll(copyFee);
                }
            } else {
                copy.fee = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeesType();
    }

}
