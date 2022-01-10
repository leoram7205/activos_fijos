package com.asd.activos_fijos.exception;

public class ServiceException extends PortalException
{
    private static final long serialVersionUID = 1L;

    public ServiceException(LogRefServicios logRefServicios, String mensaje)
    {
        super(logRefServicios, mensaje);
    }
    
    public ServiceException(LogRefServicios logRefServicios,String mensaje,Throwable cause)
    {
        super(logRefServicios,mensaje,cause);
    }
    
    public ServiceException(PortalException portalException)
    {
        super(portalException.getLogRefServicios(),portalException.getMessage(),portalException);
    }
}
