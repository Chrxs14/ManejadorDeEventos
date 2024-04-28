package Events;

import javax.swing.*;
import java.awt.*;

public class ChangeColorEvent {
    public ChangeColorEvent() {}

    public void setColor(Color color, JPanel panel){
        panel.setBackground(color);
    }
}
