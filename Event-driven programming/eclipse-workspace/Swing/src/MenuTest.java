import java.awt.EventQueue;
import javax.swing.UIManager;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuTest {

	private JFrame frmEjemploUsoMenu;

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
					MenuTest window = new MenuTest();
					window.frmEjemploUsoMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploUsoMenu = new JFrame();
		frmEjemploUsoMenu.setTitle("Ejemplo uso menu");
		frmEjemploUsoMenu.setBounds(100, 100, 450, 300);
		frmEjemploUsoMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmEjemploUsoMenu.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpenFile = new JMenuItem("Open file...");
		mnFile.add(mntmOpenFile);
		
		JMenuItem mntmSaveFile = new JMenuItem("Save");
		mntmSaveFile.setIcon(new ImageIcon(MenuTest.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmSaveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
		mnFile.add(mntmSaveFile);
		
		JMenuItem mntmSaveAsFile = new JMenuItem("Save as...");
		mnFile.add(mntmSaveAsFile);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmPrintFile = new JMenuItem("Print...");
		mnFile.add(mntmPrintFile);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmExitFile = new JMenuItem("Exit");
		mntmExitFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmExitFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExitFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(frmEjemploUsoMenu.getContentPane(), popupMenu);
		
		JMenuItem mntmRojo = new JMenuItem("Rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEjemploUsoMenu.getContentPane().setBackground(Color.RED);
			}
		});
		popupMenu.add(mntmRojo);
		
		JMenuItem mntmVerde = new JMenuItem("Verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEjemploUsoMenu.getContentPane().setBackground(Color.GREEN);
			}
		});
		popupMenu.add(mntmVerde);
		
		JMenuItem mntmAzul = new JMenuItem("Azul");
		mntmAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEjemploUsoMenu.getContentPane().setBackground(Color.BLUE);
			}
		});
		popupMenu.add(mntmAzul);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

