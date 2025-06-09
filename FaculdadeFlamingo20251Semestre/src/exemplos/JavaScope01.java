package exemplos;

public class JavaScope01 {

	public static void main(String[] args) {

		float salario = 1900;
		float salarioFinal = 0;

		if (salario < 2000) {
			float reajuste = salario * 10 / 100;
			salarioFinal = salario + reajuste;
		} else {
			salarioFinal = salario;
		}

		System.out.println("Salário final: " + salarioFinal);
	}
}
