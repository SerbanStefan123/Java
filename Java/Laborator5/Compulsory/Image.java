package com.robot.imagemanager.Model;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public record Image(String name, LocalDate date, List<String> tags, Path fileLocation) {

}