package com.github.sn42.sample.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.sn42.sample.library.LibraryMarker;

@SpringBootApplication(scanBasePackageClasses = { ApplicationMarker.class, LibraryMarker.class })
public class SampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}