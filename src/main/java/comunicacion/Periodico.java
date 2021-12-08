package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;

	public Periodico(String origen, String titulo, String autor, int paginas,
			String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
		this.setFecha(fecha);
		this.setPrimicia(primicia);
		this.setInterpretacion(interpretacion);
	}

	public String getFecha() {
		return fecha;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}	

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return getPaginas() * palabrasPagina * 10;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" +
				this.fecha + "\n" + this.primicia;
	}

}