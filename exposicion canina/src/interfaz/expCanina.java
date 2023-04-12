package interfaz;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class expCanina extends JFrame{
 
     
    public expCanina(){
        JFrame ventana = new JFrame("Ejemplo JList con Scroll");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize( new Dimension( 700, 550 ) );
        ventana.setLayout(null);
		ventana.setTitle("Exposicion Canina");
	

        JPanel CompletDog=new JPanel();
        CompletDog.setLayout(null);
        CompletDog.setSize( new Dimension( 180, 220 ) );
        CompletDog.setBorder(BorderFactory.createTitledBorder("Perros en la exposicion"));
        String[] datos = {"puppy\n","Taylor","Cobrador", "tarzan", "Fido", "Maximus", "Nieve", "Pancha", "Tony", "Brutal", "Mamut", "Pirata", "jaguar", "Inferno","puppy","Taylor","Cobrador", "tarzan", "Fido", "Maximus", "Nieve", "Pancha", "Tony", "Brutal", "Mamut", "Pirata", "jaguar", "Inferno"};
        JList lista = new JList(datos);
        lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane Flist = new JScrollPane(lista);
        Flist.setBounds(13, 20, 155, 180);
        CompletDog.setBounds(10, 10, 180, 220);
        CompletDog.add(Flist);

        JPanel DogFig=new JPanel();
        DogFig.setLayout(null);
        DogFig.setSize( new Dimension( 300, 220) );
        DogFig.setBorder(BorderFactory.createTitledBorder("Datos Perro"));
        JLabel Name = new JLabel( "Nombre: " );
        JTextField NameI = new JTextField( );
        JLabel Raza = new JLabel( "Raza: " );
        JTextField RazaI = new JTextField( );
        JLabel Edad = new JLabel( "Edad: " );
        JTextField EdadI = new JTextField( );
        JLabel Puntos = new JLabel( "Puntos: " );
        JTextField PuntosI = new JTextField( );
        Name.setBounds(10, 160, 60, 20);
        NameI.setBounds(70, 160, 80, 20);
        Edad.setBounds(10, 190, 60, 20);
        EdadI.setBounds(70, 190, 80, 20);
        Raza.setBounds(160, 160, 60, 20);
        RazaI.setBounds(220, 160, 70, 20);
        Puntos.setBounds(160, 190, 60, 20);
        PuntosI.setBounds(220, 190, 70, 20);
        DogFig.setBounds(200, 10, 300, 220);
        DogFig.add(Name);
        DogFig.add(NameI);
        DogFig.add(Raza);
        DogFig.add(RazaI);
        DogFig.add(Puntos);
        DogFig.add(PuntosI);
        DogFig.add(Edad);
        DogFig.add(EdadI);

        JPanel FindDog=new JPanel();
        FindDog.setLayout(null);
        FindDog.setSize( new Dimension( 160, 220) );
        FindDog.setBorder(BorderFactory.createTitledBorder("Busqueda y Ordenamientos"));
        FindDog.setBounds(505, 10, 175, 220);
        JButton BOrd = new JButton( "Ordenar por Raza" );
        BOrd.setBounds(10, 100, 155, 20);
        FindDog.add(BOrd);
        JButton BOrd1 = new JButton( "Ordenar por puntos" );
        BOrd1.setBounds(10, 130, 155, 20);
        FindDog.add(BOrd1);
        JButton BOrd11 = new JButton( "Ordenar por edad" );
        BOrd11.setBounds(10, 160, 155, 20);
        FindDog.add(BOrd11);
        JButton BOrd111 = new JButton( "Buscar Perro" );
        BOrd111.setBounds(10, 190, 155, 20);
        FindDog.add(BOrd111);
        

        JPanel NewDog=new JPanel();
        NewDog.setLayout(null);
        NewDog.setSize( new Dimension( 430, 160) );
        NewDog.setBorder(BorderFactory.createTitledBorder("Agregar Perro"));
        NewDog.setBounds(10, 230, 420, 160);
        JLabel Name1 = new JLabel( "Nombre: " );
        JTextField NameI1 = new JTextField( );
        JLabel Raza1 = new JLabel( "Raza: " );
        JTextField RazaI1 = new JTextField( );
        JLabel Edad1 = new JLabel( "Edad: " );
        JTextField EdadI1 = new JTextField( );
        JLabel Puntos1 = new JLabel( "Puntos: " );
        JTextField PuntosI1 = new JTextField( );
        JLabel Imagen1 = new JLabel( "Imagen: " );
        JTextField ImagenI1 = new JTextField( );
        Name1.setBounds(10, 20, 60, 20);
        NameI1.setBounds(70, 20, 120, 20);
        Edad1.setBounds(20, 50, 60, 20);
        EdadI1.setBounds(70, 50, 120, 20);
        Raza1.setBounds(210, 20, 60, 20);
        RazaI1.setBounds(270, 20, 120, 20);
        Puntos1.setBounds(200, 50, 60, 20);
        PuntosI1.setBounds(270, 50, 120, 20);
        Imagen1.setBounds(10, 80, 60, 20);
        ImagenI1.setBounds(70, 80, 57, 20);
        JButton BImg = new JButton( "Examinar" );
        BImg.setBounds(126, 80, 60, 20);
        JButton BND = new JButton( "AgregarPerro" );
        BND.setBounds(150, 120, 220, 20);
        NewDog.add(Name1);
        NewDog.add(NameI1);
        NewDog.add(Raza1);
        NewDog.add(RazaI1);
        NewDog.add(Puntos1);
        NewDog.add(PuntosI1);
        NewDog.add(Edad1);
        NewDog.add(EdadI1);
        NewDog.add(Imagen1);
        NewDog.add(ImagenI1);
        NewDog.add(BImg);
        NewDog.add(BND);

        JPanel FindDog1=new JPanel();
        FindDog1.setLayout(null);
        FindDog1.setSize( new Dimension( 160, 220) );
        FindDog1.setBorder(BorderFactory.createTitledBorder("Consultas Exposicion"));
        FindDog1.setBounds(460, 230, 220, 160);
        JButton BOrd2 = new JButton( "Ganador" );
        BOrd2.setBounds(10, 50, 200, 20);
        FindDog1.add(BOrd2);
        JButton BOrd12 = new JButton( "Menor Puntaje" );
        BOrd12.setBounds(10, 80, 200, 20);
        FindDog1.add(BOrd12);
        JButton BOrd112 = new JButton( "Mas Viejo" );
        BOrd112.setBounds(10, 110, 200, 20);
        FindDog1.add(BOrd112);


        JPanel EXT=new JPanel();
        EXT.setLayout(null);
        EXT.setSize( new Dimension( 670, 100) );
        EXT.setBorder(BorderFactory.createTitledBorder("Puntos de Extension"));
        EXT.setBounds(10, 400, 670, 100);
        JButton BOrd23 = new JButton( "Opcion1" );
        BOrd23.setBounds(200, 70, 120, 20);
        EXT.add(BOrd23);
        JButton BOrd123 = new JButton( "Opcion 2" );
        BOrd123.setBounds(330, 70, 120, 20);
        EXT.add(BOrd123);

        ventana.add(CompletDog);
        ventana.add(DogFig);
        ventana.add(FindDog);
        ventana.add(NewDog);
        ventana.add(FindDog1);
        ventana.add(EXT);
        ventana.setVisible(true);



        

    }
    public void paint(Graphics g){
        JPanel Img= new JPanel();
        Image Fig= new ImageIcon(getClass().getResource("dog.jpg")).getImage();
        g.drawImage(Fig, 0,0,100,100,Img);
        }
    public static void main(String[] args) {
        new expCanina();
    }
}
