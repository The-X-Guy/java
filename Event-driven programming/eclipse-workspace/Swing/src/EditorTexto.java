import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class EditorTexto {

	private JFrame frmEditorTexto;
	private JScrollPane scrollPane;
	private JMenu mnNewMenu;
	private JMenu mnEditar;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmGuardar;
	private JMenuItem mntmGuardarComo;
	private JMenuItem mntmImprimir;
	private JMenuItem mntmSalir;
	private JSeparator separator;
	private JSeparator separator_1;
	private JMenu mnAyuda;
	private JTextPane textPane;
	private String filename;
	private JMenuItem mntmColor;
	private JMenuItem mntmFuente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorTexto window = new EditorTexto();
					window.frmEditorTexto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditorTexto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditorTexto = new JFrame();
		frmEditorTexto.setTitle("Editor de texto");
		frmEditorTexto.setIconImage(Toolkit.getDefaultToolkit().getImage(EditorTexto.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		frmEditorTexto.setBounds(100, 100, 450, 300);
		frmEditorTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmEditorTexto.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmAbrir = new JMenuItem("Abrir...");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				String aux = "";
				String texto = "";
				try {
					fc.showOpenDialog(frmEditorTexto);
					File abrir = fc.getSelectedFile();
					
					filename = abrir.getName();
					
					if (abrir != null) {
						FileReader archivo = new FileReader(abrir);
						BufferedReader leer = new BufferedReader(archivo);
						while ((aux = leer.readLine()) != null) {
							texto += aux + "\n";
						}
						leer.close();
						archivo.close();
						textPane.setText(texto);
						frmEditorTexto.setTitle(filename);
					}
				} catch (IOException ex) {
					
				}
			}
		});
		mnNewMenu.add(mntmAbrir);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setIcon(new ImageIcon(EditorTexto.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mnNewMenu.add(mntmGuardar);
		
		mntmGuardarComo = new JMenuItem("Guardar como...");
		mnNewMenu.add(mntmGuardarComo);
		
		separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		mntmImprimir = new JMenuItem("Imprimir...");
		mnNewMenu.add(mntmImprimir);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmSalir);
		
		mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		mntmColor = new JMenuItem("Color...");
		mntmColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = JColorChooser.showDialog(menuBar, "Seleccione un color: ", Color.WHITE);
				textPane.setForeground(c);
				
			}
		});
		mnEditar.add(mntmColor);
		
		mntmFuente = new JMenuItem("Fuente...");
		mnEditar.add(mntmFuente);		
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		frmEditorTexto.getContentPane().setLayout(new BoxLayout(frmEditorTexto.getContentPane(), BoxLayout.X_AXIS));
		
		scrollPane = new JScrollPane();
		frmEditorTexto.getContentPane().add(scrollPane);
		
		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
	

}

