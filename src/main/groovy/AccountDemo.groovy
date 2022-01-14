Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)

checking.withdraw(20)
BigDecimal total = checking.getBalance().plus(savings.getBalance())
println total
