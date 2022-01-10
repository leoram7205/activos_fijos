package com.asd.activos_fijos.exception;

public class ArgumentosInvalidosException extends ServiceException
{
    private static final long serialVersionUID = 1L;

    public ArgumentosInvalidosException(String mensaje)
    {
        super(LogRefServicios.ERROR_ARGUMENTOS_INVALIDOS, mensaje);
    }

    public ArgumentosInvalidosException(String mensaje, Throwable cause)
    {
        super(LogRefServicios.ERROR_ARGUMENTOS_INVALIDOS, mensaje, cause);
    }
}
