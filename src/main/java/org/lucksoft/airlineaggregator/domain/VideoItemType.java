//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Details for a video of a given category. 
 * 
 * <p>Java class for VideoItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MultimediaItemGroup"/&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="BitRate" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoItemType", propOrder = {
    "url"
})
@XmlSeeAlso({
    org.lucksoft.airlineaggregator.domain.VideoDescriptionType.VideoFormat.class
})
public class VideoItemType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "Width")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger width;
    @XmlAttribute(name = "Height")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger height;
    @XmlAttribute(name = "BitRate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bitRate;
    @XmlAttribute(name = "Length")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "FileSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fileSize;
    @XmlAttribute(name = "FileName")
    protected String fileName;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the bitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBitRate(BigInteger value) {
        this.bitRate = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
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

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
            String theURL;
            theURL = this.getURL();
            strategy.appendField(locator, this, "url", buffer, theURL);
        }
        {
            String theUnitOfMeasureCode;
            theUnitOfMeasureCode = this.getUnitOfMeasureCode();
            strategy.appendField(locator, this, "unitOfMeasureCode", buffer, theUnitOfMeasureCode);
        }
        {
            BigInteger theWidth;
            theWidth = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theWidth);
        }
        {
            BigInteger theHeight;
            theHeight = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theHeight);
        }
        {
            BigInteger theBitRate;
            theBitRate = this.getBitRate();
            strategy.appendField(locator, this, "bitRate", buffer, theBitRate);
        }
        {
            BigInteger theLength;
            theLength = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theLength);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            strategy.appendField(locator, this, "format", buffer, theFormat);
        }
        {
            BigInteger theFileSize;
            theFileSize = this.getFileSize();
            strategy.appendField(locator, this, "fileSize", buffer, theFileSize);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            strategy.appendField(locator, this, "fileName", buffer, theFileName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VideoItemType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VideoItemType that = ((VideoItemType) object);
        {
            String lhsURL;
            lhsURL = this.getURL();
            String rhsURL;
            rhsURL = that.getURL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsURL), LocatorUtils.property(thatLocator, "url", rhsURL), lhsURL, rhsURL)) {
                return false;
            }
        }
        {
            String lhsUnitOfMeasureCode;
            lhsUnitOfMeasureCode = this.getUnitOfMeasureCode();
            String rhsUnitOfMeasureCode;
            rhsUnitOfMeasureCode = that.getUnitOfMeasureCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasureCode", lhsUnitOfMeasureCode), LocatorUtils.property(thatLocator, "unitOfMeasureCode", rhsUnitOfMeasureCode), lhsUnitOfMeasureCode, rhsUnitOfMeasureCode)) {
                return false;
            }
        }
        {
            BigInteger lhsWidth;
            lhsWidth = this.getWidth();
            BigInteger rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth)) {
                return false;
            }
        }
        {
            BigInteger lhsHeight;
            lhsHeight = this.getHeight();
            BigInteger rhsHeight;
            rhsHeight = that.getHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight)) {
                return false;
            }
        }
        {
            BigInteger lhsBitRate;
            lhsBitRate = this.getBitRate();
            BigInteger rhsBitRate;
            rhsBitRate = that.getBitRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bitRate", lhsBitRate), LocatorUtils.property(thatLocator, "bitRate", rhsBitRate), lhsBitRate, rhsBitRate)) {
                return false;
            }
        }
        {
            BigInteger lhsLength;
            lhsLength = this.getLength();
            BigInteger rhsLength;
            rhsLength = that.getLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "length", lhsLength), LocatorUtils.property(thatLocator, "length", rhsLength), lhsLength, rhsLength)) {
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
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat)) {
                return false;
            }
        }
        {
            BigInteger lhsFileSize;
            lhsFileSize = this.getFileSize();
            BigInteger rhsFileSize;
            rhsFileSize = that.getFileSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileSize", lhsFileSize), LocatorUtils.property(thatLocator, "fileSize", rhsFileSize), lhsFileSize, rhsFileSize)) {
                return false;
            }
        }
        {
            String lhsFileName;
            lhsFileName = this.getFileName();
            String rhsFileName;
            rhsFileName = that.getFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileName", lhsFileName), LocatorUtils.property(thatLocator, "fileName", rhsFileName), lhsFileName, rhsFileName)) {
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
            String theURL;
            theURL = this.getURL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theURL), currentHashCode, theURL);
        }
        {
            String theUnitOfMeasureCode;
            theUnitOfMeasureCode = this.getUnitOfMeasureCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasureCode", theUnitOfMeasureCode), currentHashCode, theUnitOfMeasureCode);
        }
        {
            BigInteger theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth);
        }
        {
            BigInteger theHeight;
            theHeight = this.getHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight);
        }
        {
            BigInteger theBitRate;
            theBitRate = this.getBitRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bitRate", theBitRate), currentHashCode, theBitRate);
        }
        {
            BigInteger theLength;
            theLength = this.getLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "length", theLength), currentHashCode, theLength);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "format", theFormat), currentHashCode, theFormat);
        }
        {
            BigInteger theFileSize;
            theFileSize = this.getFileSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileSize", theFileSize), currentHashCode, theFileSize);
        }
        {
            String theFileName;
            theFileName = this.getFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileName", theFileName), currentHashCode, theFileName);
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
        if (draftCopy instanceof VideoItemType) {
            final VideoItemType copy = ((VideoItemType) draftCopy);
            if (this.url!= null) {
                String sourceURL;
                sourceURL = this.getURL();
                String copyURL = ((String) strategy.copy(LocatorUtils.property(locator, "url", sourceURL), sourceURL));
                copy.setURL(copyURL);
            } else {
                copy.url = null;
            }
            if (this.unitOfMeasureCode!= null) {
                String sourceUnitOfMeasureCode;
                sourceUnitOfMeasureCode = this.getUnitOfMeasureCode();
                String copyUnitOfMeasureCode = ((String) strategy.copy(LocatorUtils.property(locator, "unitOfMeasureCode", sourceUnitOfMeasureCode), sourceUnitOfMeasureCode));
                copy.setUnitOfMeasureCode(copyUnitOfMeasureCode);
            } else {
                copy.unitOfMeasureCode = null;
            }
            if (this.width!= null) {
                BigInteger sourceWidth;
                sourceWidth = this.getWidth();
                BigInteger copyWidth = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "width", sourceWidth), sourceWidth));
                copy.setWidth(copyWidth);
            } else {
                copy.width = null;
            }
            if (this.height!= null) {
                BigInteger sourceHeight;
                sourceHeight = this.getHeight();
                BigInteger copyHeight = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "height", sourceHeight), sourceHeight));
                copy.setHeight(copyHeight);
            } else {
                copy.height = null;
            }
            if (this.bitRate!= null) {
                BigInteger sourceBitRate;
                sourceBitRate = this.getBitRate();
                BigInteger copyBitRate = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bitRate", sourceBitRate), sourceBitRate));
                copy.setBitRate(copyBitRate);
            } else {
                copy.bitRate = null;
            }
            if (this.length!= null) {
                BigInteger sourceLength;
                sourceLength = this.getLength();
                BigInteger copyLength = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "length", sourceLength), sourceLength));
                copy.setLength(copyLength);
            } else {
                copy.length = null;
            }
            if (this.language!= null) {
                String sourceLanguage;
                sourceLanguage = this.getLanguage();
                String copyLanguage = ((String) strategy.copy(LocatorUtils.property(locator, "language", sourceLanguage), sourceLanguage));
                copy.setLanguage(copyLanguage);
            } else {
                copy.language = null;
            }
            if (this.format!= null) {
                String sourceFormat;
                sourceFormat = this.getFormat();
                String copyFormat = ((String) strategy.copy(LocatorUtils.property(locator, "format", sourceFormat), sourceFormat));
                copy.setFormat(copyFormat);
            } else {
                copy.format = null;
            }
            if (this.fileSize!= null) {
                BigInteger sourceFileSize;
                sourceFileSize = this.getFileSize();
                BigInteger copyFileSize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "fileSize", sourceFileSize), sourceFileSize));
                copy.setFileSize(copyFileSize);
            } else {
                copy.fileSize = null;
            }
            if (this.fileName!= null) {
                String sourceFileName;
                sourceFileName = this.getFileName();
                String copyFileName = ((String) strategy.copy(LocatorUtils.property(locator, "fileName", sourceFileName), sourceFileName));
                copy.setFileName(copyFileName);
            } else {
                copy.fileName = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VideoItemType();
    }

}
