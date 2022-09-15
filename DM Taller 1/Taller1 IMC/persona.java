
/**
 * @author estudiante
 *
 */
public class persona {
	
	/**
	 * @param peso
	 * @param altura
	 */
	
	public persona () {
		
	}

	public persona(float peso, float altura) {
		// TODO Auto-generated constructor stub
	}

	public float calcularIMC(float peso, float altura) {
		
		float IMC = peso/(altura*2);
		return IMC;
		
	}
	
	public float peso;
	public float altura;
}
