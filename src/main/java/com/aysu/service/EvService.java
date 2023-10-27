package com.aysu.service;

import com.aysu.repository.EvRepository;

public class EvService {
    private EvRepository evRepository;

    public EvService() {
        this.evRepository = new EvRepository();
    }
}
