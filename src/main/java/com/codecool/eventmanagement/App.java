package com.codecool.eventmanagement;

import com.codecool.eventmanagement.employee.*;
import com.codecool.eventmanagement.event.Cake;
import com.codecool.eventmanagement.event.Events;
import com.codecool.eventmanagement.event.Wedding;

public class App {
    public static void main(String[] args) {
        Staff staff = buildStaff1();
        Staff staff2 = buildStaff2();
        Wedding wedding = new Wedding(staff.getChiefOrganiser());
        Wedding wedding2 = new Wedding(staff.getChiefOrganiser());
        Wedding wedding3 = new Wedding(staff2.getChiefOrganiser());
        wedding.setCake(new Cake());
        wedding.startWedding();
        Events events = new Events();
        events.addEvent(wedding);
        events.addEvent(wedding2);
        events.addEvent(wedding3);
        System.out.println(events.getNameOfChiefForMostEvents());
    }

    private static Staff buildStaff1() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .helper(new Helper("helper1"))
                .helper(new Helper("helper2"))
                .helper(new Helper("helper3"))
                .helper(new Helper("helper4"))
                .helper(new Helper("helper5"))
                .helper(new Helper("helper6"))
                .helper(new Helper("helper7"))
                .helper(new Helper("helper8"))
                .helper(new Helper("helper9"))
                .helper(new Helper("helper10"))
                .organiser(new Organiser("organiser1"))
                .organiser(new Organiser("organiser2"))
                .chiefOrganiser(new ChiefOrganiser("chief1"))
                .build();
    }

    private static Staff buildStaff2() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .helper(new Helper("helper1"))
                .helper(new Helper("helper2"))
                .helper(new Helper("helper3"))
                .helper(new Helper("helper4"))
                .helper(new Helper("helper5"))
                .helper(new Helper("helper6"))
                .helper(new Helper("helper7"))
                .helper(new Helper("helper8"))
                .helper(new Helper("helper9"))
                .helper(new Helper("helper10"))
                .organiser(new Organiser("organiser1"))
                .organiser(new Organiser("organiser2"))
                .chiefOrganiser(new ChiefOrganiser("chief2"))
                .build();
    }
}
