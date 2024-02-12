class Account:
    def __init__(self, account_number, balance=0):
        self.account_number = account_number
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        print(f"Deposited ${amount}. New balance: ${self.balance}")

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print(f"Withdrew ${amount}. New balance: ${self.balance}")
        else:
            print("Insufficient funds.")

    def display_balance(self):
        print(f"Account Number: {self.account_number}\nBalance: ${self.balance}")


class SavingsAccount(Account):
    def __init__(self, account_number, interest_rate=0.01, balance=0):
        super().__init__(account_number, balance)
        self.interest_rate = interest_rate

    def calculate_interest(self):
        interest_amount = self.balance * self.interest_rate
        self.balance += interest_amount
        print(f"Interest added: ${interest_amount}. New balance: ${self.balance}")


class CheckingAccount(Account):
    def __init__(self, account_number, overdraft_limit=100, balance=0):
        super().__init__(account_number, balance)
        self.overdraft_limit = overdraft_limit

    def withdraw(self, amount):
        if amount <= self.balance + self.overdraft_limit:
            self.balance -= amount
            print(f"Withdrew ${amount}. New balance: ${self.balance}")
        else:
            print("Overdraft limit exceeded.")


savings_acc = SavingsAccount("SA123", interest_rate=0.02, balance=1000)
savings_acc.deposit(500)
savings_acc.calculate_interest()
savings_acc.withdraw(2000)
savings_acc.display_balance()

print("\n")

checking_acc = CheckingAccount("CA456", overdraft_limit=200, balance=500)
checking_acc.deposit(300)
checking_acc.withdraw(700)
checking_acc.display_balance()
