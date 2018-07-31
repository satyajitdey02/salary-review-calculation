package com.cefalo.school.component;

interface HasSubordinate {

    void add(Employee employee);

    void remove(Employee employee);

    Employee getChild(int i);
}
