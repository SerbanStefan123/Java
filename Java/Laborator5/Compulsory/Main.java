package com.robot.imagemanager.Main;

import com.robot.imagemanager.Model.Image;
import com.robot.imagemanager.Repository.ImageRepository;
import com.robot.imagemanager.Exceptions.ImageException;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            ImageRepository repository = new ImageRepository();

            Image image1 = new Image("Pisica", LocalDate.now(), Arrays.asList("pisica", "animal"), Paths.get("C:\\Users\\Serban\\Desktop\\Poze\\Level1.jfif"));

            repository.addImage(image1);

            repository.displayImage(image1);

        }
        catch (ImageException e) {
            System.err.println("Eroare: " + e.getMessage());
            e.printStackTrace();
        }
    }
}