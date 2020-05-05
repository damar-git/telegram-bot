package com.damar.telegram.model;

import com.damar.telegram.model.eventdate.Dates;
import lombok.Data;

@Data
public class Event {

    private String name;

    private String url;

    private Dates dates;

}
