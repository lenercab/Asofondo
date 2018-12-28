package co.gov.colpensiones.beps.certificados.businesslogic.comun;

/**
 *  
 * <b>Descripcion:</b> Clase que sirve para almacenar la información de los movimientos para el reporte de certificados<br/>
 * <b>Caso de Uso:</b> FAB-04-GenerarCertificadoVinculadoConMovimientos <br/>
 * 
 * @author arrios <arrios@heinsohn.com.co>
 */
public class MovimientoDTO implements Comparable<MovimientoDTO> {

	/** Corresponde a los valores parametrizados */
	private String origen;
	/** Fecha en la que se realiza el movimiento */
	private String fechaMovimiento;
	/** De acuerdo a los conceptos parametrizados */
	private String tipoMovimiento;
	/** Corresponde al valor del movimiento */
	private String valor;

	/**
	 * contructor por defecto
	 */
	public MovimientoDTO() {
	}

	/**
	 * Devuelve el valor de origen
	 * 
	 * @return El valor de origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Establece el valor de origen
	 * 
	 * @param origen
	 *            El valor por establecer para origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Devuelve el valor de fechaMovimiento
	 * 
	 * @return El valor de fechaMovimiento
	 */
	public String getFechaMovimiento() {
		return fechaMovimiento;
	}

	/**
	 * Establece el valor de fechaMovimiento
	 * 
	 * @param fechaMovimiento
	 *            El valor por establecer para fechaMovimiento
	 */
	public void setFechaMovimiento(String fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	/**
	 * Devuelve el valor de tipoMovimiento
	 * 
	 * @return El valor de tipoMovimiento
	 */
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	/**
	 * Establece el valor de tipoMovimiento
	 * 
	 * @param tipoMovimiento
	 *            El valor por establecer para tipoMovimiento
	 */
	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	/**
	 * Devuelve el valor de valor
	 * 
	 * @return El valor de valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Establece el valor de valor
	 * 
	 * @param valor
	 *            El valor por establecer para valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * Sobre escribe el método, para poder ordenarlo.
	 */
	@Override
	public int compareTo(MovimientoDTO arg0) {
		return fechaMovimiento.compareTo(arg0.getFechaMovimiento());
	}

}
