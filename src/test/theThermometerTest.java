package src.test;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ctr.theThermometer;

public class theThermometerTest {
    private theThermometer thermometer;

    @Test
    void adultLessthan95() {
        assertEquals("Hypothermia \nSEEK CARE", thermometer.adult(94));
    }
}
