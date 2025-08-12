package main

// AskPrincipal gets the user input for principal amount and validates it
fun AskPrincipal(): Any? {
    println("Enter the principal amount")
    val principal = readLine()?.toDoubleOrNull() ?: run {
        println("Please enter a double, exiting.")
    }
    return principal
}

// AskInterestRate gets the user input for interest rate and validates it
fun AskInterestRate(): Any? {
    println("Enter the interest rate")
    val interestRate = readLine()?.toDoubleOrNull() ?: run {
        println("Please enter a double, exiting.")
    }
    return interestRate
}

// AskTimePeriods gets the user input for time periods and validates it
fun AskTimePeriods(): Any? {
    println("Enter the number of equal time periods when interest is compounded (ex. number of years, months, or days)")
    val timePeriods = readLine()?.toIntOrNull() ?: run {
        println("Please enter an integer, exiting.")
    }
    return timePeriods
}

// AskTotalInterest gets the user input for total interest paid and validates it
fun AskTotalInterest(): Any? {
    println("Enter the total interest paid")
    val totalInterest = readLine()?.toDoubleOrNull() ?: run {
        println("Please enter a double, exiting.")
    }
    return totalInterest
}