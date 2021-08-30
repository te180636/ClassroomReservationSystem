# ClassroomReservationSystem

## 概要

### 教室予約システム

10室ある教室を事前に予約することで、 後からバッティングが起きないようにしたい。 教室数は変動する可能性がある。

## 開発環境

### ローカルリポジトリの設定

1. 自分のアカウントにForkしたリモートリポジトリを以下のコマンドで任意の場所にcloneする。
   ```shell
   # ssh
   git clone git@github.com:[your account]/ClassroomReservationSystem.git

   # https
   git clone https://github.com/[your account]/ClassroomReservationSystem.git
   ```
   [your account]は適宜変更すること。

2. 上流ブランチを設定する
   ```shell
   # ssh
   git remote add upstream git@github.com:teamTE4A/ClassroomReservationSystem.git

   #https
   git remote add upstream https://github.com/teamTE4A/ClassroomReservationSystem.git
   ```

### IDE

IntelliJ IDEA （JetBrains 製品）