package Events;

import javax.swing.JPanel;
import java.awt.Color;

public class ChangeColorEvent {
    public ChangeColorEvent() {}

    public void setColor(Color color, JPanel panel){
        panel.setBackground(color);
    }
}
