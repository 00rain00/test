package test;


public class Poketmon {
    private int price;
    private String name;
    private String attributes;
    private int PoketmonID;
    private int levels;
    private String rareness;

    public int getPrice(){
        return this.price;
    } 
    public String getName(){
        return this.name;
    }
    public String getAttributes(){
        return this.attributes;
    }
    public int getPoketmonID(){
        return this.PoketmonID;
    }
    public int getLevel() {
        return this.levels;
    }
    public String getRareness() {
        return this.rareness;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAttributes(String attributes){
        this.attributes = attributes;
    }
    public void setPoketmonID(int PoketmonID){
        this.PoketmonID = PoketmonID;
    }
    public void SetLevel(int levels) {
        this.levels=levels;
    }
    public void SetRareness(String rareness) {
        this.rareness=rareness;
    }
    
    public Poketmon(int price,String name,String attributes,int PoketmonID,int levels,String rareness){
        this.price = price;
        this.name = name;
        this.PoketmonID = PoketmonID;
        this.attributes = attributes;
        this.levels = levels;
        this.rareness = rareness;  
    } 
    
}