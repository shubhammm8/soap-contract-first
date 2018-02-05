/**
 * SoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.myfile;

public interface SoapService extends javax.xml.rpc.Service {
    public java.lang.String getgetmesomethingAddress();

    public org.example.www.myfile.SoapPortType getgetmesomething() throws javax.xml.rpc.ServiceException;

    public org.example.www.myfile.SoapPortType getgetmesomething(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
