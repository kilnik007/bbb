package ru.mirea.task30;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapesTest {

    @Test
    public void testEquals() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 1 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void testHashCode() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 2 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void getAllShapes() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 3 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testGetAllShapes() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 4 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void getHowManyShapes() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 5 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void getAllFrequency() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 6 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void testToString() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 7 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void main() {
        try (FileWriter file
                     = new FileWriter("C:\\Users\\User\\Desktop\\JavaFirstMirea\\src\\ru\\mirea\\task31\\Test.md", true)) {

            file.write("Test 8 passed - \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
