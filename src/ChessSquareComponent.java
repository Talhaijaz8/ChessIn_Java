import javax.swing.*;
import java.awt.*;

public class ChessSquareComponent extends JLabel {
    private final int row;
    private final int col;

    public ChessSquareComponent(int row, int col, int size) {
        this.row = row;
        this.col = col;
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setFont(new Font("SansSerif", Font.BOLD, size / 2)); // Adjust font size to fit square
        setBackground((row + col) % 2 == 0 ? Color.LIGHT_GRAY : new Color(205, 133, 63));
    }

    public void setPieceSymbol(String symbol, Color color) {
        setText(symbol); // Use Unicode symbol
        setForeground(color); // Set color for the piece (white or black)
        setIcon(null); // Clear any icon
    }

    public void setPieceSymbol(ImageIcon icon) {
        setIcon(icon); // Use image for the piece
        setText(null); // Clear any text
    }

    public void clearPieceSymbol() {
        setText(null); // Clear text
        setIcon(null); // Clear icon
    }
}
