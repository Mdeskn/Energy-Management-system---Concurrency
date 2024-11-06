You're right; expanding the README with a bit more detail on each new feature and concept can help provide a clearer overview of the project's functionality and purpose. Here’s an extended version:

---

# Energy Management System

## Project Name:
Energy Management System (Concurrency and Multithreading)

## Description:
This project simulates an Energy Management System designed to manage log files for charging stations and energy sources, with capabilities to create daily logs, view logs, simulate data exchanges, and manage log files (create, delete, move, and rename). In this latest version, we’ve added multithreaded simulation of battery charging and usage. This addition brings real-time, concurrent simulation of energy management, providing insights into the simultaneous charging and usage of energy resources.

Through multithreading, the project showcases the practical application of concurrency in energy management, along with a deeper understanding of concurrency models, concurrency vs. parallelism, and blocking vs. non-blocking algorithms.

### Key Features and Requirements:
1. **Log File Management**:
   - Implemented in the **LogFileManager** class, which allows users to systematically manage log files for each energy source or charging station. The key functionalities include:
     - **Creating logs**: Generates daily logs for each piece of equipment.
     - **Viewing logs**: Users can retrieve specific logs by date or equipment name.
     - **Deleting, moving, and renaming logs**: Provides options for organizing and archiving log files effectively.

2. **Simulate Data Exchange Using Streams**:
   - Implemented in the **DataExchangeSimulation** class, which uses byte streams to simulate data exchanges between energy stations and the management system. This functionality includes error simulation, showcasing how data streams handle disruptions or unexpected input/output errors.

3. **Multithreaded Battery Charging and Usage Simulation**:
   - Implemented using the **Battery**, **BatteryCharger**, and **BatteryUser** classes. This feature brings concurrency into the project by simulating simultaneous charging from multiple energy sources and usage by multiple energy consumers:
     - The `Battery` class manages the charge level, with synchronized methods to ensure thread-safe interactions between charging and usage.
     - The `BatteryCharger` class simulates multiple sources charging the battery, with random intervals and charge amounts, showcasing the dynamic nature of energy intake.
     - The `BatteryUser` class simulates multiple energy-consuming devices or operations that drain energy from the battery, with checks to prevent overuse.
   - **Control Overload**: The simulation includes safeguards to prevent the battery charge level from exceeding 100% or dropping below 0%, simulating realistic control over energy resources in the system.

4. **Concurrency Concepts and Analysis**:
   - The project includes research and explanations on concurrency topics for deeper insight, covering:
     - **Comparison of concurrency models (Pros & Cons)**: Analysis of various concurrency models used in software systems, comparing their advantages and disadvantages.
     - **Concurrency vs. Parallelism**: Explanation of these two core concepts, highlighting their differences and applications.
     - **Blocking vs. Non-blocking Concurrency Algorithms**: Overview of different approaches to managing tasks in concurrent systems, discussing when to use blocking versus non-blocking algorithms.

### New Role Distribution (Concurrency and Multithreading)

- **Maede Eskandari Borujerdi** - 7221435
  - Implemented **BatteryCharger.java** to simulate battery charging from multiple energy sources, with random intervals and amounts for dynamic simulation.
  
- **Vida Bahrami** - 7221533
  - Developed **BatteryUser.java** to simulate battery usage from multiple energy-consuming objects, including logic to prevent system overload.

- **Zahra Mahdion** - 7221957 & **Zahra Paya** - 7216582
  - Developed the **Battery.java** class to provide synchronized methods for concurrent charge management, ensuring thread safety for charging and usage.

### Instructions for Running the Project

1. **Clone or Download the Project**:
   - Clone the repository using:
   
   ```bash
   git clone https://github.com/Mdeskn/Energy-Management-system---Concurrency.git
   ```

2. **Import the Project into Eclipse**:
   - Open **Eclipse IDE**.
   - Navigate to **File > Import**.
   - Choose **General > Existing Projects into Workspace** and click **Next**.
   - Browse to the location where you saved or extracted the project and select the project folder.
   - Click **Finish** to import the project.

3. **Run the Program in Eclipse**:
   - In the **Package Explorer**, right-click the project folder.
   - Choose **Run As > Java Application**.
   - Use the on-screen menu to create logs, view logs, simulate data exchange, manage log files, or start the multithreaded battery simulation.
   - To stop the battery simulation, press "Enter" when prompted to return to the main menu.

4. **Running Unit Tests**:
   - In the **test** package, right-click `AllTests.java`.
   - Choose **Run As > JUnit Test** to run the test suite.
   - Verify that all tests pass successfully. Results are displayed in the **JUnit** tab within Eclipse.

### Screenshots:
Below are screenshots of key project results, such as successful unit test execution, system outputs, and concurrency simulation.

**Battery Charging and Usage Simulation**:
   - A screenshot showing concurrent charging and usage of the battery in real-time.

   ![Battery Simulation](https://github.com/Mdeskn/Energy-Management-system---Concurrency/blob/41658e530fe10c12eca383f218695ff980cd61f8/imgs/Screenshot%202024-11-05%20144830.jpg)

---

This project was developed for the **Concurrency and Multithreading Assignment** under the supervision of **Dr. Prof. Galyna Tabunshchyk**.

## [Link to Video]([https://fhdoprod-my.sharepoint.com/:v:/g/personal/maede_eskandariborujerdi001_stud_fh-dortmund_de/ETYJqdaYkoFDsCINwNEW8WoBGn53bEl_eJs_sm5yRbmQ4A?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=fguJfz])
