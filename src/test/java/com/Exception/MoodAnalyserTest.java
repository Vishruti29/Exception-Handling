package com.Exception;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void testAnalyseMoodReturnsSad() {
        MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
        String mood = analyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
}
