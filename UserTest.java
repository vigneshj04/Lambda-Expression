package com.Lambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTest {

    @Test
    public void userTest() {
        ValidateEntry userEntry = new ValidateEntry();
        assertEquals("Priyanka", userEntry.firstName("Chan"));
        assertEquals("Singh", userEntry.lastName("kumar"));
        assertEquals("5646564648", userEntry.contactNumber("9876543210"));
        assertEquals("abc.abcd@bl.co.go", userEntry.contactNumber("abc.abcd@bl.co.go"));
    }
}
