package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Competition> competitionsHistory = new ArrayList<>();
    private List<String> programDataCollection = new ArrayList<>();

    public static void main(String[] args) {
        // Создаем участников
        Participant mazhor = new Mazhor("Мажор");
        Participant rabotyaga = new Rabotyaga("Работяга");
        Participant student = new Student("Студент");
        Participant botanik = new Botanik("Ботаник");

        // Создаем массив соревнований
        Competition[] competitions = {
                new RunningCompetition(mazhor, 500),
                new RunningCompetition(rabotyaga, 800),
                new RunningCompetition(student, 400),
                new RunningCompetition(botanik, 200),
                new ProblemSolvingCompetition(mazhor, 15),
                new ProblemSolvingCompetition(rabotyaga, 20),
                new ProblemSolvingCompetition(student, 40),
                new ProblemSolvingCompetition(botanik, 60)
        };

        Main main = new Main();

        // Проводим соревнования и добавляем их в историю
        for (Competition competition : competitions) {
            competition.performCompetition();
            System.out.println(competition.getParticipant().toString());
            main.addCompetitionToHistory(competition);
        }

        // Выводим дату создания участника
        System.out.println("Creation date of " + mazhor.getName() + ": " + mazhor.getCreationDate());

        // Добавляем данные в коллекцию
        main.addDataToCollection("Data 1");
        main.addDataToCollection("Data 2");
        main.addDataToCollection("Data 3");

        // Получаем данные из коллекции и выводим их
        List<String> programData = main.getDataCollection();
        System.out.println("Сбор данных программы: " + programData);

        // Ищем данные в коллекции и выводим результат
        String searchData = "Data 2";
        boolean found = main.searchDataInCollection(searchData);
        System.out.println("Является '" + searchData + "' относится к коллекции? " + found);

        // Удаляем данные из коллекции
        main.removeDataFromCollection("Data 2");

        // Получаем обновленные данные из коллекции и выводим их
        programData = main.getDataCollection();
        System.out.println("Обновлен сбор данных программы: " + programData);

        // Определяем победителя
        Participant winner = main.findWinner(competitions);
        System.out.println("Победитель: " + winner.getName());
        System.out.println(mazhor.equals(rabotyaga)); // Сравнение участников
        System.out.println(mazhor.toString()); // Вывод информации о участнике
    }

    // Метод для добавления данных в коллекцию
    private void addDataToCollection(String data) {
        programDataCollection.add(data);
    }

    // Публичный метод для получения данных из коллекции
    public List<String> getDataCollection() {
        return programDataCollection;
    }

    // Публичный метод для поиска данных в коллекции
    public boolean searchDataInCollection(String data) {
        return programDataCollection.contains(data);
    }

    // Публичный метод для удаления данных из коллекции
    public void removeDataFromCollection(String data) {
        programDataCollection.remove(data);
    }

    // Метод для добавления соревнования в историю
    private void addCompetitionToHistory(Competition competition) {
        competitionsHistory.add(competition);
    }

    // Метод для определения победителя
    private Participant findWinner(Competition[] competitions) {
        Participant winner = competitions[0].getParticipant();

        for (Competition competition : competitions) {
            if (competition.getScore() > winner.getScore()) {
                winner = competition.getParticipant();
            }
        }

        return winner;
    }
}
