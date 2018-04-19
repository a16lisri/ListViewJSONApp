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
    private int size;
    private int cost;
    private String auxdata;

    // Constructor(s)
    public Mountain(int inID,String inName,String inType,String inCompany,String inLocation,String inCategory, int inSize,int inCost,String inAuxdata){
        ID=inID;
        name=inName;
        type=inType;
        company=inCompany;
        location=inLocation;
        category=inCategory;
        size=inSize;
        cost=inCost;
        auxdata=inAuxdata;
    }
}
