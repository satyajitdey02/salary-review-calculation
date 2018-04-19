package com.cefalo.school.sln.Contracts;

import java.util.ArrayList;
import java.util.List;

// Management is a resource with additional functionality : ex, Adding child resources
public abstract class Management extends Resource {
    protected List<Resource> resources;
    public Management() {
        resources = new ArrayList<>();
    }

    public void addResource(Resource resource) throws Exception {
        this.resources.add(resource);
    }
    @Override
    protected double getTotalValue(){
        return this.getOwnValue() + this.getValueOfChildren();
    }
    private double getValueOfChildren() {
        double total = 0;
        for(Resource resource : this.resources){
            total += resource.getTotalValue();
        }
        return total;
    }

    protected void printChildrensResult(Indentation indentation) {
        for(Resource resource : this.resources){
            resource.printOwnResult(new Indentation(indentation.getLevel()+1));
        }
    }

}
