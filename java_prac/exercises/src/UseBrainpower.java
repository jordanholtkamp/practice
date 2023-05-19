public class UseBrainpower {
    private static long mostPoints(int[][] questions) {
        long mostPoints = 0;
        long currentPoints = 0;

        for (int i = 0; i < questions.length; i++) {
            int brainpower = questions[i][1];
            int qPoints = questions[i][0];
            currentPoints = qPoints;
            int nextInd = i + brainpower + 1;
            while (nextInd < questions.length) {
                int[] nextQuestion = questions[nextInd];
                currentPoints += nextQuestion[0];
                nextInd += nextQuestion[1];
            }
            if (currentPoints > mostPoints) {mostPoints = currentPoints;}
        }

        return mostPoints;
    }

    public static void main(String[] args) {
        int[][] questions = new int[][] {{3,2}, {4,3}, {4,4}, {2,5}};
        System.out.println(mostPoints(questions));
        int[][] questions2 = new int[][] {{1,1}, {2,2}, {3,3}, {4,4}, {5,5}};
        System.out.println(mostPoints(questions2));
    }
}
