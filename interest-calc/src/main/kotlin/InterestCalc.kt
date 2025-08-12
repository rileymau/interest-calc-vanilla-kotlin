package main

import kotlin.math.ln
import kotlin.math.pow

// findPrincipal calculates the principal amount given user input for rate, time periods, and total interest paid
fun findPrincipal() {
    // Get user input for rate, time periods, and total interest paid
    val rate = (askInterestRate() as Number).toDouble()
    val time = (askTimePeriods() as Number).toDouble()
    val totalInterest = (askTotalInterest() as Number).toDouble()

    // Calculate the principal
    val denom = (Math.pow(1 + (rate / 100), time)) - 1
    val principal = totalInterest / denom
    print("The principal amount for rate $rate over $time periods paying $totalInterest in interest is: \n")
    println(principal)
}

// findRate calculates the interest rate given user input for principal, time periods, and total interest paid
fun findRate() {
    // Get user input for principal, time periods, and total interest paid
    val principal = (askPrincipal() as Number).toDouble()
    val time = (askTimePeriods() as Number).toDouble()
    val totalInterest = (askTotalInterest() as Number).toDouble()

    // Calculate the interest rate
    val inside = totalInterest / principal + 1
    val rate = 100 * (inside.pow(1 / time) - 1)
    print("The interest rate per time period for principal amount $principal over $time time periods paying $totalInterest in interest is: \n")
    println(rate)
}

// findTime calculates the number of time periods given user input for principal, interest rate, and total interest paid
fun findTime() {
    // Get user input for principal, interest rate, and total interest paid
    val principal = (askPrincipal() as Number).toDouble()
    val rate = (askInterestRate() as Number).toDouble()
    val totalInterest = (askTotalInterest() as Number).toDouble()

    // Calculate time periods
    val num = ln((totalInterest + principal) / principal)
    val denom =ln(1 + (rate / 100))
    val time = num / denom
    print("The number of time periods for principal $principal with interest rate $rate paying total interest $totalInterest is: \n")
    println(time)
}

// findTotalInterest calculates the total interest paid given user input for principal,
// interest rate, and number of time periods
fun findTotalInterest() {
    // Get user input for principal, interest rate, and time periods
    val principal = (askPrincipal() as Number).toDouble()
    val rate = (askInterestRate() as Number).toDouble()
    val time = (askTimePeriods() as Number).toDouble()

    // Calculate the total interest paid
    val inside = (1 + rate / 100)
    val totalInterest = principal * inside.pow(time) - principal
    print("The total interest paid for the rate $rate over $time periods with $principal principal is: \n")
    println(totalInterest)
}

// main() runs the app and centralizes user input
fun main() {
    println("Welcome to the Interest Calc!")

    // Ask what number they are calculating
    println("This calculator uses compound interest over consecutive time periods of equal length")
    println ("Are you calculating:")
    println("1. principal,")
    println("2. interest rate,")
    println("3. number of time periods, or")
    println("4. total interest paid?")
    println("Enter 1-4:")

    val choice = readLine()?.toIntOrNull()

    when (choice) {
        1 -> // find principal
            findPrincipal()
        2 -> // find interest rate
            findRate()
        3 -> // find time periods
            findTime()
        4 -> // find interest paid
            findTotalInterest()
        else -> println("Invalid option, please run again and choose 1-4.")
    }

    // Exit
    println("Thanks for using the calculator.")
}