package com.codecool.eventmanagement.event;

import com.codecool.eventmanagement.employee.ChiefOrganiser;

public class Conference extends Event {
    public Conference(ChiefOrganiser chiefOrganiser) {
        super(chiefOrganiser);
    }

    public void giveBag(Guest guest) {
        if (guest.receivedBag) {
            System.out.println("You already received the bag");
            return;
        }
        guest.setReceivedBag(true);
        System.out.println("Here is your bag");
    }
}
