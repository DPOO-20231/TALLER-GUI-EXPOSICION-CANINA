package interfaz;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;


public class expCanina extends JFrame
 {
    private DataDog DataWindow;
    private ExtendPoint ExtendWindow;
    private FindWindow FindWindonw1;
    private ListPerro DataComplete;
    private NewDog NewDog1;
    private SearchDog SearchDog1;
     
    public expCanina(){
        DataWindow = new DataDog();
        ExtendWindow = new ExtendPoint();
        FindWindonw1= new FindWindow();
        DataComplete = new ListPerro();
        NewDog1= new NewDog();
        SearchDog1 = new SearchDog();
		setSize(new Dimension(800,580));
		setResizable(false);
		setTitle("Exposicion Canina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

        JPanel WindowP= new JPanel();
        WindowP.setLayout(null);

        

    }
}
