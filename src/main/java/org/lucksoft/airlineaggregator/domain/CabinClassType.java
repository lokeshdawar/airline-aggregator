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
 * Describes the Cabin details in a seat map
 * 
 * <p>Java class for CabinClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirRows" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AirRow" type="{http://www.opentravel.org/OTA/2003/05}RowDetailsType" maxOccurs="999"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CabinType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" /&gt;
 *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassType", propOrder = {
    "airRows"
})
public class CabinClassType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "AirRows")
    protected CabinClassType.AirRows airRows;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the airRows property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassType.AirRows }
     *     
     */
    public CabinClassType.AirRows getAirRows() {
        return airRows;
    }

    /**
     * Sets the value of the airRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassType.AirRows }
     *     
     */
    public void setAirRows(CabinClassType.AirRows value) {
        this.airRows = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
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
            CabinClassType.AirRows theAirRows;
            theAirRows = this.getAirRows();
            strategy.appendField(locator, this, "airRows", buffer, theAirRows);
        }
        {
            CabinType theCabinType;
            theCabinType = this.getCabinType();
            strategy.appendField(locator, this, "cabinType", buffer, theCabinType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CabinClassType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CabinClassType that = ((CabinClassType) object);
        {
            CabinClassType.AirRows lhsAirRows;
            lhsAirRows = this.getAirRows();
            CabinClassType.AirRows rhsAirRows;
            rhsAirRows = that.getAirRows();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airRows", lhsAirRows), LocatorUtils.property(thatLocator, "airRows", rhsAirRows), lhsAirRows, rhsAirRows)) {
                return false;
            }
        }
        {
            CabinType lhsCabinType;
            lhsCabinType = this.getCabinType();
            CabinType rhsCabinType;
            rhsCabinType = that.getCabinType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cabinType", lhsCabinType), LocatorUtils.property(thatLocator, "cabinType", rhsCabinType), lhsCabinType, rhsCabinType)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            CabinClassType.AirRows theAirRows;
            theAirRows = this.getAirRows();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airRows", theAirRows), currentHashCode, theAirRows);
        }
        {
            CabinType theCabinType;
            theCabinType = this.getCabinType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cabinType", theCabinType), currentHashCode, theCabinType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
        if (draftCopy instanceof CabinClassType) {
            final CabinClassType copy = ((CabinClassType) draftCopy);
            if (this.airRows!= null) {
                CabinClassType.AirRows sourceAirRows;
                sourceAirRows = this.getAirRows();
                CabinClassType.AirRows copyAirRows = ((CabinClassType.AirRows) strategy.copy(LocatorUtils.property(locator, "airRows", sourceAirRows), sourceAirRows));
                copy.setAirRows(copyAirRows);
            } else {
                copy.airRows = null;
            }
            if (this.cabinType!= null) {
                CabinType sourceCabinType;
                sourceCabinType = this.getCabinType();
                CabinType copyCabinType = ((CabinType) strategy.copy(LocatorUtils.property(locator, "cabinType", sourceCabinType), sourceCabinType));
                copy.setCabinType(copyCabinType);
            } else {
                copy.cabinType = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CabinClassType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AirRow" type="{http://www.opentravel.org/OTA/2003/05}RowDetailsType" maxOccurs="999"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airRow"
    })
    public static class AirRows
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlElement(name = "AirRow", required = true)
        protected List<RowDetailsType> airRow;

        /**
         * Gets the value of the airRow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airRow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RowDetailsType }
         * 
         * 
         */
        public List<RowDetailsType> getAirRow() {
            if (airRow == null) {
                airRow = new ArrayList<RowDetailsType>();
            }
            return this.airRow;
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
                List<RowDetailsType> theAirRow;
                theAirRow = (((this.airRow!= null)&&(!this.airRow.isEmpty()))?this.getAirRow():null);
                strategy.appendField(locator, this, "airRow", buffer, theAirRow);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof CabinClassType.AirRows)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final CabinClassType.AirRows that = ((CabinClassType.AirRows) object);
            {
                List<RowDetailsType> lhsAirRow;
                lhsAirRow = (((this.airRow!= null)&&(!this.airRow.isEmpty()))?this.getAirRow():null);
                List<RowDetailsType> rhsAirRow;
                rhsAirRow = (((that.airRow!= null)&&(!that.airRow.isEmpty()))?that.getAirRow():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "airRow", lhsAirRow), LocatorUtils.property(thatLocator, "airRow", rhsAirRow), lhsAirRow, rhsAirRow)) {
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
                List<RowDetailsType> theAirRow;
                theAirRow = (((this.airRow!= null)&&(!this.airRow.isEmpty()))?this.getAirRow():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airRow", theAirRow), currentHashCode, theAirRow);
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
            if (draftCopy instanceof CabinClassType.AirRows) {
                final CabinClassType.AirRows copy = ((CabinClassType.AirRows) draftCopy);
                if ((this.airRow!= null)&&(!this.airRow.isEmpty())) {
                    List<RowDetailsType> sourceAirRow;
                    sourceAirRow = (((this.airRow!= null)&&(!this.airRow.isEmpty()))?this.getAirRow():null);
                    @SuppressWarnings("unchecked")
                    List<RowDetailsType> copyAirRow = ((List<RowDetailsType> ) strategy.copy(LocatorUtils.property(locator, "airRow", sourceAirRow), sourceAirRow));
                    copy.airRow = null;
                    if (copyAirRow!= null) {
                        List<RowDetailsType> uniqueAirRowl = copy.getAirRow();
                        uniqueAirRowl.addAll(copyAirRow);
                    }
                } else {
                    copy.airRow = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new CabinClassType.AirRows();
        }

    }

}
