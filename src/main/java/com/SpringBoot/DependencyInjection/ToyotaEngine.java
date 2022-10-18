package com.SpringBoot.DependencyInjection;

public class ToyotaEngine implements IEngine {

    ///////////////////// Variables ///////////////
    String company;
    double cost;

    /////////////////// getters and setter ///////////////

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    ///////////////// overrides ///////////////


    @Override
    public String importOrigin() {
        return "Japan";
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String toString(){
        return "this is engine object from: " + company + " its cost: " + cost + " ";
    }
}

