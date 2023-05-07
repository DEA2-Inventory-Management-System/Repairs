package com.repairmodule;

public class Repair {
    private int repairId;
    private int category;
    private String description;
    private int status;

    //constructors
    public Repair() {
        super();
    }

    public Repair(int repairId, int category, String description, int status) {
        super();
        this.repairId = repairId;
        this.category = category;
        this.description = description;
        this.status = status;
    }

    //getters and setters
    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
