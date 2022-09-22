package com.codecool.eventmanagement.event;

import com.codecool.eventmanagement.employee.ChiefOrganiser;

public class Wedding extends Event {
    Cake cake;

    public Wedding(ChiefOrganiser chiefOrganiser) {
        super(chiefOrganiser);
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public void startWedding() {
        if (cake == null) {
            throw new IllegalStateException("No cake");
        }
        System.out.println("Started wedding");
    }
}
