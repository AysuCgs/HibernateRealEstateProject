package com.aysu.service;

import com.aysu.repository.KiralamaRepository;

public class KiralamaService {
    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {
        this.kiralamaRepository = new KiralamaRepository();
    }
}
