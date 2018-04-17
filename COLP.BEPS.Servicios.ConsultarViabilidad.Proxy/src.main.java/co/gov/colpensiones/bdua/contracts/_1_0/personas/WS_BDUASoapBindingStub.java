/**
 * WS_BDUASoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.gov.colpensiones.bdua.contracts._1_0.personas;

public class WS_BDUASoapBindingStub extends org.apache.axis.client.Stub implements co.gov.colpensiones.www.bdua.contracts._1_0.personas.ServicioWebViabilidad {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viabilidad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "area"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCaso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "marcaActualizacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "primerApellido"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "primerNombre"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subTramite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tramite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "causalesNoViabilidadBEPS"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "causalesNoViabilidadBEPS"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "causalNoViabilidadBEPS"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idM_Tramite"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "idMTramite"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "informacionViablidad"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "informacionViablidad"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "m_CiudadanoBDUA"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoBDUA"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBDUA.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "m_CiudadanoBeps"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoBeps"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "m_CiudadanoRegistraduria"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoRegistraduria"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoRegistraduria.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "m_CiudadanosConsultados"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanosConsultados"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "m_GestionVinculacionBEPS"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mGestionVinculacionBEPS"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MGestionVinculacionBEPS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "m_InformacionBDUA"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mInformacionBDUA"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoEstadoRespuesta"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "tipoEstadoRespuesta"), co.gov.colpensiones.www.bdua.contracts._1_0.personas.TipoEstadoRespuesta.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("asyncbzg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "area"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCaso"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "marcaActualizacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "primerApellido"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "primerNombre"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subTramite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tramite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nombreEvento"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "respuesta"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public WS_BDUASoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WS_BDUASoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WS_BDUASoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "causalesNoViabilidadBEPS");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "causalNoViabilidadBEPS");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "idMTramite");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "informacionViablidad");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "listaCausalNoViabilidad");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "causal");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoBDUA");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBDUA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoBeps");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanoRegistraduria");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoRegistraduria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mCiudadanosConsultados");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mGestionVinculacionBEPS");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.MGestionVinculacionBEPS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "mInformacionBDUA");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "tipoEstadoRespuesta");
            cachedSerQNames.add(qName);
            cls = co.gov.colpensiones.www.bdua.contracts._1_0.personas.TipoEstadoRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void viabilidad(java.lang.String area, java.lang.String idCaso, boolean marcaActualizacion, java.lang.String numeroDocumento, java.lang.String primerApellido, java.lang.String primerNombre, java.lang.String subTramite, java.lang.String tipoDocumento, java.lang.String tramite, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.CausalesNoViabilidadBEPSHolder causalesNoViabilidadBEPS, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.IdMTramiteHolder idM_Tramite, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.InformacionViablidadHolder informacionViablidad, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBDUAHolder m_CiudadanoBDUA, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoBepsHolder m_CiudadanoBeps, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanoRegistraduriaHolder m_CiudadanoRegistraduria, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MCiudadanosConsultadosHolder m_CiudadanosConsultados, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MGestionVinculacionBEPSHolder m_GestionVinculacionBEPS, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.MInformacionBDUAHolder m_InformacionBDUA, co.gov.colpensiones.www.bdua.contracts._1_0.personas.holders.TipoEstadoRespuestaHolder tipoEstadoRespuesta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/contracts/1.0/personas", "viabilidad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {area, idCaso, new java.lang.Boolean(marcaActualizacion), numeroDocumento, primerApellido, primerNombre, subTramite, tipoDocumento, tramite});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                causalesNoViabilidadBEPS.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "causalesNoViabilidadBEPS"));
            } catch (java.lang.Exception _exception) {
                causalesNoViabilidadBEPS.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "causalesNoViabilidadBEPS")), java.lang.String[].class);
            }
            try {
                idM_Tramite.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite) _output.get(new javax.xml.namespace.QName("", "idM_Tramite"));
            } catch (java.lang.Exception _exception) {
                idM_Tramite.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idM_Tramite")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.IdMTramite.class);
            }
            try {
                informacionViablidad.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad) _output.get(new javax.xml.namespace.QName("", "informacionViablidad"));
            } catch (java.lang.Exception _exception) {
                informacionViablidad.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "informacionViablidad")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.InformacionViablidad.class);
            }
            try {
                m_CiudadanoBDUA.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBDUA) _output.get(new javax.xml.namespace.QName("", "m_CiudadanoBDUA"));
            } catch (java.lang.Exception _exception) {
                m_CiudadanoBDUA.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBDUA) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "m_CiudadanoBDUA")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBDUA.class);
            }
            try {
                m_CiudadanoBeps.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps) _output.get(new javax.xml.namespace.QName("", "m_CiudadanoBeps"));
            } catch (java.lang.Exception _exception) {
                m_CiudadanoBeps.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "m_CiudadanoBeps")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoBeps.class);
            }
            try {
                m_CiudadanoRegistraduria.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoRegistraduria) _output.get(new javax.xml.namespace.QName("", "m_CiudadanoRegistraduria"));
            } catch (java.lang.Exception _exception) {
                m_CiudadanoRegistraduria.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoRegistraduria) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "m_CiudadanoRegistraduria")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanoRegistraduria.class);
            }
            try {
                m_CiudadanosConsultados.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados) _output.get(new javax.xml.namespace.QName("", "m_CiudadanosConsultados"));
            } catch (java.lang.Exception _exception) {
                m_CiudadanosConsultados.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "m_CiudadanosConsultados")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MCiudadanosConsultados.class);
            }
            try {
                m_GestionVinculacionBEPS.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MGestionVinculacionBEPS) _output.get(new javax.xml.namespace.QName("", "m_GestionVinculacionBEPS"));
            } catch (java.lang.Exception _exception) {
                m_GestionVinculacionBEPS.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MGestionVinculacionBEPS) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "m_GestionVinculacionBEPS")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MGestionVinculacionBEPS.class);
            }
            try {
                m_InformacionBDUA.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA) _output.get(new javax.xml.namespace.QName("", "m_InformacionBDUA"));
            } catch (java.lang.Exception _exception) {
                m_InformacionBDUA.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "m_InformacionBDUA")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.MInformacionBDUA.class);
            }
            try {
                tipoEstadoRespuesta.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.TipoEstadoRespuesta) _output.get(new javax.xml.namespace.QName("", "tipoEstadoRespuesta"));
            } catch (java.lang.Exception _exception) {
                tipoEstadoRespuesta.value = (co.gov.colpensiones.www.bdua.contracts._1_0.personas.TipoEstadoRespuesta) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "tipoEstadoRespuesta")), co.gov.colpensiones.www.bdua.contracts._1_0.personas.TipoEstadoRespuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void asyncbzg(java.lang.String area, javax.xml.rpc.holders.StringHolder idCaso, boolean marcaActualizacion, java.lang.String numeroDocumento, java.lang.String primerApellido, java.lang.String primerNombre, java.lang.String subTramite, java.lang.String tipoDocumento, java.lang.String tramite, javax.xml.rpc.holders.StringHolder nombreEvento, javax.xml.rpc.holders.StringHolder respuesta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.colpensiones.gov.co/bdua/bean/bzg", "InformacionEventoCaso"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {area, idCaso.value, new java.lang.Boolean(marcaActualizacion), numeroDocumento, primerApellido, primerNombre, subTramite, tipoDocumento, tramite});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idCaso.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idCaso"));
            } catch (java.lang.Exception _exception) {
                idCaso.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idCaso")), java.lang.String.class);
            }
            try {
                nombreEvento.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "nombreEvento"));
            } catch (java.lang.Exception _exception) {
                nombreEvento.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "nombreEvento")), java.lang.String.class);
            }
            try {
                respuesta.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "respuesta"));
            } catch (java.lang.Exception _exception) {
                respuesta.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "respuesta")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
