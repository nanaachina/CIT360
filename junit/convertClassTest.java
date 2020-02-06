/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author adm-achina
 */



// Test assertNotNull and assertEquals

class convertClassTest {

    // Test for not null and equals
    @Test
    public void testConvertToDouble() {
        String age = "1970";
        Double expAge = Double.valueOf(age);
        Double actual = convertClass.convertToDouble(age);

        assertAll("Do many assertions.", () -> {
            assertNotNull(actual);
            assertEquals(expAge, actual);
        });


    }
}