package com.Exception;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void testAnalyseMoodReturnsHappyWithNullMessage() {
        MoodAnalyser analyser = new MoodAnalyser(null);
        String mood = analyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
