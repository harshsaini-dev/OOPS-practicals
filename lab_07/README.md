# Lab Sheet 07 — Exceptions, Packages, Threads (30 exercises)

- `Q01.java`–`Q10.java`: exception handling.
- `package_Q11`–`package_Q20`: each self-contained package experiment, isolated to prevent package name collisions.
- `Q21.java`–`Q30.java`: multithreading.

## Run standalone programs

`javac Q01.java && java Q01` (change 01 to an appropriate number).

## Run package experiments

Open `package_Q11`, then run: `javac -d . $(find . -name '*.java')` on bash or compile listed `.java` files with `javac -d .` on Windows. Run `java Q11`.

For question 20 specifically: from `package_Q20`, execute `javac -d . Student.java college/students/Main.java`, then `java college.students.Main`. This preserves the question's required package name and `javac -d .` syntax.

In Q23, Java's actual `Thread.State` has NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED. "Running" is a scheduling concept, not a separate enum value. Thread priorities do **not** guarantee scheduling order. The unsafe counter in Q28 may occasionally happen to print the correct value; that does not make it thread-safe.
