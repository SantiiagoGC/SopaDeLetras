package application;

import java.util.ArrayList;
import javafx.geometry.Point2D;

public class Sopita
{

	private final int size = 10;

	private String[] palabritas =
	{ "SOFTWARE", "HARDWARE", "JAVA", "CSS", "SEBAS", "SANTI", "PAOLA", "ECLIPSE", "ANUBIS",
			"HAROLD" };

	// POINT2D es una clase que guarda dos valores doubles como "x" y "y", los
	// cuales usamos para encontrar los botones donde estan las palabras
	private ArrayList<Point2D> coords;
	private String palabraE = "*";

	private char[][] sopita =
	{
			{ 'A', 'H', 'P', 'A', 'O', 'L', 'A', 'B', 'S', 'A' },
			{ 'S', 'E', 'H', 'A', 'R', 'O', 'L', 'D', 'E', 'E' },
			{ 'A', 'O', 'S', 'U', 'A', 'A', 'N', 'E', 'B', 'A' },
			{ 'N', 'A', 'F', 'P', 'R', 'A', 'R', 'A', 'A', 'A' },
			{ 'I', 'I', 'O', 'T', 'I', 'A', 'U', 'A', 'S', 'S' },
			{ 'T', 'U', 'A', 'A', 'W', 'L', 'L', 'A', 'C', 'I' },
			{ 'N', 'A', 'V', 'D', 'A', 'A', 'C', 'C', 'A', 'B' },
			{ 'A', 'V', 'R', 'O', 'T', 'A', 'R', 'E', 'E', 'U' },
			{ 'S', 'A', 'J', 'I', 'L', 'O', 'J', 'E', 'P', 'N' },
			{ 'H', 'J', 'A', 'S', 'S', 'C', 'N', 'A', 'S', 'A' },

	};

	public Sopita ()
	{
		coords = new ArrayList<>();
	}

	// recorrer la matriz "sopita", comprobar la primera letra y comparar la
	// palabra retornada por el metodo guardarDirecciones con la palabra
	// ingresada en el metodo por parametro
	public boolean buscarPalabra ( String palabrita, int i, int j, int ind )
	{
		char[] letras = palabrita.toUpperCase().toCharArray();

		// Caso base
		if ( i == 0 && j == 0 )
		{

			if ( palabraE.contains(palabrita) )
			{
				return true;

			} else if ( ind < 8 && sopita[j][i] == letras[0] )
			{
				palabraE = guardarDirecciones(letras, i, j, ind);
				return buscarPalabra(palabrita, i, j, ind + 1);
			}

			return false;

			// Cambiar de fila
		} else if ( i == 0 )
		{

			if ( palabraE.contains(palabrita) )
			{
				return true;

			} else if ( ind < 8 && sopita[j][i] == letras[0] )
			{
				palabraE = guardarDirecciones(letras, i, j, ind);
				return buscarPalabra(palabrita, i, j, ind + 1);
			} else
			{
				return buscarPalabra(palabrita, size - 1, j - 1, 0);
			}

		} else
		{

			if ( palabraE.contains(palabrita) )
			{
				return true;

			} else if ( ind < 8 && sopita[j][i] == letras[0] )
			{
				palabraE = guardarDirecciones(letras, i, j, ind);
				return buscarPalabra(palabrita, i, j, ind + 1);
			} else
			{
				return buscarPalabra(palabrita, i - 1, j, 0);
			}
		}

	}

	// guardar palabra de cada direccion y guardar su posicón en la matriz
	private String guardarDirecciones ( char[] letras, int i, int j, int ind )
	{

		String palabrita = "";
		coords.clear();

		// try catch para evitar que se detenga la aplicacion por
		// "indexOutBoundException"
		try
		{
			// recorrer una direccion segun "ind" guardando en "palabrita" todas
			// las letras de dicha direccion
			for ( int x = 0; x < size; x++ )
			{
				switch ( ind )
				{
					// izquierda
					case 0:
						palabrita += sopita[j][i - x];
						if ( sopita[j][i - x] == letras[x] )
						{
							coords.add(new Point2D(j, i - x));
						}
						break;

					// diagonal arriba izquierda
					case 1:

						palabrita += sopita[j - x][i - x];
						if ( sopita[j - x][i - x] == letras[x] )
						{
							coords.add(new Point2D(j - x, i - x));
						}
						break;

					// arriba
					case 2:
						palabrita += sopita[j - x][i];
						if ( sopita[j - x][i] == letras[x] )
						{
							coords.add(new Point2D(j - x, i));
						}
						break;

					// diagonal arriba derecha
					case 3:
						palabrita += sopita[j - x][i + x];
						if ( sopita[j - x][i + x] == letras[x] )
						{
							coords.add(new Point2D(j - x, i + x));
						}
						break;

					// derecha
					case 4:
						palabrita += sopita[j][i + x];
						if ( sopita[j][i + x] == letras[x] )
						{
							coords.add(new Point2D(j, i + x));
						}
						break;

					// diagonal abajo derecha
					case 5:
						palabrita += sopita[j + x][i + x];
						if ( sopita[j + x][i + x] == letras[x] )
						{
							coords.add(new Point2D(j + x, i + x));
						}
						break;

					// abajo
					case 6:
						palabrita += sopita[j + x][i];
						if ( sopita[j + x][i] == letras[x] )
						{
							coords.add(new Point2D(j + x, i));
						}
						break;

					// diagonal abajo izquierda
					case 7:
						palabrita += sopita[j + x][i - x];
						if ( sopita[j + x][i - x] == letras[x] )
						{
							coords.add(new Point2D(j + x, i - x));
						}
						break;
					// .-. PONGAMOSLO A PRUEBA
				}

			}
		} catch ( Exception e )
		{
			// e.printStackTrace();
		}

		return palabrita;
	}

	// --------------------------------GETTERS AND
	// SETTERS-------------------------------------------------//
	public int getSize ()
	{
		return size;
	}

	public ArrayList<Point2D> getCoords ()
	{
		return coords;
	}

	public char getSopitaIndex ( int i, int j )
	{
		return sopita[i][j];
	}

	public char[][] getSopita ()
	{
		return sopita;
	}

	public void setSopita ( char[][] sopita )
	{
		this.sopita = sopita;
	}

	public String[] getPalabritas ()
	{
		return palabritas;
	}

	public void setPalabritas ( String[] palabritas )
	{
		this.palabritas = palabritas;
	}

}
