import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dialogos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dialogos window = new Dialogos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dialogos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMensaje = new JLabel("Selecciona una opci�n.");
		
		JButton btnInfo = new JButton("Informaci\u00F3n");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Mensaje de informaci�n.");
			}
		});
		
		JButton btnConf = new JButton("Confirmaci\u00F3n");
		btnConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(frame, "�Quieres destruir el mundo?", "Una decisi�n vital.", JOptionPane.YES_NO_CANCEL_OPTION);
				switch (n) {
					case JOptionPane.YES_OPTION:
						lblMensaje.setText("Bomba at�mica lanzada.");
						break;
					case JOptionPane.NO_OPTION:
						lblMensaje.setText("La mejor opci�n.");
						break;
					case JOptionPane.CANCEL_OPTION:
						lblMensaje.setText("Quiz�s en otro momento.");
						break;
					default:
						lblMensaje.setText("Operaci�n abortada");
				}
			}
		});
		
		JButton btn = new JButton("3 botones");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] option = {"S�, quiero.", "No, mala idea", "No s�"};
				int n = JOptionPane.showOptionDialog(
						frame, 
						"�Quieres destruir el mundo?", 
						"Una decisi�n vital.",  
						JOptionPane.YES_NO_CANCEL_OPTION, 
						JOptionPane.QUESTION_MESSAGE,
						null, 
						option, 
						option[0]
				);
				switch (n) {
				case JOptionPane.YES_OPTION:
					lblMensaje.setText("Bomba at�mica lanzada.");
					break;
				case JOptionPane.NO_OPTION:
					lblMensaje.setText("La mejor opci�n.");
					break;
				case JOptionPane.CANCEL_OPTION:
					lblMensaje.setText("Quiz�s en otro momento.");
					break;
				default:
					lblMensaje.setText("Operaci�n abortada");
				}
			}
		});
		
		JButton btnLista = new JButton("Lista");
		btnLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon("src/volcano.jpeg");
				Object[] posibilidades = {"Meteorito", "Plaga", "Invasi�n"};
				String cadena = (String)JOptionPane.showInputDialog(
						frame, 
						"Tipos de ataque.", 
						"�C�mo quieres destruir el mundo?", 
						JOptionPane.PLAIN_MESSAGE, 
						icono, 
						posibilidades, 
						posibilidades[0]
				);
				if((cadena != null)&&(cadena.length()>0)) {
					lblMensaje.setText("Destrucci�n con " + cadena + ".");
				}
			}
		});
		
		JButton btnInput = new JButton("Input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = JOptionPane.showInputDialog(frame, "Introduce texto: ");
				if((cadena != null)&&(cadena.length()>0)) {
					lblMensaje.setText(cadena);
				}
			}
		});
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(frame, "�Quieres salir?", "Salida.", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnInput)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnLista)
								.addComponent(btn)
								.addComponent(btnConf, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(121)
							.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
					.addGap(43))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(145, Short.MAX_VALUE)
					.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addGap(98))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnInfo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnConf)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLista)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnInput))
						.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMensaje)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
