import javax.swing.*;

public class Logo extends JFrame {
    public Logo() {
        setTitle("IFMT");
        ImageIcon ifmtLogo = new ImageIcon("ifmt_horizontal.png");
        JLabel ifmtLabel = new JLabel(ifmtLogo);
        JLabel textLabel = new JLabel("Instituto Federal de Educação, Ciência e Tecnologia de Mato Grosso");
        
        JPanel panel = new JPanel();
        panel.add(ifmtLabel);
        panel.add(textLabel);
        add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Logo());
    }
}
