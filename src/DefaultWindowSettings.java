import javax.swing.*;

public class DefaultWindowSettings {

    public static void apply(JFrame frame) {


        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("CLIRDECS LIBRARY");

        ImageIcon image = new ImageIcon("src/Images/clsu.png");
        frame.setIconImage(image.getImage());
        frame.setLocationRelativeTo(null); // center on screen
        frame.setResizable(false);
    }
}
