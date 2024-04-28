package GUI;

import Events.ChangeColorEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.Color;

public class Window extends JFrame {

    private ChangeColorEvent changeColorEvent = new ChangeColorEvent();
    private ColorPresentation colorPanel;
    private ButtonsGrid buttonsGrid;

    public Window() {
        setTitle("Manejador de Eventos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel(new GridLayout(1, 2));

        colorPanel = new ColorPresentation();
        buttonsGrid = new ButtonsGrid(new ChangeColorEvent(), colorPanel);
        colorPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        contentPanel.add(buttonsGrid);
        contentPanel.add(colorPanel);

        contentPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        setContentPane(contentPanel);
    }
}
