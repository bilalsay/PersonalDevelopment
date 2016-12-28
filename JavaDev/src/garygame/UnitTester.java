package garygame;

import java.util.LinkedList;

/**
 * Created by bilalsay on 28.12.2016.
 */
public class UnitTester {
    public void testType(Unit unit, String type, String expectedOutputType) {
        System.out.println("\nTesting setting/getting the type property.");
        unit.setProperty("type", type);
        String outputType = (String) unit.getProperty("type");
        if (expectedOutputType.equals(outputType)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + outputType + " didn’t match " + expectedOutputType);
        }
    }

    public void testUnitSpecificProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputValue) {
        System.out.println("\nTesting setting/getting a unit-specific property.");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (expectedOutputValue.equals(outputValue)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + outputValue + " didn’t match " + expectedOutputValue);
        }
    }

    public void testChangeProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputValue) {
        System.out.println("\nTesting changing an existing property’s value.");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (expectedOutputValue.equals(outputValue)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: " + outputValue + " didn’t match " + expectedOutputValue);
        }
    }

    public void testNonExistentProperty(Unit unit, String propertyName) {
        System.out.println("\nTesting getting a non-existent property’s value.");
        Object outputValue = unit.getProperty(propertyName);
        if (outputValue == null) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed with value of " + outputValue);
        }
    }

    public static void main(String args[]) {
        UnitTester tester = new UnitTester();
        Unit unit = new Unit(2345);
        tester.testType(unit, "infantry", "infantry");
        tester.testUnitSpecificProperty(unit, "weapons", new LinkedList<Weapon>(), new LinkedList<Weapon>());
        tester.testChangeProperty(unit, "hitPoints", new Integer(15), new Integer(15));
        tester.testNonExistentProperty(unit, "strength");
    }
}