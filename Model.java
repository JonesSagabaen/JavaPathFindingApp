/** COPYRIGHT(C). Jonathan Sagabaen. All Rights Reserved.
    Java application that displays the A* path finding algorithm.
    @author Jonathan Sagabaen
    @version 4.0
*/
package cs134astarpathfinding;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Model
{
    private CurrentButton currentButton;
    private BoxType[][] boxType;
    private ArrowDirection[][] arrow;
    private int[][] distance;
    private int[][] totalCost;
    private int playerColumnLocation;
    private int playerRowLocation;
    private int monsterColumnLocation;
    private int monsterRowLocation;
    private int currentOpenColumnLocation;
    private int currentOpenRowLocation;

    private ArrayList<NodeCost> nodes;

    private ArrayList<ChangeListener> listeners;

    public Model()
    {
        currentButton = null;
        boxType = new BoxType[16][16];
        arrow = new ArrowDirection[16][16];
        distance = new int[16][16];
        totalCost = new int[16][16];
        playerColumnLocation = -1;
        playerRowLocation = -1;
        monsterColumnLocation = -1;
        monsterRowLocation = -1;
        currentOpenColumnLocation = -1;
        currentOpenRowLocation = -1;

        nodes = new ArrayList<NodeCost>();
        listeners = new ArrayList<ChangeListener>();
    }

    public void attach(ChangeListener c)
    {
        listeners.add(c);
    }

    public void updateView()
    {
        for (ChangeListener l : listeners)
        {
            l.stateChanged(new ChangeEvent(this));
        }
    }

    public void setCurrentButton(CurrentButton button)
    {
        currentButton = button;
    }

    public CurrentButton getCurrentButton()
    {
        return currentButton;
    }

    public BoxType getBoxType(int column, int row)
    {
        return boxType[column][row];
    }

    public void setBoxType(BoxType type, int column, int row)
    {
        boxType[column][row] = type;
    }

    public ArrowDirection getArrowDirection(int column, int row)
    {
        return arrow[column][row];
    }

    int getTotalCost(int column, int row)
    {
        return totalCost[column][row];
    }

    int getDistance(int column, int row)
    {
        return distance[column][row];
    }

    public void setPlayerLocation(int column, int row)
    {
        int oldColumnLocation = playerColumnLocation;
        int oldRowLocation = playerRowLocation;

        playerColumnLocation = column;
        playerRowLocation = row;

        if(oldColumnLocation != -1 && oldRowLocation != -1)
            boxType[oldColumnLocation][oldRowLocation] = null;
        
        updateView();
    }

    public void setMonsterLocation(int column, int row)
    {
        int oldColumnLocation = monsterColumnLocation;
        int oldRowLocation = monsterRowLocation;

        monsterColumnLocation = column;
        monsterRowLocation = row;
        nodes.clear();
        nodes.add(new NodeCost(0, monsterColumnLocation, monsterRowLocation));
        distance[column][row] = 0;

        if(oldColumnLocation != -1 && oldRowLocation != -1)
            boxType[oldColumnLocation][oldRowLocation] = null;

        updateView();
    }

    public void reset()
    {
        currentButton = null;
        for(int i = 0; i < 16; i++)
            for(int j = 0; j < 16; j++)
            {
                boxType[i][j] = null;
                arrow[i][j] = null;
                distance[i][j] = 0;
                totalCost[i][j] = 0;
            }
        playerColumnLocation = -1;
        playerRowLocation = -1;
        monsterColumnLocation = -1;
        monsterRowLocation = -1;
        currentOpenColumnLocation = -1;
        currentOpenRowLocation = -1;

        nodes.clear();
        updateView();
    }

    public void step()
    {
        if(playerColumnLocation == -1 || playerRowLocation == -1 || monsterColumnLocation == -1 || monsterRowLocation == -1)
            return;
        currentButton = null;

        NodeCost currentNode = nodes.get(0);
        nodes.remove(0);
        currentOpenColumnLocation = currentNode.getColumnLocation();
        currentOpenRowLocation = currentNode.getRowLocation();

        boxType[currentOpenColumnLocation][currentOpenRowLocation] = BoxType.CLOSED;

        int tempDistance = 0;
        int heuristic = 0;
        if(currentOpenColumnLocation >= 0 && currentOpenColumnLocation < 16 && currentOpenRowLocation - 1 >= 0 && currentOpenRowLocation - 1 < 16)
        {
            if(boxType[currentOpenColumnLocation][currentOpenRowLocation - 1] != BoxType.OBSTACLE && boxType[currentOpenColumnLocation][currentOpenRowLocation - 1] != BoxType.CLOSED && boxType[currentOpenColumnLocation][currentOpenRowLocation - 1] != BoxType.OPEN)
            {
                boxType[currentOpenColumnLocation][currentOpenRowLocation - 1] = BoxType.OPEN;
                arrow[currentOpenColumnLocation][currentOpenRowLocation - 1] = ArrowDirection.BOTTOM;
                heuristic = (Math.abs(currentOpenColumnLocation - playerColumnLocation)) + (Math.abs((currentOpenRowLocation - 1) - playerRowLocation));
                tempDistance = distance[currentOpenColumnLocation][currentOpenRowLocation] + 1;
                int currentCost = heuristic + tempDistance;
                distance[currentOpenColumnLocation][currentOpenRowLocation - 1] = tempDistance;
                totalCost[currentOpenColumnLocation][currentOpenRowLocation - 1] = currentCost;
                nodes.add(new NodeCost(currentCost, currentOpenColumnLocation, currentOpenRowLocation - 1));
            }
        }
        if(currentOpenColumnLocation + 1 >= 0 && currentOpenColumnLocation + 1 < 16 && currentOpenRowLocation >= 0 && currentOpenRowLocation < 16)
        {
            if(boxType[currentOpenColumnLocation + 1][currentOpenRowLocation] != BoxType.OBSTACLE && boxType[currentOpenColumnLocation + 1][currentOpenRowLocation] != BoxType.CLOSED && boxType[currentOpenColumnLocation + 1][currentOpenRowLocation] != BoxType.OPEN)
            {
                boxType[currentOpenColumnLocation + 1][currentOpenRowLocation] = BoxType.OPEN;
                arrow[currentOpenColumnLocation + 1][currentOpenRowLocation] = ArrowDirection.LEFT;
                heuristic = (Math.abs((currentOpenColumnLocation + 1) - playerColumnLocation)) + (Math.abs(currentOpenRowLocation - playerRowLocation));
                tempDistance = distance[currentOpenColumnLocation][currentOpenRowLocation] + 1;
                int currentCost = heuristic + tempDistance;
                distance[currentOpenColumnLocation + 1][currentOpenRowLocation] = tempDistance;
                totalCost[currentOpenColumnLocation + 1][currentOpenRowLocation] = currentCost;
                nodes.add(new NodeCost(currentCost, currentOpenColumnLocation + 1, currentOpenRowLocation));
            }
        }
        if(currentOpenColumnLocation >= 0 && currentOpenColumnLocation < 16 && currentOpenRowLocation + 1 >= 0 && currentOpenRowLocation < 16)
        {
            if(boxType[currentOpenColumnLocation][currentOpenRowLocation + 1] != BoxType.OBSTACLE && boxType[currentOpenColumnLocation][currentOpenRowLocation + 1] != BoxType.CLOSED && boxType[currentOpenColumnLocation][currentOpenRowLocation + 1] != BoxType.OPEN)
            {
                boxType[currentOpenColumnLocation][currentOpenRowLocation + 1] = BoxType.OPEN;
                arrow[currentOpenColumnLocation][currentOpenRowLocation + 1] = ArrowDirection.TOP;
                heuristic = (Math.abs(currentOpenColumnLocation - playerColumnLocation)) + (Math.abs((currentOpenRowLocation + 1) - playerRowLocation));
                tempDistance = distance[currentOpenColumnLocation][currentOpenRowLocation] + 1;
                int currentCost = heuristic + tempDistance;
                distance[currentOpenColumnLocation][currentOpenRowLocation + 1] = tempDistance;
                totalCost[currentOpenColumnLocation][currentOpenRowLocation + 1] = currentCost;
                nodes.add(new NodeCost(currentCost, currentOpenColumnLocation, currentOpenRowLocation + 1));
            }
        }
        if(currentOpenColumnLocation - 1 >= 0 && currentOpenColumnLocation - 1 < 16 && currentOpenRowLocation >= 0 && currentOpenRowLocation < 16)
        {
            if(boxType[currentOpenColumnLocation - 1][currentOpenRowLocation] != BoxType.OBSTACLE && boxType[currentOpenColumnLocation - 1][currentOpenRowLocation] != BoxType.CLOSED && boxType[currentOpenColumnLocation - 1][currentOpenRowLocation] != BoxType.OPEN)
            {
                boxType[currentOpenColumnLocation - 1][currentOpenRowLocation] = BoxType.OPEN;
                arrow[currentOpenColumnLocation - 1][currentOpenRowLocation] = ArrowDirection.RIGHT;
                heuristic = (Math.abs((currentOpenColumnLocation - 1) - playerColumnLocation)) + (Math.abs(currentOpenRowLocation - playerRowLocation));
                tempDistance = distance[currentOpenColumnLocation][currentOpenRowLocation] + 1;
                int currentCost = heuristic + tempDistance;
                distance[currentOpenColumnLocation - 1][currentOpenRowLocation] = tempDistance;
                totalCost[currentOpenColumnLocation - 1][currentOpenRowLocation] = currentCost;
                nodes.add(new NodeCost(currentCost, currentOpenColumnLocation - 1, currentOpenRowLocation));
            }
        }
        Collections.sort(nodes);
        updateView();


//        System.out.println();
//        System.out.println("Array of nodes after Step:");
//        int i = 0;
//        for(NodeCost e : nodes)
//        {
//            System.out.println("Position " + i++ + ": " + e.getCost() + "[" + e.getColumnLocation() + "][" + e.getRowLocation() + "] " + boxType[e.getColumnLocation()][e.getRowLocation()]);
//        }
    }

    public void findFullPath()
    {
        while(boxType[playerColumnLocation][playerRowLocation] == BoxType.PLAYER)
            step();
        displayFinalPath();
    }

    private void displayFinalPath()
    {
        int currentColumnLocation = playerColumnLocation;
        int currentRowLocation = playerRowLocation;

        while(currentColumnLocation != monsterColumnLocation || currentRowLocation != monsterRowLocation)
        {
            if(arrow[currentColumnLocation][currentRowLocation] == ArrowDirection.TOP)
            {
                boxType[currentColumnLocation][currentRowLocation - 1] = BoxType.FINAL;
                currentRowLocation--;
            }
            else if(arrow[currentColumnLocation][currentRowLocation] == ArrowDirection.RIGHT)
            {
                boxType[currentColumnLocation + 1][currentRowLocation] = BoxType.FINAL;
                currentColumnLocation++;
            }
            else if(arrow[currentColumnLocation][currentRowLocation] == ArrowDirection.BOTTOM)
            {
                boxType[currentColumnLocation][currentRowLocation + 1] = BoxType.FINAL;
                currentRowLocation++;
            }
            else if(arrow[currentColumnLocation][currentRowLocation] == ArrowDirection.LEFT)
            {
                boxType[currentColumnLocation - 1][currentRowLocation] = BoxType.FINAL;
                currentColumnLocation--;
            }
        }
        boxType[monsterColumnLocation][monsterRowLocation] = BoxType.MONSTER;
        boxType[playerColumnLocation][playerRowLocation] = BoxType.PLAYER;
        updateView();
    }
    
}
