# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir nuova-directory
### Si inizializzi un repository Git dentro la cartella suddetta.
cd nuova-directory
git init
### Si osservi lo stato del repository
git status

andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)

### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
touch HelloWorld.java
code HelloWorld.java
git status

On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        HelloWorld.java

nothing added to commit but untracked files present (use "git add" to track)
### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git add HelloWorld.java
### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
git config --global user.email "andreamcastronovo06@gmail.com"
git config --global user.name "Andtheking"
git commit -m "Created HelloWorld.java"

andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git commit -m "Created HelloWorld.java"
[master (root-commit) af39fe2] Created HelloWorld.java
 1 file changed, 5 insertions(+)
 create mode 100644 HelloWorld.java
### Si compili il file Java e si verifichi lo stato del repository
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ javac HelloWorld.java
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        HelloWorld.class

nothing added to commit but untracked files present (use "git add" to track)
### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ nano .gitignore
### Si osservi lo stato del repository
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

nothing added to commit but untracked files present (use "git add" to track)
### Si crei un nuovo commit che tracci la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git add .gitignore
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git commit -m "added .gitignore"
[master 9cd274a] added .gitignore
 1 file changed, 1 insertion(+)
 create mode 100644 .gitignore
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git status
On branch master
nothing to commit, working tree clean
### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file .`gitattributes`
nano .gitignore
paste `# Automatically normalize line endings to LF for all text files (not for binaries)
\* text=auto eol=lf
\# For files with .cmd (case-insensitive) extension, enforce CRLF (Windows style) line endings.
*.[cC][mM][dD] text eol=crlf
\# For .bat files (Windows batch scripts), use CRLF endings, consistent with Windows shell requirements.
*.[bB][aA][tT] text eol=crlf
\# For PowerShell script files (.ps1), enforce CRLF endings.
*.[pP][sS]1 text eol=crlf`

### Si osservi la storia del repository usando `git log --all --graph`
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git log --all --graph
* commit 9cd274a5a5e8d2f6778834e81d31c3fc5b8a2be2 (HEAD -> master)
| Author: Andtheking <andreamcastronovo06@gmail.com>
| Date:   Tue Oct 14 16:47:14 2025 +0200
|
|     added .gitignore
|
* commit af39fe28ba9c6c4d65bc5428a156f583140a4b5a
  Author: Andtheking <andreamcastronovo06@gmail.com>
  Date:   Tue Oct 14 16:45:45 2025 +0200

      Created HelloWorld.java
### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`
ok
### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
touch Mistake.java

git add .

git commit -m "created Mistake.java"
### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
rename Mistake.java ToDelete.java Mistake.java

git add ToDelete.java

### Si elimini `ToDelete.java` e si registri la modifica in un commit
rm ToDelete.java

On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    Mistake.java

no changes added to commit (use "git add" and/or "git commit -a")
git add .
git commit -m "deleted ToDelete.Java"
### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
andrea@lab22-03-06:~/unibo-oop/oop-lab04/43-git/nuova-directory$ git log --oneline
755c940 (HEAD -> master) created Mistake.java
c028bca added .gitattributes
9cd274a added .gitignore
af39fe2 Created HelloWorld.java
### Si ripristini Mistake.java dal commit identificato al passo precedente
git checkout HEAD
### Si rimuova il file ripristinato e si ripulisca lo stage

### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
