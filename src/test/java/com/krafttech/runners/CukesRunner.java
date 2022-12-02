package com.krafttech.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(             // runner class ı ve features arasındaki bağlantıyı kurar
        features = "src/test/resources/features",    // features packagesinin path ini aldık.
        glue = "com/krafttech/step_definitions" // runner class ile step_definitions arasındaki bağlantığı kuruyoruz
                // step_definitions package sinin path ini aldık
                )

public class CukesRunner {

}



