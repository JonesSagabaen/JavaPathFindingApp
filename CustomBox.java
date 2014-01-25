/** COPYRIGHT(C). Jonathan Sagabaen. All Rights Reserved.
    Java application that displays the A* path finding algorithm.
    @author Jonathan Sagabaen
    @version 4.0
*/
package cs134astarpathfinding;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CustomBox extends JPanel implements ChangeListener
{

    private int column;      //Location along the columns of the grid
    private int row;      //Location along the rows of the grid
    private String boxLabel;
    private ArrowDirection arrow;
    private BoxType type;
    private Model model;
    private int cost;
    private int distance;

    public CustomBox(String name)
    {
        boxLabel = name;
        cost = 0;
        row = name.charAt(0) - 'A';
        column = Integer.parseInt(name.substring(1, name.length())) - 1;

        type = null;
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                CurrentButton currentButton = model.getCurrentButton();
                if(currentButton == CurrentButton.PLAYER)
                {
                    type = BoxType.PLAYER;
                    model.setBoxType(BoxType.PLAYER, column, row);
                    model.setPlayerLocation(column,row);
                }
                else if(currentButton == CurrentButton.MONSTER)
                {
                    type = BoxType.MONSTER;
                    model.setBoxType(BoxType.MONSTER, column, row);
                    model.setMonsterLocation(column, row);
                }
                else if(currentButton == CurrentButton.OBSTACLE)
                {
                    if(type != BoxType.OBSTACLE)
                    {
                        type = BoxType.OBSTACLE;
                        model.setBoxType(BoxType.OBSTACLE, column, row);
                    }
                    else
                    {
                        type = null;
                        model.setBoxType(null, column, row);
                    }
                }

                
                repaint();
                if(currentButton != CurrentButton.OBSTACLE)
                    model.setCurrentButton(null);

//                System.out.println();
//                System.out.println("CustomBox Location: [" + column + "][" + row + "]");
//                System.out.println("BoxType: " + type);
//                System.out.println("Arrow: " + arrow);
//                System.out.println("Distance from start: " + distance);
//                System.out.println("Total Cost: " + cost);
//                System.out.println("");
            }
        });
    }

    public void attach(Model m)
    {
        model = m;
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(50, 50);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.LIGHT_GRAY);
        if(type == BoxType.PLAYER)
        {
            setBorder(BorderFactory.createLineBorder(Color.BLUE));
            g2.setColor(Color.BLUE);
            g2.drawString("P", 21, 28);
            g2.setColor(Color.BLACK);
        }
        else if(type == BoxType.MONSTER)
        {
            setBorder(BorderFactory.createLineBorder(Color.RED));
            g2.setColor(Color.RED);
            g2.drawString("M", 21, 28);
            g2.setColor(Color.LIGHT_GRAY);
        }
        else if(type == BoxType.OBSTACLE)
        {
            g2.setColor(Color.BLACK);
            Rectangle rect = new Rectangle(0, 0, 50, 50);
            g2.fill(rect);
            g2.setColor(Color.LIGHT_GRAY);
        }
        else if(type == BoxType.OPEN)
        {
            g2.setColor(Color.BLACK);
            g2.drawString("" + cost, 21, 28);
            g2.setColor(Color.LIGHT_GRAY);
            g2.drawString("o", 43, 8);
        }
        else if(type == BoxType.CLOSED)
        {
            if(cost != 0)
            {
                g2.setColor(Color.BLACK);
                g2.drawString("" + cost, 21, 28);

                //Displays the number of steps away from the Monster
//                g2.setColor(Color.LIGHT_GRAY);
//                g2.drawString("" + distance , 2, 48);
//                g2.setColor(Color.BLACK);
            }
            else
            {
                g2.setColor(Color.RED);
                g2.drawString("M", 21, 28);
            }

            g2.setColor(Color.LIGHT_GRAY);
            g2.drawString("x", 43, 8);
        }
        else if(type == BoxType.FINAL)
        {
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            g2.setColor(Color.BLACK);
            g2.drawString("" + cost, 21, 28);
        }
        else
            setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        

        if(arrow == ArrowDirection.TOP)
        {
            Ellipse2D.Double circ = new Ellipse2D.Double(20, 1, 10, 10);
            g2.fill(circ);
        }
        else if(arrow == ArrowDirection.RIGHT)
        {
            Ellipse2D.Double circ = new Ellipse2D.Double(38, 19, 10, 10);
            g2.fill(circ);
        }
        else if(arrow == ArrowDirection.BOTTOM)
        {
            Ellipse2D.Double circ = new Ellipse2D.Double(20, 38, 10, 10);
            g2.fill(circ);
        }
        else if(arrow == ArrowDirection.LEFT)
        {
            Ellipse2D.Double circ = new Ellipse2D.Double(2, 19, 10, 10);
            g2.fill(circ);
        }


        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString(boxLabel, 3, 10);
//        g2.drawString("[" + column + "][" + row + "]", 1, 46);
    }

    public void stateChanged(ChangeEvent e)
    {
        type = model.getBoxType(column, row);
        arrow = model.getArrowDirection(column, row);
        cost = model.getTotalCost(column, row);
        distance = model.getDistance(column, row);
        repaint();
    }

}
