import models.Person;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test     //adnotacja
    void shouldCalculateCorrectSalary() {
        Person tomHanks = new Person("Tom", "Hanks");
        int actual = tomHanks.calculateSalary(3, 3);
        int expected = 9;

        // serce testu - asercja
        assertThat(actual).isEqualTo(expected);
//        assertThat(actual).as("Wynagrodzenie policzone nieprawidłwo").isGreaterThan(5)
    }
        @Test
    void shouldCalculateBonus(){
        Person tomHanks = new Person("Tom", "Hanks");
        int actual = tomHanks.giveBonus(3, 10);
        int expected = 20;
        assertThat(actual).as("Bonus policzone nieprawidłwo").isEqualTo(expected);
    }

   @Test
   void shouldCalculateBonusForRatingGraterThan10(){
        Person tomHanks = new Person("Tom", "Hanks");
        int actual = tomHanks.giveBonus(11, 10);
        int expected = 10;
        assertThat(actual).as("Bonus policzone nieprawidłwo").isEqualTo(expected);
    }






}
