package com.zoom59rus.javacore.chapter15.creational.builder;

import com.zoom59rus.javacore.chapter15.creational.builder.mainsystem.License;
import com.zoom59rus.javacore.chapter15.creational.builder.mainsystem.MySystem;
import com.zoom59rus.javacore.chapter15.creational.builder.mainsystem.MySystemImpl;
import com.zoom59rus.javacore.chapter15.creational.builder.subsystem.SubSystem;

public class SystemBuilderImpl implements SystemBuilder{
    private MySystemImpl mySystem = new MySystemImpl();

    public SystemBuilderImpl setName(String systemName){
        mySystem.setName(systemName);
        mySystem.getDelivery().add(systemName);
        return this;
    }

    public SystemBuilderImpl setDescription(String description){
        mySystem.setDescription(description);
        mySystem.getDelivery().add(description);
        return this;
    }

    public SystemBuilderImpl setVersion(Float version){
        mySystem.setVersion(version);
        mySystem.getDelivery().add("ВЕРСИЯ ПО: " + version);
        return this;
    }

    public SystemBuilderImpl setLicense(License license){
        mySystem.setLicense(license);
        mySystem.getDelivery().add(license.toString());
        return this;
    }

    public SystemBuilderImpl setSubSystem(SubSystem subSystem){
        mySystem.setSubsystem(subSystem);
        mySystem.getDelivery().add(subSystem.toString());
        return this;
    }

    @Override
    public MySystem build() {
        return mySystem;
    }
}
