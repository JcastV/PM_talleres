package taller2;

public class Postgres extends BDatos{

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		super.consultar();
		System.out.println("Esta consultando en la base de datos postgres");
	}

	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		super.insertar();
		System.out.println("Esta insetando en la base de datos postgres");
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		super.eliminar();
		System.out.println("Esta eliminando en la base de datos postgres");
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		super.conectar();
		System.out.println("Se ha conectado a la base de datos postgres");
	}


}
