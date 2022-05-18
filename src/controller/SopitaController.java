package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import application.Sopita;
import javafx.animation.ScaleTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class SopitaController implements Initializable
{

	@ FXML
	private Button bt00;

	@ FXML
	private Button bt01;

	@ FXML
	private Button bt02;

	@ FXML
	private Button bt03;

	@ FXML
	private Button bt04;

	@ FXML
	private Button bt05;

	@ FXML
	private Button bt06;

	@ FXML
	private Button bt07;

	@ FXML
	private Button bt08;

	@ FXML
	private Button bt09;

	@ FXML
	private Button bt10;

	@ FXML
	private Button bt11;

	@ FXML
	private Button bt12;

	@ FXML
	private Button bt13;

	@ FXML
	private Button bt14;

	@ FXML
	private Button bt15;

	@ FXML
	private Button bt16;

	@ FXML
	private Button bt17;

	@ FXML
	private Button bt18;

	@ FXML
	private Button bt19;

	@ FXML
	private Button bt20;

	@ FXML
	private Button bt21;

	@ FXML
	private Button bt22;

	@ FXML
	private Button bt23;

	@ FXML
	private Button bt24;

	@ FXML
	private Button bt25;

	@ FXML
	private Button bt26;

	@ FXML
	private Button bt27;

	@ FXML
	private Button bt28;

	@ FXML
	private Button bt29;

	@ FXML
	private Button bt30;

	@ FXML
	private Button bt31;

	@ FXML
	private Button bt32;

	@ FXML
	private Button bt33;

	@ FXML
	private Button bt34;

	@ FXML
	private Button bt35;

	@ FXML
	private Button bt36;

	@ FXML
	private Button bt37;

	@ FXML
	private Button bt38;

	@ FXML
	private Button bt39;

	@ FXML
	private Button bt40;

	@ FXML
	private Button bt41;

	@ FXML
	private Button bt42;

	@ FXML
	private Button bt43;

	@ FXML
	private Button bt44;

	@ FXML
	private Button bt45;

	@ FXML
	private Button bt46;

	@ FXML
	private Button bt47;

	@ FXML
	private Button bt48;

	@ FXML
	private Button bt49;

	@ FXML
	private Button bt50;

	@ FXML
	private Button bt51;

	@ FXML
	private Button bt52;

	@ FXML
	private Button bt53;

	@ FXML
	private Button bt54;

	@ FXML
	private Button bt55;

	@ FXML
	private Button bt56;

	@ FXML
	private Button bt57;

	@ FXML
	private Button bt58;

	@ FXML
	private Button bt59;

	@ FXML
	private Button bt60;

	@ FXML
	private Button bt61;

	@ FXML
	private Button bt62;

	@ FXML
	private Button bt63;

	@ FXML
	private Button bt64;

	@ FXML
	private Button bt65;

	@ FXML
	private Button bt66;

	@ FXML
	private Button bt67;

	@ FXML
	private Button bt68;

	@ FXML
	private Button bt69;

	@ FXML
	private Button bt70;

	@ FXML
	private Button bt71;

	@ FXML
	private Button bt72;

	@ FXML
	private Button bt73;

	@ FXML
	private Button bt74;

	@ FXML
	private Button bt75;

	@ FXML
	private Button bt76;

	@ FXML
	private Button bt77;

	@ FXML
	private Button bt78;

	@ FXML
	private Button bt79;

	@ FXML
	private Button bt80;

	@ FXML
	private Button bt81;

	@ FXML
	private Button bt82;

	@ FXML
	private Button bt83;

	@ FXML
	private Button bt84;

	@ FXML
	private Button bt85;

	@ FXML
	private Button bt86;

	@ FXML
	private Button bt87;

	@ FXML
	private Button bt88;

	@ FXML
	private Button bt89;

	@ FXML
	private Button bt90;

	@ FXML
	private Button bt91;

	@ FXML
	private Button bt92;

	@ FXML
	private Button bt93;

	@ FXML
	private Button bt94;

	@ FXML
	private Button bt95;

	@ FXML
	private Button bt96;

	@ FXML
	private Button bt97;

	@ FXML
	private Button bt98;

	@ FXML
	private Button bt99; // ._.

	@ FXML
	private Label lblBtWord;

	@ FXML
	private ListView<String> listViewPal;

	private ObservableList<String> listPal;

	@ FXML
	private ImageView imgView;

	@ FXML
	private ProgressBar progressBar;

	// Cargamos la imagen del fondo
	private Image imagen = new Image(getClass().getResourceAsStream(
			"/res/img/background_2.jpeg"));
	private ArrayList<Button> buttons = new ArrayList<>();
	private Sopita sopita = new Sopita();
	private String word = "", palabrita = "";

	//

	@ FXML
	void bt00 ( ActionEvent event )
	{
		word(0);
	}

	@ FXML
	void bt01 ( ActionEvent event )
	{
		word(1);
	}

	@ FXML
	void bt02 ( ActionEvent event )
	{
		word(2);
	}

	@ FXML
	void bt03 ( ActionEvent event )
	{
		word(3);
	}

	@ FXML
	void bt04 ( ActionEvent event )
	{
		word(4);
	}

	@ FXML
	void bt05 ( ActionEvent event )
	{
		word(5);
	}

	@ FXML
	void bt06 ( ActionEvent event )
	{
		word(6);
	}

	@ FXML
	void bt07 ( ActionEvent event )
	{
		word(7);
	}

	@ FXML
	void bt08 ( ActionEvent event )
	{
		word(8);
	}

	@ FXML
	void bt09 ( ActionEvent event )
	{
		word(9);
	}

	@ FXML
	void bt10 ( ActionEvent event )
	{
		word(10);
	}

	@ FXML
	void bt11 ( ActionEvent event )
	{
		word(11);
	}

	@ FXML
	void bt12 ( ActionEvent event )
	{
		word(12);
	}

	@ FXML
	void bt13 ( ActionEvent event )
	{
		word(13);
	}

	@ FXML
	void bt14 ( ActionEvent event )
	{
		word(14);
	}

	@ FXML
	void bt15 ( ActionEvent event )
	{
		word(15);
	}

	@ FXML
	void bt16 ( ActionEvent event )
	{
		word(16);
	}

	@ FXML
	void bt17 ( ActionEvent event )
	{
		word(17);
	}

	@ FXML
	void bt18 ( ActionEvent event )
	{
		word(18);
	}

	@ FXML
	void bt19 ( ActionEvent event )
	{
		word(19);
	}

	@ FXML
	void bt20 ( ActionEvent event )
	{
		word(20);
	}

	@ FXML
	void bt21 ( ActionEvent event )
	{
		word(21);
	}

	@ FXML
	void bt22 ( ActionEvent event )
	{
		word(22);
	}

	@ FXML
	void bt23 ( ActionEvent event )
	{
		word(23);
	}

	@ FXML
	void bt24 ( ActionEvent event )
	{
		word(24);
	}

	@ FXML
	void bt25 ( ActionEvent event )
	{
		word(25);
	}

	@ FXML
	void bt26 ( ActionEvent event )
	{
		word(26);
	}

	@ FXML
	void bt27 ( ActionEvent event )
	{
		word(27);
	}

	@ FXML
	void bt28 ( ActionEvent event )
	{
		word(28);
	}

	@ FXML
	void bt29 ( ActionEvent event )
	{
		word(29);
	}

	@ FXML
	void bt30 ( ActionEvent event )
	{
		word(30);
	}

	@ FXML
	void bt31 ( ActionEvent event )
	{
		word(31);
	}

	@ FXML
	void bt32 ( ActionEvent event )
	{
		word(32);
	}

	@ FXML
	void bt33 ( ActionEvent event )
	{
		word(33);
	}

	@ FXML
	void bt34 ( ActionEvent event )
	{
		word(34);
	}

	@ FXML
	void bt35 ( ActionEvent event )
	{
		word(35);
	}

	@ FXML
	void bt36 ( ActionEvent event )
	{
		word(36);
	}

	@ FXML
	void bt37 ( ActionEvent event )
	{
		word(37);
	}

	@ FXML
	void bt38 ( ActionEvent event )
	{
		word(38);
	}

	@ FXML
	void bt39 ( ActionEvent event )
	{
		word(39);
	}

	@ FXML
	void bt40 ( ActionEvent event )
	{
		word(40);
	}

	@ FXML
	void bt41 ( ActionEvent event )
	{
		word(41);
	}

	@ FXML
	void bt42 ( ActionEvent event )
	{
		word(42);
	}

	@ FXML
	void bt43 ( ActionEvent event )
	{
		word(43);
	}

	@ FXML
	void bt44 ( ActionEvent event )
	{
		word(44);
	}

	@ FXML
	void bt45 ( ActionEvent event )
	{
		word(45);
	}

	@ FXML
	void bt46 ( ActionEvent event )
	{
		word(46);
	}

	@ FXML
	void bt47 ( ActionEvent event )
	{
		word(47);
	}

	@ FXML
	void bt48 ( ActionEvent event )
	{
		word(48);
	}

	@ FXML
	void bt49 ( ActionEvent event )
	{
		word(49);
	}

	@ FXML
	void bt50 ( ActionEvent event )
	{
		word(50);
	}

	@ FXML
	void bt51 ( ActionEvent event )
	{
		word(51);
	}

	@ FXML
	void bt52 ( ActionEvent event )
	{
		word(52);
	}

	@ FXML
	void bt53 ( ActionEvent event )
	{
		word(53);
	}

	@ FXML
	void bt54 ( ActionEvent event )
	{
		word(54);
	}

	@ FXML
	void bt55 ( ActionEvent event )
	{
		word(55);
	}

	@ FXML
	void bt56 ( ActionEvent event )
	{
		word(56);
	}

	@ FXML
	void bt57 ( ActionEvent event )
	{
		word(57);
	}

	@ FXML
	void bt58 ( ActionEvent event )
	{
		word(58);
	}

	@ FXML
	void bt59 ( ActionEvent event )
	{
		word(59);

	}

	@ FXML
	void bt60 ( ActionEvent event )
	{
		word(60);
	}

	@ FXML
	void bt61 ( ActionEvent event )
	{
		word(61);
	}

	@ FXML
	void bt62 ( ActionEvent event )
	{
		word(62);
	}

	@ FXML
	void bt63 ( ActionEvent event )
	{
		word(63);
	}

	@ FXML
	void bt64 ( ActionEvent event )
	{
		word(64);

	}

	@ FXML
	void bt65 ( ActionEvent event )
	{
		word(65);
	}

	@ FXML
	void bt66 ( ActionEvent event )
	{
		word(66);
	}

	@ FXML
	void bt67 ( ActionEvent event )
	{
		word(67);
	}

	@ FXML
	void bt68 ( ActionEvent event )
	{
		word(68);
	}

	@ FXML
	void bt69 ( ActionEvent event )
	{
		word(69);
	}

	@ FXML
	void bt70 ( ActionEvent event )
	{
		word(70);
	}

	@ FXML
	void bt71 ( ActionEvent event )
	{
		word(71);
	}

	@ FXML
	void bt72 ( ActionEvent event )
	{
		word(72);
	}

	@ FXML
	void bt73 ( ActionEvent event )
	{
		word(73);
	}

	@ FXML
	void bt74 ( ActionEvent event )
	{
		word(74);
	}

	@ FXML
	void bt75 ( ActionEvent event )
	{
		word(75);
	}

	@ FXML
	void bt76 ( ActionEvent event )
	{
		word(76);
	}

	@ FXML
	void bt77 ( ActionEvent event )
	{
		word(77);
	}

	@ FXML
	void bt78 ( ActionEvent event )
	{
		word(78);
	}

	@ FXML
	void bt79 ( ActionEvent event )
	{
		word(79);
	}

	// delete
	@ FXML
	void bt80 ( ActionEvent event )
	{
		word(80);
	}

	@ FXML
	void bt81 ( ActionEvent event )
	{
		word(81);
	}

	@ FXML
	void bt82 ( ActionEvent event )
	{
		word(82);
	}

	@ FXML
	void bt83 ( ActionEvent event )
	{
		word(83);
	}

	@ FXML
	void bt84 ( ActionEvent event )
	{
		word(84);
	}

	@ FXML
	void bt85 ( ActionEvent event )
	{
		word(85);
	}

	@ FXML
	void bt86 ( ActionEvent event )
	{
		word(86);
	}

	@ FXML
	void bt87 ( ActionEvent event )
	{
		word(87);
	}

	@ FXML
	void bt88 ( ActionEvent event )
	{
		word(88);
	}

	@ FXML
	void bt89 ( ActionEvent event )
	{
		word(89);
	}

	@ FXML
	void bt90 ( ActionEvent event )
	{
		word(90);
	}

	@ FXML
	void bt91 ( ActionEvent event )
	{
		word(91);
	}

	@ FXML
	void bt92 ( ActionEvent event )
	{
		word(92);
	}

	@ FXML
	void bt93 ( ActionEvent event )
	{
		word(93);
	}

	@ FXML
	void bt94 ( ActionEvent event )
	{
		word(94);
	}

	@ FXML
	void bt95 ( ActionEvent event )
	{
		word(95);
	}

	@ FXML
	void bt96 ( ActionEvent event )
	{
		word(96);
	}

	@ FXML
	void bt97 ( ActionEvent event )
	{
		word(97);
	}

	@ FXML
	void bt98 ( ActionEvent event )
	{
		word(98);
	}

	@ FXML
	void bt99 ( ActionEvent event )
	{
		word(99);
	}

	// Metodo para poner vacio la etique donde va la palabra
	@ FXML
	void delWord ()
	{
		word = "";
		lblBtWord.setText(word);
		palabrita = word;
	}

	// Metodo para cargar la sopa de letras de la clase Sopita, a la matriz de
	// botones
	private void loadSopita ()
	{
		for ( int i = 0; i < sopita.getSize(); i++ )
		{
			for ( int j = 0; j < sopita.getSize(); j++ )
			{
				buttons	.get(j + i * sopita.getSize())
						.setText(String.valueOf(sopita.getSopitaIndex(i, j)));
			}
		}
	}

	private int palabritasE = 0;
	private double progress = 0.0;

	// Metodo para que al presionar el boton de buscar se compare si la palabra
	// ingresada es valida mediante el metodo de backtraking para posteriormente
	// ponerla en la lista, y si se encuentra borrar el contenido de la
	// etiqueta, pintar la palabra y avanzar en la barra de progreso, con sus
	// respectivos metodos.
	@ FXML
	void buscarPalabrita ( ActionEvent e )
	{
		if ( !palabrita.isEmpty() )
		{
			String arreglo[] = sopita.getPalabritas();

			for ( int i = 0; i < arreglo.length; i++ )
			{
				if ( palabrita.equals(arreglo[i]) )
				{
					listPal.add(word);
					listViewPal.setItems(listPal);

					boolean si = sopita.buscarPalabra(palabrita, sopita.getSize() - 1,
							sopita.getSize() - 1, 0);
					if ( si )
					{
						delWord();
						pintarPalabrita();
						progreso();
					}
				}
			}
		}
	}
	// x_x

	// Metodo donde integramos la barra de progreso, y va avanzando.
	private void progreso ()
	{
		barAnimation();
		progress = (double) palabritasE / sopita.getPalabritas().length;
		progressBar.setProgress(progress);

		if ( palabritasE == sopita.getPalabritas().length )
		{
			lblTopText.setText("COMPLETADO");
			lblTopText.setStyle("-fx-text-fill: #b95eff; -fx-border-color: #b95eff");
		}
	}

	// Metodo para hacer la animacion de la barra de progreso
	private void barAnimation ()
	{
		ScaleTransition scale = new ScaleTransition();
		scale.setNode(progressBar);
		scale.setAutoReverse(true);
		scale.setDuration(Duration.millis(200));
		scale.setCycleCount(2);
		scale.setByX(0.1);
		scale.setByY(0.1);
		scale.play();
	}

	// Metodo para hacer la animacion al encontrar una palabra
	private void animation ( int i )
	{
		ScaleTransition scale = new ScaleTransition();
		scale.setNode(buttons.get((int) (sopita.getCoords().get(i).getY()
				+ sopita.getCoords().get(i).getX() * 10)));
		scale.setAutoReverse(true);
		scale.setDuration(Duration.millis(300));
		scale.setCycleCount(2);
		scale.setByX(0.2);
		scale.setByY(0.2);
		scale.play();
	}

	@ FXML
	private Button btBuscar;
	@ FXML
	private Button btBorrar;
	@ FXML
	private Button btPista;

	private Node boton = null;

	// Metodo que verifica si el mouse esta encima de uno de los botones
	@ FXML
	void mouseEntered ( MouseEvent e )
	{
		if ( btBuscar.isHover() )
		{
			boton = btBuscar;
		} else if ( btBorrar.isHover() )
		{
			boton = btBorrar;
		} else if ( btPista.isHover() )
		{
			boton = btPista;
		}
	}

	@ FXML
	void mouseExited ( MouseEvent e )
	{
	}

	// Metodo para ver si el boton esta presionado
	@ FXML
	void mousePressed ( MouseEvent e )
	{
		if ( boton != null )
		{
			boton.setStyle("-fx-border-color: black; -fx-text-fill: black;");
		}
	}

	// Metodo para ver si el boton se ha dejado de presionar
	@ FXML
	void mouseReleased ( MouseEvent e )
	{
		if ( boton != null )
		{
			boton.setStyle("-fx-border-color: white; -fx-text-fill: white;");
		}
	}

	// Arreglo con los colores para pintar las palabras encontradas
	private String[] color =
	{ "dd52f2", "b64fff", "754fff", "524fff", "699dff", "e643b7", "e01653", "5ad5fa", "eb3e17",
			"55edbb" };

	// Metodo para pintar las palabras y al hacerlo ejecutar la animacion
	private void pintarPalabrita ()
	{
		palabritasE++;
		for ( int i = 0; i < sopita.getCoords().size(); i++ )
		{
			buttons	.get((int) (sopita.getCoords().get(i).getY()
							+ sopita.getCoords().get(i).getX() * 10))
					.setStyle("-fx-background-color: #" + getColorInd(palabritasE - 1)
							+ "; -fx-text-fill: #ffffff;");

			animation(i);
		}
	}

	// Metodo para ir desplazando los colores.
	private String getColorInd ( int e )
	{
		return color[e];
	}

	// Metodo para poner el texto en la etiqueta y se va formando una palabra
	// segun los botones presionados y llenando una variable palabrita con la
	// palabra formada.
	private void word ( int ind )
	{
		word += buttons.get(ind).getText();
		lblBtWord.setText(word);
		palabrita = word;
	}

	@ FXML
	private Label lblTopText;

	// Metodo para dar una pista de una palabra si esta palabra no se encuentra
	// todavia en el listview con las palabras encontradas
	@ FXML
	void hint ( ActionEvent e )
	{

		for ( int i = 0; i < sopita.getPalabritas().length; i++ )
		{
			if ( !(listViewPal.getItems().toString().contains(sopita.getPalabritas()[i])) )
			{
				lblTopText.setText(sopita.getPalabritas()[i]);
			}
		}
	}

	// Metodo para añadir al array de botones los botones
	private void setButtons ()
	{
		buttons.add(bt00);
		buttons.add(bt01);
		buttons.add(bt02);
		buttons.add(bt03);
		buttons.add(bt04);
		buttons.add(bt05);
		buttons.add(bt06);
		buttons.add(bt07);
		buttons.add(bt08);
		buttons.add(bt09);
		buttons.add(bt10);
		buttons.add(bt11);
		buttons.add(bt12);
		buttons.add(bt13);
		buttons.add(bt14);
		buttons.add(bt15);
		buttons.add(bt16);
		buttons.add(bt17);
		buttons.add(bt18);
		buttons.add(bt19);
		buttons.add(bt20);
		buttons.add(bt21);
		buttons.add(bt22);
		buttons.add(bt23);
		buttons.add(bt24);
		buttons.add(bt25);
		buttons.add(bt26);
		buttons.add(bt27);
		buttons.add(bt28);
		buttons.add(bt29);
		buttons.add(bt30);
		buttons.add(bt31);
		buttons.add(bt32);
		buttons.add(bt33);
		buttons.add(bt34);
		buttons.add(bt35);
		buttons.add(bt36);
		buttons.add(bt37);
		buttons.add(bt38);
		buttons.add(bt39);
		buttons.add(bt40);
		buttons.add(bt41);
		buttons.add(bt42);
		buttons.add(bt43);
		buttons.add(bt44);
		buttons.add(bt45);
		buttons.add(bt46);
		buttons.add(bt47);
		buttons.add(bt48);
		buttons.add(bt49);
		buttons.add(bt50);
		buttons.add(bt51);
		buttons.add(bt52);
		buttons.add(bt53);
		buttons.add(bt54);
		buttons.add(bt55);
		buttons.add(bt56);
		buttons.add(bt57);
		buttons.add(bt58);
		buttons.add(bt59);
		buttons.add(bt60);
		buttons.add(bt61);
		buttons.add(bt62);
		buttons.add(bt63);
		buttons.add(bt64);
		buttons.add(bt65);
		buttons.add(bt66);
		buttons.add(bt67);
		buttons.add(bt68);
		buttons.add(bt69);
		buttons.add(bt70);
		buttons.add(bt71);
		buttons.add(bt72);
		buttons.add(bt73);
		buttons.add(bt74);
		buttons.add(bt75);
		buttons.add(bt76);
		buttons.add(bt77);
		buttons.add(bt78);
		buttons.add(bt79);
		buttons.add(bt80);
		buttons.add(bt81);
		buttons.add(bt82);
		buttons.add(bt83);
		buttons.add(bt84);
		buttons.add(bt85);
		buttons.add(bt86);
		buttons.add(bt87);
		buttons.add(bt88);
		buttons.add(bt89);
		buttons.add(bt90);
		buttons.add(bt91);
		buttons.add(bt92);
		buttons.add(bt93);
		buttons.add(bt94);
		buttons.add(bt95);
		buttons.add(bt96);
		buttons.add(bt97);
		buttons.add(bt98);
		buttons.add(bt99);

	}

	// Metodo que inicializa algunos datos necesarios.
	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		// TODO Auto-generated method stub
		listPal = FXCollections.observableArrayList();
		listPal.addAll();
		listViewPal.setItems(listPal);
		imgView.setImage(imagen);
		imgView.setScaleX(5);
		setButtons();
		loadSopita();
	}

}
