package es.studium.practicatema4di;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.BoxLayout;

public class VistaMenu
{
	Frame frmMenu = new Frame("Menú Principal");

	MenuBar mnBar = new MenuBar();

	Menu mnuArticulos = new Menu("Artículos");
	MenuItem mniAltaArticulo = new MenuItem("Alta");
	MenuItem mniBajaArticulo = new MenuItem("Baja");
	MenuItem mniModificacionArticulo = new MenuItem("Modificación");
	MenuItem mniConsultaArticulo = new MenuItem("Consulta");

	Menu mnuTickets = new Menu("Tickets");
	MenuItem mniAltaTicket = new MenuItem("Alta");
	MenuItem mniConsultaTicket = new MenuItem("Consulta");	
	
	public VistaMenu()
	{
		frmMenu.setLayout(new BoxLayout(frmMenu, BoxLayout.Y_AXIS));            
		frmMenu.setTitle("Menú Principal");
		frmMenu.setMenuBar(mnBar);
		mnBar.add(mnuArticulos);
		
		mnuArticulos.add(mniAltaArticulo);
		mnuArticulos.add(mniBajaArticulo);
		mnuArticulos.add(mniModificacionArticulo);
		mnuArticulos.add(mniConsultaArticulo);
		
		mnBar.add(mnuTickets);
		
		mnuTickets.add(mniAltaTicket);
		mnuTickets.add(mniConsultaTicket);
		
		frmMenu.setResizable(false);
		frmMenu.setSize(400, 200); 
		frmMenu.setVisible(true);
	}
}
