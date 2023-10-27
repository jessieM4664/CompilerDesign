# Programming Assignment 0

## Date Out: Tuesday, August 29

## Due Date: Tuesday, September 12 (start of class)

This introductory programming assignment will help familiarize you with the development environment of this course:
* Java for programming
* IntelliJ CE (community edition) IDE for coding, debugging, and more!
* Maven, a project manager for specifying project structure and dependencies
* JUnit 4, for unit testing
* Git, for version control
* GitHub and GitHub Actions CI, for uploading your code and having it run automatically against testcases
* GitHub Classroom, for the distribution and submission of assignments

In this assignment, you'll experiment with each of these aspects to get familiar with them, and will write some basic code and tests, ultimately
submitting them using GitHub Classroom.

***This assignment will not be graded.*** However, it's like a normal assignment in every other way: there is a deadline for you to aim for, you'll be writing Java code, you'll be running automatic tests on Java code, and you'll be submitting via GitHub.

**There is no expectation that you have any prior experience or knowledge with IntelliJ, Maven, JUnit, GitHub, version control systems, or GitHub Classroom.** I'll explain and demonstrate what you need to know to do this. However, there is a learning curve with using any distributed version control system, such as GitHub, so it's perfectly normal (and expected) that you'll have questions and for there to be some learning pains. **Ask clarification questions on our course Discord server, and collaborate on the troubleshooting with your peers.**

## First Steps, What To Install and Accounts to Create
1. Java JDK (only if you do not have the java compiler on your machine)
2. IntelliJ CE
3. GitHub Account (you'll be linking your GH acct to our GitHub "compilers" classroom when you accept an assignment. It is fine if you want to use a personal GH acct.)
4. You **do not** need to download JUnit or Maven ahead of time.

## Programming Assignment Workflow

As I explained in class, you will be engaging in the following workflow to complete your assignments in this course:

0. Create a GitHub account if necessary.
1. Accept the assignment in our GitHub Classroom. An assignment link will be posted on our course homepage.
2. GitHub then copies the starter code of the assignment from my GitHub repository, into your own private repository. (It is **private** so no one else can view your code, except me. It also will not count against any repo limit on your GitHub account.)
3. Open IntelliJ. Select `File` -> `New` -> `Project From Version Control`. Type in your external private repository location from GH.
4. **Clone** (download) the project starter code onto your local machine.
5. Code/run/test your code locally.
6. When you are ready to submit the assignment, **commit** and **push** back to GitHub.
7. Check the _Actions_ for your project repository -- the autograded test results.
8. You may resubmit as often as you would like before the assignment deadline.

## Java Methods to Modify

Once you have your project loaded into IntelliJ, this 
programming assignment tasks you with making minor modifications
to a couple of Java methods:

1. Look at and examine `src/main/java/compilers/App.java`. There is a `main`, plus three additional methods. Two of them are coded incorrectly. Also notice the `main` method which can run the program -- is already coded are some example function calls. **This is the only file you are modifying.**
2. The testing file `src/test/java/compilers/AppTest.java`, using JUnit 4, contains methods that unit test the code. **Do not modify anything here.** These are going to be similar to the auto unit tests that GitHub Classroom will execute on your code. 
3. After you think you fixed the code in `App.java`, you have a few options:
  * Use Maven execute phases in the build lifecycle that will to compile and test your code.
  * Run `App/main` via IntelliJ's green "run" triangle.
  * Run individual unit tests in `AppTest` via the green "run" triangles there.
4. If your tests are passing, upload/commit the code to your GitHub Classroom repository. 

## Submission instructions

Push your completed Java Maven project to your GitHub. Verify the success of the autograding GitHub Action.

## Further Reading

If you would like to learn more about Maven (which you 
totally should do!) and why we are using it, here's the 
very very very brief overview:

[Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) helps control the _lifecycles_ of Java projects, 
and standardizes where source files, compiled files, libraries, etc.,
are all kept. Without Maven, Java projects are somewhere like the Wild Wild 
West where different developers and IDEs can all do their own thing.

We'll only be using the very tip of the iceberg of Maven's capabilities in this 
course, and I'll be setting everything up for you. 

Maven introduces a [Standard Directory Layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) 
for projects, which 
if you notice, is aligned with the project directory in this assignment.
Don't touch the `pom.xml` file, which contains specifications that Maven
will process.

We'll also be using the [Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html), specifically the `validate`,
`compile`, and `test` phases for compiling and testing our code.