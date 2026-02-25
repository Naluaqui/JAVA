package sala;

public class Teste {

	public static void main(String[] args) {


		Pessoa ana = new Pessoa();
		ana.nome = "Ana";
		ana.idade = 19;
		ana.sexo = "F";
		ana.altura = 1.61f;
		ana.peso = 60;
		ana.comer();
		ana.estudar();
		ana.dormir();

		Pessoa luiza = new Pessoa();
		luiza.nome = "Luiza";
		luiza.idade = 20;
		luiza.sexo = "F";
		luiza.altura = 1.65f;
		luiza.peso = 70;
		luiza.comer();
		luiza.estudar();
		luiza.dormir();
	}

}
