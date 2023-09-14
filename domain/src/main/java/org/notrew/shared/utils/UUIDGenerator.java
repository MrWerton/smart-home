package org.notrew.shared.utils;

import java.util.UUID;

public class UUIDGenerator {

    static public String generate() {
        return UUID.randomUUID().toString();
    }
}
