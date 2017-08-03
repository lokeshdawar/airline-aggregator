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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * Information to acknowledge the receipt of a message.
 * 
 * <p>Java class for MessageAcknowledgementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageAcknowledgementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/&gt;
 *             &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAcknowledgementType", propOrder = {
    "success",
    "warnings",
    "errors",
    "uniqueID",
    "tpaExtensions"
})
public class MessageAcknowledgementType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

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

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
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
            SuccessType theSuccess;
            theSuccess = this.getSuccess();
            strategy.appendField(locator, this, "success", buffer, theSuccess);
        }
        {
            WarningsType theWarnings;
            theWarnings = this.getWarnings();
            strategy.appendField(locator, this, "warnings", buffer, theWarnings);
        }
        {
            ErrorsType theErrors;
            theErrors = this.getErrors();
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            UniqueIDType theUniqueID;
            theUniqueID = this.getUniqueID();
            strategy.appendField(locator, this, "uniqueID", buffer, theUniqueID);
        }
        {
            TPAExtensionsType theTPAExtensions;
            theTPAExtensions = this.getTPAExtensions();
            strategy.appendField(locator, this, "tpaExtensions", buffer, theTPAExtensions);
        }
        {
            String theEchoToken;
            theEchoToken = this.getEchoToken();
            strategy.appendField(locator, this, "echoToken", buffer, theEchoToken);
        }
        {
            XMLGregorianCalendar theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            strategy.appendField(locator, this, "timeStamp", buffer, theTimeStamp);
        }
        {
            String theTarget;
            theTarget = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theTarget);
        }
        {
            BigDecimal theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            String theTransactionIdentifier;
            theTransactionIdentifier = this.getTransactionIdentifier();
            strategy.appendField(locator, this, "transactionIdentifier", buffer, theTransactionIdentifier);
        }
        {
            BigInteger theSequenceNmbr;
            theSequenceNmbr = this.getSequenceNmbr();
            strategy.appendField(locator, this, "sequenceNmbr", buffer, theSequenceNmbr);
        }
        {
            String theTransactionStatusCode;
            theTransactionStatusCode = this.getTransactionStatusCode();
            strategy.appendField(locator, this, "transactionStatusCode", buffer, theTransactionStatusCode);
        }
        {
            Boolean theRetransmissionIndicator;
            theRetransmissionIndicator = this.isRetransmissionIndicator();
            strategy.appendField(locator, this, "retransmissionIndicator", buffer, theRetransmissionIndicator);
        }
        {
            String thePrimaryLangID;
            thePrimaryLangID = this.getPrimaryLangID();
            strategy.appendField(locator, this, "primaryLangID", buffer, thePrimaryLangID);
        }
        {
            String theAltLangID;
            theAltLangID = this.getAltLangID();
            strategy.appendField(locator, this, "altLangID", buffer, theAltLangID);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MessageAcknowledgementType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MessageAcknowledgementType that = ((MessageAcknowledgementType) object);
        {
            SuccessType lhsSuccess;
            lhsSuccess = this.getSuccess();
            SuccessType rhsSuccess;
            rhsSuccess = that.getSuccess();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "success", lhsSuccess), LocatorUtils.property(thatLocator, "success", rhsSuccess), lhsSuccess, rhsSuccess)) {
                return false;
            }
        }
        {
            WarningsType lhsWarnings;
            lhsWarnings = this.getWarnings();
            WarningsType rhsWarnings;
            rhsWarnings = that.getWarnings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnings", lhsWarnings), LocatorUtils.property(thatLocator, "warnings", rhsWarnings), lhsWarnings, rhsWarnings)) {
                return false;
            }
        }
        {
            ErrorsType lhsErrors;
            lhsErrors = this.getErrors();
            ErrorsType rhsErrors;
            rhsErrors = that.getErrors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errors", lhsErrors), LocatorUtils.property(thatLocator, "errors", rhsErrors), lhsErrors, rhsErrors)) {
                return false;
            }
        }
        {
            UniqueIDType lhsUniqueID;
            lhsUniqueID = this.getUniqueID();
            UniqueIDType rhsUniqueID;
            rhsUniqueID = that.getUniqueID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueID", lhsUniqueID), LocatorUtils.property(thatLocator, "uniqueID", rhsUniqueID), lhsUniqueID, rhsUniqueID)) {
                return false;
            }
        }
        {
            TPAExtensionsType lhsTPAExtensions;
            lhsTPAExtensions = this.getTPAExtensions();
            TPAExtensionsType rhsTPAExtensions;
            rhsTPAExtensions = that.getTPAExtensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tpaExtensions", lhsTPAExtensions), LocatorUtils.property(thatLocator, "tpaExtensions", rhsTPAExtensions), lhsTPAExtensions, rhsTPAExtensions)) {
                return false;
            }
        }
        {
            String lhsEchoToken;
            lhsEchoToken = this.getEchoToken();
            String rhsEchoToken;
            rhsEchoToken = that.getEchoToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "echoToken", lhsEchoToken), LocatorUtils.property(thatLocator, "echoToken", rhsEchoToken), lhsEchoToken, rhsEchoToken)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTimeStamp;
            lhsTimeStamp = this.getTimeStamp();
            XMLGregorianCalendar rhsTimeStamp;
            rhsTimeStamp = that.getTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStamp", lhsTimeStamp), LocatorUtils.property(thatLocator, "timeStamp", rhsTimeStamp), lhsTimeStamp, rhsTimeStamp)) {
                return false;
            }
        }
        {
            String lhsTarget;
            lhsTarget = this.getTarget();
            String rhsTarget;
            rhsTarget = that.getTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "target", lhsTarget), LocatorUtils.property(thatLocator, "target", rhsTarget), lhsTarget, rhsTarget)) {
                return false;
            }
        }
        {
            BigDecimal lhsVersion;
            lhsVersion = this.getVersion();
            BigDecimal rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            String lhsTransactionIdentifier;
            lhsTransactionIdentifier = this.getTransactionIdentifier();
            String rhsTransactionIdentifier;
            rhsTransactionIdentifier = that.getTransactionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionIdentifier", lhsTransactionIdentifier), LocatorUtils.property(thatLocator, "transactionIdentifier", rhsTransactionIdentifier), lhsTransactionIdentifier, rhsTransactionIdentifier)) {
                return false;
            }
        }
        {
            BigInteger lhsSequenceNmbr;
            lhsSequenceNmbr = this.getSequenceNmbr();
            BigInteger rhsSequenceNmbr;
            rhsSequenceNmbr = that.getSequenceNmbr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNmbr", lhsSequenceNmbr), LocatorUtils.property(thatLocator, "sequenceNmbr", rhsSequenceNmbr), lhsSequenceNmbr, rhsSequenceNmbr)) {
                return false;
            }
        }
        {
            String lhsTransactionStatusCode;
            lhsTransactionStatusCode = this.getTransactionStatusCode();
            String rhsTransactionStatusCode;
            rhsTransactionStatusCode = that.getTransactionStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionStatusCode", lhsTransactionStatusCode), LocatorUtils.property(thatLocator, "transactionStatusCode", rhsTransactionStatusCode), lhsTransactionStatusCode, rhsTransactionStatusCode)) {
                return false;
            }
        }
        {
            Boolean lhsRetransmissionIndicator;
            lhsRetransmissionIndicator = this.isRetransmissionIndicator();
            Boolean rhsRetransmissionIndicator;
            rhsRetransmissionIndicator = that.isRetransmissionIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retransmissionIndicator", lhsRetransmissionIndicator), LocatorUtils.property(thatLocator, "retransmissionIndicator", rhsRetransmissionIndicator), lhsRetransmissionIndicator, rhsRetransmissionIndicator)) {
                return false;
            }
        }
        {
            String lhsPrimaryLangID;
            lhsPrimaryLangID = this.getPrimaryLangID();
            String rhsPrimaryLangID;
            rhsPrimaryLangID = that.getPrimaryLangID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryLangID", lhsPrimaryLangID), LocatorUtils.property(thatLocator, "primaryLangID", rhsPrimaryLangID), lhsPrimaryLangID, rhsPrimaryLangID)) {
                return false;
            }
        }
        {
            String lhsAltLangID;
            lhsAltLangID = this.getAltLangID();
            String rhsAltLangID;
            rhsAltLangID = that.getAltLangID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altLangID", lhsAltLangID), LocatorUtils.property(thatLocator, "altLangID", rhsAltLangID), lhsAltLangID, rhsAltLangID)) {
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
            SuccessType theSuccess;
            theSuccess = this.getSuccess();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess);
        }
        {
            WarningsType theWarnings;
            theWarnings = this.getWarnings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnings", theWarnings), currentHashCode, theWarnings);
        }
        {
            ErrorsType theErrors;
            theErrors = this.getErrors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            UniqueIDType theUniqueID;
            theUniqueID = this.getUniqueID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uniqueID", theUniqueID), currentHashCode, theUniqueID);
        }
        {
            TPAExtensionsType theTPAExtensions;
            theTPAExtensions = this.getTPAExtensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tpaExtensions", theTPAExtensions), currentHashCode, theTPAExtensions);
        }
        {
            String theEchoToken;
            theEchoToken = this.getEchoToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "echoToken", theEchoToken), currentHashCode, theEchoToken);
        }
        {
            XMLGregorianCalendar theTimeStamp;
            theTimeStamp = this.getTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStamp", theTimeStamp), currentHashCode, theTimeStamp);
        }
        {
            String theTarget;
            theTarget = this.getTarget();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "target", theTarget), currentHashCode, theTarget);
        }
        {
            BigDecimal theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            String theTransactionIdentifier;
            theTransactionIdentifier = this.getTransactionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionIdentifier", theTransactionIdentifier), currentHashCode, theTransactionIdentifier);
        }
        {
            BigInteger theSequenceNmbr;
            theSequenceNmbr = this.getSequenceNmbr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNmbr", theSequenceNmbr), currentHashCode, theSequenceNmbr);
        }
        {
            String theTransactionStatusCode;
            theTransactionStatusCode = this.getTransactionStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionStatusCode", theTransactionStatusCode), currentHashCode, theTransactionStatusCode);
        }
        {
            Boolean theRetransmissionIndicator;
            theRetransmissionIndicator = this.isRetransmissionIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retransmissionIndicator", theRetransmissionIndicator), currentHashCode, theRetransmissionIndicator);
        }
        {
            String thePrimaryLangID;
            thePrimaryLangID = this.getPrimaryLangID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryLangID", thePrimaryLangID), currentHashCode, thePrimaryLangID);
        }
        {
            String theAltLangID;
            theAltLangID = this.getAltLangID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altLangID", theAltLangID), currentHashCode, theAltLangID);
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
        if (draftCopy instanceof MessageAcknowledgementType) {
            final MessageAcknowledgementType copy = ((MessageAcknowledgementType) draftCopy);
            if (this.success!= null) {
                SuccessType sourceSuccess;
                sourceSuccess = this.getSuccess();
                SuccessType copySuccess = ((SuccessType) strategy.copy(LocatorUtils.property(locator, "success", sourceSuccess), sourceSuccess));
                copy.setSuccess(copySuccess);
            } else {
                copy.success = null;
            }
            if (this.warnings!= null) {
                WarningsType sourceWarnings;
                sourceWarnings = this.getWarnings();
                WarningsType copyWarnings = ((WarningsType) strategy.copy(LocatorUtils.property(locator, "warnings", sourceWarnings), sourceWarnings));
                copy.setWarnings(copyWarnings);
            } else {
                copy.warnings = null;
            }
            if (this.errors!= null) {
                ErrorsType sourceErrors;
                sourceErrors = this.getErrors();
                ErrorsType copyErrors = ((ErrorsType) strategy.copy(LocatorUtils.property(locator, "errors", sourceErrors), sourceErrors));
                copy.setErrors(copyErrors);
            } else {
                copy.errors = null;
            }
            if (this.uniqueID!= null) {
                UniqueIDType sourceUniqueID;
                sourceUniqueID = this.getUniqueID();
                UniqueIDType copyUniqueID = ((UniqueIDType) strategy.copy(LocatorUtils.property(locator, "uniqueID", sourceUniqueID), sourceUniqueID));
                copy.setUniqueID(copyUniqueID);
            } else {
                copy.uniqueID = null;
            }
            if (this.tpaExtensions!= null) {
                TPAExtensionsType sourceTPAExtensions;
                sourceTPAExtensions = this.getTPAExtensions();
                TPAExtensionsType copyTPAExtensions = ((TPAExtensionsType) strategy.copy(LocatorUtils.property(locator, "tpaExtensions", sourceTPAExtensions), sourceTPAExtensions));
                copy.setTPAExtensions(copyTPAExtensions);
            } else {
                copy.tpaExtensions = null;
            }
            if (this.echoToken!= null) {
                String sourceEchoToken;
                sourceEchoToken = this.getEchoToken();
                String copyEchoToken = ((String) strategy.copy(LocatorUtils.property(locator, "echoToken", sourceEchoToken), sourceEchoToken));
                copy.setEchoToken(copyEchoToken);
            } else {
                copy.echoToken = null;
            }
            if (this.timeStamp!= null) {
                XMLGregorianCalendar sourceTimeStamp;
                sourceTimeStamp = this.getTimeStamp();
                XMLGregorianCalendar copyTimeStamp = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "timeStamp", sourceTimeStamp), sourceTimeStamp));
                copy.setTimeStamp(copyTimeStamp);
            } else {
                copy.timeStamp = null;
            }
            if (this.target!= null) {
                String sourceTarget;
                sourceTarget = this.getTarget();
                String copyTarget = ((String) strategy.copy(LocatorUtils.property(locator, "target", sourceTarget), sourceTarget));
                copy.setTarget(copyTarget);
            } else {
                copy.target = null;
            }
            if (this.version!= null) {
                BigDecimal sourceVersion;
                sourceVersion = this.getVersion();
                BigDecimal copyVersion = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.transactionIdentifier!= null) {
                String sourceTransactionIdentifier;
                sourceTransactionIdentifier = this.getTransactionIdentifier();
                String copyTransactionIdentifier = ((String) strategy.copy(LocatorUtils.property(locator, "transactionIdentifier", sourceTransactionIdentifier), sourceTransactionIdentifier));
                copy.setTransactionIdentifier(copyTransactionIdentifier);
            } else {
                copy.transactionIdentifier = null;
            }
            if (this.sequenceNmbr!= null) {
                BigInteger sourceSequenceNmbr;
                sourceSequenceNmbr = this.getSequenceNmbr();
                BigInteger copySequenceNmbr = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "sequenceNmbr", sourceSequenceNmbr), sourceSequenceNmbr));
                copy.setSequenceNmbr(copySequenceNmbr);
            } else {
                copy.sequenceNmbr = null;
            }
            if (this.transactionStatusCode!= null) {
                String sourceTransactionStatusCode;
                sourceTransactionStatusCode = this.getTransactionStatusCode();
                String copyTransactionStatusCode = ((String) strategy.copy(LocatorUtils.property(locator, "transactionStatusCode", sourceTransactionStatusCode), sourceTransactionStatusCode));
                copy.setTransactionStatusCode(copyTransactionStatusCode);
            } else {
                copy.transactionStatusCode = null;
            }
            if (this.retransmissionIndicator!= null) {
                Boolean sourceRetransmissionIndicator;
                sourceRetransmissionIndicator = this.isRetransmissionIndicator();
                Boolean copyRetransmissionIndicator = ((Boolean) strategy.copy(LocatorUtils.property(locator, "retransmissionIndicator", sourceRetransmissionIndicator), sourceRetransmissionIndicator));
                copy.setRetransmissionIndicator(copyRetransmissionIndicator);
            } else {
                copy.retransmissionIndicator = null;
            }
            if (this.primaryLangID!= null) {
                String sourcePrimaryLangID;
                sourcePrimaryLangID = this.getPrimaryLangID();
                String copyPrimaryLangID = ((String) strategy.copy(LocatorUtils.property(locator, "primaryLangID", sourcePrimaryLangID), sourcePrimaryLangID));
                copy.setPrimaryLangID(copyPrimaryLangID);
            } else {
                copy.primaryLangID = null;
            }
            if (this.altLangID!= null) {
                String sourceAltLangID;
                sourceAltLangID = this.getAltLangID();
                String copyAltLangID = ((String) strategy.copy(LocatorUtils.property(locator, "altLangID", sourceAltLangID), sourceAltLangID));
                copy.setAltLangID(copyAltLangID);
            } else {
                copy.altLangID = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MessageAcknowledgementType();
    }

}