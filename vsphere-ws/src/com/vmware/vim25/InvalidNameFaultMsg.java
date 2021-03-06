
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidNameFault", targetNamespace = "urn:vim25")
public class InvalidNameFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidName faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidNameFaultMsg(String message, InvalidName faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidNameFaultMsg(String message, InvalidName faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.InvalidName
     */
    public InvalidName getFaultInfo() {
        return faultInfo;
    }

}
