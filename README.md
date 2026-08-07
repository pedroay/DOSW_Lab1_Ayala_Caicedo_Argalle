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

---

## Lab Questions & Answers

1. **Team agreements: Add the agreements you defined in the Onboarding section here.**
   - Use descriptive branch names for each challenge (e.g., `feature/challenge1`).
   - Divide work equitably among team members (Pedro Ayala, Samuel Argalle, Javier Caicedo).
   - Test code locally before creating a pull request or merging into `main`.
   - Resolve merge conflicts collaboratively when combining branch features.

2. **What is the difference between `git merge` and `git rebase`?**
   - **`git merge`**: Combines two branches by creating a new merge commit. It preserves the exact historical timeline of both branches.
   - **`git rebase`**: Replays commits from one branch on top of another, creating a clean and linear project history without extra merge commits.

3. **What happens when two branches modify the same line of a file?**
   - Git cannot automatically determine which change to keep, so it generates a **merge conflict**. Git inserts conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`) into the file and stops the process until a developer manually resolves the conflict, tests the code, and commits the solution.

4. **How can you display the branch and merge history graphically in the terminal?**
   - By running the command: `git log --oneline --graph --decorate --all`

5. **What is the difference between a commit and a push?**
   - **Commit (`git commit`)**: Saves changes locally in your computer's Git database.
   - **Push (`git push`)**: Uploads local commits from your machine to the remote repository on GitHub.

6. **What are `git stash` and `git stash pop` used for?**
   - **`git stash`**: Temporarily shelves/hides uncommitted local changes to provide a clean working directory.
   - **`git stash pop`**: Restores the most recently stashed changes back into your working directory.

7. **What is the difference between `HashMap` and `Hashtable`?**
   - **`HashMap`**: Allows one `null` key and multiple `null` values; it is non-synchronized (faster, ideal for single-threaded tasks).
   - **`Hashtable`**: Does not allow any `null` keys or `null` values; it is synchronized (thread-safe, but slightly slower).

8. **What advantages does `Collectors.toMap()` provide over a traditional loop?**
   - It provides concise, declarative code that transforms stream elements into a Map while enabling explicit key collision resolution rules (such as `(existing, replacement) -> existing`) in a single line without manual loop boilerplate.

9. **When using `stream().map()` on a list of objects, what type of operation is being performed?**
   - It performs an **intermediate transformation operation**. It applies a function to transform each element in a stream into another form or object and returns a new `Stream`.

10. **What does `stream().filter()` do, and what does it return?**
    - It evaluates each element in a stream against a boolean predicate condition. It keeps only elements that return `true` and returns a **new `Stream`** containing the filtered elements.

11. **Describe the steps required to create a new feature branch from `develop`.**
    - **Step 1:** Switch to the develop branch: `git checkout develop`
    - **Step 2:** Pull the latest updates: `git pull origin develop`
    - **Step 3:** Create and switch to the new feature branch: `git checkout -b feature/challenge-name`

12. **What is the difference between `git branch` and `git checkout -b`?**
    - **`git branch <name>`**: Only creates the new branch, leaving you on your current working branch.
    - **`git checkout -b <name>`**: Creates the new branch AND immediately switches your workspace context to it.

13. **Why should new functionality be developed in `feature/*` branches instead of directly in `main`?**
    - Developing in `feature/*` branches keeps the `main` branch stable, clean, and production-ready. It allows team members to work on different challenges concurrently without breaking working code before peer review and merging.

