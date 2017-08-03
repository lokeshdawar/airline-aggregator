//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 10:21:37 AM IST 
//


package org.lucksoft.airlineaggregator.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *     &lt;enumeration value="OnRequest"/&gt;
 *     &lt;enumeration value="Confirmed"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Waitlist"/&gt;
 *     &lt;enumeration value="SupplierBooked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryStatusType")
@XmlEnum
public enum InventoryStatusType {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Waitlist")
    WAITLIST("Waitlist"),

    /**
     * The booking has already been made directly through the supplier.
     * 
     */
    @XmlEnumValue("SupplierBooked")
    SUPPLIER_BOOKED("SupplierBooked");
    private final String value;

    InventoryStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryStatusType fromValue(String v) {
        for (InventoryStatusType c: InventoryStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
