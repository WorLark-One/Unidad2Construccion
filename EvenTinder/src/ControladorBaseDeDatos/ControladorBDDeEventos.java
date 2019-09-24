package 9. Controlador de base de datos;

import java.util.*;

/**
 * 
 */
public class ControladorBDDeEventos {

    /**
     * Default constructor
     */
    public ControladorBDDeEventos() {
    }

    /**
     * @param String rut 
     * @return
     */
    public ArrayList<String> listaDeSolicitudes obtenerInformacionDeSolicitudesDeEventos(void String rut) {
        // TODO implement here
        return null;
    }

    /**
     * @param String rut 
     * @param int id 
     * @return
     */
    public ArrayList<String> informacionSolicitudDeEvento obtenerInformacionDeUnaSolicitudDeEvento(void String rut, void int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param String rut 
     * @param int id 
     * @return
     */
    public void aceptarSolicitudDeUnEvento(void String rut, void int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param String rut 
     * @param int id 
     * @return
     */
    public void rechazarSolicitud(void String rut, void int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param String rut 
     * @return
     */
    public ArrayList<String> eventos obtenerInformacionDeTodosLosEventosDeUnOrganizador(void String rut) {
        // TODO implement here
        return null;
    }

    /**
     * @param String rut 
     * @return
     */
    public ArrayList<String> eventos obtenerInformacionDeEventosPublicadosDeUnOrganizador(void String rut) {
        // TODO implement here
        return null;
    }

    /**
     * @param String rut 
     * @return
     */
    public ArrayList<String> eventos obtenerInformacionDeEventosNoPublicados(void String rut) {
        // TODO implement here
        return null;
    }

    /**
     * @param String nombre 
     * @param Date fechaDeInicio 
     * @param Date fechaDeTermino 
     * @param int capacidad 
     * @param String descripcion 
     * @param int diasMaximoDevolucion 
     * @param boolean publicado 
     * @return
     */
    public void crearEvento(void String nombre, void Date fechaDeInicio, void Date fechaDeTermino, void int capacidad, void String descripcion, void int diasMaximoDevolucion, void boolean publicado) {
        // TODO implement here
        return null;
    }

    /**
     * @param int id 
     * @param String nombre 
     * @param Date fechaDeInicio 
     * @param Date fechaDeTermino 
     * @param int capacidad 
     * @param String descripcion 
     * @param int diasMaximoDevolucion 
     * @param boolean publicado 
     * @return
     */
    public void modificarEvento(void int id, void String nombre, void Date fechaDeInicio, void Date fechaDeTermino, void int capacidad, void String descripcion, void int diasMaximoDevolucion, void boolean publicado) {
        // TODO implement here
        return null;
    }

    /**
     * @param int id 
     * @return
     */
    public void eliminarEvento(void int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param int id 
     * @return
     */
    public ArrayList<String> listaDeEstadisticas obtenerInformacionDeEstadisticasDeVentasPorEventos(void int id) {
        // TODO implement here
        return null;
    }

    /**
     * @param int id 
     * @return
     */
    public ArrayList<String> listaDeEventosHistoricas obtenerInformacionDeHistorialDeEventosPorPropiedad(void int id) {
        // TODO implement here
        return null;
    }

}