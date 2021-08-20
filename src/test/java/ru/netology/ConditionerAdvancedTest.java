package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void setOntest() {
        ConditionerAdvanced conditionerAdvanced = new ConditionerAdvanced();
        conditionerAdvanced.setOn(true);
        assertTrue(conditionerAdvanced.isOn());
        conditionerAdvanced.setOn(false);
        assertFalse(conditionerAdvanced.isOn());
    }

    @Test
    public void setCurrentTempTest() {
        ConditionerAdvanced conditionerAdvanced = new ConditionerAdvanced();
        conditionerAdvanced.setCurrentTemperature(10);
        conditionerAdvanced.setMaxTemperature(100);
        conditionerAdvanced.setMinTemperature(0);

        conditionerAdvanced.setCurrentTemperature(101);
        assertEquals(10, conditionerAdvanced.getCurrentTemperature());

        conditionerAdvanced.setCurrentTemperature(-10);
        assertEquals(10, conditionerAdvanced.getCurrentTemperature());

        conditionerAdvanced.setCurrentTemperature(15);
        assertEquals(15, conditionerAdvanced.getCurrentTemperature());
    }
}