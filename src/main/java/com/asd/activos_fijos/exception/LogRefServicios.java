package com.asd.activos_fijos.exception;

public enum LogRefServicios
{
    /** Error general */
    ERROR_GENERAL("ERROR_GENERAL", "/ayuda/error-general.html")
    /** Sucede al hacer timeout el servicio */
    ,ERROR_TIMEOUT_CONSUMIENDO_SERVICIO_WEB("ERROR_TIMEOUT_CONSUMIENDO_SERVICIO_WEB", "/ayuda/error-timeout-consumiento-servicio-web.html")
    /** Error en caso de falar al consumir un servicio web por fallo en el protocolo */
    ,ERROR_PROTOCOLO_CONSUMIENTO_SERVICIO_WEB("ERROR_PROTOCOLO_CONSUMIENTO_SERVICIO_WEB", "/ayuda/error-protocolo-consumiento-consumiento-servicio-web.html")
    /** Error al invocar servicio */
    ,ERROR_SERVICIO("ERROR_SERVICIO", "/ayuda/error-servicio.html")
    /** Error al invocar SP */
    ,ERROR_SP("ERROR_SP", "/ayuda/error-procedimiento-almacenado.html")
    /** Error al invocar SP de datos de asesor Fiduciaria */
    ,ERROR_SP_DATOS_ASESOR_FIDUCIARIA("ERROR_SP_DATOS_ASESOR_FIDUCIARIA", "/ayuda/error-procedimiento-almacenado-datos-asesor-fiduciaria.html")
    /** Error al invocar SP de perfil de riesgo Fiduciaria */
    ,ERROR_SP_PERFIL_RIESGO_FIDUCIARIA("ERROR_SP_PERFIL_RIESGO_FIDUCIARIA", "/ayuda/error-procedimiento-almacenado-perfil-riesgo-fiduciaria.html")
    /** Error al invocar SP de actualizar perfil de riesgo Fiduciaria */
    ,ERROR_SP_ACTUALIZAR_PERFIL_RIESGO_FIDUCIARIA("ERROR_SP_ACTUALIZAR_PERFIL_RIESGO_FIDUCIARIA", "/ayuda/error-procedimiento-almacenado-actualizar-perfil-riesgo-fiduciaria.html")
    /** Error al invocar SP de rango monto inversion Fiduciaria */
    ,ERROR_SP_RANGO_MONTO_INVERSION("ERROR_SP_PERFIL_RIESGO_FIDUCIARIA", "/ayuda/error-procedimiento-almacenado-rango-monto-inversion-fiduciaria.html")
    /** Error al invocar SP de datos de asesor Valores */
    ,ERROR_SP_DATOS_ASESOR_VALORES("ERROR_SP_DATOS_ASESOR_VALORES", "/ayuda/error-procedimiento-almacenado-datos-asesor-valores.html")
    /** Error al invocar SP de extracto cliente Valores */
    ,ERROR_SP_EXTRACTO_CLIENTE_VALORES("ERROR_SP_EXTRACTO_CLIENTE_VALORES", "/ayuda/error-procedimiento-almacenado-extracto-cliente-valores.html")
    /** Error al invocar SP de transferencia de Valores a Fiduciaria en OYD */
    ,ERROR_SP_TRANSFERENCIA_VALORES_FIDUCIARIA("ERROR_SP_TRANSFERENCIA_VALORES_FIDUCIARIA", "/ayuda/error-procedimiento-almacenado-transferencia-valores-fiduciaria.html")
    /** Error al invocar SP de extracto cliente movimientos periodo */
    ,ERROR_SP_EXTRACTO_CLIENTE_MOVIMIENTOS_PERIODO("ERROR_SP_EXTRACTO_CLIENTE_MOVIMIENTOS_PERIODO", "/ayuda/error-procedimiento-almacenado-extracto-cliente-movimientos-periodo.html")
    /** Error en caso de encontrar argumentos invalidos */
    ,ERROR_ARGUMENTOS_INVALIDOS("ERROR_ARGUMENTOS_INVALIDOS", "/ayuda/error-argumentos-invalidos.html")
    /** Error servicio datos asesor */
    ,ERROR_DATOS_ASESOR_SERVICE("ERROR_DATOS_ASESOR_SERVICE", "/ayuda/error-datos-asesor-service.html")
    /** Error servicio riesgo perfil */
    ,ERROR_PERFIL_RIESGO_SERVICE("ERROR_PERFIL_RIESGO_SERVICE", "/ayuda/error-perfil-riesgo-service.html")
    /** Error servicio rentabilidad historica */
    ,ERROR_RENTABILIDAD_HISTORICA_SERVICE("ERROR_RENTABILIDAD_HISTORICA_SERVICE", "/ayuda/error-rentabilidad-historica-service.html")
    /** Error en crypto utils con el keystore */
    ,ERROR_FILE_SIGNATURE_CRYPTO_UTIL("ERROR_FILE_SIGNATURE_CRYPTO_UTIL", "/ayuda/error-crypto-utils-keystore.html")
    /** Error en servicio de autenticacion */
    ,ERROR_AUTHENTICATION_SERVICE("ERROR_AUTHENTICATION_SERVICE", "/ayuda/error-autenticacion-service.html")
    /** Error en servicio de validacion token */
    ,ERROR_TOKEN_VALIDATION_SERVICE("ERROR_TOKEN_VALIDATION_SERVICE", "/ayuda/error-validacion-token-service.html")
    /** Error en servicio de generacion PDF */
    ,ERROR_JASPER_REPORT_GENERACION_SERVICE("ERROR_JASPER_REPORT_GENERACION_SERVICE", "/ayuda/error-jasper-report-service.html")
    /** Error en servicio de movimientos valores ultimos 20 */
    ,ERROR_ULTIMOS_MOVIMIENTOS_VALORES_SERVICE("ERROR_ULTIMOS_MOVIMIENTOS_VALORES_SERVICE", "/ayuda/error-ultimos-movimientos-valores-service.html")
    /** Error en el cliente ws soap de computech */
    ,ERROR_CLIENTE_WS_SOAP_COMPUTECH("ERROR_CLIENTE_WS_SOAP_COMPUTECH", "/ayuda/error-cliente-ws-soap-computech.html")
    /** Error en el cliente ws soap de BIZAGI 11 */
    ,ERROR_CLIENTE_WS_SOAP_BIZAGI("ERROR_CLIENTE_WS_SOAP_BIZAGI", "/ayuda/error-cliente-ws-soap-bizagi.html")
    /** Error en caso de no encontrarse un dato */
    ,ERROR_DATO_NO_ENCONTRADO("DATO_NO_ENCONTRADO", "/ayuda/dato-no-encontrado.html")
    /** Error en caso de encontrarse un dato */
    ,ERROR_DATO_ENCONTRADO("DATO_ENCONTRADO", "/ayuda/dato-encontrado.html")
    /** Error en caso de encontrarse un dato */
    ,ERROR_CONSULTA_DB_POSTGRESQL("ERROR_CONSULTA_DB_POSTGRESQL", "/ayuda/error-consulta-db-postgresql.html")
    /** Error servicio de consulta correo portal publico */
    ,ERROR_CONSULTA_EMAIL_PUBLICO_SERVICE("ERROR_CONSULTA_EMAIL_PUBLICO_SERVICE", "/ayuda/error-consulta-email-publico.html")
    /** Error procedimiento almacenado para consultar correo portal publico */
    ,ERROR_SP_PORTAL_PUBLIC_CORREO("ERROR_SP_PORTAL_PUBLIC_CORREO", "/ayuda/error-procedimiento-almacenado-email-publico.html")
    /** Error en el envio de email para crear contraseña */
    ,ERROR_ENVIO_EMAIL_CREAR_CONTRASENA("ERROR_ENVIO_EMAIL_CREAR_CONTRASENA", "/ayuda/error-envio-email-crear-contrasena.html")
    /** Error en el envio de email para crear contraseña */
    ,ERROR_ENVIO_EMAIL_OLVIDAR_CONTRASENA("ERROR_ENVIO_EMAIL_OLVIDAR_CONTRASENA", "/ayuda/error-envio-email-olvidar-contrasena.html")
    /** Error procedimiento almacenado consulta productos sifi publico */
    ,ERROR_SP_CONSULTA_PRODUCTOS_FIDUCIARIA_PUBLICO("ERROR_SP_CONSULTA_PRODUCTOS_FIDUCIARIA_PUBLICO", "/ayuda/error-procedimiento-almacenado-consulta-productos-sifi-publico.html")
    /** Error servicio envio correo certificado tributarios portal publico */
    ,ERROR_SP_SENT_MAIL_CERTIFICADOS_TRIBUTARIOS_SERVICE("ERROR_SP_SENT_MAIL_CERTIFICADOS_TRIBUTARIOS_SERVICEO", "/ayuda/error-envio-correo-certificado-tributario-publico.html")
    /** Error en el servicio de olvidar contrasena */
    ,ERROR_OLVIDAR_CONTRASENA("ERROR_OLVIDAR_CONTRASENA", "/ayuda/error-olvidar-contrasena.html")
    /** Error en el servicio de actualizar contrasena */
    ,ERROR_ACTUALIZAR_CONTRASENA("ERROR_ACTUALIZAR_CONTRASENA", "/ayuda/error-actualizar-contrasena.html")
    /** Error en el servicio de SFTP */
    ,ERROR_SFTP_SERVICE("ERROR_SFTP_SERVICE", "/ayuda/error-sftp-service.html")
    /** Error en el servicio de Certificado Opcion Inversion */
    ,ERROR_CERTIFICADO_OPIN_SERVICE("ERROR_CERTIFICADO_OPIN_SERVICE", "/ayuda/error-certificado-opin-service.html")
    /** Error en el servicio consultar lista certificados alianza */
    ,ERROR_CERTIFICADOS_ALIANZA_LIST_SERVICE("ERROR_CERTIFICADOS_ALIANZA_LIST_SERVICE", "/ayuda/error-consultar-lista-certificados-alianza-service.html")
    /** Error en el cliente ws */
    ,ERROR_CLIENT_WS_REST("ERROR_CLIENT_WS_REST", "/ayuda/error-client-ws-rest.html")
    /** Error en el cliente ws validar permisos tx login */
    ,ERROR_CLIENT_WS_REST_PERMISSIONS_TX("ERROR_CLIENT_WS_REST_PERMISSIONS_TX", "/ayuda/error-validar-permisos-tx-login-cliente-rest-service.html")
    /** Error en el cliente ws consultar identificacion usuario por token */
    ,ERROR_CLIENT_WS_REST_USER_ID_BY_TOKEN("ERROR_CLIENT_WS_REST_USER_ID_BY_TOKEN", "/ayuda/error-consultar-identificacion-usuario-token-cliente-rest-service.html")
    /** Error en el servicio de transferencias */
    ,ERROR_TX_TRANSFERS_PRODUCTS_SERVICE("ERROR_TX_TRANSFERS_PRODUCTS_SERVICE", "/ayuda/error-tx-productos-service.html")
    /** Error en el servicio de valdiar horario */
    ,ERROR_VALIDAR_HORARIO("ERROR_VALIDAR_HORARIO", "/ayuda/error-validar-horario.html")
    /** Error procedimiento almacenado consulta cuenta alianza */
    ,ERROR_SP_CONSULTA_CUENTA_ALIANZA("ERROR_SP_CONSULTA_VALIDAR_CUENTA_ALIANZA", "/ayuda/error-sp-consulta-cuenta-alianza.html")
    /** Error procedimiento almacenado inscribe cuenta alianza */
    ,ERROR_SP_INSCRIBIR_CUENTA_ALIANZA("ERROR_SP_INSCRIBIR_CUENTA_ALIANZA", "/ayuda/error-sp-inscribir-cuenta-alianza.html")
    /** Error procedimiento almacenado consulta validar cuenta alianza */
    ,ERROR_SP_CONSULTA_VALIDAR_CUENTA_ALIANZA("ERROR_SP_CONSULTA_VALIDAR_CUENTA_ALIANZA", "/ayuda/error-sp-consulta-validar-cuenta-alianza.html")
    /** Error procedimiento que elimina cuenta bancaria */
    ,ERROR_SP_ELIMINAR_CUENTA_BANCARIA("ERROR_SP_ELIMINAR_CUENTA_BANCARIA", "/ayuda/error-sp-elimina-cuenta-bancaria.html")
    /** Error procedimiento que elimina cuenta alianza */
    ,ERROR_SP_ELIMINAR_CUENTA_ALIANZA("ERROR_SP_ELIMINAR_CUENTA_ALIANZA", "/ayuda/error-sp-elimina-cuenta-alianza.html")
    /** Error en caso de no encontrarse el token */
    ,ERROR_TOKEN_INVALIDO("ERROR_TOKEN_INVALIDO", "/ayuda/error-token-invalido.html")
    /** Error en SP que procesa la transferencia y/o retiro */
    ,ERROR_SP_PROCESAR_RETIRO_TR("ERROR_SP_PROCESAR_RETIRO_TR", "/ayuda/error-sp-proceso-retiro-tr.html")
    /** Error en SP que procesa la transferencia y/o retiro */
    ,ERROR_SP_CREAR_TRANSFERENCIA_PROGRAMACION("ERROR_SP_CREAR_TRANSFERENCIA_PROGRAMACION", "/ayuda/error-sp-crear-transferencia-programacion.html")
    /** Error en servicio de extractos */
    ,ERROR_EXTRACTOS_SERVICE("ERROR_EXTRACTOS_SERVICE", "/ayuda/error-extractos-service.html")
    /** Error en caso de no encontrar registros en una consulta para mostrar en pantalla */
    ,ERROR_NO_CONTENT("ERROR_NO_CONTENT", "/ayuda/error-sin-registros-exception.html")
    /** Error procedimiento almacenado transferencias pendientes */
    ,ERROR_TRANSFERENCIAS_PENDIENTES_SERVICE("ERROR_TRANSFERENCIAS_PENDIENTES_SERVICE", "/ayuda/error-sp-transferencias-pendientes.html")
    /** Error en caso de cambiar el recurso */
    ,ERROR_RECURSO_ACTUALIZADO("ERROR_RECURSO_ACTUALIZADO", "/ayuda/error-recurso-actualizado.html")
    /** Error en caso de login fallido */
    ,ERROR_LOGIN_FALLIDO("ERROR_LOGIN_FALLIDO", "/ayuda/error-login-fallido.html")
    /** Error en cliente ws de validacion otp */
    ,ERROR_CLIENT_WS_OTP_VALIDATION_SERVICE("ERROR_CLIENT_WS_OTP_VALIDATION_SERVICE", "/ayuda/error-cliente-ws-otp-validation-service.html")
    /** Error en cliente ws de consulta de tarjetas de firmas */
    ,ERROR_CONSULTAR_TARJETAS_FIRMAS_SERVICE("ERROR_CONSULTAR_TARJETAS_FIRMAS_SERVICE", "/ayuda/error-consultar-tarjetas-firmas-service.html")
    /** Error en el envio de email para un prospecto */
    ,ERROR_ENVIO_EMAIL_PROSPECTO("ERROR_ENVIO_EMAIL_PROSPECTO", "/ayuda/error-envio-email-prospecto.html")
    /** Error en el envio de email para terceros en una transferencia*/
    ,ERROR_ENVIO_EMAIL_TERCERO_TRANSFERENCIA("ERROR_ENVIO_EMAIL_TERCERO_TRANSFERENCIA", "/ayuda/error-envio-email-tercero-transferencia.html")
    /** Error en el envio de email para el comercial en una transferencia*/
    ,ERROR_ENVIO_EMAIL_COMERCIAL_TRANSFERENCIA("ERROR_ENVIO_EMAIL_COMERCIAL_TRANSFERENCIA", "/ayuda/error-envio-email-comercial-transferencia.html")
    /** Error en el envio de email de inscripcion*/
    ,ERROR_ENVIO_EMAIL_INSCRIPCION("ERROR_ENVIO_EMAIL_INSCRIPCION", "/ayuda/error-envio-email-inscripcion.html")
    /** Error en al consultar el comercial para informarle de una transferencia*/
    ,ERROR_ENVIO_CONSULTA_DATOS_ASESOR("ERROR_ENVIO_CONSULTA_DATOS_ASESOR", "/ayuda/error-envio-consulta-datos-asesor.html")
    /** Error en al consultar los permisos para transacciones y sus valores*/
    ,ERROR_CONSULTA_MONTOS_MAX_TX("ERROR_CONSULTA_MONTOS_MAX_TX", "/ayuda/error-consulta-montos-max-tx.html")
    /** Error en al enviar la peticion para enviar los certificados al correos*/
    ,ERROR_ENVIAR_CORREO_CERTIFICADO("ERROR_ENVIAR_CORREO_CERTIFICADO", "/ayuda/error-enviar-correo-certificado.html")
    /** Error en al enviar el correo con los certificados comerciales*/
    ,ERROR_ENVIAR_CERTIFICADO_COMERCIAL("ERROR_ENVIAR_CERTIFICADO_COMERCIAL", "/ayuda/error-enviar-certificado-comercial.html")
    /** Error al consultar desde el cliente el certificado comercial por fondo*/
    ,ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_POR_FONDO("ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_POR_FONDO","/ayuda/error-consultar-cliente-certificado-comercial-por-fondo.html")
    /** Error al consultar desde el cliente el certificado comercial todos*/
    ,ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_TODOS("ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_TODOS","/ayuda/error-consultar-cliente-certificado-comercial-todos.html")
    /** Error al consultar desde el cliente el certificado comercial de las embajadas*/
    ,ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_EMBAJADA("ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_EMBAJADA","/ayuda/error-consultar-cliente-certificado-comercial-embajada.html")
    /** Error al consultar desde el cliente el certificado comercial participacion*/
    ,ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_PARTICIPACION("ERROR_CONSULTAR_CLIENTE_CERTIFICADO_COMERCIAL_PARTICIPACION","/ayuda/error-consultar-cliente-certificado-comercial-participacion.html")    
    /** Error en el servicio de envio extractos al correo */
    ,ERROR_ENVIO_EXTRACTOS_AL_CORREO("ERROR_ENVIO_EXTRACTOS_AL_CORREO", "/ayuda/error-envio-extractos-al-correo.html")
    /** Error procedimiento almacenado consulta productos para certificado tributario OYD */
    ,ERROR_SP_CONSULTA_PRODUCTOS_CERTIFICADO_TRIBUTARIO_OYD("ERROR_SP_CONSULTA_PRODUCTOS_CERTIFICADO_TRIBUTARIO_OYD", "/ayuda/error-consultar-productos-certificado-triburario-oyd.html")
    /** Error al consultar desde el cliente el extracto para pensiones*/
    ,ERROR_CONSULTAR_CLIENTE_EXTRACTO_PENSIONES("ERROR_CONSULTAR_CLIENTE_EXTRACTO_PENSIONES","/ayuda/error-consultar-cliente-extracto-pensiones.html")    
    /** Error en el envio de email para un agente mi fiducia */
    ,ERROR_ENVIO_EMAIL_AGENTE("ERROR_ENVIO_EMAIL_AGENTE", "/ayuda/error-envio-email-agente.html")
    /** Error al llamar el servicio de generacon de reportes de Sifi*/
    ,ERROR_SERVICIO_REPORTES_SIFI("ERROR_SERVICIO_REPORTES_SIFI","/ayuda/error-servicio-reportes-sifi.html")
    /** Error al llamar el servicio de consulta de documentos de Siged*/
    ,ERROR_SERVICIO_DOCUMENTOS_SIGED("ERROR_SERVICIO_REPORTES_SIFI","/ayuda/error-servicio-documentos-siged.html")
    /** Error en el envio de email notificación aprobadores radicación */
    ,ERROR_ENVIO_EMAIL_APROBADORES_RADICACION("ERROR_ENVIO_EMAIL_APROBADORES_RADICACION", "/ayuda/error-envio-email-aprobadores-radicacion.html")
    ;

    private String logRef;
    private String hrefLink;

    private LogRefServicios(String logRef, String hrefLink)
    {
        this.logRef = logRef;
        this.hrefLink = hrefLink;
    }

    public String getHrefLink()
    {
        return hrefLink;
    }

    public String getLogRef()
    {
        return logRef;
    }

    public static LogRefServicios valueOfLogRef(String logRef)
    {
        for (LogRefServicios item : values())
        {
            if (item.getLogRef().equals(logRef))
            {
                return item;
            }
        }
        return null;
    }
}
