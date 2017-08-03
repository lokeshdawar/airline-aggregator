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
 * A container to relate individual travelers to an inventory or chargeable item.
 * 
 * <p>Java class for TravelerRPHs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerRPHs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelerRPH" maxOccurs="99"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerRPHs", propOrder = {
    "travelerRPH"
})
public class TravelerRPHs
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "TravelerRPH", required = true)
    protected List<TravelerRPHs.TravelerRPH> travelerRPH;

    /**
     * Gets the value of the travelerRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerRPHs.TravelerRPH }
     * 
     * 
     */
    public List<TravelerRPHs.TravelerRPH> getTravelerRPH() {
        if (travelerRPH == null) {
            travelerRPH = new ArrayList<TravelerRPHs.TravelerRPH>();
        }
        return this.travelerRPH;
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
            List<TravelerRPHs.TravelerRPH> theTravelerRPH;
            theTravelerRPH = (((this.travelerRPH!= null)&&(!this.travelerRPH.isEmpty()))?this.getTravelerRPH():null);
            strategy.appendField(locator, this, "travelerRPH", buffer, theTravelerRPH);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TravelerRPHs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TravelerRPHs that = ((TravelerRPHs) object);
        {
            List<TravelerRPHs.TravelerRPH> lhsTravelerRPH;
            lhsTravelerRPH = (((this.travelerRPH!= null)&&(!this.travelerRPH.isEmpty()))?this.getTravelerRPH():null);
            List<TravelerRPHs.TravelerRPH> rhsTravelerRPH;
            rhsTravelerRPH = (((that.travelerRPH!= null)&&(!that.travelerRPH.isEmpty()))?that.getTravelerRPH():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "travelerRPH", lhsTravelerRPH), LocatorUtils.property(thatLocator, "travelerRPH", rhsTravelerRPH), lhsTravelerRPH, rhsTravelerRPH)) {
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
            List<TravelerRPHs.TravelerRPH> theTravelerRPH;
            theTravelerRPH = (((this.travelerRPH!= null)&&(!this.travelerRPH.isEmpty()))?this.getTravelerRPH():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "travelerRPH", theTravelerRPH), currentHashCode, theTravelerRPH);
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
        if (draftCopy instanceof TravelerRPHs) {
            final TravelerRPHs copy = ((TravelerRPHs) draftCopy);
            if ((this.travelerRPH!= null)&&(!this.travelerRPH.isEmpty())) {
                List<TravelerRPHs.TravelerRPH> sourceTravelerRPH;
                sourceTravelerRPH = (((this.travelerRPH!= null)&&(!this.travelerRPH.isEmpty()))?this.getTravelerRPH():null);
                @SuppressWarnings("unchecked")
                List<TravelerRPHs.TravelerRPH> copyTravelerRPH = ((List<TravelerRPHs.TravelerRPH> ) strategy.copy(LocatorUtils.property(locator, "travelerRPH", sourceTravelerRPH), sourceTravelerRPH));
                copy.travelerRPH = null;
                if (copyTravelerRPH!= null) {
                    List<TravelerRPHs.TravelerRPH> uniqueTravelerRPHl = copy.getTravelerRPH();
                    uniqueTravelerRPHl.addAll(copyTravelerRPH);
                }
            } else {
                copy.travelerRPH = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TravelerRPHs();
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
     *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRPH
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "RPH", required = true)
        protected String rph;

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
                String theRPH;
                theRPH = this.getRPH();
                strategy.appendField(locator, this, "rph", buffer, theRPH);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof TravelerRPHs.TravelerRPH)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TravelerRPHs.TravelerRPH that = ((TravelerRPHs.TravelerRPH) object);
            {
                String lhsRPH;
                lhsRPH = this.getRPH();
                String rhsRPH;
                rhsRPH = that.getRPH();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "rph", lhsRPH), LocatorUtils.property(thatLocator, "rph", rhsRPH), lhsRPH, rhsRPH)) {
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
                String theRPH;
                theRPH = this.getRPH();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rph", theRPH), currentHashCode, theRPH);
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
            if (draftCopy instanceof TravelerRPHs.TravelerRPH) {
                final TravelerRPHs.TravelerRPH copy = ((TravelerRPHs.TravelerRPH) draftCopy);
                if (this.rph!= null) {
                    String sourceRPH;
                    sourceRPH = this.getRPH();
                    String copyRPH = ((String) strategy.copy(LocatorUtils.property(locator, "rph", sourceRPH), sourceRPH));
                    copy.setRPH(copyRPH);
                } else {
                    copy.rph = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new TravelerRPHs.TravelerRPH();
        }

    }

}
