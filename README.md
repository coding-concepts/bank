Repository - Bank
======================
This is a banking application for students. 



@Aniket, @Aneesh, @Ishil @Viggy,

Follow the commands.

1. Clone repository. Please make sure you do not make any changes to master
```
$  git clone 
```
2. Create your local copy. We need to make sure that git tracks outr changes.
```
$  git checkout --track -b feature/<yourname>
```
3. Now you make code changes.

4. Once you are done. Commit them, either from IntelliJ or from command prompt. Here is the command prompt command.
```
$  git commit -m"YOUR COMMENT HERE INSIDE THE DOUBLE QUOTES"
```
5. Since there could have been code change since you last cloned/pulled, lets go to master and pull again
```
$  git checkout master
```

6. Now Pull
```
$  git pull
```

7. Go back to your branch. 
```
$  git checkout feature/<yourname>
```

8. Now rebase ( kind of merge) the latest code from master and then your committed code on top


```
$  git rebase master
```

9. Now you can push

```
$  git push origin
```

Now your code is in the remote branch in github. Create a pull request and send it to your instructor.
