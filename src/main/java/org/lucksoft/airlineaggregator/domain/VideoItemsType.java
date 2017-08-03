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
 * Collection of video items.
 * 
 * <p>Java class for VideoItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoItem" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/&gt;
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *                 &lt;attribute name="Caption" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" /&gt;
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "VideoItemsType", propOrder = {
    "videoItem"
})
public class VideoItemsType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "VideoItem", required = true)
    protected List<VideoItemsType.VideoItem> videoItem;

    /**
     * Gets the value of the videoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoItemsType.VideoItem }
     * 
     * 
     */
    public List<VideoItemsType.VideoItem> getVideoItem() {
        if (videoItem == null) {
            videoItem = new ArrayList<VideoItemsType.VideoItem>();
        }
        return this.videoItem;
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
            List<VideoItemsType.VideoItem> theVideoItem;
            theVideoItem = (((this.videoItem!= null)&&(!this.videoItem.isEmpty()))?this.getVideoItem():null);
            strategy.appendField(locator, this, "videoItem", buffer, theVideoItem);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VideoItemsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VideoItemsType that = ((VideoItemsType) object);
        {
            List<VideoItemsType.VideoItem> lhsVideoItem;
            lhsVideoItem = (((this.videoItem!= null)&&(!this.videoItem.isEmpty()))?this.getVideoItem():null);
            List<VideoItemsType.VideoItem> rhsVideoItem;
            rhsVideoItem = (((that.videoItem!= null)&&(!that.videoItem.isEmpty()))?that.getVideoItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoItem", lhsVideoItem), LocatorUtils.property(thatLocator, "videoItem", rhsVideoItem), lhsVideoItem, rhsVideoItem)) {
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
            List<VideoItemsType.VideoItem> theVideoItem;
            theVideoItem = (((this.videoItem!= null)&&(!this.videoItem.isEmpty()))?this.getVideoItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "videoItem", theVideoItem), currentHashCode, theVideoItem);
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
        if (draftCopy instanceof VideoItemsType) {
            final VideoItemsType copy = ((VideoItemsType) draftCopy);
            if ((this.videoItem!= null)&&(!this.videoItem.isEmpty())) {
                List<VideoItemsType.VideoItem> sourceVideoItem;
                sourceVideoItem = (((this.videoItem!= null)&&(!this.videoItem.isEmpty()))?this.getVideoItem():null);
                @SuppressWarnings("unchecked")
                List<VideoItemsType.VideoItem> copyVideoItem = ((List<VideoItemsType.VideoItem> ) strategy.copy(LocatorUtils.property(locator, "videoItem", sourceVideoItem), sourceVideoItem));
                copy.videoItem = null;
                if (copyVideoItem!= null) {
                    List<VideoItemsType.VideoItem> uniqueVideoIteml = copy.getVideoItem();
                    uniqueVideoIteml.addAll(copyVideoItem);
                }
            } else {
                copy.videoItem = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VideoItemsType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType"&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/&gt;
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
     *       &lt;attribute name="Caption" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" /&gt;
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoItem
        extends VideoDescriptionType
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Caption")
        protected String caption;
        @XmlAttribute(name = "Version")
        protected String version;
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
        @XmlAttribute(name = "Removal")
        protected Boolean removal;

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

        /**
         * Gets the value of the caption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaption() {
            return caption;
        }

        /**
         * Sets the value of the caption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaption(String value) {
            this.caption = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
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
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRemoval() {
            if (removal == null) {
                return false;
            } else {
                return removal;
            }
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
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
                String theLanguage;
                theLanguage = this.getLanguage();
                strategy.appendField(locator, this, "language", buffer, theLanguage);
            }
            {
                String theCaption;
                theCaption = this.getCaption();
                strategy.appendField(locator, this, "caption", buffer, theCaption);
            }
            {
                String theVersion;
                theVersion = this.getVersion();
                strategy.appendField(locator, this, "version", buffer, theVersion);
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
                boolean theRemoval;
                theRemoval = ((this.removal!= null)?this.isRemoval():false);
                strategy.appendField(locator, this, "removal", buffer, theRemoval);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VideoItemsType.VideoItem)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final VideoItemsType.VideoItem that = ((VideoItemsType.VideoItem) object);
            {
                String lhsLanguage;
                lhsLanguage = this.getLanguage();
                String rhsLanguage;
                rhsLanguage = that.getLanguage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage)) {
                    return false;
                }
            }
            {
                String lhsCaption;
                lhsCaption = this.getCaption();
                String rhsCaption;
                rhsCaption = that.getCaption();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "caption", lhsCaption), LocatorUtils.property(thatLocator, "caption", rhsCaption), lhsCaption, rhsCaption)) {
                    return false;
                }
            }
            {
                String lhsVersion;
                lhsVersion = this.getVersion();
                String rhsVersion;
                rhsVersion = that.getVersion();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
                boolean lhsRemoval;
                lhsRemoval = ((this.removal!= null)?this.isRemoval():false);
                boolean rhsRemoval;
                rhsRemoval = ((that.removal!= null)?that.isRemoval():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "removal", lhsRemoval), LocatorUtils.property(thatLocator, "removal", rhsRemoval), lhsRemoval, rhsRemoval)) {
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
                String theLanguage;
                theLanguage = this.getLanguage();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage);
            }
            {
                String theCaption;
                theCaption = this.getCaption();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caption", theCaption), currentHashCode, theCaption);
            }
            {
                String theVersion;
                theVersion = this.getVersion();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
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
                boolean theRemoval;
                theRemoval = ((this.removal!= null)?this.isRemoval():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "removal", theRemoval), currentHashCode, theRemoval);
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
            if (draftCopy instanceof VideoItemsType.VideoItem) {
                final VideoItemsType.VideoItem copy = ((VideoItemsType.VideoItem) draftCopy);
                if (this.language!= null) {
                    String sourceLanguage;
                    sourceLanguage = this.getLanguage();
                    String copyLanguage = ((String) strategy.copy(LocatorUtils.property(locator, "language", sourceLanguage), sourceLanguage));
                    copy.setLanguage(copyLanguage);
                } else {
                    copy.language = null;
                }
                if (this.caption!= null) {
                    String sourceCaption;
                    sourceCaption = this.getCaption();
                    String copyCaption = ((String) strategy.copy(LocatorUtils.property(locator, "caption", sourceCaption), sourceCaption));
                    copy.setCaption(copyCaption);
                } else {
                    copy.caption = null;
                }
                if (this.version!= null) {
                    String sourceVersion;
                    sourceVersion = this.getVersion();
                    String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                    copy.setVersion(copyVersion);
                } else {
                    copy.version = null;
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
                if (this.removal!= null) {
                    boolean sourceRemoval;
                    sourceRemoval = ((this.removal!= null)?this.isRemoval():false);
                    boolean copyRemoval = strategy.copy(LocatorUtils.property(locator, "removal", sourceRemoval), sourceRemoval);
                    copy.setRemoval(copyRemoval);
                } else {
                    copy.removal = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VideoItemsType.VideoItem();
        }

    }

}
