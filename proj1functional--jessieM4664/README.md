# Programming Assignment 1: Straight Line Program Interpreter - Functional Edition

-----

### Date Out: Tuesday, September 5
### Due Date: Tuesday, September 26 (start of class)

-----

## Introduction:

This introductory programming assignment is designed as a "warm-up" assignment involving tree data structures and encapsulation. Don't allow the expression "warm-up" to be misleading: this assignment contains several layers of complexity!

The assignment follows the Ch 1 introductory programming exercise in Appel's compiler textbook -- I used this assignment previously, and it's a really great "warm up" and Java refresher. I've extended the assignment a bit and you'll also be potentially exposed to some new ideas that you already practiced in Programming Assignment #0: unit tests, automatic grading, writing your own test cases, a complicated software pacakge structure, and object-oriented (oo) vs. functional style programming.

The wording and description in the Appel book is very, very dense. Anticipate reading the few pages in Ch. 1 many times before getting comforable enough to start coding. This is okay! This is expected! You may feel lost and overwhelemed at the onset of this assignment, but you'll feel satistied and feel like a better programmer afterwards.

## CSC416 vs CSC565:

There are two starter code projects for this assignment, "functional" and "OO", as briefly motivated by Appel.

* **CSC416 and CSC565:** Students in both CSC416 and CSC565 should implement the functional paradigm, as given in this starter code and testing files.
* **CSC565:** Students in CSC565 should also do a separate implementation in the object oriented paradigm.

## The Tasks:

1. **Understand.** This is a potentially challenging individual programming assignment. Utilize our slack channel for help and venting frustrations. Start now. Start now. Start now. Read and understand Section 1.3 (pp. 7-11) of the Appel text, and especially the grammar in Grammar 1.3 and the grammar's representation in Program 1.5. Then read the programming assignment (pp. 11-14). Re-read it; it is very dense.

2. **Ready to Start Coding?** Follow the same steps as in Programming Assignment #0 to "accept" the GHC assignment, and then clone your GH repo into your local IntelliJ.

3. Understand the starter code and its directory structure. Note the use of three different packages in the code:

   - src: `slpinterpreter` - any code that you write, you'll likely want to place here within this package. (Found under: src → main → java → slpinterpreter).
   - src: `slpinterpreter.grammar` - these Java classes implement Appel Grammar 1.3, and directly follow the Straight Line Program language from class. I've already written them for you. (Found under: src → main → java → slpinterpreter → grammar).
   - test: `slpinterpreter` - will contain test cases to be used for testing (and grading) your project. I've started you off with 5 SLP programs that your interpreter will interpret. (Found under: test → java → slpinterpreter)

4. **Running the project.** To run your code in IntelliJ, you'll want to run `slpinterpreter.Driver.main`. First, you'll want to make sure lines 19 and 22 compile **by adding the `MaxArgs` and `Interpreter` classes**.

5. **JUnit Testing and Understanding the tests.** I've provided five testing files to you, each one contains a single StraightLineProgram. There are two tests in each file: one for the max args task, the other for the interpreter task. In short, we are using the JUnit method `assertEquals` to see if the output of the program is correct. If either the maxargs or interpreter task is not yet implemented, the JUnit testing files will generate compiler errors. You can block comment out any tasks that you want to skip for now. Use Maven to run the 5 unit test files (for a total of 10 unit tests), just like in Programming Assignment #0 when you are ready.

## Submission instructions

Push your completed Java Maven project to your GitHub. Verify the success of the autograding GitHub Action.