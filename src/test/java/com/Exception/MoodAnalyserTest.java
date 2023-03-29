package com.Exception;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void testAnalyseMoodReturnsHappy() {
        MoodAnalyser analyser = new MoodAnalyser("I am in Any Mood");
        String mood = analyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
