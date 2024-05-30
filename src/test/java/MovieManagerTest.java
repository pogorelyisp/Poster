import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.MovieManager;

public class MovieManagerTest {


    @Test
    public void whatIsThereNow() {                   // показать что есть сейчас, без добавления фильмов
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingOneMovie() {                   // добавление одного фильма
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingAllMovie() {                   // вывод всех фильмов в порядке добавления
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");


        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены",
                "Человек-невидимка", "Тролли.Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findingAllMovie() {                   // вывод всех фильмов в порядке добавления
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены",
                "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findingFiveMovie() {                   // вывод фильмов в обратном порядке c лимитом в пять
        MovieManager manager = new MovieManager(5);


        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");


        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены",
                "Отель Белград",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findingMinLimitMovie() {                   // вывод фильмов в обратном порядке меньше лимита
        MovieManager manager = new MovieManager(5);


        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
//        manager.addMovie("Джентельмены");
//        manager.addMovie("Человек-невидимка");
//        manager.addMovie("Тролли.Мировой тур");
//        manager.addMovie("Номер один");


        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

