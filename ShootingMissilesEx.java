import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMissilesEx extends JFrame {

    public ShootingMissilesEx() {
        
        initUI();
    }
    
    public void initUI() {
        
        add(new Window());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            ShootingMissilesEx ex = new ShootingMissilesEx();
            ex.setVisible(true);
        });
    }
}