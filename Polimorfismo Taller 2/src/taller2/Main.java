package taller2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oracle orac = new Oracle();
		Postgres post = new Postgres();
		
		orac.conectar();
		post.conectar();
	}

}
