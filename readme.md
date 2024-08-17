# RewardsConverter System
## Overview

This project is part of a task for the Credit Rewards Department at JPMorgan Chase. The goal was to enhance the RewardsConverter system, which handles conversions between various currencies, including cash, credit card points, and airline miles. The system was missing a crucial class, RewardValue, which is responsible for managing these conversions.
Project Description

The RewardsConverter system accepts a cash value and returns the corresponding value in airline miles. To achieve this, we needed to create a new class, RewardValue, which represents the correspondence between different currencies and handles conversions between them.
## Key Features:

### Cash to Miles Conversion: 
Convert a given cash value into airline miles using a fixed conversion rate.
### 
Miles to Cash Conversion: Convert a given miles value back into cash.    
### Constructor Overloading: The RewardValue class supports two constructors:
One that accepts a cash value.
Another that accepts a value in miles.
### Utility Methods:
           getCashValue(): Returns the cash value of the RewardValue object.
           getMilesValue(): Returns the miles value of the RewardValue object.

## Code Structure
### Main Classes

           RewardsConverter.java:
This class contains the main method, which serves as the entry point for the system. It prompts the user for a cash value, converts it to miles using the RewardValue class, and prints the result.

           RewardValue.java:
This class represents the relationship between cash and airline miles. It handles conversion between these two scales based on a fixed conversion rate.
### Key methods:
            getCashValue(): Returns the cash value.
            getMilesValue(): Returns the equivalent miles for the given cash value.
### Conversion Methods: 
Converts between miles and cash based on the rate of 1 mile = $0.0035.

## Tests
RewardValueTests.java:
        This file contains unit tests for the RewardValue class, ensuring that conversions between cash and miles are accurate and that the class functions as expected.


## Future Improvements

Additional Conversions: Extend the system to handle more types of conversions, such as converting between credit card points and other currencies.
Dynamic Conversion Rates: Allow for dynamic conversion rates instead of hardcoding them.

## Conclusion

This project successfully implements the missing RewardValue class, allowing the RewardsConverter system to function as intended. By handling conversions between cash and airline miles, this system provides a foundational capability for broader financial operations.
