//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import java.math.BigDecimal;
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
 * Construct for holding cabin class information, such as seat availability or meal codes. Can be up to three of these per flight segment or air leg - First, Business and Economy.
 * 
 * <p>Java class for CabinAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Meal" maxOccurs="5" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MealCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BaggageAllowance" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CabinType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinAvailabilityType", propOrder = {
    "meal",
    "baggageAllowance"
})
@XmlSeeAlso({
    MarketingCabinType.class
})
public class CabinAvailabilityType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Meal")
    protected List<CabinAvailabilityType.Meal> meal;
    @XmlElement(name = "BaggageAllowance")
    protected CabinAvailabilityType.BaggageAllowance baggageAllowance;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;

    /**
     * Gets the value of the meal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinAvailabilityType.Meal }
     * 
     * 
     */
    public List<CabinAvailabilityType.Meal> getMeal() {
        if (meal == null) {
            meal = new ArrayList<CabinAvailabilityType.Meal>();
        }
        return this.meal;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link CabinAvailabilityType.BaggageAllowance }
     *     
     */
    public CabinAvailabilityType.BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinAvailabilityType.BaggageAllowance }
     *     
     */
    public void setBaggageAllowance(CabinAvailabilityType.BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
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
            List<CabinAvailabilityType.Meal> theMeal;
            theMeal = (((this.meal!= null)&&(!this.meal.isEmpty()))?this.getMeal():null);
            strategy.appendField(locator, this, "meal", buffer, theMeal);
        }
        {
            CabinAvailabilityType.BaggageAllowance theBaggageAllowance;
            theBaggageAllowance = this.getBaggageAllowance();
            strategy.appendField(locator, this, "baggageAllowance", buffer, theBaggageAllowance);
        }
        {
            CabinType theCabinType;
            theCabinType = this.getCabinType();
            strategy.appendField(locator, this, "cabinType", buffer, theCabinType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CabinAvailabilityType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CabinAvailabilityType that = ((CabinAvailabilityType) object);
        {
            List<CabinAvailabilityType.Meal> lhsMeal;
            lhsMeal = (((this.meal!= null)&&(!this.meal.isEmpty()))?this.getMeal():null);
            List<CabinAvailabilityType.Meal> rhsMeal;
            rhsMeal = (((that.meal!= null)&&(!that.meal.isEmpty()))?that.getMeal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meal", lhsMeal), LocatorUtils.property(thatLocator, "meal", rhsMeal), lhsMeal, rhsMeal)) {
                return false;
            }
        }
        {
            CabinAvailabilityType.BaggageAllowance lhsBaggageAllowance;
            lhsBaggageAllowance = this.getBaggageAllowance();
            CabinAvailabilityType.BaggageAllowance rhsBaggageAllowance;
            rhsBaggageAllowance = that.getBaggageAllowance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baggageAllowance", lhsBaggageAllowance), LocatorUtils.property(thatLocator, "baggageAllowance", rhsBaggageAllowance), lhsBaggageAllowance, rhsBaggageAllowance)) {
                return false;
            }
        }
        {
            CabinType lhsCabinType;
            lhsCabinType = this.getCabinType();
            CabinType rhsCabinType;
            rhsCabinType = that.getCabinType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cabinType", lhsCabinType), LocatorUtils.property(thatLocator, "cabinType", rhsCabinType), lhsCabinType, rhsCabinType)) {
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
            List<CabinAvailabilityType.Meal> theMeal;
            theMeal = (((this.meal!= null)&&(!this.meal.isEmpty()))?this.getMeal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meal", theMeal), currentHashCode, theMeal);
        }
        {
            CabinAvailabilityType.BaggageAllowance theBaggageAllowance;
            theBaggageAllowance = this.getBaggageAllowance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baggageAllowance", theBaggageAllowance), currentHashCode, theBaggageAllowance);
        }
        {
            CabinType theCabinType;
            theCabinType = this.getCabinType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cabinType", theCabinType), currentHashCode, theCabinType);
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
        if (draftCopy instanceof CabinAvailabilityType) {
            final CabinAvailabilityType copy = ((CabinAvailabilityType) draftCopy);
            if ((this.meal!= null)&&(!this.meal.isEmpty())) {
                List<CabinAvailabilityType.Meal> sourceMeal;
                sourceMeal = (((this.meal!= null)&&(!this.meal.isEmpty()))?this.getMeal():null);
                @SuppressWarnings("unchecked")
                List<CabinAvailabilityType.Meal> copyMeal = ((List<CabinAvailabilityType.Meal> ) strategy.copy(LocatorUtils.property(locator, "meal", sourceMeal), sourceMeal));
                copy.meal = null;
                if (copyMeal!= null) {
                    List<CabinAvailabilityType.Meal> uniqueMeall = copy.getMeal();
                    uniqueMeall.addAll(copyMeal);
                }
            } else {
                copy.meal = null;
            }
            if (this.baggageAllowance!= null) {
                CabinAvailabilityType.BaggageAllowance sourceBaggageAllowance;
                sourceBaggageAllowance = this.getBaggageAllowance();
                CabinAvailabilityType.BaggageAllowance copyBaggageAllowance = ((CabinAvailabilityType.BaggageAllowance) strategy.copy(LocatorUtils.property(locator, "baggageAllowance", sourceBaggageAllowance), sourceBaggageAllowance));
                copy.setBaggageAllowance(copyBaggageAllowance);
            } else {
                copy.baggageAllowance = null;
            }
            if (this.cabinType!= null) {
                CabinType sourceCabinType;
                sourceCabinType = this.getCabinType();
                CabinType copyCabinType = ((CabinType) strategy.copy(LocatorUtils.property(locator, "cabinType", sourceCabinType), sourceCabinType));
                copy.setCabinType(copyCabinType);
            } else {
                copy.cabinType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new CabinAvailabilityType();
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaggageAllowance
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the unitOfMeasureQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Sets the value of the unitOfMeasureQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
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
                BigDecimal theUnitOfMeasureQuantity;
                theUnitOfMeasureQuantity = this.getUnitOfMeasureQuantity();
                strategy.appendField(locator, this, "unitOfMeasureQuantity", buffer, theUnitOfMeasureQuantity);
            }
            {
                String theUnitOfMeasure;
                theUnitOfMeasure = this.getUnitOfMeasure();
                strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure);
            }
            {
                String theUnitOfMeasureCode;
                theUnitOfMeasureCode = this.getUnitOfMeasureCode();
                strategy.appendField(locator, this, "unitOfMeasureCode", buffer, theUnitOfMeasureCode);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof CabinAvailabilityType.BaggageAllowance)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final CabinAvailabilityType.BaggageAllowance that = ((CabinAvailabilityType.BaggageAllowance) object);
            {
                BigDecimal lhsUnitOfMeasureQuantity;
                lhsUnitOfMeasureQuantity = this.getUnitOfMeasureQuantity();
                BigDecimal rhsUnitOfMeasureQuantity;
                rhsUnitOfMeasureQuantity = that.getUnitOfMeasureQuantity();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasureQuantity", lhsUnitOfMeasureQuantity), LocatorUtils.property(thatLocator, "unitOfMeasureQuantity", rhsUnitOfMeasureQuantity), lhsUnitOfMeasureQuantity, rhsUnitOfMeasureQuantity)) {
                    return false;
                }
            }
            {
                String lhsUnitOfMeasure;
                lhsUnitOfMeasure = this.getUnitOfMeasure();
                String rhsUnitOfMeasure;
                rhsUnitOfMeasure = that.getUnitOfMeasure();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure)) {
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
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                BigDecimal theUnitOfMeasureQuantity;
                theUnitOfMeasureQuantity = this.getUnitOfMeasureQuantity();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasureQuantity", theUnitOfMeasureQuantity), currentHashCode, theUnitOfMeasureQuantity);
            }
            {
                String theUnitOfMeasure;
                theUnitOfMeasure = this.getUnitOfMeasure();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure);
            }
            {
                String theUnitOfMeasureCode;
                theUnitOfMeasureCode = this.getUnitOfMeasureCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasureCode", theUnitOfMeasureCode), currentHashCode, theUnitOfMeasureCode);
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
            if (draftCopy instanceof CabinAvailabilityType.BaggageAllowance) {
                final CabinAvailabilityType.BaggageAllowance copy = ((CabinAvailabilityType.BaggageAllowance) draftCopy);
                if (this.unitOfMeasureQuantity!= null) {
                    BigDecimal sourceUnitOfMeasureQuantity;
                    sourceUnitOfMeasureQuantity = this.getUnitOfMeasureQuantity();
                    BigDecimal copyUnitOfMeasureQuantity = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "unitOfMeasureQuantity", sourceUnitOfMeasureQuantity), sourceUnitOfMeasureQuantity));
                    copy.setUnitOfMeasureQuantity(copyUnitOfMeasureQuantity);
                } else {
                    copy.unitOfMeasureQuantity = null;
                }
                if (this.unitOfMeasure!= null) {
                    String sourceUnitOfMeasure;
                    sourceUnitOfMeasure = this.getUnitOfMeasure();
                    String copyUnitOfMeasure = ((String) strategy.copy(LocatorUtils.property(locator, "unitOfMeasure", sourceUnitOfMeasure), sourceUnitOfMeasure));
                    copy.setUnitOfMeasure(copyUnitOfMeasure);
                } else {
                    copy.unitOfMeasure = null;
                }
                if (this.unitOfMeasureCode!= null) {
                    String sourceUnitOfMeasureCode;
                    sourceUnitOfMeasureCode = this.getUnitOfMeasureCode();
                    String copyUnitOfMeasureCode = ((String) strategy.copy(LocatorUtils.property(locator, "unitOfMeasureCode", sourceUnitOfMeasureCode), sourceUnitOfMeasureCode));
                    copy.setUnitOfMeasureCode(copyUnitOfMeasureCode);
                } else {
                    copy.unitOfMeasureCode = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new CabinAvailabilityType.BaggageAllowance();
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
     *       &lt;attribute name="MealCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Meal
        implements Cloneable, CopyTo, Equals, HashCode, ToString
    {

        @XmlAttribute(name = "MealCode", required = true)
        protected String mealCode;

        /**
         * Gets the value of the mealCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealCode() {
            return mealCode;
        }

        /**
         * Sets the value of the mealCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealCode(String value) {
            this.mealCode = value;
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
                String theMealCode;
                theMealCode = this.getMealCode();
                strategy.appendField(locator, this, "mealCode", buffer, theMealCode);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof CabinAvailabilityType.Meal)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final CabinAvailabilityType.Meal that = ((CabinAvailabilityType.Meal) object);
            {
                String lhsMealCode;
                lhsMealCode = this.getMealCode();
                String rhsMealCode;
                rhsMealCode = that.getMealCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mealCode", lhsMealCode), LocatorUtils.property(thatLocator, "mealCode", rhsMealCode), lhsMealCode, rhsMealCode)) {
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
                String theMealCode;
                theMealCode = this.getMealCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mealCode", theMealCode), currentHashCode, theMealCode);
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
            if (draftCopy instanceof CabinAvailabilityType.Meal) {
                final CabinAvailabilityType.Meal copy = ((CabinAvailabilityType.Meal) draftCopy);
                if (this.mealCode!= null) {
                    String sourceMealCode;
                    sourceMealCode = this.getMealCode();
                    String copyMealCode = ((String) strategy.copy(LocatorUtils.property(locator, "mealCode", sourceMealCode), sourceMealCode));
                    copy.setMealCode(copyMealCode);
                } else {
                    copy.mealCode = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new CabinAvailabilityType.Meal();
        }

    }

}
