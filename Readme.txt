Etape d'ajout d'un utilisateur ou d'une transaction dans le triple Store

1- lancer la logiciel Neo4j et creer une projet, puis une base de donnée et définissez un mot de passe
2- Exécuter l'application avec l'IDE intellij de préférence
3- Patienter l'installation des dépendences (Assurer vous d'être connecté à internet)
4- ouvrir le fichier application.properties qui se trouve dans ressouces du projet intellij
5- Remplissez les champs username et passzord comme défini lors de la création de la base de donnée dans Neo4j
6- Lancer votre projet Neo4j en cliquant sur le bouton "Start"
et saisissez ceci dans votre navigateur "http://localhost:7474/browser/" et connecté vous avec vos identifiants
7- Ouvrir votre le fichier UserController et remplir les informations pour l'ajout d'un nouvel utilisateur;
puis lancer le projet depuis le fichier Neo4j2Application(Utilisateur ajouté si vous avez bien rempli les champs)
8- Consulter les informations de l'utilisateur depuis votre navigateur en selectionnant la base de donnée correspondante
9- Pour ajouter un transaction, décommenter le contenu du fichier TransactionController et
commenter le contenu du fichier UserCOntroller et vice versa pour éviter les conflits lors du lancement du fichier Neo4j2Application
10- Lancer le logiciel Postman pour afficher l'ensemble des utilisateurs contenu dans le triplestore ou
encore affiché les informations d'un utilisateur à partir de son nom
exemple :
Get : http//:localhost:8080/getOrders (affiche la liste des utilisateurs)

    exemple:
    Get : http//:localhost:8080/getInfo/nom (affiche les informations d'untilisateur à partir de son nom)

Merci
