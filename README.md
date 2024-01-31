# maintenance

Readline

#### INSTALL LIBRAIRIE #####
Installer : 
* readline
* readline-devel
* make
* gcc

dia : logiciel de conception

#### Installation ####
Processus d'installation :
Dans dossier /src :
__$ make__

__$ make clean__

__$ make__

Lancer draw
__./draw__

#### COMMANDE ####
###### Principale
__help__: manuel des commandes
__clear__: effacer les commandes
__exit__: quitter
__plot__: voir/dessiner le dessin

###### Plus
Shape
__list shapes__: liste des dessins

Layer
__list layers__: liste des calques/ donne celui qui est activé
__new layer__ : Nouveau calque
__set layer unvisible__ : Calque invisible

Area
__list areas__: zone/onglet
__select area 1__: Sélectionner un onglet

__set char__: Changer de bordure

#### DESSIN ####
Dessiner un cercle :
circle : <x> <y> <taille rayon> 
line : <x> <y>
square :