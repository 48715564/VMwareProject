
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIpRouteTableInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostIpRouteTableInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="ipRoute" type="{urn:vim25}HostIpRouteEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ipv6Route" type="{urn:vim25}HostIpRouteEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteTableInfo", propOrder = {
    "ipRoute",
    "ipv6Route"
})
public class HostIpRouteTableInfo
    extends DynamicData
{

    protected List<HostIpRouteEntry> ipRoute;
    protected List<HostIpRouteEntry> ipv6Route;

    /**
     * Gets the value of the ipRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIpRouteEntry }
     * 
     * 
     */
    public List<HostIpRouteEntry> getIpRoute() {
        if (ipRoute == null) {
            ipRoute = new ArrayList<HostIpRouteEntry>();
        }
        return this.ipRoute;
    }

    /**
     * Gets the value of the ipv6Route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipv6Route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpv6Route().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIpRouteEntry }
     * 
     * 
     */
    public List<HostIpRouteEntry> getIpv6Route() {
        if (ipv6Route == null) {
            ipv6Route = new ArrayList<HostIpRouteEntry>();
        }
        return this.ipv6Route;
    }

}
