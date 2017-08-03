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
 * Specifies the origin and destination of the traveler.
 * 			Attributes:
 * 			DirectionInd - A directional indicator that identifies a type of air booking, either one-way, round-trip, or open-jaw with the enumeration of (OneWay | RT | OpenJaw) respectively.
 * 			ActionCode - Indicates the status of the booking, such as OK or Wait-List.
 * 			NumberInParty - Indicates the traveler count.
 * 			 
 * 
 * <p>Java class for AirItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginDestinationOptions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginDestinationOption" maxOccurs="99"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType"&gt;
 *                           &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DirectionInd" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryType", propOrder = {
    "originDestinationOptions"
})
public class AirItineraryType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "OriginDestinationOptions", required = true)
    protected AirItineraryType.OriginDestinationOptions originDestinationOptions;
    @XmlAttribute(name = "DirectionInd")
    protected AirTripType directionInd;

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType.OriginDestinationOptions }
     *     
     */
    public AirItineraryType.OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType.OriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(AirItineraryType.OriginDestinationOptions value) {
        this.originDestinationOptions = value;
    }

    /**
     * Gets the value of the directionInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getDirectionInd() {
        return directionInd;
    }

    /**
     * Sets the value of the directionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setDirectionInd(AirTripType value) {
        this.directionInd = value;
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
            AirItineraryType.OriginDestinationOptions theOriginDestinationOptions;
            theOriginDestinationOptions = this.getOriginDestinationOptions();
            strategy.appendField(locator, this, "originDestinationOptions", buffer, theOriginDestinationOptions);
        }
        {
            AirTripType theDirectionInd;
            theDirectionInd = this.getDirectionInd();
            strategy.appendField(locator, this, "directionInd", buffer, theDirectionInd);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirItineraryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirItineraryType that = ((AirItineraryType) object);
        {
            AirItineraryType.OriginDestinationOptions lhsOriginDestinationOptions;
            lhsOriginDestinationOptions = this.getOriginDestinationOptions();
            AirItineraryType.OriginDestinationOptions rhsOriginDestinationOptions;
            rhsOriginDestinationOptions = that.getOriginDestinationOptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originDestinationOptions", lhsOriginDestinationOptions), LocatorUtils.property(thatLocator, "originDestinationOptions", rhsOriginDestinationOptions), lhsOriginDestinationOptions, rhsOriginDestinationOptions)) {
                return false;
            }
        }
        {
            AirTripType lhsDirectionInd;
            lhsDirectionInd = this.getDirectionInd();
            AirTripType rhsDirectionInd;
            rhsDirectionInd = that.getDirectionInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directionInd", lhsDirectionInd), LocatorUtils.property(thatLocator, "directionInd", rhsDirectionInd), lhsDirectionInd, rhsDirectionInd)) {
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
            AirItineraryType.OriginDestinationOptions theOriginDestinationOptions;
            theOriginDestinationOptions = this.getOriginDestinationOptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originDestinationOptions", theOriginDestinationOptions), currentHashCode, theOriginDestinationOptions);
        }
        {
            AirTripType theDirectionInd;
            theDirectionInd = this.getDirectionInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directionInd", theDirectionInd), currentHashCode, theDirectionInd);
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
        if (draftCopy instanceof AirItineraryType) {
            final AirItineraryType copy = ((AirItineraryType) draftCopy);
            if (this.originDestinationOptions!= null) {
                AirItineraryType.OriginDestinationOptions sourceOriginDestinationOptions;
                sourceOriginDestinationOptions = this.getOriginDestinationOptions();
                AirItineraryType.OriginDestinationOptions copyOriginDestinationOptions = ((AirItineraryType.OriginDestinationOptions) strategy.copy(LocatorUtils.property(locator, "originDestinationOptions", sourceOriginDestinationOptions), sourceOriginDestinationOptions));
                copy.setOriginDestinationOptions(copyOriginDestinationOptions);
            } else {
                copy.originDestinationOptions = null;
            }
            if (this.directionInd!= null) {
                AirTripType sourceDirectionInd;
                sourceDirectionInd = this.getDirectionInd();
                AirTripType copyDirectionInd = ((AirTripType) strategy.copy(LocatorUtils.property(locator, "directionInd", sourceDirectionInd), sourceDirectionInd));
                copy.setDirectionInd(copyDirectionInd);
            } else {
                copy.directionInd = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AirItineraryType();
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
     *         &lt;element name="OriginDestinationOption" maxOccurs="99"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType"&gt;
     *                 &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" /&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "originDestinationOption"
    })
    public static class OriginDestinationOptions
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlElement(name = "OriginDestinationOption", required = true)
        protected List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> originDestinationOption;

        /**
         * Gets the value of the originDestinationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption }
         * 
         * 
         */
        public List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> getOriginDestinationOption() {
            if (originDestinationOption == null) {
                originDestinationOption = new ArrayList<AirItineraryType.OriginDestinationOptions.OriginDestinationOption>();
            }
            return this.originDestinationOption;
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
                List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> theOriginDestinationOption;
                theOriginDestinationOption = (((this.originDestinationOption!= null)&&(!this.originDestinationOption.isEmpty()))?this.getOriginDestinationOption():null);
                strategy.appendField(locator, this, "originDestinationOption", buffer, theOriginDestinationOption);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof AirItineraryType.OriginDestinationOptions)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AirItineraryType.OriginDestinationOptions that = ((AirItineraryType.OriginDestinationOptions) object);
            {
                List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> lhsOriginDestinationOption;
                lhsOriginDestinationOption = (((this.originDestinationOption!= null)&&(!this.originDestinationOption.isEmpty()))?this.getOriginDestinationOption():null);
                List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> rhsOriginDestinationOption;
                rhsOriginDestinationOption = (((that.originDestinationOption!= null)&&(!that.originDestinationOption.isEmpty()))?that.getOriginDestinationOption():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "originDestinationOption", lhsOriginDestinationOption), LocatorUtils.property(thatLocator, "originDestinationOption", rhsOriginDestinationOption), lhsOriginDestinationOption, rhsOriginDestinationOption)) {
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
                List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> theOriginDestinationOption;
                theOriginDestinationOption = (((this.originDestinationOption!= null)&&(!this.originDestinationOption.isEmpty()))?this.getOriginDestinationOption():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originDestinationOption", theOriginDestinationOption), currentHashCode, theOriginDestinationOption);
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
            if (draftCopy instanceof AirItineraryType.OriginDestinationOptions) {
                final AirItineraryType.OriginDestinationOptions copy = ((AirItineraryType.OriginDestinationOptions) draftCopy);
                if ((this.originDestinationOption!= null)&&(!this.originDestinationOption.isEmpty())) {
                    List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> sourceOriginDestinationOption;
                    sourceOriginDestinationOption = (((this.originDestinationOption!= null)&&(!this.originDestinationOption.isEmpty()))?this.getOriginDestinationOption():null);
                    @SuppressWarnings("unchecked")
                    List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> copyOriginDestinationOption = ((List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> ) strategy.copy(LocatorUtils.property(locator, "originDestinationOption", sourceOriginDestinationOption), sourceOriginDestinationOption));
                    copy.originDestinationOption = null;
                    if (copyOriginDestinationOption!= null) {
                        List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> uniqueOriginDestinationOptionl = copy.getOriginDestinationOption();
                        uniqueOriginDestinationOptionl.addAll(copyOriginDestinationOption);
                    }
                } else {
                    copy.originDestinationOption = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AirItineraryType.OriginDestinationOptions();
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType"&gt;
         *       &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OriginDestinationOption
            extends OriginDestinationOptionType
            implements Cloneable, CopyTo, Equals, HashCode, ToString
        {

            @XmlAttribute(name = "RefNumber")
            protected Integer refNumber;

            /**
             * Gets the value of the refNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRefNumber() {
                return refNumber;
            }

            /**
             * Sets the value of the refNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRefNumber(Integer value) {
                this.refNumber = value;
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
                    Integer theRefNumber;
                    theRefNumber = this.getRefNumber();
                    strategy.appendField(locator, this, "refNumber", buffer, theRefNumber);
                }
                return buffer;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof AirItineraryType.OriginDestinationOptions.OriginDestinationOption)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                    return false;
                }
                final AirItineraryType.OriginDestinationOptions.OriginDestinationOption that = ((AirItineraryType.OriginDestinationOptions.OriginDestinationOption) object);
                {
                    Integer lhsRefNumber;
                    lhsRefNumber = this.getRefNumber();
                    Integer rhsRefNumber;
                    rhsRefNumber = that.getRefNumber();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "refNumber", lhsRefNumber), LocatorUtils.property(thatLocator, "refNumber", rhsRefNumber), lhsRefNumber, rhsRefNumber)) {
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
                    Integer theRefNumber;
                    theRefNumber = this.getRefNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refNumber", theRefNumber), currentHashCode, theRefNumber);
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
                if (draftCopy instanceof AirItineraryType.OriginDestinationOptions.OriginDestinationOption) {
                    final AirItineraryType.OriginDestinationOptions.OriginDestinationOption copy = ((AirItineraryType.OriginDestinationOptions.OriginDestinationOption) draftCopy);
                    if (this.refNumber!= null) {
                        Integer sourceRefNumber;
                        sourceRefNumber = this.getRefNumber();
                        Integer copyRefNumber = ((Integer) strategy.copy(LocatorUtils.property(locator, "refNumber", sourceRefNumber), sourceRefNumber));
                        copy.setRefNumber(copyRefNumber);
                    } else {
                        copy.refNumber = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new AirItineraryType.OriginDestinationOptions.OriginDestinationOption();
            }

        }

    }

}
