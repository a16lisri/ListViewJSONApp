package com.example.brom.listviewjsonapp;

/**
 * Created by Lisa Rinhammar on 2018-04-19.
 */

public class Mountain {
    // Member variables
    private int ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int height;
    private int cost;
    private String auxdata;

    // Constructor(s)
    public Mountain(int inID,String inName,String inType,String inCompany,String inLocation,String inCategory, int inHeight,int inCost,String inAuxdata){
        ID=inID;
        name=inName;
        type=inType;
        company=inCompany;
        location=inLocation;
        category=inCategory;
        height=inHeight;
        cost=inCost;
        auxdata=inAuxdata;
    }
    public Mountain(String inName,String inLocation,int inHeight){
        ID=-1;
        name=inName;
        type="unknown";
        company="unknown";
        location=inLocation;
        category="unknown";
        height=inHeight;
        cost=-1;
        auxdata="unknown";
    }
    public String Lisasfunk(){
        String str=name;
        str+=" is part of the ";
        str+=location;
        str+=" mountain range and is ";
        str+=Integer.toString(height);
        str+="m";
        str+=" high.";
        return str;
    }

    @Override
    public String toString() {
        return name;
    }
}
