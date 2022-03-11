package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader reader = null;
        ArrayList customers = new ArrayList();

        try {
            reader = new BufferedReader(new FileReader("CustomersFile.csv"));

            String nextLine;
            for(int j = 0; (nextLine = reader.readLine()) != null; ++j) {
                String[] partOfNextLine = nextLine.split(";");
                if (!isFullName(partOfNextLine[0].strip())) {
                    throw new IllegalArgumentException("Incorrect Name " + partOfNextLine[0] + " in " + j + " row");
                }

                if (!islogin(partOfNextLine[1].strip())) {
                    throw new IllegalArgumentException("Incorrect Login " + partOfNextLine[1] + " in " + j + " row");
                }

                if (!isPassword(partOfNextLine[2].strip())) {
                    throw new IllegalArgumentException("Incorrect Password " + partOfNextLine[2] + " in " + j + " row");
                }

                if (!isPhoneNumber(partOfNextLine[3].strip())) {
                    throw new IllegalArgumentException("Incorrect Phone " + partOfNextLine[3] + " in " + j + " row");
                }

                customers.add(new Customer(partOfNextLine[0], partOfNextLine[1], partOfNextLine[2], partOfNextLine[3]));
            }
        } catch (IOException var16) {
            var16.printStackTrace();
        } catch (IllegalArgumentException var17) {
            var17.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Close file");
                } catch (IOException var15) {
                    var15.printStackTrace();
                }
            }

        }
        System.out.println(customers.toString());
        Seller seller = new Seller("dfsd", "123");
        seller.viewActiveCustomers(customers);
    }

    public static boolean isPhoneNumber(String str) throws IllegalArgumentException {
        String phoneNumberRegex = "\\+7[(]?(\\d{3})[)]?\\d{3}[-]?\\d{2}[-]?\\d{2}";
        return str.matches(phoneNumberRegex);
    }

    public static boolean isFullName(String str) {
        String fullNameRegex = "([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)";
        return str.matches(fullNameRegex);
    }

    public static boolean islogin(String str) {
        String loginRegex = "[A-Za-z0-9]{3,10}";
        return str.matches(loginRegex);
    }

    public static boolean isPassword(String str) {
        String passRegex = "[A-Za-z0-9]{6,10}";
        return str.matches(passRegex);
    }


}
