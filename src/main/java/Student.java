import java.util.ArrayList;
import java.util.List;

class Student {
    //Создайте класс Студент, которая описывается:
    //Имя: строка
    //Оценки: массив целых чисел
    private String name;
    private List<Integer> scoresList;

    public Student(String name) {
        this.name = name;
        int[] scores = new int[]{};
        initScores(scores);
    }

    public Student(String name, int[] scores) {
        this.name = name;
        initScores(scores);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void initScores(int[] scores) {
        this.scoresList = new ArrayList<>();
        addScores(scores);
    }

    public void addScores(int[] scores) {
        for (int score : scores
        ) {
            if (score >= 2 && score <= 5) {
                this.scoresList.add(score);
            } else throw new IllegalArgumentException("Все оценки должны быть в диапазоне от 2 до 5");
        }
    }

    public List<Integer> getScoresList() {
        return scoresList;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                " " + scoresList;
    }
}
/*

При создании обязательно указать имя, и опционально набор оценок
Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
Оценки можно добавлять в любой момент, но нельзя удалять
Все оценки должны быть в диапазоне от 2 до 5
Весь набор оценок можно получить в любой момент
Задача считается решенной корректно, если выполняются требования инкапсуляции.
 */