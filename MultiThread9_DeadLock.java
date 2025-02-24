public class MultiThread9_DeadLock {
    public static void main(String[] args) {
        final Object resource1 = "Every love is phala phala pyar when it has a new beginning 1";
        final Object resource2 = "The beautiful girl for me is the person I like 2";

        // Thread 1 tries to lock resource 1
        Thread T1 = new Thread() {
            public void run() {
                String name = Thread.currentThread().getName();
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource1 by " + name);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource2 by " + name);
                    }
                }
            }
        };
        // Thread 2 tries to lock resource 2
        Thread T2 = new Thread() {
            public void run() {
                String name = Thread.currentThread().getName();
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource1 by " + name);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 2: locked resource2 by " + name);
                    }
                }
            }
        };
        T1.setName("Thread 1");
        T2.setName("Thread 2");
        T1.start();
        T2.start();
    }
}
/*
  * 1)(Thread1)--->[R1]
  * (Thread2)--->[R2]
  * 2)(Thread1)--->[R1]
  * |
  * -----------
  * |
  * (Thread2)--->[R2]
  * 
  * A deadlock happens when two or more threads are blocked, waiting for each
  * other to release the resources they hold.
  * In your code, Thread 1 locks resource1 first and then tries to lock
  * resource2, while Thread 2 locks resource2 first and then tries to lock
  * resource1. If both threads are started simultaneously, Thread 1 may lock
  * resource1, and Thread 2 may lock resource2. Then, they will both be stuck
  * waiting for the resource they need to be released by the other thread,
  * resulting in a deadlock.
  
  String name=Thread.currentThread().getName();
BANKER problem.
  synchronized (resource1) {                                              ]
    System.out.println("Thread 1: locked resource1 by " + name);          ]
    synchronized (resource2) {                                            ]
    System.out.println("Thread 1: locked resource2 by " + name);          ]
   synchronized (resource1) {                                             ]
    System.out.println("Thread 2: locked resource1 by " + name);          ]✔It is not causing deadlock situation because Both the threats are executing at the same time Thread one tries to access the resource one, and then it tries to access the resource too Now it is allocating the resource to not one anymore And now the threat to trials to access the resource one And when thread one is successfully executed, it deallocate the resources. And then the thread two canaccess the resource and make the output and then deALlocate it. 
    synchronized (resource2) {                                            ]
    System.out.println("Thread 2: locked resource2 by " + name);          ]

synchronized (resource1) {
    System.out.println("Thread 1: locked resource1 by " + name);           ]
    synchronized (resource2) {                                             ]
        System.out.println("Thread 1: locked resource2 by " + name);       ]  \/
   synchronized (resource2) {                                              ]  /\
    System.out.println("Thread 1: locked resource2 by " + name);           ] Deadlock
     synchronized (resource1) {                                            ]
        System.out.println("Thread 1: locked resource2 by " + name);       ]

LINUX operating system is an open source.The source code of it can be accessible by all over the world

GIT AND GITHUB
They are related to each other, but they are different

Github
______
is a Cloud based website OR hosting server 
   [WEBSITE]LOCAL SERVER/HOST MEANS You are the only person who have access to the website
            -------------
             YOUR SYSTEM

These are the concepts It is not related to any programming language
Github Is basically one type of website where we basically host our projects, source code and various types of files.
Github Can be useful in maintaining the source CODEThat means it allows to make changes in the source code
Github works in remote server.Github is a open source For collaborative purposes.
 Git is a software tool designed for version control. Git work is to keep the track of all changes
Without Git we cannot use Github
Github Works on remote server and Git works on local server
                                  [Project folder]Working Directory--->(Staging area)It is a place FROM where GIT starts its tracking--->[local repository]FOLDER--->ComMIt history.
https://git-scm.com/downloads
https://git-scm.com/download/win
https://github.com/git-for-windows/git/releases/download/v2.42.0.windows.2/Git-2.42.0.2-64-bit.exe
cmd command
git --version
program file --> GIT
c:\Program Files\Git
https://github.com/
E:\First Project
First Project Folder ---> Working directory ---> local system --->SSD--->E Drive

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
fatal: not a git repository (or any of the parent directories): .git
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project>
litral: saying is that it(file) is in the state of working directory,it is not yet changed/converted into remote or local repository
Until the file changed/converted into remote or local repository,it is not posiible to access through git
TO converted into remote or local repository,WE use this command
git init

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project>git init 
Initialized empty Git repository in C:/Users/Sumanta Bhattacharya/OneDrive/Documents/Desktop/First Project/.git/
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git init
Reinitialized existing Git repository in C:/Users/Sumanta Bhattacharya/OneDrive/Documents/Desktop/First Project/.git/
C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)
___________________________________________________________________________
By default, the branch which is created in Github is called master branch.
We will always work on main branch.
---------------------------------------------------------------------

TO not converted into remote or local repository,WE use this command
Remove-Item -Recurse -Force .git


Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

PS C:\Users\Sumanta Bhattacharya> git status
fatal: not a git repository (or any of the parent directories): .git
PS C:\Users\Sumanta Bhattacharya>




What specific features are you interested in using?
Select all that apply so we can point you to the right GitHub plan.


GitHub Collaboration Icon
Collaborative coding
Codespaces, Pull requests, Notifications, Code review, Code review assignments, Code owners, Draft pull requests, Protected branches, and more.

GitHub Automation and CI/CD Icon
Automation and CI/CD
Actions, Packages, APIs, GitHub Pages, GitHub Marketplace, Webhooks, Hosted runners, Self-hosted runners, Secrets management, and more.

GitHub Security Icon
Security
Private repos, 2FA, Required reviews, Required status checks, Code scanning, Secret scanning, Dependency graph, Dependabot alerts, and more.

Enterprise security
SAML, LDAP, IP allow list, GitHub Connect, and Audit log API.

GitHub Client Apps Icon
Client Apps
GitHub Mobile, GitHub CLI, and GitHub Desktop.

GitHub Project Management Icon
Project Management
Projects, Labels, Milestones, Issues, Unified Contribution Graph, Org activity graph, Org dependency insights, Repo insights, Wikis, and GitHub Insights.

GitHub Team Administration Icon
Team Administration
Organizations, Invitations, Team sync, Custom roles, Domain verification, Audit Log API, Repo creation restriction, and Notification restriction.

GitHub Community Icon
Community
GitHub Marketplace, GitHub Sponsors, GitHub Skills, and Electron.

U untracked
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        xyz.txt

nothing added to commit but untracked files present (use "git add" to track)

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git add xyz.txt
A index added means it has been entered into local repositary
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   xyz.txt

red untracted
green tracked

if we delete the file from the folder
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   xyz.txt

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    xyz.txt

another way to transfer from the local repository to working directory but not deleted
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git rm --cached xyz.txt
rm 'xyz.txt'
converted to U from A
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        xyz.txt

nothing added to commit but untracked files present (use "git add" to track)
now we can delete it from the folder
first method The history was remained, but in the second method, the history was deleted

cls/clear to clear the terminal

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git commit -m "my first commit"
[master (root-commit) 85231d7] my first commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 MyCode.txt

 PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git init -b main                
Initialized empty Git repository in C:/Users/Sumanta Bhattacharya/OneDrive/Documents/Desktop/First Project/.git/

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch main

No commits yet

nothing to commit (create/copy files and use "git add" to track)

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git commit -m "My first commit"
[main (root-commit) 8d1eac3] My first commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 MyCode.txt

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   MyCode.txt

no changes added to commit (use "git add" and/or "git commit -a")

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git add MyCode.txt
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   MyCode.txt

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git commit -m "My first commit"
[main f6494f1] My first commit
 1 file changed, 194 insertions(+)
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch main
nothing to commit, working tree clean

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git log
commit f6494f144be31c2fe5a5752377b4474c83ed364e (HEAD -> main)
Author: SumantaBhattacharya <sumanta2004@gmail.com>
Date:   Fri Nov 3 20:47:14 2023 +0530

    My first commit

commit 8d1eac3bb3f62a57de084ec7af947d61dc38ea19
Author: SumantaBhattacharya <sumanta2004@gmail.com>
Date:   Fri Nov 3 20:43:44 2023 +0530

    My first commit
(END)

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git diff
diff --git a/MyCode.txt b/MyCode.txt
index 54a5a03..b98290e 100644
--- a/MyCode.txt
+++ b/MyCode.txt
@@ -188,6 +188,24 @@ git init -b main (to change it from the branch master to main)

 we will work in the main branch

+
+git init: Initializes a new Git repository in the current directory, creating a .git directory to store all the version control information.
+
+Remove-Item -Recurse -Force .git: This command appears to be used to remove the .git directory, effectively undoing the initialization of the Git repository.
+
+git status: Checks and displays the current status of the files in your working directory, showing untracked, modified, and staged files.
+
+git add file.txt: Stages the changes in the file.txt to be committed. It prepares the file for the next commit.
+
+git rm --cached file.txt: Unstages the file.txt, which means the changes in this file will not be included in the next commit. This effectively reverses the "git add" operation for the specified file.
+
+git init -b main: Initializes a new Git repository and specifies the default branch name as "main" instead of the default "master."
+
+git commit -m "My first commit": Commits the staged changes to the Git repository, creating a new commit with the given commit message.
+
+These are essential Git commands for initializing a repository, managing changes, and making commits. Please let me know if you have any specific questions or if there's anything else you'd like to learn about Git and GitHub.
+
+
 


(END)

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git diff --staged
diff --git a/MyCode.txt b/MyCode.txt
index 54a5a03..702ce73 100644
--- a/MyCode.txt
+++ b/MyCode.txt
@@ -188,6 +188,25 @@ git init -b main (to change it from the branch master to main)
 
 we will work in the main branch

+
+git init: Initializes a new Git repository in the current directory, creating a .git directory to store all the version control information.
+
+Remove-Item -Recurse -Force .git: This command appears to be used to remove the .git directory, effectively undoing the initialization of the Git repository.
+
+git status: Checks and displays the current status of the files in your working directory, showing untracked, modified, and staged files.
+
+git add file.txt: Stages the changes in the file.txt to be committed. It prepares the file for the next commit.
+
+git rm --cached file.txt: Unstages the file.txt, which means the changes in this file will not be included in the next commit. This effectively reverses the "git add" operation for the specified file.
+
+git init -b main: Initializes a new Git repository and specifies the default branch name as "main" instead of the default "master."
+
+git commit -m "My first commit": Commits the staged changes to the Git repository, creating a new commit with the given commit message.
+
+These are essential Git commands for initializing a repository, managing changes, and making commits. Please let me know if you have any specific questions or if there's anything else you'd like to learn about Git and GitHub.
+YO
+
+The git log command is a useful tool for reviewing the history of changes in your Git repository, tracking who made each commit, and understanding the order and content of those commits.
 


(END)

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch main
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        INTRO.txt
        Redme.md

nothing added to commit but untracked files present (use "git add" to track)
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git add .
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git status
On branch main
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   INTRO.txt
        new file:   Redme.md
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\First Project> git push -u -f origin main
fatal: User cancelled dialog.
Enumerating objects: 16, done.
Counting objects: 100% (16/16), done.
Delta compression using up to 12 threads
Compressing objects: 100% (12/12), done.
Writing objects: 100% (16/16), 4.24 KiB | 724.00 KiB/s, done.
Total 16 (delta 3), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/SumantaBhattacharya/git-info.git
 + 04ca3e1...d81f77c main -> main (forced update)
branch 'main' set up to track 'origin/main'.

--------------------------------_______________________________________________
git init(to initialise to local repository from woking directory(to add .git))
Remove-Item -Recurse -Force .git
git status
git add file.txt
git rm --cached file.txt
git init -b main (to change it from the branch master to main)
git commit -m "My first commit"
git log(provides a history)
git diff
git diff --staged
git add . (It helps to track all the untracked files)
git remote add origin https://github.com/SumantaBhattacharya/git-info.git (for connection)
git push -u origin main
git push -u -f origin main
git branch
echo "# Name-git" >> README.md
git remote add origin https://github.com/SumantaBhattacharya/Name-git.git
dir
git branch feature-1 (to create a branch name is a user input like feature-1)
git checkout feature-1 (To switch from the main branch to feature-1 branch.)
git branch -d feature-1

we will work in the main branch

git init: Initializes a new Git repository in the current directory, creating a .git directory to store all the version control information.

Remove-Item -Recurse -Force .git: This command appears to be used to remove the .git directory, effectively undoing the initialization of the Git repository.

git status: Checks and displays the current status of the files in your working directory, showing untracked, modified, and staged files.

git add file.txt: Stages the changes in the file.txt to be committed. It prepares the file for the next commit.

git rm --cached file.txt: Unstages the file.txt, which means the changes in this file will not be included in the next commit. This effectively reverses the "git add" operation for the specified file.

git init -b main: Initializes a new Git repository and specifies the default branch name as "main" instead of the default "master."

git commit -m "My first commit": Commits the staged changes to the Git repository, creating a new commit with the given commit message.

These are essential Git commands for initializing a repository, managing changes, and making commits. Please let me know if you have any specific questions or if there's anything else you'd like to learn about Git and GitHub.

REMOTE WORKING DIRECTORY / REMOTE REPODITORY 

-b is branch
-d is delete

PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git branch
* main
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git branch feature-1
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git branch feature-1 
fatal: a branch named 'feature-1' already exists
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git branch
  feature-1
* main
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git checkout feature-1
Switched to branch 'feature-1'
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git branch
* feature-1
  main
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git branch -d feature-1
Deleted branch feature-1 (was 7b1b4ec).
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> git log --oneline
885f9fb (HEAD -> feature-1) added a branch
7b1b4ec (origin/main, main) changes added
58ade39 README.md added
c306835 Second commit
d81f77c Redme.md removed
a36b681 removed the INTRO.txt
116eb0d readme and introduction update
e0cef8e Data update
f6494f1 My first commit
8d1eac3 My first commit
(END)
echo "# Name-git" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/SumantaBhattacharya/Name-git.git
git push -u origin main

pwd-present working directory
PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project> dir


    Directory: C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---l        04-11-2023     16:15            229 INTRO.txt
-a---l        03-11-2023     21:08           9039 MyCode.txt
-a---l        04-11-2023     16:19             91 Name.txt
-a---l        04-11-2023     16:30             26 README.md
-a---l        03-11-2023     22:35             57 Redme.md


PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\Git Project>

git bash
Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 ~
$ pwd
/c/Users/Sumanta Bhattacharya

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 ~
$ ^C

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 ~
$ cd ..

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 /c/Users
$ cd ..

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 /c
$ E:/
bash: E:/: Is a directory
Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 /c
$ ^C

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 /c
$ cd /E

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 /E
$ ls
'$RECYCLE.BIN'/  'First Project'/  'Local Disk (D) - Shortcut.lnk'*  'System Volume Information'/

Sumanta Bhattacharya@LAPTOP-IRD7157V MINGW64 /E
$ ls -a
'$RECYCLE.BIN'/   ./   ../  'First Project'/  'Local Disk (D) - Shortcut.lnk'*  'System Volume Information'/


control+l = to clear

cmd
Microsoft Windows [Version 10.0.22621.2506]
(c) Microsoft Corporation. All rights reserved.

E:\>dir
 Volume in drive E has no label.
 Volume Serial Number is C4B2-6028

 Directory of E:\

19-10-2023  21:39    <DIR>          First Project
19-04-2023  23:14               515 Local Disk (D) - Shortcut.lnk
               1 File(s)            515 bytes
               1 Dir(s)  155,665,686,528 bytes free

E:\>git clone https://github.com/SumantaBhattacharya/git-info.git
Cloning into 'git-info'...
remote: Enumerating objects: 22, done.
remote: Counting objects: 100% (22/22), done.
remote: Compressing objects: 100% (13/13), done.
remote: Total 22 (delta 4), reused 22 (delta 4), pack-reused 0
Receiving objects: 100% (22/22), 4.78 KiB | 2.39 MiB/s, done.
Resolving deltas: 100% (4/4), done.
Those applications, which we open without any Internet connexion, are called desktop applications.And these are eventually GUI

https://www.javatpoint.com/java-swing
*/

                            

