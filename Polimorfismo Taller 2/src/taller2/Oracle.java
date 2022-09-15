package taller2;

public class Oracle extends BDatos{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		super.conectar();
		System.out.println("Se ha conectado a la base de datos Oracle");
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		super.consultar();
		System.out.println("Consultar en Oracle");
	}

	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		super.insertar();
		System.out.println("Insertar en Oracle");
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		super.eliminar();
		System.out.println("Eliminacion en Oracle");
	}


}
