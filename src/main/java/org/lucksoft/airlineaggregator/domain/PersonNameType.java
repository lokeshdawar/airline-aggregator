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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * This provides name information for a person.
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="SurnamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *       &lt;attribute name="NameType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "namePrefix",
    "givenName",
    "middleName",
    "surnamePrefix",
    "surname",
    "nameSuffix",
    "nameTitle"
})
@XmlSeeAlso({
    org.lucksoft.airlineaggregator.domain.VerificationType.PersonName.class
})
public class PersonNameType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "NamePrefix")
    protected List<String> namePrefix;
    @XmlElement(name = "GivenName")
    protected List<String> givenName;
    @XmlElement(name = "MiddleName")
    protected List<String> middleName;
    @XmlElement(name = "SurnamePrefix")
    protected String surnamePrefix;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "NameSuffix")
    protected List<String> nameSuffix;
    @XmlElement(name = "NameTitle")
    protected List<String> nameTitle;
    @XmlAttribute(name = "NameType")
    protected String nameType;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the namePrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamePrefix() {
        if (namePrefix == null) {
            namePrefix = new ArrayList<String>();
        }
        return this.namePrefix;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the surnamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Sets the value of the surnamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<String>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameTitle() {
        if (nameTitle == null) {
            nameTitle = new ArrayList<String>();
        }
        return this.nameTitle;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
            List<String> theNamePrefix;
            theNamePrefix = (((this.namePrefix!= null)&&(!this.namePrefix.isEmpty()))?this.getNamePrefix():null);
            strategy.appendField(locator, this, "namePrefix", buffer, theNamePrefix);
        }
        {
            List<String> theGivenName;
            theGivenName = (((this.givenName!= null)&&(!this.givenName.isEmpty()))?this.getGivenName():null);
            strategy.appendField(locator, this, "givenName", buffer, theGivenName);
        }
        {
            List<String> theMiddleName;
            theMiddleName = (((this.middleName!= null)&&(!this.middleName.isEmpty()))?this.getMiddleName():null);
            strategy.appendField(locator, this, "middleName", buffer, theMiddleName);
        }
        {
            String theSurnamePrefix;
            theSurnamePrefix = this.getSurnamePrefix();
            strategy.appendField(locator, this, "surnamePrefix", buffer, theSurnamePrefix);
        }
        {
            String theSurname;
            theSurname = this.getSurname();
            strategy.appendField(locator, this, "surname", buffer, theSurname);
        }
        {
            List<String> theNameSuffix;
            theNameSuffix = (((this.nameSuffix!= null)&&(!this.nameSuffix.isEmpty()))?this.getNameSuffix():null);
            strategy.appendField(locator, this, "nameSuffix", buffer, theNameSuffix);
        }
        {
            List<String> theNameTitle;
            theNameTitle = (((this.nameTitle!= null)&&(!this.nameTitle.isEmpty()))?this.getNameTitle():null);
            strategy.appendField(locator, this, "nameTitle", buffer, theNameTitle);
        }
        {
            String theNameType;
            theNameType = this.getNameType();
            strategy.appendField(locator, this, "nameType", buffer, theNameType);
        }
        {
            String theShareSynchInd;
            theShareSynchInd = this.getShareSynchInd();
            strategy.appendField(locator, this, "shareSynchInd", buffer, theShareSynchInd);
        }
        {
            String theShareMarketInd;
            theShareMarketInd = this.getShareMarketInd();
            strategy.appendField(locator, this, "shareMarketInd", buffer, theShareMarketInd);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PersonNameType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PersonNameType that = ((PersonNameType) object);
        {
            List<String> lhsNamePrefix;
            lhsNamePrefix = (((this.namePrefix!= null)&&(!this.namePrefix.isEmpty()))?this.getNamePrefix():null);
            List<String> rhsNamePrefix;
            rhsNamePrefix = (((that.namePrefix!= null)&&(!that.namePrefix.isEmpty()))?that.getNamePrefix():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namePrefix", lhsNamePrefix), LocatorUtils.property(thatLocator, "namePrefix", rhsNamePrefix), lhsNamePrefix, rhsNamePrefix)) {
                return false;
            }
        }
        {
            List<String> lhsGivenName;
            lhsGivenName = (((this.givenName!= null)&&(!this.givenName.isEmpty()))?this.getGivenName():null);
            List<String> rhsGivenName;
            rhsGivenName = (((that.givenName!= null)&&(!that.givenName.isEmpty()))?that.getGivenName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "givenName", lhsGivenName), LocatorUtils.property(thatLocator, "givenName", rhsGivenName), lhsGivenName, rhsGivenName)) {
                return false;
            }
        }
        {
            List<String> lhsMiddleName;
            lhsMiddleName = (((this.middleName!= null)&&(!this.middleName.isEmpty()))?this.getMiddleName():null);
            List<String> rhsMiddleName;
            rhsMiddleName = (((that.middleName!= null)&&(!that.middleName.isEmpty()))?that.getMiddleName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "middleName", lhsMiddleName), LocatorUtils.property(thatLocator, "middleName", rhsMiddleName), lhsMiddleName, rhsMiddleName)) {
                return false;
            }
        }
        {
            String lhsSurnamePrefix;
            lhsSurnamePrefix = this.getSurnamePrefix();
            String rhsSurnamePrefix;
            rhsSurnamePrefix = that.getSurnamePrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surnamePrefix", lhsSurnamePrefix), LocatorUtils.property(thatLocator, "surnamePrefix", rhsSurnamePrefix), lhsSurnamePrefix, rhsSurnamePrefix)) {
                return false;
            }
        }
        {
            String lhsSurname;
            lhsSurname = this.getSurname();
            String rhsSurname;
            rhsSurname = that.getSurname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surname", lhsSurname), LocatorUtils.property(thatLocator, "surname", rhsSurname), lhsSurname, rhsSurname)) {
                return false;
            }
        }
        {
            List<String> lhsNameSuffix;
            lhsNameSuffix = (((this.nameSuffix!= null)&&(!this.nameSuffix.isEmpty()))?this.getNameSuffix():null);
            List<String> rhsNameSuffix;
            rhsNameSuffix = (((that.nameSuffix!= null)&&(!that.nameSuffix.isEmpty()))?that.getNameSuffix():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameSuffix", lhsNameSuffix), LocatorUtils.property(thatLocator, "nameSuffix", rhsNameSuffix), lhsNameSuffix, rhsNameSuffix)) {
                return false;
            }
        }
        {
            List<String> lhsNameTitle;
            lhsNameTitle = (((this.nameTitle!= null)&&(!this.nameTitle.isEmpty()))?this.getNameTitle():null);
            List<String> rhsNameTitle;
            rhsNameTitle = (((that.nameTitle!= null)&&(!that.nameTitle.isEmpty()))?that.getNameTitle():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameTitle", lhsNameTitle), LocatorUtils.property(thatLocator, "nameTitle", rhsNameTitle), lhsNameTitle, rhsNameTitle)) {
                return false;
            }
        }
        {
            String lhsNameType;
            lhsNameType = this.getNameType();
            String rhsNameType;
            rhsNameType = that.getNameType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameType", lhsNameType), LocatorUtils.property(thatLocator, "nameType", rhsNameType), lhsNameType, rhsNameType)) {
                return false;
            }
        }
        {
            String lhsShareSynchInd;
            lhsShareSynchInd = this.getShareSynchInd();
            String rhsShareSynchInd;
            rhsShareSynchInd = that.getShareSynchInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shareSynchInd", lhsShareSynchInd), LocatorUtils.property(thatLocator, "shareSynchInd", rhsShareSynchInd), lhsShareSynchInd, rhsShareSynchInd)) {
                return false;
            }
        }
        {
            String lhsShareMarketInd;
            lhsShareMarketInd = this.getShareMarketInd();
            String rhsShareMarketInd;
            rhsShareMarketInd = that.getShareMarketInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shareMarketInd", lhsShareMarketInd), LocatorUtils.property(thatLocator, "shareMarketInd", rhsShareMarketInd), lhsShareMarketInd, rhsShareMarketInd)) {
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
            List<String> theNamePrefix;
            theNamePrefix = (((this.namePrefix!= null)&&(!this.namePrefix.isEmpty()))?this.getNamePrefix():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namePrefix", theNamePrefix), currentHashCode, theNamePrefix);
        }
        {
            List<String> theGivenName;
            theGivenName = (((this.givenName!= null)&&(!this.givenName.isEmpty()))?this.getGivenName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "givenName", theGivenName), currentHashCode, theGivenName);
        }
        {
            List<String> theMiddleName;
            theMiddleName = (((this.middleName!= null)&&(!this.middleName.isEmpty()))?this.getMiddleName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "middleName", theMiddleName), currentHashCode, theMiddleName);
        }
        {
            String theSurnamePrefix;
            theSurnamePrefix = this.getSurnamePrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surnamePrefix", theSurnamePrefix), currentHashCode, theSurnamePrefix);
        }
        {
            String theSurname;
            theSurname = this.getSurname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surname", theSurname), currentHashCode, theSurname);
        }
        {
            List<String> theNameSuffix;
            theNameSuffix = (((this.nameSuffix!= null)&&(!this.nameSuffix.isEmpty()))?this.getNameSuffix():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameSuffix", theNameSuffix), currentHashCode, theNameSuffix);
        }
        {
            List<String> theNameTitle;
            theNameTitle = (((this.nameTitle!= null)&&(!this.nameTitle.isEmpty()))?this.getNameTitle():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameTitle", theNameTitle), currentHashCode, theNameTitle);
        }
        {
            String theNameType;
            theNameType = this.getNameType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameType", theNameType), currentHashCode, theNameType);
        }
        {
            String theShareSynchInd;
            theShareSynchInd = this.getShareSynchInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shareSynchInd", theShareSynchInd), currentHashCode, theShareSynchInd);
        }
        {
            String theShareMarketInd;
            theShareMarketInd = this.getShareMarketInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shareMarketInd", theShareMarketInd), currentHashCode, theShareMarketInd);
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
        if (draftCopy instanceof PersonNameType) {
            final PersonNameType copy = ((PersonNameType) draftCopy);
            if ((this.namePrefix!= null)&&(!this.namePrefix.isEmpty())) {
                List<String> sourceNamePrefix;
                sourceNamePrefix = (((this.namePrefix!= null)&&(!this.namePrefix.isEmpty()))?this.getNamePrefix():null);
                @SuppressWarnings("unchecked")
                List<String> copyNamePrefix = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "namePrefix", sourceNamePrefix), sourceNamePrefix));
                copy.namePrefix = null;
                if (copyNamePrefix!= null) {
                    List<String> uniqueNamePrefixl = copy.getNamePrefix();
                    uniqueNamePrefixl.addAll(copyNamePrefix);
                }
            } else {
                copy.namePrefix = null;
            }
            if ((this.givenName!= null)&&(!this.givenName.isEmpty())) {
                List<String> sourceGivenName;
                sourceGivenName = (((this.givenName!= null)&&(!this.givenName.isEmpty()))?this.getGivenName():null);
                @SuppressWarnings("unchecked")
                List<String> copyGivenName = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "givenName", sourceGivenName), sourceGivenName));
                copy.givenName = null;
                if (copyGivenName!= null) {
                    List<String> uniqueGivenNamel = copy.getGivenName();
                    uniqueGivenNamel.addAll(copyGivenName);
                }
            } else {
                copy.givenName = null;
            }
            if ((this.middleName!= null)&&(!this.middleName.isEmpty())) {
                List<String> sourceMiddleName;
                sourceMiddleName = (((this.middleName!= null)&&(!this.middleName.isEmpty()))?this.getMiddleName():null);
                @SuppressWarnings("unchecked")
                List<String> copyMiddleName = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "middleName", sourceMiddleName), sourceMiddleName));
                copy.middleName = null;
                if (copyMiddleName!= null) {
                    List<String> uniqueMiddleNamel = copy.getMiddleName();
                    uniqueMiddleNamel.addAll(copyMiddleName);
                }
            } else {
                copy.middleName = null;
            }
            if (this.surnamePrefix!= null) {
                String sourceSurnamePrefix;
                sourceSurnamePrefix = this.getSurnamePrefix();
                String copySurnamePrefix = ((String) strategy.copy(LocatorUtils.property(locator, "surnamePrefix", sourceSurnamePrefix), sourceSurnamePrefix));
                copy.setSurnamePrefix(copySurnamePrefix);
            } else {
                copy.surnamePrefix = null;
            }
            if (this.surname!= null) {
                String sourceSurname;
                sourceSurname = this.getSurname();
                String copySurname = ((String) strategy.copy(LocatorUtils.property(locator, "surname", sourceSurname), sourceSurname));
                copy.setSurname(copySurname);
            } else {
                copy.surname = null;
            }
            if ((this.nameSuffix!= null)&&(!this.nameSuffix.isEmpty())) {
                List<String> sourceNameSuffix;
                sourceNameSuffix = (((this.nameSuffix!= null)&&(!this.nameSuffix.isEmpty()))?this.getNameSuffix():null);
                @SuppressWarnings("unchecked")
                List<String> copyNameSuffix = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "nameSuffix", sourceNameSuffix), sourceNameSuffix));
                copy.nameSuffix = null;
                if (copyNameSuffix!= null) {
                    List<String> uniqueNameSuffixl = copy.getNameSuffix();
                    uniqueNameSuffixl.addAll(copyNameSuffix);
                }
            } else {
                copy.nameSuffix = null;
            }
            if ((this.nameTitle!= null)&&(!this.nameTitle.isEmpty())) {
                List<String> sourceNameTitle;
                sourceNameTitle = (((this.nameTitle!= null)&&(!this.nameTitle.isEmpty()))?this.getNameTitle():null);
                @SuppressWarnings("unchecked")
                List<String> copyNameTitle = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "nameTitle", sourceNameTitle), sourceNameTitle));
                copy.nameTitle = null;
                if (copyNameTitle!= null) {
                    List<String> uniqueNameTitlel = copy.getNameTitle();
                    uniqueNameTitlel.addAll(copyNameTitle);
                }
            } else {
                copy.nameTitle = null;
            }
            if (this.nameType!= null) {
                String sourceNameType;
                sourceNameType = this.getNameType();
                String copyNameType = ((String) strategy.copy(LocatorUtils.property(locator, "nameType", sourceNameType), sourceNameType));
                copy.setNameType(copyNameType);
            } else {
                copy.nameType = null;
            }
            if (this.shareSynchInd!= null) {
                String sourceShareSynchInd;
                sourceShareSynchInd = this.getShareSynchInd();
                String copyShareSynchInd = ((String) strategy.copy(LocatorUtils.property(locator, "shareSynchInd", sourceShareSynchInd), sourceShareSynchInd));
                copy.setShareSynchInd(copyShareSynchInd);
            } else {
                copy.shareSynchInd = null;
            }
            if (this.shareMarketInd!= null) {
                String sourceShareMarketInd;
                sourceShareMarketInd = this.getShareMarketInd();
                String copyShareMarketInd = ((String) strategy.copy(LocatorUtils.property(locator, "shareMarketInd", sourceShareMarketInd), sourceShareMarketInd));
                copy.setShareMarketInd(copyShareMarketInd);
            } else {
                copy.shareMarketInd = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PersonNameType();
    }

}
