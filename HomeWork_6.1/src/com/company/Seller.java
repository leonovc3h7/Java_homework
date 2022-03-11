package com.company;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Seller extends User {

    public Seller(String password, String login) {
        super(password, login);
    }

    public void viewActiveCustomers(ArrayList<Customer> customerArrayList) {
        Collections.sort(customerArrayList);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ActiveCustomersFile.csv"));
            for (Customer i : customerArrayList) {
                writer.write(i.toString() + "\n");
            }
            writer.close();
        } catch (IOException var1) {
            var1.printStackTrace();
        }


    }
}
