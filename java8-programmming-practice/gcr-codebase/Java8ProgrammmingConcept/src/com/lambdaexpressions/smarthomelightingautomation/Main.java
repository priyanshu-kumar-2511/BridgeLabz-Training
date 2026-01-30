package com.lambdaexpressions.smarthomelightingautomation;

/*1. Smart Home Lighting Automation
○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
commands) need to execute different light patterns.
○ Task: Use lambdas to define these light activation behaviors dynamically without
creating multiple classes.
*/
public class Main {

    public static void main(String[] args) {

        SmartLight light = new SmartLight();

        // Motion trigger behavior
        LightBehavior motionTrigger = () -> {
            System.out.println("Motion detected!");
            System.out.println("Lights ON at full brightness.");
        };

        // Time-based trigger behavior
        LightBehavior nightMode = () -> {
            System.out.println("Night mode activated.");
            System.out.println("Lights dimmed to 30%.");
        };

        // Voice command trigger behavior
        LightBehavior voiceCommand = () -> {
            System.out.println("Voice command received.");
            System.out.println("Changing light color to warm white.");
        };

        // Simulate triggers
        light.setBehavior(motionTrigger);
        light.trigger();

        System.out.println();

        light.setBehavior(nightMode);
        light.trigger();

        System.out.println();

        light.setBehavior(voiceCommand);
        light.trigger();
    }
}
