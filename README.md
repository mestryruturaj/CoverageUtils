CoverageUtils
Streamline your code coverage with CoverageUtils, a Java utility package leveraging Java 8's Supplier feature to simplify logical operations.


Features
performLogicalAnd: Condenses multiple boolean conditions into a single branch with logical AND operations.
performLogicalOr: Simplifies complex conditional statements by executing logical OR operations on boolean suppliers.
performLogicalNot: Enhances code readability and conciseness with logical NOT operations on boolean suppliers.

Usage
Simply include the CoverageUtils package in your Java project and start streamlining your code coverage today!


// Example usage of performLogicalAnd
boolean result = CoverageUtils.performLogicalAnd(() -> condition1(), () -> condition2(), () -> condition3());

// Example usage of performLogicalOr
boolean result = CoverageUtils.performLogicalOr(() -> condition1(), () -> condition2(), () -> condition3());

// Example usage of performLogicalNot
boolean result = CoverageUtils.performLogicalNot(() -> condition1());

Contributing
We welcome contributions to enhance CoverageUtils and make code coverage even more efficient! Fork the repository, make your changes, and submit a pull request.

License
CoverageUtils is licensed under the MIT License.
