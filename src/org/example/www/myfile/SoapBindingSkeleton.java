/**
 * SoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.myfile;

public class SoapBindingSkeleton implements org.example.www.myfile.SoapPortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.myfile.SoapPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/myfile/", "input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getsome", _params, new javax.xml.namespace.QName("http://www.example.org/myfile/", "output"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getsome"));
        _oper.setSoapAction("http:www.example.org/myfile/operation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getsome") == null) {
            _myOperations.put("getsome", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getsome")).add(_oper);
    }

    public SoapBindingSkeleton() {
        this.impl = new org.example.www.myfile.SoapBindingImpl();
    }

    public SoapBindingSkeleton(org.example.www.myfile.SoapPortType impl) {
        this.impl = impl;
    }
    public java.lang.String getsome(java.lang.String inputs) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getsome(inputs);
        return ret;
    }

}
