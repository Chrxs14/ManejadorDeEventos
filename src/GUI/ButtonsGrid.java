package GUI;

import Events.ChangeColorEvent;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;


public class ButtonsGrid extends JPanel {
    private ChangeColorEvent changeColorEvent;

    public ButtonsGrid(ChangeColorEvent changeColorEvent, JPanel panel) {
        setLayout(new GridLayout(5, 2));
        this.changeColorEvent = changeColorEvent;

        String[] colors = {"Yellow", "Red", "Green", "Blue", "White", "Black", "Cyan", "Orange", "Pink", "Brown"};

        for (String color : colors) {
            JButton button = new JButton(color);

            button.addActionListener(e -> {
                Color colorPanel;
                try {
                    colorPanel = (Color) Color.class.getField(color.toUpperCase()).get(null);
                } catch (Exception ex) {
                    colorPanel = Color.BLACK;
                }
                changeColorEvent.setColor(colorPanel, panel);
            });


            add(button);
        }
    }
}
