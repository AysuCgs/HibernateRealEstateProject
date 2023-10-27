package com.aysu.controller;

import com.aysu.service.EvService;

public class EvController {

    private EvService evService;

    public EvController() {
        this.evService = new EvService();
    }
}
