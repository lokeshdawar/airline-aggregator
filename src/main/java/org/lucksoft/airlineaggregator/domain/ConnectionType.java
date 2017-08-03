//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

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
 * To specify connection locations, preference level for each, min connection time, and whether location is specified for stopping or changing.
 * 
 * <p>Java class for ConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionLocation" maxOccurs="9"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
 *                 &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *                 &lt;attribute name="MinChangeTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="ConnectionInfo"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Via"/&gt;
 *                       &lt;enumeration value="Stop"/&gt;
 *                       &lt;enumeration value="Change"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "ConnectionType", propOrder = {
    "connectionLocation"
})
public class ConnectionType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "ConnectionLocation", required = true)
    protected List<ConnectionType.ConnectionLocation> connectionLocation;

    /**
     * Gets the value of the connectionLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionType.ConnectionLocation }
     * 
     * 
     */
    public List<ConnectionType.ConnectionLocation> getConnectionLocation() {
        if (connectionLocation == null) {
            connectionLocation = new ArrayList<ConnectionType.ConnectionLocation>();
        }
        return this.connectionLocation;
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
            List<ConnectionType.ConnectionLocation> theConnectionLocation;
            theConnectionLocation = (((this.connectionLocation!= null)&&(!this.connectionLocation.isEmpty()))?this.getConnectionLocation():null);
            strategy.appendField(locator, this, "connectionLocation", buffer, theConnectionLocation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConnectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ConnectionType that = ((ConnectionType) object);
        {
            List<ConnectionType.ConnectionLocation> lhsConnectionLocation;
            lhsConnectionLocation = (((this.connectionLocation!= null)&&(!this.connectionLocation.isEmpty()))?this.getConnectionLocation():null);
            List<ConnectionType.ConnectionLocation> rhsConnectionLocation;
            rhsConnectionLocation = (((that.connectionLocation!= null)&&(!that.connectionLocation.isEmpty()))?that.getConnectionLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionLocation", lhsConnectionLocation), LocatorUtils.property(thatLocator, "connectionLocation", rhsConnectionLocation), lhsConnectionLocation, rhsConnectionLocation)) {
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
            List<ConnectionType.ConnectionLocation> theConnectionLocation;
            theConnectionLocation = (((this.connectionLocation!= null)&&(!this.connectionLocation.isEmpty()))?this.getConnectionLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionLocation", theConnectionLocation), currentHashCode, theConnectionLocation);
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
        if (draftCopy instanceof ConnectionType) {
            final ConnectionType copy = ((ConnectionType) draftCopy);
            if ((this.connectionLocation!= null)&&(!this.connectionLocation.isEmpty())) {
                List<ConnectionType.ConnectionLocation> sourceConnectionLocation;
                sourceConnectionLocation = (((this.connectionLocation!= null)&&(!this.connectionLocation.isEmpty()))?this.getConnectionLocation():null);
                @SuppressWarnings("unchecked")
                List<ConnectionType.ConnectionLocation> copyConnectionLocation = ((List<ConnectionType.ConnectionLocation> ) strategy.copy(LocatorUtils.property(locator, "connectionLocation", sourceConnectionLocation), sourceConnectionLocation));
                copy.connectionLocation = null;
                if (copyConnectionLocation!= null) {
                    List<ConnectionType.ConnectionLocation> uniqueConnectionLocationl = copy.getConnectionLocation();
                    uniqueConnectionLocationl.addAll(copyConnectionLocation);
                }
            } else {
                copy.connectionLocation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConnectionType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/&gt;
     *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *       &lt;attribute name="MinChangeTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="ConnectionInfo"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Via"/&gt;
     *             &lt;enumeration value="Stop"/&gt;
     *             &lt;enumeration value="Change"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConnectionLocation
        extends LocationType
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "Inclusive")
        protected Boolean inclusive;
        @XmlAttribute(name = "MinChangeTime")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minChangeTime;
        @XmlAttribute(name = "ConnectionInfo")
        protected String connectionInfo;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

        /**
         * Gets the value of the inclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isInclusive() {
            if (inclusive == null) {
                return true;
            } else {
                return inclusive;
            }
        }

        /**
         * Sets the value of the inclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInclusive(Boolean value) {
            this.inclusive = value;
        }

        /**
         * Gets the value of the minChangeTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinChangeTime() {
            return minChangeTime;
        }

        /**
         * Sets the value of the minChangeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinChangeTime(BigInteger value) {
            this.minChangeTime = value;
        }

        /**
         * Gets the value of the connectionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionInfo() {
            return connectionInfo;
        }

        /**
         * Sets the value of the connectionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConnectionInfo(String value) {
            this.connectionInfo = value;
        }

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType.PREFERRED;
            } else {
                return preferLevel;
            }
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
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
                boolean theInclusive;
                theInclusive = ((this.inclusive!= null)?this.isInclusive():false);
                strategy.appendField(locator, this, "inclusive", buffer, theInclusive);
            }
            {
                BigInteger theMinChangeTime;
                theMinChangeTime = this.getMinChangeTime();
                strategy.appendField(locator, this, "minChangeTime", buffer, theMinChangeTime);
            }
            {
                String theConnectionInfo;
                theConnectionInfo = this.getConnectionInfo();
                strategy.appendField(locator, this, "connectionInfo", buffer, theConnectionInfo);
            }
            {
                PreferLevelType thePreferLevel;
                thePreferLevel = this.getPreferLevel();
                strategy.appendField(locator, this, "preferLevel", buffer, thePreferLevel);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof ConnectionType.ConnectionLocation)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final ConnectionType.ConnectionLocation that = ((ConnectionType.ConnectionLocation) object);
            {
                boolean lhsInclusive;
                lhsInclusive = ((this.inclusive!= null)?this.isInclusive():false);
                boolean rhsInclusive;
                rhsInclusive = ((that.inclusive!= null)?that.isInclusive():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "inclusive", lhsInclusive), LocatorUtils.property(thatLocator, "inclusive", rhsInclusive), lhsInclusive, rhsInclusive)) {
                    return false;
                }
            }
            {
                BigInteger lhsMinChangeTime;
                lhsMinChangeTime = this.getMinChangeTime();
                BigInteger rhsMinChangeTime;
                rhsMinChangeTime = that.getMinChangeTime();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "minChangeTime", lhsMinChangeTime), LocatorUtils.property(thatLocator, "minChangeTime", rhsMinChangeTime), lhsMinChangeTime, rhsMinChangeTime)) {
                    return false;
                }
            }
            {
                String lhsConnectionInfo;
                lhsConnectionInfo = this.getConnectionInfo();
                String rhsConnectionInfo;
                rhsConnectionInfo = that.getConnectionInfo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionInfo", lhsConnectionInfo), LocatorUtils.property(thatLocator, "connectionInfo", rhsConnectionInfo), lhsConnectionInfo, rhsConnectionInfo)) {
                    return false;
                }
            }
            {
                PreferLevelType lhsPreferLevel;
                lhsPreferLevel = this.getPreferLevel();
                PreferLevelType rhsPreferLevel;
                rhsPreferLevel = that.getPreferLevel();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "preferLevel", lhsPreferLevel), LocatorUtils.property(thatLocator, "preferLevel", rhsPreferLevel), lhsPreferLevel, rhsPreferLevel)) {
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
                boolean theInclusive;
                theInclusive = ((this.inclusive!= null)?this.isInclusive():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inclusive", theInclusive), currentHashCode, theInclusive);
            }
            {
                BigInteger theMinChangeTime;
                theMinChangeTime = this.getMinChangeTime();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minChangeTime", theMinChangeTime), currentHashCode, theMinChangeTime);
            }
            {
                String theConnectionInfo;
                theConnectionInfo = this.getConnectionInfo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionInfo", theConnectionInfo), currentHashCode, theConnectionInfo);
            }
            {
                PreferLevelType thePreferLevel;
                thePreferLevel = this.getPreferLevel();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferLevel", thePreferLevel), currentHashCode, thePreferLevel);
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
            if (draftCopy instanceof ConnectionType.ConnectionLocation) {
                final ConnectionType.ConnectionLocation copy = ((ConnectionType.ConnectionLocation) draftCopy);
                if (this.inclusive!= null) {
                    boolean sourceInclusive;
                    sourceInclusive = ((this.inclusive!= null)?this.isInclusive():false);
                    boolean copyInclusive = strategy.copy(LocatorUtils.property(locator, "inclusive", sourceInclusive), sourceInclusive);
                    copy.setInclusive(copyInclusive);
                } else {
                    copy.inclusive = null;
                }
                if (this.minChangeTime!= null) {
                    BigInteger sourceMinChangeTime;
                    sourceMinChangeTime = this.getMinChangeTime();
                    BigInteger copyMinChangeTime = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "minChangeTime", sourceMinChangeTime), sourceMinChangeTime));
                    copy.setMinChangeTime(copyMinChangeTime);
                } else {
                    copy.minChangeTime = null;
                }
                if (this.connectionInfo!= null) {
                    String sourceConnectionInfo;
                    sourceConnectionInfo = this.getConnectionInfo();
                    String copyConnectionInfo = ((String) strategy.copy(LocatorUtils.property(locator, "connectionInfo", sourceConnectionInfo), sourceConnectionInfo));
                    copy.setConnectionInfo(copyConnectionInfo);
                } else {
                    copy.connectionInfo = null;
                }
                if (this.preferLevel!= null) {
                    PreferLevelType sourcePreferLevel;
                    sourcePreferLevel = this.getPreferLevel();
                    PreferLevelType copyPreferLevel = ((PreferLevelType) strategy.copy(LocatorUtils.property(locator, "preferLevel", sourcePreferLevel), sourcePreferLevel));
                    copy.setPreferLevel(copyPreferLevel);
                } else {
                    copy.preferLevel = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ConnectionType.ConnectionLocation();
        }

    }

}
