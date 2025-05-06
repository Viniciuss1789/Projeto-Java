package exemplos;

import javax.swing.*;

public class FirstSwingExample {

	public static void main(String[] args) {

		JFrame quadro = new JFrame();

		JButton botao = new JButton("Clique Aqui");

		botao.setBounds(130, 100, 100, 40);

		quadro.add(botao);

		quadro.setSize(400, 500);

		quadro.setLayout(null);

		quadro.setVisible(true);
	}
}