package com.epam.brest.course;

import com.epam.brest.course.calculation.Calculation;
import com.epam.brest.course.calculation.CalculationImpl;
import com.epam.brest.course.calculation.model.DeliveryCostModel;
import com.epam.brest.course.provider.FileReader;
import com.epam.brest.course.provider.FileReaderImpl;
import com.epam.brest.course.provider.model.FileModel;

import java.math.BigDecimal;
import java.util.Properties;
import java.util.Scanner;

/**
 * The type DeliveryCost.
 */
public class DeliveryCost {

    private static final String SELECT = "Select data reading method";
    private static final String POSTFIX = ", please. ";
    private static final String FILE_READING = "Console reading[y/n]?";
    private static final String CONSOLE_READING = "File reading[y/n]?";

    private static final String YES = "y";
    private static final String NO = "n";

    private static final String PREFIX_ENTER = "Enter";

    private static final String WEIGHT = "weight";
    private static final String DISTANCE = "distance";
    private static final String SECURITY_LEVEL = "security";

    private static final String FILE_NAME = "cost.properties";
    private static final String $ = "$";


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DeliveryCostModel deliveryCostModel = new DeliveryCostModel();
        Calculation calculation = new CalculationImpl();
        BigDecimal result;

        System.out.println(SELECT.concat(POSTFIX));
        System.out.println(FILE_READING);
        String key = scanner.nextLine();

        if (key.equals(YES)) {
            try {
                System.out.println(PREFIX_ENTER.concat(WEIGHT).concat(POSTFIX));
                deliveryCostModel.setWeight(scanner.nextDouble());
                System.out.println(PREFIX_ENTER.concat(DISTANCE).concat(POSTFIX));
                deliveryCostModel.setDistance(scanner.nextDouble());
                System.out.println(PREFIX_ENTER.concat(SECURITY_LEVEL).concat(POSTFIX));
                deliveryCostModel.setSecurityLevel(scanner.nextDouble());
                result = calculation.calculate(deliveryCostModel);
                System.out.println("Cost is ".concat(result.toString()).concat($));
                System.exit(0);
            } catch (IllegalArgumentException e) {
                System.out.println("error");
            }
        }

        System.out.println(CONSOLE_READING);
        key = scanner.nextLine();

        if (key.equals(YES)) {
            FileModel fileModel = new FileModel();
            fileModel.setFileName(FILE_NAME);
            FileReader fileReader = new FileReaderImpl();
            Properties properties = fileReader.read(fileModel);
            deliveryCostModel.setWeight(Double.valueOf(properties.getProperty(WEIGHT)));
            deliveryCostModel.setDistance(Double.valueOf(properties.getProperty(DISTANCE)));
            deliveryCostModel.setSecurityLevel(Double.valueOf(properties.getProperty(SECURITY_LEVEL)));
            System.out.println("testing");
            result = calculation.calculate(deliveryCostModel);
            System.out.println("Cost is ".concat(result.toString()).concat($));
        }


    }

}
