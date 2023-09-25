package A04_Exceptions.B01_Exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Main_Exceptions {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Data base query
        System.out.println("In this moments the database query is running...");
        System.out.println("The query is finished");

        String[] clients_db = {"Juan", "Pedro", "Carlos", "María", "Pablo", "Luis", "Ana", "Sofía", "Lucía", "Jorge"};

        System.out.println("The query data is: " + Arrays.toString(clients_db));

        find_client(clients_db);
    }

    // Method to find a client in the database
    // Receive a database and ask for the index of the client
    // If the index is out of range, the method will be called again, managing the exception
    static void find_client(String[] clients_db) {

        System.out.println("Enter the index of the client you want to find: ");
        int index_client_db = input.nextInt();

        try {
            System.out.println("The name of the customer in " + index_client_db + "th position is: " + clients_db[index_client_db]);
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("Error: " + e.getMessage());
            System.out.println("Try again, please. The index must be between 0 and " + (clients_db.length - 1));
            find_client(clients_db);
        }
    }
}
