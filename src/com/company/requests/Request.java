package com.company.requests;

import java.io.BufferedReader;

public interface Request {
    void fulfillRequest(BufferedReader reader);
}
