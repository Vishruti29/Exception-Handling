package com.Exception;
public class MoodAnalyser {
        private String message;
        public MoodAnalyser(String message) {
            this.message = message;
        }
        public String analyseMood() {
            if (message.contains("happy") || message.contains("Happy")) {
                return "HAPPY";
            } else if (message.contains("sad") || message.contains("Sad")) {
                return "SAD";
            } else {
                return "UNKNOWN";
            }
        }

}
