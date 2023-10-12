package org.example;

public class RunningCompetition implements Competition {
    private Participant participant;
    private int distance; // Расстояние для соревнования

    public RunningCompetition(Participant participant, int distance) {
        this.participant = participant;
        this.distance = distance;
    }

    @Override
    public void performCompetition() {
        System.out.println(participant.getName() + " бежит " + distance + " метров.");
        // Здесь можно добавить логику для определения результатов бегового соревнования.
        // В данном примере, просто устанавливаем баллы в зависимости от расстояния.
        int score = distance / 2;
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
