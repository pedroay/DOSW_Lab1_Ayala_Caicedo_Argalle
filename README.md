# DOSW Laboratory 1 - Solutions

## Team Members
- Pedro Ayala
- Samuel Argalle
- Javier Caicedo

---

## Challenge 1 – Team Introduction & Welcome Message

### Evidence

![Challenge evidence](images/challenge1.png)

### Description

Briefly explain:

- **What was implemented:** A Java application that uses a `Student` model class and a `WelcomeMessage` class. It uses Java Streams (`stream()`, `map()`, `collect()`) and Lambda expressions to generate a formatted welcome message containing student details and institutional emails.
- **How the work was divided:** Pedro built the `Student` class model, Samuel wrote the stream-based formatting logic in `WelcomeMessage`, and Javier integrated the main execution flow in `Challenge1.java`.
- **Which Git operations were used:** `git checkout -b feature/challenge1`, `git add`, `git commit`, `git push`, and `git merge main`.
- **Which conflicts appeared:** Text formatting merge conflicts in `WelcomeMessage.java` when combining stream mapping logic from different commits.
- **How the conflicts were resolved:** Inspected git conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`), manually unified string formatting, and validated the code output before committing.

## Challenge 2 – Parallel Race & Number Statistics

### Evidence

![Challenge evidence](images/challenge2.png)

### Description

Briefly explain:

- **What was implemented:** A numerical processing tool using functional interfaces (`java.util.function.Function`) and Lambda expressions to find minimum/maximum values, list size, and test numeric conditions (even, odd, divisible, multiple), returning results in a `Resultado` object.
- **How the work was divided:** Samuel created the min/max/count calculation lambda, Javier wrote the validation lambdas (`isDivisible`, `isMultiple`, `isOdd`, `isEven`), and Pedro created the `Resultado` model and main function logic.
- **Which Git operations were used:** `git checkout -b feature/challenge2`, `git commit`, `git pull origin main`, and `git merge`.
- **Which conflicts appeared:** A merge conflict in `ParallelRace.java` caused by overlapping changes to lambda function definitions.
- **How the conflicts were resolved:** Consolidated function names, preserved all validation lambdas, re-tested the class, and completed the merge commit.

## Challenge 3 – Message Transformation & Stream Operations

### Evidence

![Challenge evidence](images/challenge3.png)

### Description

Briefly explain:

- **What was implemented:** A string transformation method (`transformMessage`) using `Stream.generate()`, `.limit(3)`, `StringBuilder`, and `StringBuffer.reverse()` to repeat an input message 3 times with spaces and reverse the final result, wrapped in a `Function<String, String>` lambda.
- **How the work was divided:** Javier developed the stream generation and repetition logic, Pedro implemented string reversal using `StringBuffer`, and Samuel built the functional transformer wrapper and main execution method.
- **Which Git operations were used:** `git branch feature/challenge3`, `git checkout`, `git add`, `git commit`, and `git merge`.
- **Which conflicts appeared:** Merge conflicts in `Challenge3.java` due to duplicate import statements and method signatures.
- **How the conflicts were resolved:** Removed redundant imports, merged method signatures into a single clean implementation, and verified expected string output.

## Challenge 4 – Map Sorting & Merging

### Evidence

![Challenge evidence](images/challenge4.png)

### Description

Briefly explain:

- **What was implemented:** Sorting key-value pairs into `HashMap` and `Hashtable` collections using Java Streams and Key Comparators. Developed `mergeMap()` to combine map entries from two student sources while handling duplicate keys and output formatting.
- **How the work was divided:** Pedro implemented `mapsStudentA` using `HashMap`, Samuel implemented `mapsStudentB` using `Hashtable`, and Javier created `mergeMap()` to merge and format key-value outputs.
- **Which Git operations were used:** `git checkout -b feature/challenge4`, `git commit`, `git rebase main`, and `git push origin main`.
- **Which conflicts appeared:** Merge conflict in `mergeMap()` when handling duplicate key precedence between `HashMap` and `Hashtable`.
- **How the conflicts were resolved:** Adjusted key lookup checks (`containsKey`) to ensure correct precedence and avoid missing key-value pairs during merge.

## Challenge 5 – Collections Filtering & Priority Queue Arena

### Evidence

![Challenge evidence](images/challenge5.png)

### Description

Briefly explain:

- **What was implemented:** Data filtering across multiple collection types (`HashSet`, `TreeSet`, `PriorityQueue`). Multiples of 3 are filtered out into a `HashSet`, multiples of 5 into a `TreeSet`, and both sets are merged into a `PriorityQueue` which polls elements in ascending order.
- **How the work was divided:** Samuel created the `HashSet` filtering logic (`tree`), Javier created the `TreeSet` filtering logic (`processTreeSetStudentB`), and Pedro implemented `processPriorityQueue` and the arena polling loop.
- **Which Git operations were used:** `git checkout -b feature/challenge5`, `git add .`, `git commit`, `git push`, and `git merge`.
- **Which conflicts appeared:** Merge conflicts in `main()` caused by overlapping sample data list definitions.
- **How the conflicts were resolved:** Merged sample datasets (`datosA` and `datosB`), verified priority queue insertions, and tested the polling loop.

## Challenge 6 – Command Pattern & Action Dispatcher

### Evidence

![Challenge evidence](images/challenge6.png)

### Description

Briefly explain:

- **What was implemented:** A dynamic command registry and execution system using a `HashMap<String, Runnable>`. Developed `registerCommand()` to map command strings (`JOKE`, `SHOUT`, `WHISPER`, `ANALYZE`, `GREET`, `FAREWELL`, `SING`, `DANCE`) to lambda functions, and `executeCommand()` for safe execution.
- **How the work was divided:** Pedro created the command map registry and base switch logic, Samuel added additional action lambdas, and Javier implemented error handling and the execution runner.
- **Which Git operations were used:** `git checkout -b feature/challenge6`, `git commit`, `git pull`, and `git merge feature/challenge6`.
- **Which conflicts appeared:** Merge conflict in the switch expression when team members registered new command keys concurrently.
- **How the conflicts were resolved:** Combined all switch branches into a single unified switch expression, ensuring all 8 commands register cleanly.
