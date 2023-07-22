# GitHubへアップロードしたいプロジェクトディレクトリへ移動
```
$ cd /path/to/your/project
$ git init
```
# 必要であれば.gitignoreを作成し、バージョン管理しないファイルやディレクトリを記載（例：*.log）
```
$ vim .gitignore
```
# プロジェクトディレクトリ内にあるファイルやディレクトリを全てコミット 
```
$ git add .
$ git commit -m "Initial Commit"
```
# 先ほど作成したGitHubリポジトリのURLをコピー&ペーストして、リモートブランチとして設定
```
git remote add origin https://github.com/your-name/project-name.git
```
# ローカルのファイルをアップロード
```
git push -u origin master
```
# APIアクセス
```
localhost:8080/human
localhost:8080/human/{contry}
```