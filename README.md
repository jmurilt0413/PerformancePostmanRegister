# Performance Project 📈

## Tech Stack 💻
This project utilizes the following technologies:

* **SBT**: The Scala Build Tool, used for project build automation.
* **Scala**: A programming language for functional programming.
* **Gatling**: A load testing framework for generating and executing load scenarios.
* **Java 17**: Java programming language.

## Installation 🔧🔩🔨
### Windows ✅
1. Download and install the **[Java Development Kit 17](https://www.oracle.com/java/technologies/downloads/)**. Ensure to install the 64-bit version if your system is 64-bit.
2. Download and install **[Scala](https://www.scala-lang.org/download/)**.
3. Download and install **[SBT](https://www.scala-sbt.org/download/)**.
### MacOs ✅
1. Install Homebrew using the following command: ```/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"```
2. Download and install the **[Java Development Kit 17](https://www.oracle.com/java/technologies/downloads/)**.
3. Install Scala using Homebrew ```brew install scala```
4. Install SBT using Homebrew: ```brew install sbt```
## Running the Project ▶️
To execute the project, use the following command, replacing environment with the desired environment (either pre_prod or qa) and ClassName for the class that you want to execute:
   ```sbt -Denv=environment "gatling:testOnly *ClassName" ``` example
```bash 
#Example
sbt -Denv=pre_prod "gatling:testOnly *RegisterUserSimulation"
