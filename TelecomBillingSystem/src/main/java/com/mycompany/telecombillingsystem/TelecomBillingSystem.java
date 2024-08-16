/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telecombillingsystem;

/**
 *
 * @author stuart
 */
public class TelecomBillingSystem {

    public static void main(String[] args) {
        // Initial airtime loaded in UGX
        double initialLoad = 10000.0;

        // Service charge percentage
        double serviceChargeRate = 0.10; // 10%

        // Call cost per second in UGX
        double callCostPerSecond = 200.0;

        // Call duration in seconds (5 minutes = 5 * 60 seconds)
        int callDurationInSeconds = 5 * 60;

        // Calculate the service charge
        double serviceCharge = initialLoad * serviceChargeRate;

        // Calculate the total cost of the call
        double totalCallCost = callDurationInSeconds * callCostPerSecond;

        // Calculate the remaining balance
        double remainingBalance = initialLoad - serviceCharge - totalCallCost;

        // Display the remaining balance
        System.out.println("The remaining balance is: UGX " + remainingBalance);
    }
}

