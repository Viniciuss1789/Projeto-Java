package exemplos;

import java.awt.*;

public class AWTExemple1 extends Frame {

	AWTExemple1() {

		Button b = new Button("Aperta ai mano");

		b.setBounds(30, 100, 80, 30);

		add(b);

		setSize(300, 300);

		setTitle("This is our basic AWT example");

		setLayout(null);

		setVisible(true);
	}

	public static void main(String args[]) {

		AWTExemple1 f = new AWTExemple1();
	}
}
