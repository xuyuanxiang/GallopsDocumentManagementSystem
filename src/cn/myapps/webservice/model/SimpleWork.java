/**
 * SimpleWork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleWork  implements java.io.Serializable {
    private java.lang.String applicationId;

    private java.lang.String auditorList;

    private java.lang.String auditorNames;

    private java.lang.String docId;

    private java.lang.String flowId;

    private java.lang.String flowName;

    private java.lang.String formId;

    private java.lang.String stateLabel;

    private java.lang.String subject;

    public SimpleWork() {
    }

    public SimpleWork(
           java.lang.String applicationId,
           java.lang.String auditorList,
           java.lang.String auditorNames,
           java.lang.String docId,
           java.lang.String flowId,
           java.lang.String flowName,
           java.lang.String formId,
           java.lang.String stateLabel,
           java.lang.String subject) {
           this.applicationId = applicationId;
           this.auditorList = auditorList;
           this.auditorNames = auditorNames;
           this.docId = docId;
           this.flowId = flowId;
           this.flowName = flowName;
           this.formId = formId;
           this.stateLabel = stateLabel;
           this.subject = subject;
    }


    /**
     * Gets the applicationId value for this SimpleWork.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this SimpleWork.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the auditorList value for this SimpleWork.
     * 
     * @return auditorList
     */
    public java.lang.String getAuditorList() {
        return auditorList;
    }


    /**
     * Sets the auditorList value for this SimpleWork.
     * 
     * @param auditorList
     */
    public void setAuditorList(java.lang.String auditorList) {
        this.auditorList = auditorList;
    }


    /**
     * Gets the auditorNames value for this SimpleWork.
     * 
     * @return auditorNames
     */
    public java.lang.String getAuditorNames() {
        return auditorNames;
    }


    /**
     * Sets the auditorNames value for this SimpleWork.
     * 
     * @param auditorNames
     */
    public void setAuditorNames(java.lang.String auditorNames) {
        this.auditorNames = auditorNames;
    }


    /**
     * Gets the docId value for this SimpleWork.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this SimpleWork.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the flowId value for this SimpleWork.
     * 
     * @return flowId
     */
    public java.lang.String getFlowId() {
        return flowId;
    }


    /**
     * Sets the flowId value for this SimpleWork.
     * 
     * @param flowId
     */
    public void setFlowId(java.lang.String flowId) {
        this.flowId = flowId;
    }


    /**
     * Gets the flowName value for this SimpleWork.
     * 
     * @return flowName
     */
    public java.lang.String getFlowName() {
        return flowName;
    }


    /**
     * Sets the flowName value for this SimpleWork.
     * 
     * @param flowName
     */
    public void setFlowName(java.lang.String flowName) {
        this.flowName = flowName;
    }


    /**
     * Gets the formId value for this SimpleWork.
     * 
     * @return formId
     */
    public java.lang.String getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this SimpleWork.
     * 
     * @param formId
     */
    public void setFormId(java.lang.String formId) {
        this.formId = formId;
    }


    /**
     * Gets the stateLabel value for this SimpleWork.
     * 
     * @return stateLabel
     */
    public java.lang.String getStateLabel() {
        return stateLabel;
    }


    /**
     * Sets the stateLabel value for this SimpleWork.
     * 
     * @param stateLabel
     */
    public void setStateLabel(java.lang.String stateLabel) {
        this.stateLabel = stateLabel;
    }


    /**
     * Gets the subject value for this SimpleWork.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this SimpleWork.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleWork)) return false;
        SimpleWork other = (SimpleWork) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.auditorList==null && other.getAuditorList()==null) || 
             (this.auditorList!=null &&
              this.auditorList.equals(other.getAuditorList()))) &&
            ((this.auditorNames==null && other.getAuditorNames()==null) || 
             (this.auditorNames!=null &&
              this.auditorNames.equals(other.getAuditorNames()))) &&
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.flowId==null && other.getFlowId()==null) || 
             (this.flowId!=null &&
              this.flowId.equals(other.getFlowId()))) &&
            ((this.flowName==null && other.getFlowName()==null) || 
             (this.flowName!=null &&
              this.flowName.equals(other.getFlowName()))) &&
            ((this.formId==null && other.getFormId()==null) || 
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.stateLabel==null && other.getStateLabel()==null) || 
             (this.stateLabel!=null &&
              this.stateLabel.equals(other.getStateLabel()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getAuditorList() != null) {
            _hashCode += getAuditorList().hashCode();
        }
        if (getAuditorNames() != null) {
            _hashCode += getAuditorNames().hashCode();
        }
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getFlowId() != null) {
            _hashCode += getFlowId().hashCode();
        }
        if (getFlowName() != null) {
            _hashCode += getFlowName().hashCode();
        }
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getStateLabel() != null) {
            _hashCode += getStateLabel().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleWork.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleWork"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditorNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditorNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
