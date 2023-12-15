package org.example;

public class ProblemSolvingCompetition implements Competition {
    private final Participant participant;
    private final int problemsCount; // Количество задач для решения

    public ProblemSolvingCompetition(Participant participant, int problemsCount) {
        this.participant = participant;
        this.problemsCount = problemsCount;
    }

    @Override
    public void performCompetition() {
        try {
            if (problemsCount < 0) {
                throw new NegativeScoreException("Количество задач не может быть отрицательным.");
            }

            System.out.println(participant.getName() + " решает " + problemsCount + " задач.");
            int score = problemsCount * 5;
            if (score < 0) {
                throw new NegativeScoreException("Баллы не могут быть отрицательными.");
            }
            participant.setScore(score);
            System.out.println(participant.getName() + " набрал " + score + " очков.");
        } catch (NegativeScoreException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    @Override
    public Participant getParticipant() {
        return participant;
    }

    @Override
    public int getScore() {
        // Возвращаем баллы, которые были установлены в performCompetition
        return participant.getScore();
    }
}