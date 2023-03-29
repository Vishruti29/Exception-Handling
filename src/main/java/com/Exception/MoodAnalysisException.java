package com.Exception;
    public class MoodAnalysisException extends Exception {
        public MoodAnalysisException(String message) {
            super(message);
        }
    }
    enum MoodAnalysisErrorType {
        NULL_MESSAGE_ERROR("Mood message cannot be null."),
        EMPTY_MESSAGE_ERROR("Mood message cannot be empty.");
        private final String message;
        MoodAnalysisErrorType(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
}
