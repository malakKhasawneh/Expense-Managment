package com.example.scanningreceiptstest.database

import com.example.scanningreceiptstest.Model.Person
import com.example.scanningreceiptstest.Model.Transaction

data class DBPerson(
    val phoneNumber: String, val name: String, val password :String, val groupId: String, val monthlySalary: Double,
    val totalIncome: Double, val savingAmount: Double, val savingWallet: Double, val remaining: Double
) {
    constructor() : this("", "", "","", 0.0, 0.0, 0.0, 0.0, 0.0)
}

fun DBPerson.toPerson(): Person {
    /***********/
    //get all expenses and incomes for this person
    // from DB and put it in a transaction list then pass it to the constructor
    val transactions: List<Transaction> = mutableListOf()
    //transactions = database.getAllExpenses(phoneNumber)
    //convert it from List<DBExpense> to List<Expense>

    return Person(
        phoneNumber,
        name,
        password,
        groupId,
        monthlySalary,
        totalIncome,
        savingAmount,
        savingWallet,
        transactions,
        remaining
    )
}