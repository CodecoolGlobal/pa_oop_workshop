package com.codecool.eventmanagement.event;

import com.codecool.eventmanagement.employee.ChiefOrganiser;

public abstract class Event {
    protected ChiefOrganiser chiefOrganiser;

    protected Event(ChiefOrganiser chiefOrganiser) {
        this.chiefOrganiser = chiefOrganiser;
    }

    public ChiefOrganiser getChiefOrganiser() {
        return chiefOrganiser;
    }
}
