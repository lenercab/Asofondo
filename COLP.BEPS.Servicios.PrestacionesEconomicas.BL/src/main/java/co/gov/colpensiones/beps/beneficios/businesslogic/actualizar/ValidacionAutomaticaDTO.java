package co.gov.colpensiones.beps.beneficios.businesslogic.actualizar;

import java.sql.Date;

/**
 * Objeto para la persistencia de registro de control sobre la BD, que se genera por la ejecución del proceso de validaciones automáticas
 * para las solicitudes de destinación de recursos radicadas en el sistema BEPS.
 * 
 * <b>Caso de Uso:</b> GOI-OTO-1-FAB-19-ValidacionesAutomaticas<br/>
 * 
 * @author Yenny Nustez Arevalo <ynustez@heinsohn.com.co>
 * @author Arnold Rios Delgado <arrios@heinsohn.com.co>
 * 
 */
public class ValidacionAutomaticaDTO {

    /** Identificador de la solicitud a la cual se le ejecutan las validaciones automáticas */
    private Long idSolicitud;

    /** Variable que almacena la validación de estado de fallecimiento del vinculado asociado a la solicitud */
    private String estadoFallecido;

    /** Fecha de corte del proceso de actualización de fallecido */
    private Date fechaCorte;

    /** Variable que almacena el resultado de la validación de edad/género */
    private String edadGenero;

    /** Fecha de validación de edad/género */
    private Date fechaValidacionEdadGenero;

    /**
     * Variable que almacena el resultado de la validación ejecutada por el servicio de NominaBeneficios para las solicitudes con
     * destinación de recusos Anualidad Vitalicia
     */
    private String pensionRPM;

    /** Fecha de validación pensión Régimen Prima Media */
    private Date fechaValidacionPension;

    /**
     * Variable que almacena el resultado de la validación ejecutada por el servicio de NominaBeneficios para las solicitudes con
     * destinación de recusos Anualidad Vitalicia
     */
    private String indemnizadoRPM;

    /** Fecha de validación indemnización Régimen Prima Media */
    private Date fechaValidacionIndeminazado;
    
    /**
     * Variable que almacena el resultado de la validación al consultar en la base de datos local RAIS la pensión para las solicitudes con
     * destinación de recusos Anualidad Vitalicia
     */
    private String pensionRAIS;
    
    /** Fecha de validación Pensión RAIS */
    private Date fechaPensionRAIS;
    
    /**
     * Variable que almacena el resultado de la validación ejecutada por el servicio de Indicio Prestaciones para las solicitudes con
     * destinación de recusos Anualidad Vitalicia
     */
    private String prestacionOBP;

    /** Fecha de validación Indicio Pensional */
    private Date fechaPrestacionOBP;

    /** Constructor de la clase */
    public ValidacionAutomaticaDTO() {

    }

    /**
     * @return the idSolicitud
     */
    public Long getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * @param idSolicitud
     *            the idSolicitud to set
     */
    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    /**
     * @return the estadoFallecido
     */
    public String getEstadoFallecido() {
        return estadoFallecido;
    }

    /**
     * @param estadoFallecido
     *            the estadoFallecido to set
     */
    public void setEstadoFallecido(String estadoFallecido) {
        this.estadoFallecido = estadoFallecido;
    }

    /**
     * @return the edadGenero
     */
    public String getEdadGenero() {
        return edadGenero;
    }

    /**
     * @param edadGenero
     *            the edadGenero to set
     */
    public void setEdadGenero(String edadGenero) {
        this.edadGenero = edadGenero;
    }

    /**
     * @return the pensionRPM
     */
    public String getPensionRPM() {
        return pensionRPM;
    }

    /**
     * @param pensionRPM
     *            the pensionRPM to set
     */
    public void setPensionRPM(String pensionRPM) {
        this.pensionRPM = pensionRPM;
    }

    /**
     * @return the indemnizadoRPM
     */
    public String getIndemnizadoRPM() {
        return indemnizadoRPM;
    }

    /**
     * @param indemnizadoRPM
     *            the indemnizadoRPM to set
     */
    public void setIndemnizadoRPM(String indemnizadoRPM) {
        this.indemnizadoRPM = indemnizadoRPM;
    }

    /**
     * @param fechaCorte
     *            the fechaCorte to set
     */
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    /**
     * @param fechaValidacionEdadGenero
     *            the fechaValidacionEdadGenero to set
     */
    public void setFechaValidacionEdadGenero(Date fechaValidacionEdadGenero) {
        this.fechaValidacionEdadGenero = fechaValidacionEdadGenero;
    }

    /**
     * @param fechaValidacionPension
     *            the fechaValidacionPension to set
     */
    public void setFechaValidacionPension(Date fechaValidacionPension) {
        this.fechaValidacionPension = fechaValidacionPension;
    }

    /**
     * @param fechaValidacionIndeminazado
     *            the fechaValidacionIndeminazado to set
     */
    public void setFechaValidacionIndeminazado(Date fechaValidacionIndeminazado) {
        this.fechaValidacionIndeminazado = fechaValidacionIndeminazado;
    }

    /**
     * @return the fechaCorte
     */
    public Date getFechaCorte() {
        return fechaCorte;
    }

    /**
     * @return the fechaValidacionEdadGenero
     */
    public Date getFechaValidacionEdadGenero() {
        return fechaValidacionEdadGenero;
    }

    /**
     * @return the fechaValidacionPension
     */
    public Date getFechaValidacionPension() {
        return fechaValidacionPension;
    }

    /**
     * @return the fechaValidacionIndeminazado
     */
    public Date getFechaValidacionIndeminazado() {
        return fechaValidacionIndeminazado;
    }

    /**
     * Devuelve el valor de pensionRAIS
     * @return El valor de pensionRAIS
     */
    public String getPensionRAIS() {
        return pensionRAIS;
    }

    /**
     * Establece el valor de pensionRAIS
     * @param pensionRAIS El valor por establecer para pensionRAIS
     */
    public void setPensionRAIS(String pensionRAIS) {
        this.pensionRAIS = pensionRAIS;
    }

    /**
     * Devuelve el valor de fechaPensionRAIS
     * @return El valor de fechaPensionRAIS
     */
    public Date getFechaPensionRAIS() {
        return fechaPensionRAIS;
    }

    /**
     * Establece el valor de fechaPensionRAIS
     * @param fechaPensionRAIS El valor por establecer para fechaPensionRAIS
     */
    public void setFechaPensionRAIS(Date fechaPensionRAIS) {
        this.fechaPensionRAIS = fechaPensionRAIS;
    }

    /**
     * Devuelve el valor de prestacionOBP
     * @return El valor de prestacionOBP
     */
    public String getPrestacionOBP() {
        return prestacionOBP;
    }

    /**
     * Establece el valor de prestacionOBP
     * @param prestacionOBP El valor por establecer para prestacionOBP
     */
    public void setPrestacionOBP(String prestacionOBP) {
        this.prestacionOBP = prestacionOBP;
    }

    /**
     * Devuelve el valor de fechaPrestacionOBP
     * @return El valor de fechaPrestacionOBP
     */
    public Date getFechaPrestacionOBP() {
        return fechaPrestacionOBP;
    }

    /**
     * Establece el valor de fechaPrestacionOBP
     * @param fechaPrestacionOBP El valor por establecer para fechaPrestacionOBP
     */
    public void setFechaPrestacionOBP(Date fechaPrestacionOBP) {
        this.fechaPrestacionOBP = fechaPrestacionOBP;
    }

}
