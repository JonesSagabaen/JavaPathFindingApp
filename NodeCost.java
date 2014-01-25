/** COPYRIGHT(C). Jonathan Sagabaen. All Rights Reserved.
    Java application that displays the A* path finding algorithm.
    @author Jonathan Sagabaen
    @version 4.0
*/
package cs134astarpathfinding;

public class NodeCost implements Comparable
{
    private int cost;
    private int columnLocation;
    private int rowLocation;

    public NodeCost(int cost, int column, int row)
    {
        this.cost = cost;
        columnLocation = column;
        rowLocation = row;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public int getColumnLocation()
    {
        return columnLocation;
    }
    
    public int getRowLocation()
    {
        return rowLocation;
    }

    public int compareTo(Object o)
    {
        int thisNode = this.cost;
        int otherNode = ((NodeCost) o).getCost();

        if(thisNode > otherNode)
            return 1;
        else if(thisNode < otherNode)
            return -1;
        else
            return 0;
    }

}
