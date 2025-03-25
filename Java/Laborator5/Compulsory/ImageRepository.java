package com.robot.imagemanager.Repository;

import com.robot.imagemanager.Model.Image;
import com.robot.imagemanager.Exceptions.ImageException;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ImageRepository {
    private List<Image> images;

    public ImageRepository() {
        this.images = new ArrayList<>();
    }

    public void addImage(Image image) throws ImageException {
        if (image == null) {
            throw new ImageException("Imagine este nula!");
        }

        if (!Files.exists(image.fileLocation())) {
            throw new ImageException("Imaginea nu exista: " + image.fileLocation());
        }

        if (images.stream().anyMatch(img -> img.fileLocation().equals(image.fileLocation()))) {
            throw new ImageException("Imaginea exista deja in repository");
        }

        images.add(image);
    }


    public void displayImage(Image image) throws ImageException {
        try {
            if (!Desktop.isDesktopSupported()) {
                throw new ImageException("Eroare!");
            }

            Desktop desktop = Desktop.getDesktop();
            File imageFile = image.fileLocation().toFile();

            if (!desktop.isSupported(Desktop.Action.OPEN)) {
                throw new ImageException("Nu pot deschide fisierul din desktop");
            }

            desktop.open(imageFile);
        } catch (IOException e) {
            throw new ImageException("Eroare la afisarea imaginii " + e.getMessage(), e);
        }
    }

    public List<Image> getAllImages() {
        return new ArrayList<>(images);
    }
}