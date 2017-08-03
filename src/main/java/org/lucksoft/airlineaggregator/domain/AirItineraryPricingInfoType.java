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
 * Pricing Information for an Air Itinerary
 * 
 * <p>Java class for AirItineraryPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItinTotalFare" type="{http://www.opentravel.org/OTA/2003/05}FareType" minOccurs="0"/&gt;
 *         &lt;element name="PTC_FareBreakdowns" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FareInfos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FareInfo" maxOccurs="10"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
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
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}PricingSourceType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfoType", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos"
})
@XmlSeeAlso({
    BookingPriceInfoType.class
})
public class AirItineraryPricingInfoType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "ItinTotalFare")
    protected FareType itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected AirItineraryPricingInfoType.PTCFareBreakdowns ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected AirItineraryPricingInfoType.FareInfos fareInfos;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getItinTotalFare() {
        return itinTotalFare;
    }

    /**
     * Sets the value of the itinTotalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setItinTotalFare(FareType value) {
        this.itinTotalFare = value;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     *     
     */
    public AirItineraryPricingInfoType.PTCFareBreakdowns getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     *     
     */
    public void setPTCFareBreakdowns(AirItineraryPricingInfoType.PTCFareBreakdowns value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.FareInfos }
     *     
     */
    public AirItineraryPricingInfoType.FareInfos getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.FareInfos }
     *     
     */
    public void setFareInfos(AirItineraryPricingInfoType.FareInfos value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
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
            FareType theItinTotalFare;
            theItinTotalFare = this.getItinTotalFare();
            strategy.appendField(locator, this, "itinTotalFare", buffer, theItinTotalFare);
        }
        {
            AirItineraryPricingInfoType.PTCFareBreakdowns thePTCFareBreakdowns;
            thePTCFareBreakdowns = this.getPTCFareBreakdowns();
            strategy.appendField(locator, this, "ptcFareBreakdowns", buffer, thePTCFareBreakdowns);
        }
        {
            AirItineraryPricingInfoType.FareInfos theFareInfos;
            theFareInfos = this.getFareInfos();
            strategy.appendField(locator, this, "fareInfos", buffer, theFareInfos);
        }
        {
            PricingSourceType thePricingSource;
            thePricingSource = this.getPricingSource();
            strategy.appendField(locator, this, "pricingSource", buffer, thePricingSource);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirItineraryPricingInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirItineraryPricingInfoType that = ((AirItineraryPricingInfoType) object);
        {
            FareType lhsItinTotalFare;
            lhsItinTotalFare = this.getItinTotalFare();
            FareType rhsItinTotalFare;
            rhsItinTotalFare = that.getItinTotalFare();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itinTotalFare", lhsItinTotalFare), LocatorUtils.property(thatLocator, "itinTotalFare", rhsItinTotalFare), lhsItinTotalFare, rhsItinTotalFare)) {
                return false;
            }
        }
        {
            AirItineraryPricingInfoType.PTCFareBreakdowns lhsPTCFareBreakdowns;
            lhsPTCFareBreakdowns = this.getPTCFareBreakdowns();
            AirItineraryPricingInfoType.PTCFareBreakdowns rhsPTCFareBreakdowns;
            rhsPTCFareBreakdowns = that.getPTCFareBreakdowns();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ptcFareBreakdowns", lhsPTCFareBreakdowns), LocatorUtils.property(thatLocator, "ptcFareBreakdowns", rhsPTCFareBreakdowns), lhsPTCFareBreakdowns, rhsPTCFareBreakdowns)) {
                return false;
            }
        }
        {
            AirItineraryPricingInfoType.FareInfos lhsFareInfos;
            lhsFareInfos = this.getFareInfos();
            AirItineraryPricingInfoType.FareInfos rhsFareInfos;
            rhsFareInfos = that.getFareInfos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fareInfos", lhsFareInfos), LocatorUtils.property(thatLocator, "fareInfos", rhsFareInfos), lhsFareInfos, rhsFareInfos)) {
                return false;
            }
        }
        {
            PricingSourceType lhsPricingSource;
            lhsPricingSource = this.getPricingSource();
            PricingSourceType rhsPricingSource;
            rhsPricingSource = that.getPricingSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingSource", lhsPricingSource), LocatorUtils.property(thatLocator, "pricingSource", rhsPricingSource), lhsPricingSource, rhsPricingSource)) {
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
            FareType theItinTotalFare;
            theItinTotalFare = this.getItinTotalFare();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itinTotalFare", theItinTotalFare), currentHashCode, theItinTotalFare);
        }
        {
            AirItineraryPricingInfoType.PTCFareBreakdowns thePTCFareBreakdowns;
            thePTCFareBreakdowns = this.getPTCFareBreakdowns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ptcFareBreakdowns", thePTCFareBreakdowns), currentHashCode, thePTCFareBreakdowns);
        }
        {
            AirItineraryPricingInfoType.FareInfos theFareInfos;
            theFareInfos = this.getFareInfos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fareInfos", theFareInfos), currentHashCode, theFareInfos);
        }
        {
            PricingSourceType thePricingSource;
            thePricingSource = this.getPricingSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingSource", thePricingSource), currentHashCode, thePricingSource);
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
        if (draftCopy instanceof AirItineraryPricingInfoType) {
            final AirItineraryPricingInfoType copy = ((AirItineraryPricingInfoType) draftCopy);
            if (this.itinTotalFare!= null) {
                FareType sourceItinTotalFare;
                sourceItinTotalFare = this.getItinTotalFare();
                FareType copyItinTotalFare = ((FareType) strategy.copy(LocatorUtils.property(locator, "itinTotalFare", sourceItinTotalFare), sourceItinTotalFare));
                copy.setItinTotalFare(copyItinTotalFare);
            } else {
                copy.itinTotalFare = null;
            }
            if (this.ptcFareBreakdowns!= null) {
                AirItineraryPricingInfoType.PTCFareBreakdowns sourcePTCFareBreakdowns;
                sourcePTCFareBreakdowns = this.getPTCFareBreakdowns();
                AirItineraryPricingInfoType.PTCFareBreakdowns copyPTCFareBreakdowns = ((AirItineraryPricingInfoType.PTCFareBreakdowns) strategy.copy(LocatorUtils.property(locator, "ptcFareBreakdowns", sourcePTCFareBreakdowns), sourcePTCFareBreakdowns));
                copy.setPTCFareBreakdowns(copyPTCFareBreakdowns);
            } else {
                copy.ptcFareBreakdowns = null;
            }
            if (this.fareInfos!= null) {
                AirItineraryPricingInfoType.FareInfos sourceFareInfos;
                sourceFareInfos = this.getFareInfos();
                AirItineraryPricingInfoType.FareInfos copyFareInfos = ((AirItineraryPricingInfoType.FareInfos) strategy.copy(LocatorUtils.property(locator, "fareInfos", sourceFareInfos), sourceFareInfos));
                copy.setFareInfos(copyFareInfos);
            } else {
                copy.fareInfos = null;
            }
            if (this.pricingSource!= null) {
                PricingSourceType sourcePricingSource;
                sourcePricingSource = this.getPricingSource();
                PricingSourceType copyPricingSource = ((PricingSourceType) strategy.copy(LocatorUtils.property(locator, "pricingSource", sourcePricingSource), sourcePricingSource));
                copy.setPricingSource(copyPricingSource);
            } else {
                copy.pricingSource = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AirItineraryPricingInfoType();
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
     *         &lt;element name="FareInfo" maxOccurs="10"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
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
        "fareInfo"
    })
    public static class FareInfos
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlElement(name = "FareInfo", required = true)
        protected List<AirItineraryPricingInfoType.FareInfos.FareInfo> fareInfo;

        /**
         * Gets the value of the fareInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryPricingInfoType.FareInfos.FareInfo }
         * 
         * 
         */
        public List<AirItineraryPricingInfoType.FareInfos.FareInfo> getFareInfo() {
            if (fareInfo == null) {
                fareInfo = new ArrayList<AirItineraryPricingInfoType.FareInfos.FareInfo>();
            }
            return this.fareInfo;
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
                List<AirItineraryPricingInfoType.FareInfos.FareInfo> theFareInfo;
                theFareInfo = (((this.fareInfo!= null)&&(!this.fareInfo.isEmpty()))?this.getFareInfo():null);
                strategy.appendField(locator, this, "fareInfo", buffer, theFareInfo);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof AirItineraryPricingInfoType.FareInfos)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AirItineraryPricingInfoType.FareInfos that = ((AirItineraryPricingInfoType.FareInfos) object);
            {
                List<AirItineraryPricingInfoType.FareInfos.FareInfo> lhsFareInfo;
                lhsFareInfo = (((this.fareInfo!= null)&&(!this.fareInfo.isEmpty()))?this.getFareInfo():null);
                List<AirItineraryPricingInfoType.FareInfos.FareInfo> rhsFareInfo;
                rhsFareInfo = (((that.fareInfo!= null)&&(!that.fareInfo.isEmpty()))?that.getFareInfo():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fareInfo", lhsFareInfo), LocatorUtils.property(thatLocator, "fareInfo", rhsFareInfo), lhsFareInfo, rhsFareInfo)) {
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
                List<AirItineraryPricingInfoType.FareInfos.FareInfo> theFareInfo;
                theFareInfo = (((this.fareInfo!= null)&&(!this.fareInfo.isEmpty()))?this.getFareInfo():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fareInfo", theFareInfo), currentHashCode, theFareInfo);
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
            if (draftCopy instanceof AirItineraryPricingInfoType.FareInfos) {
                final AirItineraryPricingInfoType.FareInfos copy = ((AirItineraryPricingInfoType.FareInfos) draftCopy);
                if ((this.fareInfo!= null)&&(!this.fareInfo.isEmpty())) {
                    List<AirItineraryPricingInfoType.FareInfos.FareInfo> sourceFareInfo;
                    sourceFareInfo = (((this.fareInfo!= null)&&(!this.fareInfo.isEmpty()))?this.getFareInfo():null);
                    @SuppressWarnings("unchecked")
                    List<AirItineraryPricingInfoType.FareInfos.FareInfo> copyFareInfo = ((List<AirItineraryPricingInfoType.FareInfos.FareInfo> ) strategy.copy(LocatorUtils.property(locator, "fareInfo", sourceFareInfo), sourceFareInfo));
                    copy.fareInfo = null;
                    if (copyFareInfo!= null) {
                        List<AirItineraryPricingInfoType.FareInfos.FareInfo> uniqueFareInfol = copy.getFareInfo();
                        uniqueFareInfol.addAll(copyFareInfo);
                    }
                } else {
                    copy.fareInfo = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AirItineraryPricingInfoType.FareInfos();
        }


        /**
         *  Information used to define a fare and its associated rules information.
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions"
        })
        public static class FareInfo
            extends FareInfoType
            implements Cloneable, CopyTo, Equals, HashCode, ToString
        {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensionsType }
             *     
             */
            public TPAExtensionsType getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensionsType }
             *     
             */
            public void setTPAExtensions(TPAExtensionsType value) {
                this.tpaExtensions = value;
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
                    TPAExtensionsType theTPAExtensions;
                    theTPAExtensions = this.getTPAExtensions();
                    strategy.appendField(locator, this, "tpaExtensions", buffer, theTPAExtensions);
                }
                return buffer;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof AirItineraryPricingInfoType.FareInfos.FareInfo)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                    return false;
                }
                final AirItineraryPricingInfoType.FareInfos.FareInfo that = ((AirItineraryPricingInfoType.FareInfos.FareInfo) object);
                {
                    TPAExtensionsType lhsTPAExtensions;
                    lhsTPAExtensions = this.getTPAExtensions();
                    TPAExtensionsType rhsTPAExtensions;
                    rhsTPAExtensions = that.getTPAExtensions();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "tpaExtensions", lhsTPAExtensions), LocatorUtils.property(thatLocator, "tpaExtensions", rhsTPAExtensions), lhsTPAExtensions, rhsTPAExtensions)) {
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
                    TPAExtensionsType theTPAExtensions;
                    theTPAExtensions = this.getTPAExtensions();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tpaExtensions", theTPAExtensions), currentHashCode, theTPAExtensions);
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
                if (draftCopy instanceof AirItineraryPricingInfoType.FareInfos.FareInfo) {
                    final AirItineraryPricingInfoType.FareInfos.FareInfo copy = ((AirItineraryPricingInfoType.FareInfos.FareInfo) draftCopy);
                    if (this.tpaExtensions!= null) {
                        TPAExtensionsType sourceTPAExtensions;
                        sourceTPAExtensions = this.getTPAExtensions();
                        TPAExtensionsType copyTPAExtensions = ((TPAExtensionsType) strategy.copy(LocatorUtils.property(locator, "tpaExtensions", sourceTPAExtensions), sourceTPAExtensions));
                        copy.setTPAExtensions(copyTPAExtensions);
                    } else {
                        copy.tpaExtensions = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new AirItineraryPricingInfoType.FareInfos.FareInfo();
            }

        }

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
     *         &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="20"/&gt;
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
        "ptcFareBreakdown"
    })
    public static class PTCFareBreakdowns
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlElement(name = "PTC_FareBreakdown", required = true)
        protected List<PTCFareBreakdownType> ptcFareBreakdown;

        /**
         * Gets the value of the ptcFareBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCFareBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType }
         * 
         * 
         */
        public List<PTCFareBreakdownType> getPTCFareBreakdown() {
            if (ptcFareBreakdown == null) {
                ptcFareBreakdown = new ArrayList<PTCFareBreakdownType>();
            }
            return this.ptcFareBreakdown;
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
                List<PTCFareBreakdownType> thePTCFareBreakdown;
                thePTCFareBreakdown = (((this.ptcFareBreakdown!= null)&&(!this.ptcFareBreakdown.isEmpty()))?this.getPTCFareBreakdown():null);
                strategy.appendField(locator, this, "ptcFareBreakdown", buffer, thePTCFareBreakdown);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof AirItineraryPricingInfoType.PTCFareBreakdowns)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AirItineraryPricingInfoType.PTCFareBreakdowns that = ((AirItineraryPricingInfoType.PTCFareBreakdowns) object);
            {
                List<PTCFareBreakdownType> lhsPTCFareBreakdown;
                lhsPTCFareBreakdown = (((this.ptcFareBreakdown!= null)&&(!this.ptcFareBreakdown.isEmpty()))?this.getPTCFareBreakdown():null);
                List<PTCFareBreakdownType> rhsPTCFareBreakdown;
                rhsPTCFareBreakdown = (((that.ptcFareBreakdown!= null)&&(!that.ptcFareBreakdown.isEmpty()))?that.getPTCFareBreakdown():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "ptcFareBreakdown", lhsPTCFareBreakdown), LocatorUtils.property(thatLocator, "ptcFareBreakdown", rhsPTCFareBreakdown), lhsPTCFareBreakdown, rhsPTCFareBreakdown)) {
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
                List<PTCFareBreakdownType> thePTCFareBreakdown;
                thePTCFareBreakdown = (((this.ptcFareBreakdown!= null)&&(!this.ptcFareBreakdown.isEmpty()))?this.getPTCFareBreakdown():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ptcFareBreakdown", thePTCFareBreakdown), currentHashCode, thePTCFareBreakdown);
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
            if (draftCopy instanceof AirItineraryPricingInfoType.PTCFareBreakdowns) {
                final AirItineraryPricingInfoType.PTCFareBreakdowns copy = ((AirItineraryPricingInfoType.PTCFareBreakdowns) draftCopy);
                if ((this.ptcFareBreakdown!= null)&&(!this.ptcFareBreakdown.isEmpty())) {
                    List<PTCFareBreakdownType> sourcePTCFareBreakdown;
                    sourcePTCFareBreakdown = (((this.ptcFareBreakdown!= null)&&(!this.ptcFareBreakdown.isEmpty()))?this.getPTCFareBreakdown():null);
                    @SuppressWarnings("unchecked")
                    List<PTCFareBreakdownType> copyPTCFareBreakdown = ((List<PTCFareBreakdownType> ) strategy.copy(LocatorUtils.property(locator, "ptcFareBreakdown", sourcePTCFareBreakdown), sourcePTCFareBreakdown));
                    copy.ptcFareBreakdown = null;
                    if (copyPTCFareBreakdown!= null) {
                        List<PTCFareBreakdownType> uniquePTCFareBreakdownl = copy.getPTCFareBreakdown();
                        uniquePTCFareBreakdownl.addAll(copyPTCFareBreakdown);
                    }
                } else {
                    copy.ptcFareBreakdown = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new AirItineraryPricingInfoType.PTCFareBreakdowns();
        }

    }

}