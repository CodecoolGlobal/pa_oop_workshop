package com.codecool.eventmanagement.employee;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Helper> helpers;
    private List<Organiser> organisers;
    private ChiefOrganiser chiefOrganiser;

    public Staff() {
        this.helpers = new ArrayList<>();
        this.organisers = new ArrayList<>();
    }

    public void addHelper(Helper helper) {
        helpers.add(helper);
    }

    public void addOrganiser(Organiser organiser) {
        organisers.add(organiser);
    }

    public List<Helper> getHelpers() {
        return helpers;
    }

    public List<Organiser> getOrganisers() {
        return organisers;
    }

    public ChiefOrganiser getChiefOrganiser() {
        return chiefOrganiser;
    }

    public Staff setChiefOrganiser(ChiefOrganiser chiefOrganiser) {
        this.chiefOrganiser = chiefOrganiser;
        return this;
    }
}
