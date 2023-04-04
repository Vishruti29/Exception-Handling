package com.Exception;

public class MoodAnalyser {
        private String message;
        public MoodAnalyser() {
            this.message = "";
        }
        public MoodAnalyser(String message) {
            this.message = message;
        }
        public String analyseMood() throws MoodAnalysisException {
            try {
                if (message.isEmpty()) {
                    throw new MoodAnalysisException(MoodAnalysisErrorType.EMPTY_MESSAGE_ERROR.getMessage());
                } else if (message.contains("sad") || message.contains("Sad")) {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            } catch (NullPointerException e) {
                throw new MoodAnalysisException(MoodAnalysisErrorType.NULL_MESSAGE_ERROR.getMessage());
            }
        }
}
