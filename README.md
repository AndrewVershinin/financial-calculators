# Project Description

Create a new GitHub project named financial-calculators,
and clone it to your workshops directory.
Read all of the project requirements before you begin to code. Use
your notebook to plan your project. Use the links provided in the
Hints section to help research how each calculator should work.
The Project

You will build an application for a financial organization that wants
to provide a set of financial calculators for their clients. The screen
will prompt the user to select which calculator they would like to
use.

They are interested in having you implement as many of the
following calculators you can in the time allotted. Expectations:
Getting two done would be good, getting three done would be
great.

## Calculator 1: 
A mortgage calculator - it is used to calculate out
how much a monthly payment for a loan would be (minus any
insurance or taxes), as well as how much interest you would pay
over the life of the loan.

  a. It would accept the principal, interest rate, and loan length
from the user
  b. It would display the expected monthly payment and total
interest paid

Example: A $53,000 loan at 7.625% interest for 15 years would
have a $495.09/mo payment with a total interest of $36,115.99
This calculator would use a compounded interest formula.
M=P×(i*(1+i)^n / ((1+i)^n)-1)

- Monthly Payment (M)
- Principal (P): This is the total amount of the loan.
- Annual Interest Rate (r): The nominal annual interest rate in
decimal form (e.g., 7.625% = 0.07625).
- Loan Term in Years (y) How many years the loan lasts.
- Number of Monthly Payments (n): This is 12×y (Because
there are 12 monthly payments per year.)
- Monthly Interest Rate (i): This is the annual interest rate
divided by 12, i.e. r/12
- Total Interest =(M×n)−P


## Calculator 2: 
A calculator that determines the future value of a
one-time deposit assuming compound interest - it is used to help
you decide how much a CD will be worth when it matures

  a. It would accept the deposit, interest rate, and number of
years from the user
  b. It would display the future value and the total interest
earned

Example: If you deposit $1,000 in a CD that earns 1.75%
interest and matures in 5 years, your CD's ending balance will
be $1,092.62 and you would have earned $92.62 in interest
Note: The numbers above assume daily compounding

FV = P × (1 + (r / 365))^(365 × t)

- Future Value (FV)
- Principal (P): This is the initial deposit amount.
- Annual Interest Rate (r): The nominal annual interest rate in decimal form
(e.g., 1.75% = 0.0175).
- Number of Years (t): The total number of years the deposit will earn interest.
- Days Per Year: Daily compounding assumes 365 days per year.
- Total Number of Days: This is 365 × t (because there are 365 days per year).
- Total Interest Earned = FV - P

##  Calculator 3: 
A calculator that determines the present value of an
ordinary annuity. (Note: this is difficult)

  a. It would accept the monthly payout, expected interest rate,
and years to pay out from the user

  b. It would display the present value of that annuity
  
Example: To fund an annuity that pays $3,000 monthly for 20
years and earns an expected 2.5% interest, you would need to
invest $566,141.46 today.
NOTE: If your results on any of these calculators are off by a
few pennies (not dollars!), don't worry. The difference is likely
attributable to rounding and we aren't that concerned about it
in this academy# workshops
