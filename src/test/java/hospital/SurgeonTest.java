package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "speciality", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10To20WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20,healthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelFrom20To15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test
    public void shouldExpectSalaryOf90K(){
        int salary = underTest.calculatePay();
        assertEquals(1000000, salary);
    }


}
