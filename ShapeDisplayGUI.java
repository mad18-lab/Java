import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDisplayGUI extends JFrame {
    private JPanel shapePanel;
    
    public ShapeDisplayGUI() {
        setTitle("Shape Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        // Create a panel to hold the shapes
        shapePanel = new JPanel();
        shapePanel.setBackground(Color.WHITE);
        
        // Create buttons
        JButton button1 = new JButton("Rectangle (1)");
        JButton button2 = new JButton("Circle (2)");
        JButton button3 = new JButton("Square (3)");
        
        // Set action listeners for the buttons
        button1.addActionListener(new ShapeButtonListener());
        button2.addActionListener(new ShapeButtonListener());
        button3.addActionListener(new ShapeButtonListener());
        
        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        
        // Add the panels to the frame
        add(shapePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    private class ShapeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            Shape shape = null;
            
            if (actionCommand.equals("Rectangle (1)")) {
                shape = new Rectangle();
            } else if (actionCommand.equals("Circle (2)")) {
                shape = new Circle();
            } else if (actionCommand.equals("Square (3)")) {
                shape = new Square();
            }
            
            if (shape != null) {
                shapePanel.removeAll();
                shapePanel.add(shape);
                shapePanel.revalidate();
                shapePanel.repaint();
            }
        }
    }
    
    private abstract class Shape extends JPanel {
        private Color color;
        
        public Shape(Color color) {
            this.color = color;
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(color);
            g.fillOval(10, 10, getWidth() - 20, getHeight() - 20);
        }
    }
    
    private class Rectangle extends Shape {
        public Rectangle() {
            super(Color.GREEN);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(color);
            g.fillRect(10, 10, getWidth() - 20, getHeight() - 20);
        }
    }
    
    private class Circle extends Shape {
        public Circle() {
            super(Color.BLUE);
        }
    }
    
    private class Square extends Shape {
        public Square() {
            super(Color.RED);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(color);
            int size = Math.min(getWidth() - 20, getHeight() - 20);
            g.fillRect((getWidth() - size) / 2, (getHeight() - size) / 2, size, size);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShapeDisplayGUI();
        });
    }
}
