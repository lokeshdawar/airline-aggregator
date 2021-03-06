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
 * Used to provide subsection formatted text information.
 * 
 * <p>Java class for FormattedTextSubSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormattedTextSubSectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paragraph" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubTitle" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *       &lt;attribute name="SubCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *       &lt;attribute name="SubSectionNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextSubSectionType", propOrder = {
    "paragraph"
})
public class FormattedTextSubSectionType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Paragraph", required = true)
    protected List<ParagraphType> paragraph;
    @XmlAttribute(name = "SubTitle")
    protected String subTitle;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "SubSectionNumber")
    protected Integer subSectionNumber;

    /**
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ParagraphType>();
        }
        return this.paragraph;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the subSectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubSectionNumber() {
        return subSectionNumber;
    }

    /**
     * Sets the value of the subSectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubSectionNumber(Integer value) {
        this.subSectionNumber = value;
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
            List<ParagraphType> theParagraph;
            theParagraph = (((this.paragraph!= null)&&(!this.paragraph.isEmpty()))?this.getParagraph():null);
            strategy.appendField(locator, this, "paragraph", buffer, theParagraph);
        }
        {
            String theSubTitle;
            theSubTitle = this.getSubTitle();
            strategy.appendField(locator, this, "subTitle", buffer, theSubTitle);
        }
        {
            String theSubCode;
            theSubCode = this.getSubCode();
            strategy.appendField(locator, this, "subCode", buffer, theSubCode);
        }
        {
            Integer theSubSectionNumber;
            theSubSectionNumber = this.getSubSectionNumber();
            strategy.appendField(locator, this, "subSectionNumber", buffer, theSubSectionNumber);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FormattedTextSubSectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FormattedTextSubSectionType that = ((FormattedTextSubSectionType) object);
        {
            List<ParagraphType> lhsParagraph;
            lhsParagraph = (((this.paragraph!= null)&&(!this.paragraph.isEmpty()))?this.getParagraph():null);
            List<ParagraphType> rhsParagraph;
            rhsParagraph = (((that.paragraph!= null)&&(!that.paragraph.isEmpty()))?that.getParagraph():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paragraph", lhsParagraph), LocatorUtils.property(thatLocator, "paragraph", rhsParagraph), lhsParagraph, rhsParagraph)) {
                return false;
            }
        }
        {
            String lhsSubTitle;
            lhsSubTitle = this.getSubTitle();
            String rhsSubTitle;
            rhsSubTitle = that.getSubTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subTitle", lhsSubTitle), LocatorUtils.property(thatLocator, "subTitle", rhsSubTitle), lhsSubTitle, rhsSubTitle)) {
                return false;
            }
        }
        {
            String lhsSubCode;
            lhsSubCode = this.getSubCode();
            String rhsSubCode;
            rhsSubCode = that.getSubCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subCode", lhsSubCode), LocatorUtils.property(thatLocator, "subCode", rhsSubCode), lhsSubCode, rhsSubCode)) {
                return false;
            }
        }
        {
            Integer lhsSubSectionNumber;
            lhsSubSectionNumber = this.getSubSectionNumber();
            Integer rhsSubSectionNumber;
            rhsSubSectionNumber = that.getSubSectionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subSectionNumber", lhsSubSectionNumber), LocatorUtils.property(thatLocator, "subSectionNumber", rhsSubSectionNumber), lhsSubSectionNumber, rhsSubSectionNumber)) {
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
            List<ParagraphType> theParagraph;
            theParagraph = (((this.paragraph!= null)&&(!this.paragraph.isEmpty()))?this.getParagraph():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paragraph", theParagraph), currentHashCode, theParagraph);
        }
        {
            String theSubTitle;
            theSubTitle = this.getSubTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subTitle", theSubTitle), currentHashCode, theSubTitle);
        }
        {
            String theSubCode;
            theSubCode = this.getSubCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subCode", theSubCode), currentHashCode, theSubCode);
        }
        {
            Integer theSubSectionNumber;
            theSubSectionNumber = this.getSubSectionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subSectionNumber", theSubSectionNumber), currentHashCode, theSubSectionNumber);
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
        if (draftCopy instanceof FormattedTextSubSectionType) {
            final FormattedTextSubSectionType copy = ((FormattedTextSubSectionType) draftCopy);
            if ((this.paragraph!= null)&&(!this.paragraph.isEmpty())) {
                List<ParagraphType> sourceParagraph;
                sourceParagraph = (((this.paragraph!= null)&&(!this.paragraph.isEmpty()))?this.getParagraph():null);
                @SuppressWarnings("unchecked")
                List<ParagraphType> copyParagraph = ((List<ParagraphType> ) strategy.copy(LocatorUtils.property(locator, "paragraph", sourceParagraph), sourceParagraph));
                copy.paragraph = null;
                if (copyParagraph!= null) {
                    List<ParagraphType> uniqueParagraphl = copy.getParagraph();
                    uniqueParagraphl.addAll(copyParagraph);
                }
            } else {
                copy.paragraph = null;
            }
            if (this.subTitle!= null) {
                String sourceSubTitle;
                sourceSubTitle = this.getSubTitle();
                String copySubTitle = ((String) strategy.copy(LocatorUtils.property(locator, "subTitle", sourceSubTitle), sourceSubTitle));
                copy.setSubTitle(copySubTitle);
            } else {
                copy.subTitle = null;
            }
            if (this.subCode!= null) {
                String sourceSubCode;
                sourceSubCode = this.getSubCode();
                String copySubCode = ((String) strategy.copy(LocatorUtils.property(locator, "subCode", sourceSubCode), sourceSubCode));
                copy.setSubCode(copySubCode);
            } else {
                copy.subCode = null;
            }
            if (this.subSectionNumber!= null) {
                Integer sourceSubSectionNumber;
                sourceSubSectionNumber = this.getSubSectionNumber();
                Integer copySubSectionNumber = ((Integer) strategy.copy(LocatorUtils.property(locator, "subSectionNumber", sourceSubSectionNumber), sourceSubSectionNumber));
                copy.setSubSectionNumber(copySubSectionNumber);
            } else {
                copy.subSectionNumber = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FormattedTextSubSectionType();
    }

}
