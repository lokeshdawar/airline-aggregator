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
 * Provides blackout date information.
 * 
 * <p>Java class for BlackoutDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackoutDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlackoutDate" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackoutDateType", propOrder = {
    "blackoutDate"
})
public class BlackoutDateType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "BlackoutDate", required = true)
    protected List<DateTimeSpanType> blackoutDate;

    /**
     * Gets the value of the blackoutDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackoutDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackoutDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeSpanType }
     * 
     * 
     */
    public List<DateTimeSpanType> getBlackoutDate() {
        if (blackoutDate == null) {
            blackoutDate = new ArrayList<DateTimeSpanType>();
        }
        return this.blackoutDate;
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
            List<DateTimeSpanType> theBlackoutDate;
            theBlackoutDate = (((this.blackoutDate!= null)&&(!this.blackoutDate.isEmpty()))?this.getBlackoutDate():null);
            strategy.appendField(locator, this, "blackoutDate", buffer, theBlackoutDate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BlackoutDateType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BlackoutDateType that = ((BlackoutDateType) object);
        {
            List<DateTimeSpanType> lhsBlackoutDate;
            lhsBlackoutDate = (((this.blackoutDate!= null)&&(!this.blackoutDate.isEmpty()))?this.getBlackoutDate():null);
            List<DateTimeSpanType> rhsBlackoutDate;
            rhsBlackoutDate = (((that.blackoutDate!= null)&&(!that.blackoutDate.isEmpty()))?that.getBlackoutDate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blackoutDate", lhsBlackoutDate), LocatorUtils.property(thatLocator, "blackoutDate", rhsBlackoutDate), lhsBlackoutDate, rhsBlackoutDate)) {
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
            List<DateTimeSpanType> theBlackoutDate;
            theBlackoutDate = (((this.blackoutDate!= null)&&(!this.blackoutDate.isEmpty()))?this.getBlackoutDate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blackoutDate", theBlackoutDate), currentHashCode, theBlackoutDate);
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
        if (draftCopy instanceof BlackoutDateType) {
            final BlackoutDateType copy = ((BlackoutDateType) draftCopy);
            if ((this.blackoutDate!= null)&&(!this.blackoutDate.isEmpty())) {
                List<DateTimeSpanType> sourceBlackoutDate;
                sourceBlackoutDate = (((this.blackoutDate!= null)&&(!this.blackoutDate.isEmpty()))?this.getBlackoutDate():null);
                @SuppressWarnings("unchecked")
                List<DateTimeSpanType> copyBlackoutDate = ((List<DateTimeSpanType> ) strategy.copy(LocatorUtils.property(locator, "blackoutDate", sourceBlackoutDate), sourceBlackoutDate));
                copy.blackoutDate = null;
                if (copyBlackoutDate!= null) {
                    List<DateTimeSpanType> uniqueBlackoutDatel = copy.getBlackoutDate();
                    uniqueBlackoutDatel.addAll(copyBlackoutDate);
                }
            } else {
                copy.blackoutDate = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BlackoutDateType();
    }

}
