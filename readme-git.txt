// explain your reasons for excluding each of the rules in gitignore

#IntelliJ
*.iml
.idea/
These two come from IntelliJ IDE, which is not necessary. Another people who clone your repository might not
use IntelliJ IDE.

#Maven
target/
It includes all .class files and .jar files that do not need. When people run your code on their computer.
It will re-compile anyway.

#MacOS
*.DS_Store
It created by Finder of MacOS. These files will be used by Finder which do not important for compiling project at all.
