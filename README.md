# Computer_Build_With_Composition

This project demonstrates the concept of **Composition** in Java by building a `Computer` class that is composed of `Monitor`, `CPU`, and `Keyboard` classes. Composition is a design principle where one class contains objects of other classes to represent a "has-a" relationship.

---

## Features
- **Monitor Class**:
    - Represents the monitor of a computer with attributes such as brand, size, and resolution.
    - Includes a method to display monitor details.
- **CPU Class**:
    - Represents the central processing unit with attributes such as processor type, number of cores, and speed.
    - Includes a method to display CPU details.
- **Keyboard Class**:
    - Represents a keyboard with attributes like type and backlight support.
    - Includes a method to display keyboard details.
- **Computer Class**:
    - Combines `Monitor`, `CPU`, and `Keyboard` to represent a complete computer system.
    - Includes a method to display the details of all components.

---

## Code Overview

### 1. `Monitor` Class
- **Attributes**:
    - `brand`: Brand of the monitor.
    - `size`: Size of the monitor in inches.
    - `resolution`: Resolution of the monitor (e.g., 1920x1080).
- **Method**:
    - `displayDetails()`: Displays the monitor specifications.

### 2. `CPU` Class
- **Attributes**:
    - `processor`: Processor type (e.g., Intel i7).
    - `cores`: Number of processor cores.
    - `speed`: Speed of the processor in GHz.
- **Method**:
    - `displayDetails()`: Displays the CPU specifications.

### 3. `Keyboard` Class
- **Attributes**:
    - `type`: Type of the keyboard (e.g., Mechanical).
    - `hasBacklight`: Indicates if the keyboard has a backlight.
- **Method**:
    - `displayDetails()`: Displays the keyboard specifications.

### 4. `Computer` Class
- **Attributes**:
    - `monitor`: An object of the `Monitor` class.
    - `cpu`: An object of the `CPU` class.
    - `keyboard`: An object of the `Keyboard` class.
- **Method**:
    - `displayComputerDetails()`: Displays the details of all computer components.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `CompositionExample.java` file.

---

## Sample Output

```plaintext
Computer Specifications:
Monitor Brand: Dell
Size: 24 inches
Resolution: 1920x1080
Processor: Intel i7
Cores: 8
Speed: 3.6 GHz
Keyboard Type: Mechanical
Backlight: Yes
