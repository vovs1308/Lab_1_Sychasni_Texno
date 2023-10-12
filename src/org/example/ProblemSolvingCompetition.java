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
        System.out.println(participant.getName() + " решает " + problemsCount + " задач.");
        // Здесь можно добавить логику для определения результатов соревнования по решению задач.
        // В данном примере, просто устанавливаем баллы в зависимости от количества решенных задач.
        int score = problemsCount * 5;
        participant.setScore(score);
        System.out.println(participant.getName() + " набрал " + score + " очков.");
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