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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * An indication of a new paragraph for a sub-section of a formatted text message.
 * 
 * <p>Java class for ParagraphType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParagraphType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="ListItem"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;FormattedTextTextType"&gt;
 *                 &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LanguageGroup"/&gt;
 *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *       &lt;attribute name="ParagraphNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
    "textOrImageOrURL"
})
@XmlSeeAlso({
    org.lucksoft.airlineaggregator.domain.CommentType.Comment.class,
    org.lucksoft.airlineaggregator.domain.SpecialRequestType.SpecialRequest.class
})
public class ParagraphType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "Image", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "URL", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Text", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ListItem", namespace = "http://www.opentravel.org/OTA/2003/05", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> textOrImageOrURL;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ParagraphNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger paragraphNumber;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the textOrImageOrURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrImageOrURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrImageOrURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FormattedTextTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParagraphType.ListItem }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTextOrImageOrURL() {
        if (textOrImageOrURL == null) {
            textOrImageOrURL = new ArrayList<JAXBElement<?>>();
        }
        return this.textOrImageOrURL;
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

    /**
     * Gets the value of the paragraphNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParagraphNumber() {
        return paragraphNumber;
    }

    /**
     * Sets the value of the paragraphNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParagraphNumber(BigInteger value) {
        this.paragraphNumber = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Gets the value of the lastModifyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Sets the value of the lastModifyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Gets the value of the lastModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Sets the value of the lastModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
            List<JAXBElement<?>> theTextOrImageOrURL;
            theTextOrImageOrURL = (((this.textOrImageOrURL!= null)&&(!this.textOrImageOrURL.isEmpty()))?this.getTextOrImageOrURL():null);
            strategy.appendField(locator, this, "textOrImageOrURL", buffer, theTextOrImageOrURL);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            BigInteger theParagraphNumber;
            theParagraphNumber = this.getParagraphNumber();
            strategy.appendField(locator, this, "paragraphNumber", buffer, theParagraphNumber);
        }
        {
            XMLGregorianCalendar theCreateDateTime;
            theCreateDateTime = this.getCreateDateTime();
            strategy.appendField(locator, this, "createDateTime", buffer, theCreateDateTime);
        }
        {
            String theCreatorID;
            theCreatorID = this.getCreatorID();
            strategy.appendField(locator, this, "creatorID", buffer, theCreatorID);
        }
        {
            XMLGregorianCalendar theLastModifyDateTime;
            theLastModifyDateTime = this.getLastModifyDateTime();
            strategy.appendField(locator, this, "lastModifyDateTime", buffer, theLastModifyDateTime);
        }
        {
            String theLastModifierID;
            theLastModifierID = this.getLastModifierID();
            strategy.appendField(locator, this, "lastModifierID", buffer, theLastModifierID);
        }
        {
            XMLGregorianCalendar thePurgeDate;
            thePurgeDate = this.getPurgeDate();
            strategy.appendField(locator, this, "purgeDate", buffer, thePurgeDate);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ParagraphType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ParagraphType that = ((ParagraphType) object);
        {
            List<JAXBElement<?>> lhsTextOrImageOrURL;
            lhsTextOrImageOrURL = (((this.textOrImageOrURL!= null)&&(!this.textOrImageOrURL.isEmpty()))?this.getTextOrImageOrURL():null);
            List<JAXBElement<?>> rhsTextOrImageOrURL;
            rhsTextOrImageOrURL = (((that.textOrImageOrURL!= null)&&(!that.textOrImageOrURL.isEmpty()))?that.getTextOrImageOrURL():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "textOrImageOrURL", lhsTextOrImageOrURL), LocatorUtils.property(thatLocator, "textOrImageOrURL", rhsTextOrImageOrURL), lhsTextOrImageOrURL, rhsTextOrImageOrURL)) {
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
        {
            BigInteger lhsParagraphNumber;
            lhsParagraphNumber = this.getParagraphNumber();
            BigInteger rhsParagraphNumber;
            rhsParagraphNumber = that.getParagraphNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paragraphNumber", lhsParagraphNumber), LocatorUtils.property(thatLocator, "paragraphNumber", rhsParagraphNumber), lhsParagraphNumber, rhsParagraphNumber)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCreateDateTime;
            lhsCreateDateTime = this.getCreateDateTime();
            XMLGregorianCalendar rhsCreateDateTime;
            rhsCreateDateTime = that.getCreateDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createDateTime", lhsCreateDateTime), LocatorUtils.property(thatLocator, "createDateTime", rhsCreateDateTime), lhsCreateDateTime, rhsCreateDateTime)) {
                return false;
            }
        }
        {
            String lhsCreatorID;
            lhsCreatorID = this.getCreatorID();
            String rhsCreatorID;
            rhsCreatorID = that.getCreatorID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creatorID", lhsCreatorID), LocatorUtils.property(thatLocator, "creatorID", rhsCreatorID), lhsCreatorID, rhsCreatorID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastModifyDateTime;
            lhsLastModifyDateTime = this.getLastModifyDateTime();
            XMLGregorianCalendar rhsLastModifyDateTime;
            rhsLastModifyDateTime = that.getLastModifyDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModifyDateTime", lhsLastModifyDateTime), LocatorUtils.property(thatLocator, "lastModifyDateTime", rhsLastModifyDateTime), lhsLastModifyDateTime, rhsLastModifyDateTime)) {
                return false;
            }
        }
        {
            String lhsLastModifierID;
            lhsLastModifierID = this.getLastModifierID();
            String rhsLastModifierID;
            rhsLastModifierID = that.getLastModifierID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModifierID", lhsLastModifierID), LocatorUtils.property(thatLocator, "lastModifierID", rhsLastModifierID), lhsLastModifierID, rhsLastModifierID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsPurgeDate;
            lhsPurgeDate = this.getPurgeDate();
            XMLGregorianCalendar rhsPurgeDate;
            rhsPurgeDate = that.getPurgeDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purgeDate", lhsPurgeDate), LocatorUtils.property(thatLocator, "purgeDate", rhsPurgeDate), lhsPurgeDate, rhsPurgeDate)) {
                return false;
            }
        }
        {
            String lhsLanguage;
            lhsLanguage = this.getLanguage();
            String rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage)) {
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
            List<JAXBElement<?>> theTextOrImageOrURL;
            theTextOrImageOrURL = (((this.textOrImageOrURL!= null)&&(!this.textOrImageOrURL.isEmpty()))?this.getTextOrImageOrURL():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "textOrImageOrURL", theTextOrImageOrURL), currentHashCode, theTextOrImageOrURL);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            BigInteger theParagraphNumber;
            theParagraphNumber = this.getParagraphNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paragraphNumber", theParagraphNumber), currentHashCode, theParagraphNumber);
        }
        {
            XMLGregorianCalendar theCreateDateTime;
            theCreateDateTime = this.getCreateDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createDateTime", theCreateDateTime), currentHashCode, theCreateDateTime);
        }
        {
            String theCreatorID;
            theCreatorID = this.getCreatorID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creatorID", theCreatorID), currentHashCode, theCreatorID);
        }
        {
            XMLGregorianCalendar theLastModifyDateTime;
            theLastModifyDateTime = this.getLastModifyDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastModifyDateTime", theLastModifyDateTime), currentHashCode, theLastModifyDateTime);
        }
        {
            String theLastModifierID;
            theLastModifierID = this.getLastModifierID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastModifierID", theLastModifierID), currentHashCode, theLastModifierID);
        }
        {
            XMLGregorianCalendar thePurgeDate;
            thePurgeDate = this.getPurgeDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purgeDate", thePurgeDate), currentHashCode, thePurgeDate);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage);
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
        if (draftCopy instanceof ParagraphType) {
            final ParagraphType copy = ((ParagraphType) draftCopy);
            if ((this.textOrImageOrURL!= null)&&(!this.textOrImageOrURL.isEmpty())) {
                List<JAXBElement<?>> sourceTextOrImageOrURL;
                sourceTextOrImageOrURL = (((this.textOrImageOrURL!= null)&&(!this.textOrImageOrURL.isEmpty()))?this.getTextOrImageOrURL():null);
                @SuppressWarnings("unchecked")
                List<JAXBElement<?>> copyTextOrImageOrURL = ((List<JAXBElement<?>> ) strategy.copy(LocatorUtils.property(locator, "textOrImageOrURL", sourceTextOrImageOrURL), sourceTextOrImageOrURL));
                copy.textOrImageOrURL = null;
                if (copyTextOrImageOrURL!= null) {
                    List<JAXBElement<?>> uniqueTextOrImageOrURLl = copy.getTextOrImageOrURL();
                    uniqueTextOrImageOrURLl.addAll(copyTextOrImageOrURL);
                }
            } else {
                copy.textOrImageOrURL = null;
            }
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.paragraphNumber!= null) {
                BigInteger sourceParagraphNumber;
                sourceParagraphNumber = this.getParagraphNumber();
                BigInteger copyParagraphNumber = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "paragraphNumber", sourceParagraphNumber), sourceParagraphNumber));
                copy.setParagraphNumber(copyParagraphNumber);
            } else {
                copy.paragraphNumber = null;
            }
            if (this.createDateTime!= null) {
                XMLGregorianCalendar sourceCreateDateTime;
                sourceCreateDateTime = this.getCreateDateTime();
                XMLGregorianCalendar copyCreateDateTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "createDateTime", sourceCreateDateTime), sourceCreateDateTime));
                copy.setCreateDateTime(copyCreateDateTime);
            } else {
                copy.createDateTime = null;
            }
            if (this.creatorID!= null) {
                String sourceCreatorID;
                sourceCreatorID = this.getCreatorID();
                String copyCreatorID = ((String) strategy.copy(LocatorUtils.property(locator, "creatorID", sourceCreatorID), sourceCreatorID));
                copy.setCreatorID(copyCreatorID);
            } else {
                copy.creatorID = null;
            }
            if (this.lastModifyDateTime!= null) {
                XMLGregorianCalendar sourceLastModifyDateTime;
                sourceLastModifyDateTime = this.getLastModifyDateTime();
                XMLGregorianCalendar copyLastModifyDateTime = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "lastModifyDateTime", sourceLastModifyDateTime), sourceLastModifyDateTime));
                copy.setLastModifyDateTime(copyLastModifyDateTime);
            } else {
                copy.lastModifyDateTime = null;
            }
            if (this.lastModifierID!= null) {
                String sourceLastModifierID;
                sourceLastModifierID = this.getLastModifierID();
                String copyLastModifierID = ((String) strategy.copy(LocatorUtils.property(locator, "lastModifierID", sourceLastModifierID), sourceLastModifierID));
                copy.setLastModifierID(copyLastModifierID);
            } else {
                copy.lastModifierID = null;
            }
            if (this.purgeDate!= null) {
                XMLGregorianCalendar sourcePurgeDate;
                sourcePurgeDate = this.getPurgeDate();
                XMLGregorianCalendar copyPurgeDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "purgeDate", sourcePurgeDate), sourcePurgeDate));
                copy.setPurgeDate(copyPurgeDate);
            } else {
                copy.purgeDate = null;
            }
            if (this.language!= null) {
                String sourceLanguage;
                sourceLanguage = this.getLanguage();
                String copyLanguage = ((String) strategy.copy(LocatorUtils.property(locator, "language", sourceLanguage), sourceLanguage));
                copy.setLanguage(copyLanguage);
            } else {
                copy.language = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ParagraphType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;FormattedTextTextType"&gt;
     *       &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ListItem
        extends FormattedTextTextType
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "ListItem")
        protected BigInteger listItem;

        /**
         * Gets the value of the listItem property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getListItem() {
            return listItem;
        }

        /**
         * Sets the value of the listItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setListItem(BigInteger value) {
            this.listItem = value;
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
                BigInteger theListItem;
                theListItem = this.getListItem();
                strategy.appendField(locator, this, "listItem", buffer, theListItem);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof ParagraphType.ListItem)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final ParagraphType.ListItem that = ((ParagraphType.ListItem) object);
            {
                BigInteger lhsListItem;
                lhsListItem = this.getListItem();
                BigInteger rhsListItem;
                rhsListItem = that.getListItem();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "listItem", lhsListItem), LocatorUtils.property(thatLocator, "listItem", rhsListItem), lhsListItem, rhsListItem)) {
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
                BigInteger theListItem;
                theListItem = this.getListItem();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listItem", theListItem), currentHashCode, theListItem);
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
            if (draftCopy instanceof ParagraphType.ListItem) {
                final ParagraphType.ListItem copy = ((ParagraphType.ListItem) draftCopy);
                if (this.listItem!= null) {
                    BigInteger sourceListItem;
                    sourceListItem = this.getListItem();
                    BigInteger copyListItem = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "listItem", sourceListItem), sourceListItem));
                    copy.setListItem(copyListItem);
                } else {
                    copy.listItem = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ParagraphType.ListItem();
        }

    }

}