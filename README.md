A simple Java-based application for managing bank accounts. This system supports creating current and saving accounts,
performing deposits and withdrawals, transferring funds between accounts, and allowing the user to change account passwords securely.

Features
Create Accounts: Create both current and saving accounts.
Deposit and Withdrawal: Deposit or withdraw funds from your accounts securely.
Transfer Between Accounts: Transfer funds between two accounts (both current or both saving).
Password Protection: Every action requires a secure password for authentication.
Admin Access: Admin access is required to view account details.

Prerequisites
Java 8 or later.
An IDE like IntelliJ IDEA, Eclipse, or NetBeans, or simply use a command-line interface for compiling and running Java code.

Clone the Repository
To clone the repository, run the following command:
git clone https://github.com/your-username/bank-management-system.git

Compile and Run
Navigate to the project folder in your terminal.
Compile the Java program:
javac Main.java

Run the program:
java Main

Usage
Once the program is running, you will be presented with a menu of options to perform different actions:

Create a Current Account
Create a Saving Account
Show All Current Accounts
Show All Saving Accounts
Perform Withdrawal
Perform Deposit
Transfer Between Two Accounts
Change Account Password
Admin Access
Some operations (like viewing account details) require you to enter an admin password. The default admin password is SECURED.

Features
Account Creation: You can create current and saving accounts with specified details.
Deposits and Withdrawals: You can deposit and withdraw funds from any created account after providing the correct password.
Account Transfer: You can transfer funds between two accounts of the same type (current to current, saving to saving).
Password Change: Users can change their account password once they authenticate successfully.
Error Handling: The system throws appropriate exceptions for invalid operations (like incorrect passwords, exceeding account limits, etc.).

Error Handling
Incorrect Password: If the entered password is incorrect, the system will throw an exceptionpassword error.
Account Limit Exceeded: If an attempt is made to create more accounts than the predefined limit, the system will throw an exceptionoutofbound error.
Account Not Found: If a specified account number doesn't exist, an exception will be thrown.

Contributing
Contributions are welcome! If you find a bug or have an idea for an enhancement, feel free to open an issue or submit a pull request.
Please ensure that any changes you make are well-documented and tested.
