import javax.swing.JFrame;
public class frame extends JFrame{

    frame(){
        this.setTitle("Snake"); // set title for frame
        this.add(new panel()); // adding the panel to the frame
        this.setVisible(true); // this property is false by default
        this.setResizable(false);
        this.pack(); // Force to atleast prefred size

    }
}
