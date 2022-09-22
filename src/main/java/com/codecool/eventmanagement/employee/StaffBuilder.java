package com.codecool.eventmanagement.employee;

import java.util.List;

public class StaffBuilder {
    private Staff staff;

    public StaffBuilder() {
        this.staff = new Staff();
    }

    public Staff build() {
        if (staff.getHelpers().size() < 10) {
            throw new IllegalStateException("Not enough employees to start an event");
        }
        if (staff.getOrganisers().size() < 2) {
            throw new IllegalStateException("Not enough employees to start an event");
        }
        if (staff.getChiefOrganiser() == null) {
            throw new IllegalStateException("Not enough employees to start an event");
        }
        return staff;
    }

    public StaffBuilder chiefOrganiser(ChiefOrganiser chiefOrganiser) {
        staff.setChiefOrganiser(chiefOrganiser);
        return this;
    }

    public StaffBuilder organiser(Organiser organiser) {
        staff.getOrganisers().add(organiser);
        return this;
    }

    public StaffBuilder helper(Helper helper) {
        staff.getHelpers().add(helper);
        return this;
    }
}
