# javaCodeTestingGit
playground testing for using git

Some of the steps I did to understand git, while using the Java code for Basic programming project :

I have two github accounts

tauseef@nitc
hus@c
this hosts urwid form browser

radiumtau@gmail
curiousTauseef
hus@c
this hosts datingMingly
and bartWorldProject
------------------------------------------------------------------------
After a fresh installationof Ubuntu on HP dc7800 desktop
I tried to use github.
My intention was to first run successfully the world simulation project(in Java) on Eclipse
and the upload this project to my github account 
First step i did successfully - creating directory /home/tauseef/eclipseWorkspace/courseProject using eclipse->New Java project
whereby it automatically created src and bin directories. I also successfully ran the simulation project.

Next was git and github tasks
But I stil have not figured out three questions
1. I was having some problems with git installation on my system
I could see .git in my home but even after doing sudo apt-get remove i could still see .git
So 
1. Where did git get installed? Was it preinstalled or did i install it  today ?

I used this link specifically [http://mherman.org/blog/2013/10/11/basic-git-commands/#.V7wVWtEvC90]
to perform following steps :
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~$ mkdir git-repo
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~$ chmod a+rx git-repo/
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~$ ls
courses                               Documents        eclipseWorkspace  installedSoftwareList.txt  logOfDMIDECODE.txt   prolog                                   softwares            Videos
designPatterns                        Downloads        examples.desktop  kile                       Music                Public                                   systemStatusLog.txt
Desktop                               eclipse          gitInfo.txt       kileBuild                  namrataExamTips.txt  Screenshot from 2016-08-21 11-42-15.png  taskList.txt
detailLogsOfSoftwareInstallation.txt  eclipsePrograms  git-repo          linguistics                Pictures             softwareInstallTips.txt                  Templates
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~$ cd git-repo/
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ ls
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git clone git https://github.com/curiousTauseef/javaCodeTestingGit.git
fatal: repository 'git' does not exist
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git init
Initialized empty Git repository in /home/tauseef/git-repo/.git/
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git clone git https://github.com/curiousTauseef/javaCodeTestingGit.git
fatal: repository 'git' does not exist
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git config user.email
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git config --global user.email "radiumtau@gmail.com"
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git config user.email
radiumtau@gmail.com
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git clone https://github.com/curiousTauseef/javaCodeTestingGit.git
Cloning into 'javaCodeTestingGit'...
warning: You appear to have cloned an empty repository.
Checking connectivity... done.
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ ls
javaCodeTestingGit
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ cd javaCodeTestingGit/
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ ls
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ ls -a
.  ..  .git
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ ls
courseProject
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git add .
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   courseProject/.classpath
	new file:   courseProject/.project
	new file:   courseProject/.settings/org.eclipse.jdt.core.prefs
	new file:   courseProject/bin/world/Childbirth.class
	new file:   courseProject/bin/world/Death.class
	new file:   courseProject/bin/world/Entity.class
	new file:   courseProject/bin/world/Event.class
	new file:   courseProject/bin/world/Grid.class
	new file:   courseProject/bin/world/LivingEntity.class
	new file:   courseProject/bin/world/Marriage.class
	new file:   courseProject/bin/world/MovementOfPeople.class
	new file:   courseProject/bin/world/NonLivingEntity.class
	new file:   courseProject/bin/world/Program$1.class
	new file:   courseProject/bin/world/Program$Gender.class
	new file:   courseProject/bin/world/Program$NonLivingCategory.class
	new file:   courseProject/bin/world/Program.class
	new file:   courseProject/src/world/Childbirth.java
	new file:   courseProject/src/world/Death.java
	new file:   courseProject/src/world/Entity.java
	new file:   courseProject/src/world/Event.java
	new file:   courseProject/src/world/Grid.java
	new file:   courseProject/src/world/LivingEntity.java
	new file:   courseProject/src/world/Marriage.java
	new file:   courseProject/src/world/MovementOfPeople.java
	new file:   courseProject/src/world/NonLivingEntity.java
	new file:   courseProject/src/world/Program.java

tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ 
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git commit -am "initial commit of java project executed successfully on eclipse"
[master (root-commit) a407782] initial commit of java project executed successfully on eclipse
 26 files changed, 1813 insertions(+)
 create mode 100644 courseProject/.classpath
 create mode 100644 courseProject/.project
 create mode 100644 courseProject/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 courseProject/bin/world/Childbirth.class
 create mode 100644 courseProject/bin/world/Death.class
 create mode 100644 courseProject/bin/world/Entity.class
 create mode 100644 courseProject/bin/world/Event.class
 create mode 100644 courseProject/bin/world/Grid.class
 create mode 100644 courseProject/bin/world/LivingEntity.class
 create mode 100644 courseProject/bin/world/Marriage.class
 create mode 100644 courseProject/bin/world/MovementOfPeople.class
 create mode 100644 courseProject/bin/world/NonLivingEntity.class
 create mode 100644 courseProject/bin/world/Program$1.class
 create mode 100644 courseProject/bin/world/Program$Gender.class
 create mode 100644 courseProject/bin/world/Program$NonLivingCategory.class
 create mode 100644 courseProject/bin/world/Program.class
 create mode 100755 courseProject/src/world/Childbirth.java
 create mode 100755 courseProject/src/world/Death.java
 create mode 100755 courseProject/src/world/Entity.java
 create mode 100755 courseProject/src/world/Event.java
 create mode 100755 courseProject/src/world/Grid.java
 create mode 100755 courseProject/src/world/LivingEntity.java
 create mode 100755 courseProject/src/world/Marriage.java
 create mode 100755 courseProject/src/world/MovementOfPeople.java
 create mode 100755 courseProject/src/world/NonLivingEntity.java
 create mode 100755 courseProject/src/world/Program.java
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git status
On branch master
Your branch is based on 'origin/master', but the upstream is gone.
  (use "git branch --unset-upstream" to fixup)
nothing to commit, working directory clean
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git remote add origin https://github.com/curiousTauseef/javaCodeTestingGit.git
fatal: remote origin already exists.
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git push origin master
Username for 'https://github.com': curiousTauseef
Password for 'https://curiousTauseef@github.com': 
Counting objects: 34, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (31/31), done.
Writing objects: 100% (34/34), 27.61 KiB | 0 bytes/s, done.
Total 34 (delta 3), reused 0 (delta 0)
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/curiousTauseef/javaCodeTestingGit.git
 * [new branch]      master -> master
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$

---------------------------------------

Just to summarise
1. install git
2. check git command exists
3. create a local directory in your desktop where you can clone the repo from github
4. perform a git init in above created local directory
If you try to clone without doing a git init you will encouter following error :
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ git clone git https://github.com/curiousTauseef/javaCodeTestingGit.git
fatal: repository 'git' does not exist

5. Configure the email 
git config --global user.email "radiumtau@gmail.com"

6. Clone the project from github
git clone https://github.com/curiousTauseef/javaCodeTestingGit.git

7. verify on your local directory that clone has been done
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo$ ls
javaCodeTestingGit

8. Do a git add :
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git add .
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   courseProject/.classpath
	new file:   courseProject/.project
	new file:   courseProject/.settings/org.eclipse.jdt.core.prefs
	new file:   courseProject/bin/world/Childbirth.class
	new file:   courseProject/bin/world/Death.class
	new file:   courseProject/bin/world/Entity.class
	new file:   courseProject/bin/world/Event.class
	new file:   courseProject/bin/world/Grid.class
	new file:   courseProject/bin/world/LivingEntity.class
	new file:   courseProject/bin/world/Marriage.class
	new file:   courseProject/bin/world/MovementOfPeople.class
	new file:   courseProject/bin/world/NonLivingEntity.class
	new file:   courseProject/bin/world/Program$1.class

9.Finally do the commit
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git commit -am "initial commit of java project executed successfully on eclipse"
[master (root-commit) a407782] initial commit of java project executed successfully on eclipse
 26 files changed, 1813 insertions(+)
 create mode 100644 courseProject/.classpath
 create mode 100644 courseProject/.project
 create mode 100644 courseProject/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 courseProject/bin/world/Childbirth.class
 create mode 100644 courseProject/bin/world/Death.class
 create mode 100644 courseProject/bin/world/Entity.class
 create mode 100644 courseProject/bin/world/Event.class
 create mode 100644 courseProject/bin/world/Grid.class
 create mode 100644 courseProject/bin/world/LivingEntity.class
 create mode 100644 courseProject/bin/world/Marriage.class
 create mode 100644 courseProject/bin/world/MovementOfPeople.class
 create mode 100644 courseProject/bin/world/NonLivingEntity.class
 create mode 100644 courseProject/bin/world/Program$1.class
 create mode 100644 courseProject/bin/world/Program$Gender.class
 create mode 100644 courseProject/bin/world/Program$NonLivingCategory.class
 create mode 100644 courseProject/bin/world/Program.class
 create mode 100755 courseProject/src/world/Childbirth.java
 create mode 100755 courseProject/src/world/Death.java
 create mode 100755 courseProject/src/world/Entity.java
 create mode 100755 courseProject/src/world/Event.java
 create mode 100755 courseProject/src/world/Grid.java
 create mode 100755 courseProject/src/world/LivingEntity.java
 create mode 100755 courseProject/src/world/Marriage.java
 create mode 100755 courseProject/src/world/MovementOfPeople.java
 create mode 100755 courseProject/src/world/NonLivingEntity.java
 create mode 100755 courseProject/src/world/Program.java

10. even now i cant see the courseProject on github account in firefox

tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git status
On branch master
Your branch is based on 'origin/master', but the upstream is gone.
  (use "git branch --unset-upstream" to fixup)
nothing to commit, working directory clean
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git remote add origin https://github.com/curiousTauseef/javaCodeTestingGit.git
fatal: remote origin already exists.

11. After doing the push operation I am able to see the file on github in firefox
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git push origin master
Username for 'https://github.com': curiousTauseef
Password for 'https://curiousTauseef@github.com': 
Counting objects: 34, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (31/31), done.
Writing objects: 100% (34/34), 27.61 KiB | 0 bytes/s, done.
Total 34 (delta 3), reused 0 (delta 0)
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/curiousTauseef/javaCodeTestingGit.git
 * [new branch]      master -> master


More questions
2. What exactly happened with git add command in step 
3. What exactly happened with git commmit command in step 9 ?
4. I did not really understand what people meant here [http://stackoverflow.com/questions/20931108/how-to-sync-git-on-ubuntu-with-existing-github-projects]
5. What does this config list really mean ?
tauseef@tauseef-HP-Compaq-dc7800-Small-Form-Factor:~/git-repo/javaCodeTestingGit$ git config --list
user.email=radiumtau@gmail.com
core.repositoryformatversion=0
core.filemode=true
core.bare=false
core.logallrefupdates=true
remote.origin.url=https://github.com/curiousTauseef/javaCodeTestingGit.git
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*
branch.master.remote=origin
branch.master.merge=refs/heads/master

6. what is the concept of git branches ?
https://www.linux.com/learn/beginning-git-and-github-linux-users

At the end I recommend to read this - [http://readwrite.com/2013/10/02/github-for-beginners-part-2/]

-------------
I used folowing resource to upload my code on github through the use of git
[https://git-scm.com/book/en/v2/Git-Basics-Recording-Changes-to-the-Repository]
[http://stackoverflow.com/questions/7690108/how-to-push-local-changes-to-a-remote-git-repository-on-bitbucket]
[http://gitref.org/remotes/]
[http://readwrite.com/2013/10/02/github-for-beginners-part-2/]
[https://help.github.com/articles/adding-a-file-to-a-repository-from-the-command-line/]
[http://media.pragprog.com/titles/tsgit/chap-005-extract.html]

[tauseef git-repo]$ cp -rf ~/dnnCodePlayGround/vowelClassificationUsingTheano .
[tauseef git-repo]$ ls
javaCodeTestingGit  OpenBLAS  vowelClassificationUsingTheano
[tauseef git-repo]$ cd vowelClassificationUsingTheano/
[tauseef vowelClassificationUsingTheano]$ ls
classifier.py  python_speech_features-master  readme.txt
[tauseef vowelClassificationUsingTheano]$ gvim ~/git
gitInfo.txt  git-repo/    
[tauseef vowelClassificationUsingTheano]$ gvim ~/gitInfo.txt 
[tauseef vowelClassificationUsingTheano]$ cd ..
[tauseef git-repo]$ ls
javaCodeTestingGit  OpenBLAS  vowelClassificationUsingTheano
[tauseef git-repo]$ git init
Reinitialized existing Git repository in /home/tauseef/git-repo/.git/
[tauseef git-repo]$ ls
javaCodeTestingGit  OpenBLAS  vowelClassificationUsingTheano
[tauseef git-repo]$ cd vowelClassificationUsingTheano/
[tauseef vowelClassificationUsingTheano]$ git add .
[tauseef vowelClassificationUsingTheano]$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   classifier.py
	new file:   python_speech_features-master/.gitignore
	new file:   python_speech_features-master/LICENSE
	new file:   python_speech_features-master/README.md
	new file:   python_speech_features-master/aTest1.wav.txt
	new file:   python_speech_features-master/aTest2.wav.txt
	new file:   python_speech_features-master/aTest3.wav.txt
	new file:   python_speech_features-master/docs/Makefile
	new file:   python_speech_features-master/docs/make.bat
	new file:   python_speech_features-master/docs/source/conf.py
	new file:   python_speech_features-master/docs/source/index.rst
	new file:   python_speech_features-master/eTest1.wav.txt
	new file:   python_speech_features-master/eTest2.wav.txt
	new file:   python_speech_features-master/eTest3.wav.txt
	new file:   python_speech_features-master/example.py
	new file:   python_speech_features-master/features/__init__.py
	new file:   python_speech_features-master/features/base.py
	new file:   python_speech_features-master/features/sigproc.py
	new file:   python_speech_features-master/mfccCreate.py
	new file:   python_speech_features-master/mfccCreate.py~
	new file:   python_speech_features-master/mfccCreatever1.py
	new file:   python_speech_features-master/readme.txt
	new file:   python_speech_features-master/readme.txt~
	new file:   python_speech_features-master/setup.py
	new file:   python_speech_features-master/test/a/aGabi4.wav
	new file:   python_speech_features-master/test/a/aGabi4.wav.txt
	new file:   python_speech_features-master/test/a/aGabi5.wav
	new file:   python_speech_features-master/test/a/aGabi5.wav.txt
	new file:   python_speech_features-master/test/a/aTest1.wav
	new file:   python_speech_features-master/test/a/aTest1.wav.txt
	new file:   python_speech_features-master/test/a/aTest2.wav
	new file:   python_speech_features-master/test/a/aTest2.wav.txt
	new file:   python_speech_features-master/test/a/aTest3.wav
	new file:   python_speech_features-master/test/a/aTest3.wav.txt
	new file:   python_speech_features-master/test/a/basATrain4.wav
	new file:   python_speech_features-master/test/a/basATrain4.wav.txt
	new file:   python_speech_features-master/test/a/basATrain5.wav
	new file:   python_speech_features-master/test/a/basATrain5.wav.txt
	new file:   python_speech_features-master/test/allTestExamples.txt
	new file:   python_speech_features-master/test/e/basETrain4.wav
	new file:   python_speech_features-master/test/e/basETrain4.wav.txt
	new file:   python_speech_features-master/test/e/basETrain5.wav
	new file:   python_speech_features-master/test/e/basETrain5.wav.txt
	new file:   python_speech_features-master/test/e/eGabi4.wav
	new file:   python_speech_features-master/test/e/eGabi4.wav.txt
	new file:   python_speech_features-master/test/e/eGabi5.wav
	new file:   python_speech_features-master/test/e/eGabi5.wav.txt
	new file:   python_speech_features-master/test/e/eTest1.wav
	new file:   python_speech_features-master/test/e/eTest1.wav.txt
	new file:   python_speech_features-master/test/e/eTest2.wav
	new file:   python_speech_features-master/test/e/eTest2.wav.txt
	new file:   python_speech_features-master/test/e/eTest3.wav
	new file:   python_speech_features-master/test/e/eTest3.wav.txt
	new file:   python_speech_features-master/test/readme.txt
	new file:   python_speech_features-master/test/tauseefAllTestExamples.txt
	new file:   python_speech_features-master/test/tauseefAndBasTestExamples.txt
	new file:   python_speech_features-master/train/a/aGabi1.wav
	new file:   python_speech_features-master/train/a/aGabi1.wav.txt
	new file:   python_speech_features-master/train/a/aGabi2.wav
	new file:   python_speech_features-master/train/a/aGabi2.wav.txt
	new file:   python_speech_features-master/train/a/aGabi3.wav
	new file:   python_speech_features-master/train/a/aGabi3.wav.txt
	new file:   python_speech_features-master/train/a/aTrain1.wav
	new file:   python_speech_features-master/train/a/aTrain1.wav.txt
	new file:   python_speech_features-master/train/a/aTrain2.wav
	new file:   python_speech_features-master/train/a/aTrain2.wav.txt
	new file:   python_speech_features-master/train/a/aTrain3.wav
	new file:   python_speech_features-master/train/a/aTrain3.wav.txt
	new file:   python_speech_features-master/train/a/aTrain4.wav
	new file:   python_speech_features-master/train/a/aTrain4.wav.txt
	new file:   python_speech_features-master/train/a/aTrain5.wav
	new file:   python_speech_features-master/train/a/aTrain5.wav.txt
	new file:   python_speech_features-master/train/a/basATrain1.wav
	new file:   python_speech_features-master/train/a/basATrain1.wav.txt
	new file:   python_speech_features-master/train/a/basATrain2.wav
	new file:   python_speech_features-master/train/a/basATrain2.wav.txt
	new file:   python_speech_features-master/train/a/basATrain3.wav
	new file:   python_speech_features-master/train/a/basATrain3.wav.txt
	new file:   python_speech_features-master/train/aTrain1.wav.txt
	new file:   python_speech_features-master/train/allTrainExamples.txt
	new file:   python_speech_features-master/train/combinedTestTrainExamples.txt
	new file:   python_speech_features-master/train/e/basETrain1.wav
	new file:   python_speech_features-master/train/e/basETrain1.wav.txt
	new file:   python_speech_features-master/train/e/basETrain2.wav
	new file:   python_speech_features-master/train/e/basETrain2.wav.txt
	new file:   python_speech_features-master/train/e/basETrain3.wav
	new file:   python_speech_features-master/train/e/basETrain3.wav.txt
	new file:   python_speech_features-master/train/e/eGabi1.wav
	new file:   python_speech_features-master/train/e/eGabi1.wav.txt
	new file:   python_speech_features-master/train/e/eGabi2.wav
	new file:   python_speech_features-master/train/e/eGabi2.wav.txt
	new file:   python_speech_features-master/train/e/eGabi3.wav
	new file:   python_speech_features-master/train/e/eGabi3.wav.txt
	new file:   python_speech_features-master/train/e/eTrain1.wav
	new file:   python_speech_features-master/train/e/eTrain1.wav.txt
	new file:   python_speech_features-master/train/e/eTrain2.wav
	new file:   python_speech_features-master/train/e/eTrain2.wav.txt
	new file:   python_speech_features-master/train/e/eTrain3.wav
	new file:   python_speech_features-master/train/e/eTrain3.wav.txt
	new file:   python_speech_features-master/train/e/eTrain4.wav
	new file:   python_speech_features-master/train/e/eTrain4.wav.txt
	new file:   python_speech_features-master/train/e/eTrain5.wav
	new file:   python_speech_features-master/train/e/eTrain5.wav.txt
	new file:   python_speech_features-master/train/tauseefAllTrainExamples.txt
	new file:   python_speech_features-master/train/tauseefAndBasTrainExamples.txt
	new file:   python_speech_features-master/wavRead.py
	new file:   readme.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	../OpenBLAS/
	../javaCodeTestingGit/

[tauseef vowelClassificationUsingTheano]$ git commit -am "Initial commit of vowel classification toy code using Theano NN"
[master (root-commit) 695705e] Initial commit of vowel classification toy code using Theano NN
 107 files changed, 30545 insertions(+)
 create mode 100755 vowelClassificationUsingTheano/classifier.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/.gitignore
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/LICENSE
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/README.md
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/aTest1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/aTest2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/aTest3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/docs/Makefile
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/docs/make.bat
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/docs/source/conf.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/docs/source/index.rst
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/eTest1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/eTest2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/eTest3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/example.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/features/__init__.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/features/base.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/features/sigproc.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/mfccCreate.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/mfccCreate.py~
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/mfccCreatever1.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/readme.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/readme.txt~
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/setup.py
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aGabi4.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aGabi4.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aGabi5.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aGabi5.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aTest1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aTest1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aTest2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aTest2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aTest3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/aTest3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/basATrain4.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/basATrain4.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/basATrain5.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/a/basATrain5.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/allTestExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/basETrain4.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/basETrain4.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/basETrain5.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/basETrain5.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eGabi4.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eGabi4.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eGabi5.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eGabi5.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eTest1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eTest1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eTest2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eTest2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eTest3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/e/eTest3.wav.txt
 create mode 100644 vowelClassificationUsingTheano/python_speech_features-master/test/readme.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/tauseefAllTestExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/test/tauseefAndBasTestExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aGabi1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aGabi1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aGabi2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aGabi2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aGabi3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aGabi3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain4.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain4.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain5.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/aTrain5.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/basATrain1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/basATrain1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/basATrain2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/basATrain2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/basATrain3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/a/basATrain3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/aTrain1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/allTrainExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/combinedTestTrainExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/basETrain1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/basETrain1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/basETrain2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/basETrain2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/basETrain3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/basETrain3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eGabi1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eGabi1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eGabi2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eGabi2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eGabi3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eGabi3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain1.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain1.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain2.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain2.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain3.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain3.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain4.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain4.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain5.wav
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/e/eTrain5.wav.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/tauseefAllTrainExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/train/tauseefAndBasTrainExamples.txt
 create mode 100755 vowelClassificationUsingTheano/python_speech_features-master/wavRead.py
 create mode 100644 vowelClassificationUsingTheano/readme.txt
[tauseef vowelClassificationUsingTheano]$ git remote add origin https://github.com/curiousTauseef/vowelClassificationUsingTheano.git
[tauseef vowelClassificationUsingTheano]$ git push origin master
Username for 'https://github.com': curiousTauseef
Password for 'https://curiousTauseef@github.com': 
Counting objects: 120, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (119/119), done.
Writing objects: 100% (120/120), 6.49 MiB | 323.00 KiB/s, done.
Total 120 (delta 12), reused 0 (delta 0)
remote: Resolving deltas: 100% (12/12), done.
To https://github.com/curiousTauseef/vowelClassificationUsingTheano.git
 * [new branch]      master -> master
[tauseef vowelClassificationUsingTheano]$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)

	../OpenBLAS/
	../javaCodeTestingGit/

nothing added to commit but untracked files present (use "git add" to track)
[tauseef vowelClassificationUsingTheano]$ ls
classifier.py  python_speech_features-master  readme.txt
[tauseef vowelClassificationUsingTheano]$ gvim readme.txt 
[tauseef vowelClassificationUsingTheano]$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   readme.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	../OpenBLAS/
	../javaCodeTestingGit/

no changes added to commit (use "git add" and/or "git commit -a")
[tauseef vowelClassificationUsingTheano]$ git remote -v
origin	https://github.com/curiousTauseef/vowelClassificationUsingTheano.git (fetch)
origin	https://github.com/curiousTauseef/vowelClassificationUsingTheano.git (push)
[tauseef vowelClassificationUsingTheano]$ git add readme.txt
[tauseef vowelClassificationUsingTheano]$ git status
On branch master
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	modified:   readme.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	../OpenBLAS/
	../javaCodeTestingGit/

[tauseef vowelClassificationUsingTheano]$ git commit -m "inserted my name into the readme.txt"
[master 321586c] inserted my name into the readme.txt
 1 file changed, 1 insertion(+)
[tauseef vowelClassificationUsingTheano]$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)

	../OpenBLAS/
	../javaCodeTestingGit/

nothing added to commit but untracked files present (use "git add" to track)
[tauseef vowelClassificationUsingTheano]$ git push origin master
Username for 'https://github.com': curiousTauseef
Password for 'https://curiousTauseef@github.com': 
Counting objects: 4, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 404 bytes | 0 bytes/s, done.
Total 4 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/curiousTauseef/vowelClassificationUsingTheano.git
   695705e..321586c  master -> master
[tauseef vowelClassificationUsingTheano]$ 






25-Jan-2017
After completion of my thesis and 2 exams in Jan 2017
I relook at usuing git, possibly as a way to integrate my thesis code
into GitHub

I have some further questions and tasks
1. If I have linked one local directory to GitHub 
then does GitHub tell me its locally linked ?

2. If I deleted my local directory then will the code on GitHub get deleted ?

3. whats difference between git commit and git push origin master ?



Final commands to remember : 




