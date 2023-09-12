package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
public class Menu2 {

    private Date lastUpdated;
    private ArrayList<MenuItem2> items;

    public Menu2(Date d, ArrayList<MenuItem2> i) {
        this.lastUpdated = d;
        this.items = i;
    }
    public void setLastUpdated(Date lastUpdated) {this.lastUpdated=lastUpdated;}
    public void setItems(ArrayList<MenuItem2> items) {this.items=items;}
    public Date getLastUpdated() {return lastUpdated;}
    public ArrayList<MenuItem2> getItems() {return items;}
}
