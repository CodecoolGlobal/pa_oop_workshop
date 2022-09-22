package com.codecool.eventmanagement.event;

import com.codecool.eventmanagement.employee.ChiefOrganiser;

import java.util.ArrayList;
import java.util.List;

public class Events {
    List<Event> events;

    public Events() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public String getNameOfChiefForMostEvents() {
        if (events.isEmpty()) {
            return null;
        }
        events.sort((o1, o2) -> getNumberOfEvents(o2.getChiefOrganiser()).compareTo(getNumberOfEvents(o1.getChiefOrganiser())));
        return events.get(0).getChiefOrganiser().getName();
    }

    public Integer getNumberOfEvents(ChiefOrganiser chiefOrganiser) {
        int sum = 0;
        for (Event event : events) {
            if (event.getChiefOrganiser().equals(chiefOrganiser)) {
                sum++;
            }
        }
        return sum;
    }
}
