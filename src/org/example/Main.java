package org.example;
public class Main {

    public static void main(String[] args) {

        Participant mazhor = new Mazhor("Мажор");
        Participant rabotyaga = new Rabotyaga("Работяга");
        Participant student = new Student("Студент");
        Participant botanik = new Botanik("Ботаник");

        Competition[] competitions = {
                new RunningCompetition(mazhor, 500), // 500м пробежал мажора
                new RunningCompetition(rabotyaga, 800),
                new RunningCompetition(student, 400),
                new RunningCompetition(botanik, 200),
                new ProblemSolvingCompetition(mazhor, 15), // 15 задач для мажора
                new ProblemSolvingCompetition(rabotyaga, 20),
                new ProblemSolvingCompetition(student, 40),
                new ProblemSolvingCompetition(botanik, 60)
        };

        // Проводим состязания
        for (Competition competition : competitions) {
            competition.performCompetition();
            System.out.println(competition.getParticipant().toString()); // Вывод информации о каждом участнике
        }
        Example example = new Example();
        try {
            example.processNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }

        // Определяем победителя
        Participant winner = findWinner(competitions);
        System.out.println("Победитель: " + winner.getName());
        System.out.println(mazhor.equals(rabotyaga)); // Сравнение участников
        System.out.println(mazhor.toString()); // Вывод информации о участнике
    }

    private static Participant findWinner(Competition[] competitions) {
        Participant winner = competitions[0].getParticipant();

        for (Competition competition : competitions) {
            if (competition.getScore() > winner.getScore()) {
                winner = competition.getParticipant();
            }
        }

        return winner;
    }
}