…or create a new repository on the command line

echo "# sharda_java_project" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/shardasw81-maker/sharda_java_project.git
git push -u origin master



…or push an existing repository from the command line
git remote add origin https://github.com/shardasw81-maker/sharda_java_project.git
git branch -M main
git push -u origin main

git config --global user.name "shardasw81-maker"
git config --global user.email "shardasw81@gmail.com"