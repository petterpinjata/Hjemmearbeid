package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock roger = new PetRock("Roger");
    @Test
    public void getNavn() throws Exception {
        assertEquals("Roger", roger.getNavn());
    }

    @Test
    public void testUnHappyToStart() throws Exception {
        assertFalse(roger.isHappy());
    }

    @Test
    public void testHappyAftherPlay() throws Exception {
        roger.playWithRock();
        assertTrue(roger.isHappy());
    }
}