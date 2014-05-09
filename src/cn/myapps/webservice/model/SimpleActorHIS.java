/**
 * SimpleActorHIS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.myapps.webservice.model;

public class SimpleActorHIS  extends cn.myapps.base.dao.ValueObject  implements java.io.Serializable {
    private java.lang.String actorid;

    private java.lang.String agentid;

    private java.lang.String agentname;

    private java.lang.Object[] alluserid;

    private java.lang.String attitude;

    private java.lang.String name;

    private java.util.Calendar processtime;

    private int type;

    public SimpleActorHIS() {
    }

    public SimpleActorHIS(
           java.lang.String applicationid,
           java.lang.String domainid,
           java.lang.String id,
           boolean lazyLoad,
           java.lang.String sortId,
           int version,
           java.lang.String actorid,
           java.lang.String agentid,
           java.lang.String agentname,
           java.lang.Object[] alluserid,
           java.lang.String attitude,
           java.lang.String name,
           java.util.Calendar processtime,
           int type) {
        super(
            applicationid,
            domainid,
            id,
            lazyLoad,
            sortId,
            version);
        this.actorid = actorid;
        this.agentid = agentid;
        this.agentname = agentname;
        this.alluserid = alluserid;
        this.attitude = attitude;
        this.name = name;
        this.processtime = processtime;
        this.type = type;
    }


    /**
     * Gets the actorid value for this SimpleActorHIS.
     * 
     * @return actorid
     */
    public java.lang.String getActorid() {
        return actorid;
    }


    /**
     * Sets the actorid value for this SimpleActorHIS.
     * 
     * @param actorid
     */
    public void setActorid(java.lang.String actorid) {
        this.actorid = actorid;
    }


    /**
     * Gets the agentid value for this SimpleActorHIS.
     * 
     * @return agentid
     */
    public java.lang.String getAgentid() {
        return agentid;
    }


    /**
     * Sets the agentid value for this SimpleActorHIS.
     * 
     * @param agentid
     */
    public void setAgentid(java.lang.String agentid) {
        this.agentid = agentid;
    }


    /**
     * Gets the agentname value for this SimpleActorHIS.
     * 
     * @return agentname
     */
    public java.lang.String getAgentname() {
        return agentname;
    }


    /**
     * Sets the agentname value for this SimpleActorHIS.
     * 
     * @param agentname
     */
    public void setAgentname(java.lang.String agentname) {
        this.agentname = agentname;
    }


    /**
     * Gets the alluserid value for this SimpleActorHIS.
     * 
     * @return alluserid
     */
    public java.lang.Object[] getAlluserid() {
        return alluserid;
    }


    /**
     * Sets the alluserid value for this SimpleActorHIS.
     * 
     * @param alluserid
     */
    public void setAlluserid(java.lang.Object[] alluserid) {
        this.alluserid = alluserid;
    }


    /**
     * Gets the attitude value for this SimpleActorHIS.
     * 
     * @return attitude
     */
    public java.lang.String getAttitude() {
        return attitude;
    }


    /**
     * Sets the attitude value for this SimpleActorHIS.
     * 
     * @param attitude
     */
    public void setAttitude(java.lang.String attitude) {
        this.attitude = attitude;
    }


    /**
     * Gets the name value for this SimpleActorHIS.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SimpleActorHIS.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the processtime value for this SimpleActorHIS.
     * 
     * @return processtime
     */
    public java.util.Calendar getProcesstime() {
        return processtime;
    }


    /**
     * Sets the processtime value for this SimpleActorHIS.
     * 
     * @param processtime
     */
    public void setProcesstime(java.util.Calendar processtime) {
        this.processtime = processtime;
    }


    /**
     * Gets the type value for this SimpleActorHIS.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this SimpleActorHIS.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleActorHIS)) return false;
        SimpleActorHIS other = (SimpleActorHIS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actorid==null && other.getActorid()==null) || 
             (this.actorid!=null &&
              this.actorid.equals(other.getActorid()))) &&
            ((this.agentid==null && other.getAgentid()==null) || 
             (this.agentid!=null &&
              this.agentid.equals(other.getAgentid()))) &&
            ((this.agentname==null && other.getAgentname()==null) || 
             (this.agentname!=null &&
              this.agentname.equals(other.getAgentname()))) &&
            ((this.alluserid==null && other.getAlluserid()==null) || 
             (this.alluserid!=null &&
              java.util.Arrays.equals(this.alluserid, other.getAlluserid()))) &&
            ((this.attitude==null && other.getAttitude()==null) || 
             (this.attitude!=null &&
              this.attitude.equals(other.getAttitude()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.processtime==null && other.getProcesstime()==null) || 
             (this.processtime!=null &&
              this.processtime.equals(other.getProcesstime()))) &&
            this.type == other.getType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getActorid() != null) {
            _hashCode += getActorid().hashCode();
        }
        if (getAgentid() != null) {
            _hashCode += getAgentid().hashCode();
        }
        if (getAgentname() != null) {
            _hashCode += getAgentname().hashCode();
        }
        if (getAlluserid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlluserid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlluserid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttitude() != null) {
            _hashCode += getAttitude().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProcesstime() != null) {
            _hashCode += getProcesstime().hashCode();
        }
        _hashCode += getType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleActorHIS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:model.webservice.myapps.cn", "SimpleActorHIS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alluserid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alluserid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
