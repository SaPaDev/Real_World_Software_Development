package ch.sapa.chapter_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {

    private static final String RESOURCES = "C:\\Users\\salomonp\\Desktop\\SaPa_Dev\\01.Git\\Real_World_Software_Development\\src\\main\\resources\\bank_trx.csv";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCES);
        final List <String> lines = Files.readAllLines(path);
        double total = 0d;

        for (final String line:lines){
            final String [] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;

        }
        System.out.println("The total for all transactions is " + total);

    }
}
