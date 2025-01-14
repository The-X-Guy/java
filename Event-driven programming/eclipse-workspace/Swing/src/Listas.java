import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollPane;

public class Listas {

	private JFrame frmEjemploUsoListas;

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
					Listas window = new Listas();
					window.frmEjemploUsoListas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Listas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploUsoListas = new JFrame();
		frmEjemploUsoListas.setTitle("Ejemplo uso listas");
		frmEjemploUsoListas.setBounds(100, 100, 447, 260);
		frmEjemploUsoListas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjemploUsoListas.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 42, 138, 130);
		frmEjemploUsoListas.getContentPane().add(scrollPane);
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblAficiones = new JLabel("Aficiones");
		lblAficiones.setBounds(12, 13, 138, 16);
		frmEjemploUsoListas.getContentPane().add(lblAficiones);
		
		JTextPane textPaneAficiones = new JTextPane();
		textPaneAficiones.setFont(new Font("Consolas", Font.BOLD, 14));
		textPaneAficiones.setBackground(SystemColor.menu);
		textPaneAficiones.setEditable(false);
		textPaneAficiones.setBounds(162, 62, 255, 113);
		frmEjemploUsoListas.getContentPane().add(textPaneAficiones);
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				List values = list.getSelectedValuesList();
				String str = "Elementos seleccionados: " + values.size() + ". ";
				for (int i = 0; i < values.size(); i++) {
					str += values.get(i).toString();
					if (i != values.size()-1) str += ", ";
					else str += ".";
				}
				textPaneAficiones.setText(str);
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cine", "Series", "Videojuegos", "Cosplay", "Deportes", "M\u00FAsica", "Viajes", "Cocina"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
	}
}
