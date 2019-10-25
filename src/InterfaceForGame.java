import javax.swing.*;

public class InterfaceForGame extends Rectangles {

    public final int height = 800, width = 800;

    public InterfaceForGame()
    {
        JFrame window = new JFrame("Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(height, width);
        window.setVisible(true);
    }
}
