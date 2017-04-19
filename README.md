# Java
Git commands

Adding an existing project to GitHub using the command line
1.	git init 

2.	git add 
# adds the files in the local repository and stages them for commit. To unstage a file, use 'git reset HEAD YOUR-FILE'

3.	git comit  -m “First commit”  
# Commits the tracked changes and prepares them to be pushed to a remote repository. To remove this commit and modify the file, use 'git reset --soft HEAD~1' and commit and add the file again.

4.	git remote add origin remote repository URL
# sets the new remote

5.	git remote -v
# verifies the new remote URL.

6.	git push origin master
# pushes the changes in your local repository up to the remote repository you specified as the origin



Adding a file to a repository using the command line.
1.	git add 
# adds the file to your local repository and stages it for commit. To unstage a file, use 'git reset HEAD YOUR-FILE'.

2.	git commit -m "Add existing file"
# Commits the tracked changes and prepares them to be pushed to a remote repository. To remove this commit and modify the file, use 'git reset --soft HEAD~1' and commit and add the file again.

3.	git push origin your-branch
# pushes the changes in your local repository up to the remote repository you specified as the origin
