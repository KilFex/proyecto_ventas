package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class menu_principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnNewMenu_5;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenu mnNewMenu_6;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenu mnNewMenu_7;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenu mnNewMenu_8;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_principal frame = new menu_principal();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 659, 22);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu);
		
		mnNewMenu_4 = new JMenu("Ingreso");
		mnNewMenu.add(mnNewMenu_4);
		
		mntmNewMenuItem = new JMenuItem("Cliente");
		mnNewMenu_4.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Producto");
		mnNewMenu_4.add(mntmNewMenuItem_1);
		
		mnNewMenu_5 = new JMenu("Modificacion");
		mnNewMenu.add(mnNewMenu_5);
		
		mntmNewMenuItem_2 = new JMenuItem("Cliente");
		mnNewMenu_5.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Prodcuto");
		mnNewMenu_5.add(mntmNewMenuItem_3);
		
		mnNewMenu_6 = new JMenu("Consulta");
		mnNewMenu.add(mnNewMenu_6);
		
		mntmNewMenuItem_4 = new JMenuItem("Cliente");
		mnNewMenu_6.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Producto");
		mnNewMenu_6.add(mntmNewMenuItem_5);
		
		mnNewMenu_7 = new JMenu("Eliminacion");
		mnNewMenu.add(mnNewMenu_7);
		
		mntmNewMenuItem_6 = new JMenuItem("Cliente");
		mnNewMenu_7.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Producto");
		mnNewMenu_7.add(mntmNewMenuItem_7);
		
		mnNewMenu_8 = new JMenu("Listado");
		mnNewMenu.add(mnNewMenu_8);
		
		mntmNewMenuItem_8 = new JMenuItem("Cliente");
		mnNewMenu_8.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_9 = new JMenuItem("Producto");
		mnNewMenu_8.add(mntmNewMenuItem_9);
		
		mnNewMenu_1 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("Almacen");
		menuBar.add(mnNewMenu_2);
		
		mnNewMenu_3 = new JMenu("Reportes");
		menuBar.add(mnNewMenu_3);
	}
}
