package ru.tatarinov.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.tatarinov.MySecondTestAppSpringBoot.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBonusServiceImplTest {

    @Test
    void calculate() {
        Positions position = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        double result = new AnnualBonusServiceImpl().calculate(position, salary, bonus,workDays);

        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculateQuarterlyBonus() {
        Positions position = Positions.CEO;
        double salary = 10000000.00;

        double result = new AnnualBonusServiceImpl().calculateQuarterlyBonus(position, salary);

        double expected = 250000000.00;
        assertThat(result).isEqualTo(expected);
    }
}