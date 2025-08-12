package main

// askPrincipal gets the user input for principal amount and validates it
fun askPrincipal(): Any? {
    println("Enter the principal amount")
    val principal = readLine()?.toDoubleOrNull() ?: run {
        println("Please enter a double, exiting.")
    }
    return principal
}

// askInterestRate gets the user input for interest rate and validates it
fun askInterestRate(): Any? {
    println("Enter the interest rate as a percentage")
    val interestRate = readLine()?.toDoubleOrNull() ?: run {
        println("Please enter a double, exiting.")
    }
    return interestRate
}

// askTimePeriods gets the user input for time periods and validates it
fun askTimePeriods(): Any? {
    println("Enter the number of equal time periods when interest is compounded (ex. number of years, months, or days)")
    val timePeriods = readLine()?.toIntOrNull() ?: run {
        println("Please enter an integer, exiting.")
    }
    return timePeriods
}

// askTotalInterest gets the user input for total interest paid and validates it
fun askTotalInterest(): Any? {
    println("Enter the total interest paid")
    val totalInterest = readLine()?.toDoubleOrNull() ?: run {
        println("Please enter a double, exiting.")
    }
    return totalInterest
}