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
 * Collection of operation schedules.
 * 
 * <p>Java class for OperationSchedulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationSchedulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationSchedule" type="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType" maxOccurs="999"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationSchedulesType", propOrder = {
    "operationSchedule"
})
public class OperationSchedulesType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "OperationSchedule", required = true)
    protected List<OperationScheduleType> operationSchedule;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Gets the value of the operationSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationScheduleType }
     * 
     * 
     */
    public List<OperationScheduleType> getOperationSchedule() {
        if (operationSchedule == null) {
            operationSchedule = new ArrayList<OperationScheduleType>();
        }
        return this.operationSchedule;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
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
            List<OperationScheduleType> theOperationSchedule;
            theOperationSchedule = (((this.operationSchedule!= null)&&(!this.operationSchedule.isEmpty()))?this.getOperationSchedule():null);
            strategy.appendField(locator, this, "operationSchedule", buffer, theOperationSchedule);
        }
        {
            String theStart;
            theStart = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theStart);
        }
        {
            String theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            String theEnd;
            theEnd = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theEnd);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OperationSchedulesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperationSchedulesType that = ((OperationSchedulesType) object);
        {
            List<OperationScheduleType> lhsOperationSchedule;
            lhsOperationSchedule = (((this.operationSchedule!= null)&&(!this.operationSchedule.isEmpty()))?this.getOperationSchedule():null);
            List<OperationScheduleType> rhsOperationSchedule;
            rhsOperationSchedule = (((that.operationSchedule!= null)&&(!that.operationSchedule.isEmpty()))?that.getOperationSchedule():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationSchedule", lhsOperationSchedule), LocatorUtils.property(thatLocator, "operationSchedule", rhsOperationSchedule), lhsOperationSchedule, rhsOperationSchedule)) {
                return false;
            }
        }
        {
            String lhsStart;
            lhsStart = this.getStart();
            String rhsStart;
            rhsStart = that.getStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "start", lhsStart), LocatorUtils.property(thatLocator, "start", rhsStart), lhsStart, rhsStart)) {
                return false;
            }
        }
        {
            String lhsDuration;
            lhsDuration = this.getDuration();
            String rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration)) {
                return false;
            }
        }
        {
            String lhsEnd;
            lhsEnd = this.getEnd();
            String rhsEnd;
            rhsEnd = that.getEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "end", lhsEnd), LocatorUtils.property(thatLocator, "end", rhsEnd), lhsEnd, rhsEnd)) {
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
            List<OperationScheduleType> theOperationSchedule;
            theOperationSchedule = (((this.operationSchedule!= null)&&(!this.operationSchedule.isEmpty()))?this.getOperationSchedule():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationSchedule", theOperationSchedule), currentHashCode, theOperationSchedule);
        }
        {
            String theStart;
            theStart = this.getStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "start", theStart), currentHashCode, theStart);
        }
        {
            String theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration);
        }
        {
            String theEnd;
            theEnd = this.getEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "end", theEnd), currentHashCode, theEnd);
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
        if (draftCopy instanceof OperationSchedulesType) {
            final OperationSchedulesType copy = ((OperationSchedulesType) draftCopy);
            if ((this.operationSchedule!= null)&&(!this.operationSchedule.isEmpty())) {
                List<OperationScheduleType> sourceOperationSchedule;
                sourceOperationSchedule = (((this.operationSchedule!= null)&&(!this.operationSchedule.isEmpty()))?this.getOperationSchedule():null);
                @SuppressWarnings("unchecked")
                List<OperationScheduleType> copyOperationSchedule = ((List<OperationScheduleType> ) strategy.copy(LocatorUtils.property(locator, "operationSchedule", sourceOperationSchedule), sourceOperationSchedule));
                copy.operationSchedule = null;
                if (copyOperationSchedule!= null) {
                    List<OperationScheduleType> uniqueOperationSchedulel = copy.getOperationSchedule();
                    uniqueOperationSchedulel.addAll(copyOperationSchedule);
                }
            } else {
                copy.operationSchedule = null;
            }
            if (this.start!= null) {
                String sourceStart;
                sourceStart = this.getStart();
                String copyStart = ((String) strategy.copy(LocatorUtils.property(locator, "start", sourceStart), sourceStart));
                copy.setStart(copyStart);
            } else {
                copy.start = null;
            }
            if (this.duration!= null) {
                String sourceDuration;
                sourceDuration = this.getDuration();
                String copyDuration = ((String) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration));
                copy.setDuration(copyDuration);
            } else {
                copy.duration = null;
            }
            if (this.end!= null) {
                String sourceEnd;
                sourceEnd = this.getEnd();
                String copyEnd = ((String) strategy.copy(LocatorUtils.property(locator, "end", sourceEnd), sourceEnd));
                copy.setEnd(copyEnd);
            } else {
                copy.end = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OperationSchedulesType();
    }

}
