package com.cefalo.school.sln.Contracts;

// A helper class to do indentation before printing something in console, nothing to do with the design problem, just to handle printout
public class Indentation {
    private final int level;

    public int getLevel() {
        return level;
    }

    public Indentation(int level) {
        this.level = level;
    }

    public String apply(String str){
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<level;i++){
            for(int j=0;j<4;j++)buffer.append(" ");
        }
        return buffer.toString() + str;
    }
}
