import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParImpar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearInterfaz();
            }
        });
    }

    public static void crearInterfaz() {
        JFrame frame = new JFrame("Par o Impar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel etiqueta = new JLabel("Ingrese un número:");
        JTextField campoDeTexto = new JTextField(10);
        JButton boton = new JButton("Verificar");

        panel.add(etiqueta);
        panel.add(campoDeTexto);
        panel.add(boton);

        JLabel resultado = new JLabel();

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(campoDeTexto.getText());
                    if (numero % 2 == 0) {
                        resultado.setText("El número " + numero + " es PAR.");
                    } else {
                        resultado.setText("El número " + numero + " es IMPAR.");
                    }
                } catch (NumberFormatException ex) {
                    resultado.setText("Ingrese un número válido.");
                }
            }
        });

        panel.add(resultado);

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}





