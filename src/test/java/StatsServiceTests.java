import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTests {

    @Test
    void sumSales() {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int expected = 180;
        int actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void MiddleSales( ) {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        double expected = 15;
        double actual = service.middleSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void minSales( ) {
        StatsService service = new StatsService();


        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.minSales(sales);
        int expected = 9;

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void maxSales( ) {
        StatsService service = new StatsService();


        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.maxSales(sales);
        int expected = 8;

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void lessThanMiddleSales( ) {
        StatsService service = new StatsService();


        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.lessThanMiddleSales(sales);
        int expected = 7;
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void aboveMiddleSales( ) {
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int expected = 7;
        int actual = service.aboveMiddleSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}
