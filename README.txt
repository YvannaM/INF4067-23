# INF4067-23
PersonnalWork4Schl(Yvanna Mfout)


--------------------------------------------------INF4067 PATTERNS DE CONSTRUCTIONS-----------------------------------------------------------------

Description: Face aux problèmes réccurents de conception logicielle rencontrés par les developpeurs, il est donc venu de produire une DOCUMENTATION.
Celle-ci mettant en avant des techniques éprouvées, connues et réutilisables aux problèmes reccurents de conception logicielle. 

Origines: Pour la petite histoire, les DP tiennent leurs origines des travaux de l'architecte Christopher.A dans les années 1970. 
Et formalisés pour la première fois en 1995 dans le livre "Gang of Four"



¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ PATTERNS DE CONSTRUCTION :

L'objectif du patron de construction se trouve dans l'organisation de la création d'objets. De ce fait, nous avons: Les patrons Factory, Abstract 
Factory, Singleton, Builder et Prototype.  


______________ FACTORY :

FACTORY METHOD :

Description: Il permet de créer des objets sans dependre directement des classes concrètes en déléguant la création à ses sous-classes 
spécialisées. Il resout le problème de la creation d'objets en offrant une lus grande flexibilité ' extensibilité et en évitant l'instanciation directe de classes concrètes dans le code client.  
Nom: Factory method
Intention: Il s'agit de créer une classe Fabrique qui centralise la création des objets en passant en paramètres son type. Factory method est 
utilisable lorsque le Client ne connait le type d'objet à créer qu'à l'execution; avec une volonté de centraliser la création d'objets. 
Exemple:Voir pdf
Structure: Voir pdf


FACTORY :

Description: Il permet de créer des objets de maniere modulaire et flexible en déléguant la responsabilité de l'instanciation à une classe spécialisée appelée "fabrique". Il résout le problème 
de la création d'objets en fournissant une interface générique pour créer les objets et en évitant au client de dépendre directement des classes concrètes.
Nom: Factory 
Intention: Il a la même intention que FACTORY METHOD mais à contrario, la classe Fabrique a des sous-classes implémentant chacunes la méthode de 
d'instantiation de l'objet spécifique attendu(abstraction descendante).
Exemple: Voir pdf
Structure: Voir pdf


______________ ABSTRACT FACTORY :

Description: Permet e créer des familles d'objets connexes sans spécifier leurs classes concrètes. Il résout le problème de la création des objets 
liés sans dépendre directement des classes concrètes. 
Nom: Abstract factory
Intention: Il s'agit de créer une  interface Fabrique habritant les signatures méthodes d'instanciation; Chaques classes concrètes ayant pour objectif
l'instanciation d'un produit. Utilisable lorsque le système est capable de créer des objets d'une même famille et le système est indépendant de la 
création des objets qu'il utilise. 
Exemple: Voir pdf
Structure: Voir pdf


______________ SINGLETON :

Description: Permet de restreindre l'instanciation d'une classe à un seul objet. Il résout le problème de la gestion des ressources partagées
Nom: Singleton
Intention: Il s'agit de créer une  instance unique d'un objet tout au long de l'execution du programme.
Exemple: Voir pdf
Structure: Voir pdf

______________ BUILDER :

Description: Facilite la création des objets complexes en fournissant une approche flexibe et lisible. Il est une solution au problème des constructeurs partagés
Nom: Builder
Intention: Il s'agit de permettre la création d'objets complexes par assemblage de ses composants sans toutes fois que le client ne se soucie des 
différentes étapes de création.
Exemple: Voir pdf
Structure: Voir pdf





--------------------------------------------------EXECUTION DU CODE-----------------------------------------------------------------
1. Télécharger l'archive .zip
2. Extraire l'archive; 
         Description de la hiérarchie des dossiers:

         MFOUT_BANGMO_YVANNA_18T2864
            Patern abstractFactory
             >Modifié
             >Original
            Patern Factory
             >Modifié
             >Original
            Patern Singleton
             >Modifié
             >Original
            Patern Builder
               >Modifié
               >Original

Les dossiers "Original" contiennent le code du cours et "Modifié" contiennent les ajouts de codes tels que demandés en cours.
3. Execution:
Ouvrir dans une fénètre le sous-dossier Original ou modifié selon le dossier voulu puis, taper le raccourcis "f5".


-------------------------------------------------- MERCI :) -----------------------------------------------------------------
