# CS121_bank
Java program that manages bank information

# UML
```mermaid
class diagram

interface HasMenu{
    + string menu()
    + void start()
}
class CheckingAccount {
    - double balance
    + CheckingAccount()
    + CheckingAccount(double balance)
    + main()
    + string menu()
    + void start()
    + double getBalance()
    + string getBalanceString()
    + void setBalance(double balance)
    + void makeDeposit()
    + void makeWithdrawal()
}
class SavingsAccount {
    - double interestRate
    + main()
    + calcInterest()
    + double getInterestRate()
    + void setInterestRate()
}
abstract User {
    - string userName
    - string PIN
    + boolean login()
    + boolean login(username, PIN)
    + string getUserName()
    + void setUserName(userName)
    + string getPIN()
    + void setPIN()
    abstract string getReport()
}
class Customer {
    - CheckingAccount checking
    - SavingsAccount savings
    + Customer()
    + Customer(userName, PIN)
    + void main()
    + void start()
    + string menu()
    + void changePIN()
    + string getReport()
}
HasMenu <|-- CheckingAccount
HasMenu <|-- User
CheckingAccount <-- SavingsAccount
User <--Customer
```
```mermaid
    info
```
