package com.fs3d;

public abstract class Character {
    private String _id;
    private String name;
    private String origin;
    private enum ControllerClass {
        Player, NPC
    }

    public Character(String _id, String name, String origin) {
        this._id = _id;
        this.name = name;
        this.origin = origin;
    }

    public Character(){
        // Constructor
        for(ControllerClass ctrl: ControllerClass.values()){
            System.out.println(ctrl.name());
            System.out.println(ctrl==ControllerClass.Player ? "Player Class" : "NPC Class");
        }
    }
}