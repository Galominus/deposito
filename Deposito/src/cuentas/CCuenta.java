package cuentas;

/**
 * Clase para represntar una cuenta bancaria.
 * 
 * @author Héctor Galindo
 */

public class CCuenta {

	// Atributos de la cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Devuelve el nombre del titular de la cuenta
     * 
	 * @return El nombre del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular de la cuenta.
	 * 
	 * @param nombre El nombre del titular.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de cuenta.
	 * 
	 * @return El número de cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el número de cuenta.
	 * 
	 * @param cuenta El número de cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo actual de la cuenta.
	 * 
	 * @return El saldo de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta.
	 * 
	 * @param saldo El saldo de la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interés de la cuenta.
	 * 
	 * @return el tipo de interés.
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Establece el tipo de interés de la cuenta.
	 * 
	 * @param tipoInteres El tipo de interés.
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
/**
 * Constructor vacío para la cuenta.
 */
	public CCuenta(){
		//No se requiere ninguna inicialización adicional.
    }
	
/**
 * Constructor para la cuenta.
 * 
 * @param nom Nombre del titular.
 * @param cue Número de cuenta.
 * @param sal Saldo inicial.
 * @param tipo Tipo de interés.
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
/**
 * Devuelve el estado de la cuenta
 * @return saldo de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Ingresa una cantidad en la cuenta.
 * 
 * @param cantidad Cantidad a ingresar.
 * @throws Exception Si la cantidad es negativa.
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Retira una cantidad de la cuenta.
 * 
 * @param cantidad Cantidad a retirar.
 * @throws Exception Si la cantidad es cero, negativa o no hay suficiente saldo.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
