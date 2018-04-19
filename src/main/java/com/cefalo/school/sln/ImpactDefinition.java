package com.cefalo.school.sln;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.sln.Contracts.Resource;

public class ImpactDefinition {
    public static Impact getImpact(Class<? extends Resource> aClass) {
        if(Developer.class.equals(aClass))return new Impact(.05,
                .05,.5,.5,.5);
        if(TeamLead.class.equals(aClass))return new Impact(.5,
                .5,.5,.5,.5);
        if(ProjectManager.class.equals(aClass))return new Impact(.5,
                .5,.5,.5,.5);
        return null;
    }
}
