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
 * A collection of comments.
 * 
 * <p>Java class for CommentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
 *                 &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                 &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "CommentType", propOrder = {
    "comment"
})
public class CommentType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Comment", required = true)
    protected List<CommentType.Comment> comment;

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType.Comment }
     * 
     * 
     */
    public List<CommentType.Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType.Comment>();
        }
        return this.comment;
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
            List<CommentType.Comment> theComment;
            theComment = (((this.comment!= null)&&(!this.comment.isEmpty()))?this.getComment():null);
            strategy.appendField(locator, this, "comment", buffer, theComment);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CommentType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CommentType that = ((CommentType) object);
        {
            List<CommentType.Comment> lhsComment;
            lhsComment = (((this.comment!= null)&&(!this.comment.isEmpty()))?this.getComment():null);
            List<CommentType.Comment> rhsComment;
            rhsComment = (((that.comment!= null)&&(!that.comment.isEmpty()))?that.getComment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment)) {
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
            List<CommentType.Comment> theComment;
            theComment = (((this.comment!= null)&&(!this.comment.isEmpty()))?this.getComment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment);
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
        if (draftCopy instanceof CommentType) {
            final CommentType copy = ((CommentType) draftCopy);
            if ((this.comment!= null)&&(!this.comment.isEmpty())) {
                List<CommentType.Comment> sourceComment;
                sourceComment = (((this.comment!= null)&&(!this.comment.isEmpty()))?this.getComment():null);
                @SuppressWarnings("unchecked")
                List<CommentType.Comment> copyComment = ((List<CommentType.Comment> ) strategy.copy(LocatorUtils.property(locator, "comment", sourceComment), sourceComment));
                copy.comment = null;
                if (copyComment!= null) {
                    List<CommentType.Comment> uniqueCommentl = copy.getComment();
                    uniqueCommentl.addAll(copyComment);
                }
            } else {
                copy.comment = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CommentType();
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType"&gt;
     *       &lt;attribute name="CommentOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *       &lt;attribute name="GuestViewable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Comment
        extends ParagraphType
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "CommentOriginatorCode")
        protected String commentOriginatorCode;
        @XmlAttribute(name = "GuestViewable")
        protected Boolean guestViewable;

        /**
         * Gets the value of the commentOriginatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentOriginatorCode() {
            return commentOriginatorCode;
        }

        /**
         * Sets the value of the commentOriginatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentOriginatorCode(String value) {
            this.commentOriginatorCode = value;
        }

        /**
         * Gets the value of the guestViewable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuestViewable() {
            return guestViewable;
        }

        /**
         * Sets the value of the guestViewable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuestViewable(Boolean value) {
            this.guestViewable = value;
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
                String theCommentOriginatorCode;
                theCommentOriginatorCode = this.getCommentOriginatorCode();
                strategy.appendField(locator, this, "commentOriginatorCode", buffer, theCommentOriginatorCode);
            }
            {
                Boolean theGuestViewable;
                theGuestViewable = this.isGuestViewable();
                strategy.appendField(locator, this, "guestViewable", buffer, theGuestViewable);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof CommentType.Comment)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final CommentType.Comment that = ((CommentType.Comment) object);
            {
                String lhsCommentOriginatorCode;
                lhsCommentOriginatorCode = this.getCommentOriginatorCode();
                String rhsCommentOriginatorCode;
                rhsCommentOriginatorCode = that.getCommentOriginatorCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "commentOriginatorCode", lhsCommentOriginatorCode), LocatorUtils.property(thatLocator, "commentOriginatorCode", rhsCommentOriginatorCode), lhsCommentOriginatorCode, rhsCommentOriginatorCode)) {
                    return false;
                }
            }
            {
                Boolean lhsGuestViewable;
                lhsGuestViewable = this.isGuestViewable();
                Boolean rhsGuestViewable;
                rhsGuestViewable = that.isGuestViewable();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "guestViewable", lhsGuestViewable), LocatorUtils.property(thatLocator, "guestViewable", rhsGuestViewable), lhsGuestViewable, rhsGuestViewable)) {
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
                String theCommentOriginatorCode;
                theCommentOriginatorCode = this.getCommentOriginatorCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commentOriginatorCode", theCommentOriginatorCode), currentHashCode, theCommentOriginatorCode);
            }
            {
                Boolean theGuestViewable;
                theGuestViewable = this.isGuestViewable();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "guestViewable", theGuestViewable), currentHashCode, theGuestViewable);
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
            if (draftCopy instanceof CommentType.Comment) {
                final CommentType.Comment copy = ((CommentType.Comment) draftCopy);
                if (this.commentOriginatorCode!= null) {
                    String sourceCommentOriginatorCode;
                    sourceCommentOriginatorCode = this.getCommentOriginatorCode();
                    String copyCommentOriginatorCode = ((String) strategy.copy(LocatorUtils.property(locator, "commentOriginatorCode", sourceCommentOriginatorCode), sourceCommentOriginatorCode));
                    copy.setCommentOriginatorCode(copyCommentOriginatorCode);
                } else {
                    copy.commentOriginatorCode = null;
                }
                if (this.guestViewable!= null) {
                    Boolean sourceGuestViewable;
                    sourceGuestViewable = this.isGuestViewable();
                    Boolean copyGuestViewable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "guestViewable", sourceGuestViewable), sourceGuestViewable));
                    copy.setGuestViewable(copyGuestViewable);
                } else {
                    copy.guestViewable = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new CommentType.Comment();
        }

    }

}
