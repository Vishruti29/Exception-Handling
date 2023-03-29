package ExceptionHandling.moodAnalysis;
public class MoodAnalyser {
        private final String message;
        public MoodAnalyser(String message) {
            this.message = message;
        }
        public String analyseMood() {
            if (message.contains("happy")) {
                return "Happy";
            } else if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Unknown";
            }
        }
        public static void main(String[] args) {
            MoodAnalyser analyser = new MoodAnalyser("I am feeling happy today!");
            String mood = analyser.analyseMood();
            System.out.println("Mood is " + mood);
        }
}
