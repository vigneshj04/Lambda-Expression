package com.Lambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

    @Test
    public void userTest() {
        ValidateEntry userEntry = new ValidateEntry();
        assertEquals("Chan", userEntry.firstName("Chan"));
        assertEquals("Kumar", userEntry.lastName("Kumar"));
        assertEquals("5646564648", userEntry.contactNumber("9876543210"));
        assertEquals("abc.abcd@bl.co.go", userEntry.contactNumber("abc.abcd@bl.co.go"));
    }
}
