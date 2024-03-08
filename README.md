# Maintenance

# Sommaire

- [Introduction](#introduction)
- [Fonctionnalités](#fonctionnalités)
  - [Ajouter une forme](#ajouter-une-forme)
    - [Le Point](#le-point)
    - [La Ligne](#la-ligne)
    - [Le Cercle](#le-cercle)
    - [Le Carré](#le-carr)
    - [Le Rectangle](#le-rectangle)
    - [Le Polygone](#le-polygone)
    - [La Courbe](#la-courbe)
  - [Afficher la liste des formes](#afficher-la-liste-des-formes)
  - [Supprimer une forme](#supprimer-une-forme)
  - [Afficher le dessin](#afficher-le-dessin)
  - [Quitter](#quitter)
  
# Introduction

Ce projet a pour but de créer une application de dessin suivant le principe des dessins vectoriels. Ces dessins ont la particularité d'être stockés non pas par des pixels, mais par des coordonnées, ce qui permet de zoomer sur la page sans perdre la qualité des dessins.

Notre équipe, composée de 4 étudiants en 3ème année d'un BUT Informatique, est déterminée à accomplir cette mission. Pour ce faire, nous utiliserons le langage de programmation Java. Cette application sera interactive avec l'utilisateur depuis l'interface de ligne de commande.

# Fonctionnalités

Au lancement de l'application, une page vide, sans dessin, est affichée à l'utilisateur. Celui-ci se trouve sur le menu d'actions et aura le choix entre les actions suivantes. Il devra taper au clavier la lettre associée à l'action souhaitée, puis valider avec la touche "Entrée".

### Ajouter une forme

L'utilisateur peut choisir une forme à ajouter au dessin. Un menu de formes lui sera proposé avec les formes suivantes. Il devra taper au clavier le numéro associé à la forme souhaitée, puis valider avec la touche "Entrée". À chaque forme créée, l'affichage montrera à l'utilisateur l'évolution de son dessin avec la forme qui vient d'être ajoutée. Chaque forme est créée selon les paramètres demandés par l'application à l'utilisateur.

#### Le point

Le point est considéré comme un pixel comprenant une coordonnée x et y.

#### La ligne

La ligne correspond à 2 points reliés sur le dessin.

#### Le cercle

Le cercle est constitué d'un point faisant référence à son centre ainsi qu'à un rayon.

#### Le carré

Le carré peut être dessiné à partir d'un point, qui sera son sommet situé en haut à gauche, et d'une largeur.

#### Le rectangle

Le rectangle peut être dessiné à partir d'un point, qui sera son sommet situé en haut à gauche, et d'une largeur et d'une hauteur.

#### Le polygone

Il sera demandé à l'utilisateur le nombre de points/sommets qu'il souhaite pour créer son polygone, puis il devra inscrire leurs coordonnées.

#### La courbe

Constituée de 4 points, permettant d'avoir une courbe passant par ces derniers.

### Afficher la liste des formes

Cette action permet d'afficher la liste des formes présentes sur le dessin, ainsi que leurs différents paramètres de création.

### Supprimer une forme

L'utilisateur peut choisir de supprimer la forme qu'il souhaite en indiquant l'ID de cette dernière.

NB : L'ID d'une forme peut être trouvé grâce à l'action "Afficher la liste des formes".

### Afficher le dessin

Permet d'afficher le dessin avec les formes actuelement créé.

### Quitter

Cette action permet d'arrêter l'application.