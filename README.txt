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

Description:
Nom: Factory method
Intention: Il s'agit de créer une classe Fabrique qui centralise la création des objets en passant en paramètres son type. Factory method est 
utilisable lorsque le Client ne connait le type d'objet à créer qu'à l'execution; avec une volonté de centraliser la création d'objets. 
Exemple:Voir pdf
Structure: Voir pdf


FACTORY :

Description:
Nom: Factory 
Intention: Il a la même intention que FACTORY METHOD mais à contrario, la classe Fabrique a des sous-classes implémentant chacunes la méthode de 
d'instantiation de l'objet spécifique attendu(abstraction descendante).
Exemple: Voir pdf
Structure: Voir pdf


______________ ABSTRACT FACTORY :

Description:
Nom: Abstract factory
Intention: Il s'agit de créer une  interface Fabrique habritant les signatures méthodes d'instanciation; Chaques classes concrètes ayant pour objectif
l'instanciation d'un produit. Utilisable lorsque le système est capable de créer des objets d'une même famille et le système est indépendant de la 
création des objets qu'il utilise. 
Exemple: Voir pdf
Structure: Voir pdf


______________ SINGLETON :

Description:
Nom: Singleton
Intention: Il s'agit de créer une  instance unique d'un objet tout au long de l'execution du programme.
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

Les dossiers "Original" contiennent le code du cours et "Modifié" contiennent les ajouts de codes tels que demandés en cours.
3. Execution:
Ouvrir dans une fénètre le sous-dossier Original ou modifié selon le dossier voulu puis, taper le raccourcis "f5".


-------------------------------------------------- MERCI :) -----------------------------------------------------------------
