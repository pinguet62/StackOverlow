StackOverlow
============

StackOverflow par les nuls...


Remarques :
	Certains constructeurs, comme Question, ne fonctionne pas lorsque l'on passe un attribut li� � la BDD en param�tre.
	Par exemple Question question = new Question(title: "title", content: "content", date: new Date(), user: user) ne fonctionne pas.
	Alors faisons Question question = new Question(title: "title", content: "content", date: new Date())
					question.user = user
	De m�me lorsque l'on essaye de faire un save() sur la m�me ligne que le constructeur.



Grails
Backend & frontend
Backend : use RESTful API
frontend : appli cliente HTML5 & JavaScript
admin 


pens� a mettre des cobtraiten sur les clase du model genre :
email(blank:false, nullable:false,email:true)
        password(blank:false, password:true)

sur: 
http://stackoverflow.com/questions/1720533/abstract-classes-in-gorm-relationships
http://stackoverflow.com/questions/2096891/grails-find-by-non-native-types






Cr�er un nouveau projet � partir des sources existantes :
    Ouvrir le workspace d�sir�
    File > Import...
        Grails > Grails Project > Next
            Location: > Browse... > "Chemin vers le r�pertoire" > OK
            D�cocher "Copy resources into workspace"
            Install: > "Choisir l'installation de Grails"
            Finish



Configuration de l'IDE :
    Java :
        Window > Preferences
            Java > Installed JREs
            Add
                Aller jusqu'au chemin d'installation de "Java jdk"
            Cocher la nouvelle entr�e
    
    Grails :
        Window > Preferences
            Groovy > Grails
                "Add" ou "Edit"
                    Browse...
                    Chemin vers le r�pertoire d'installation de "Grails"



Git :
	T�l�chercher d�pot :
		git clone http://github.com/pinguet62/StackOverlow.git
	
    Commandes :
        git commit -a -m "message personnel"
        	A faire r�guli�rement, avec chaque petite fonctionnalit� que tu impl�mentes
        git pull
        	Il peut y avoir des conflits, une fois que tu les as corrig�es tu peux refaire "git pull" et tester si �a marche encore
        git push



Fichier .gitgnore :
	*.iws
	*Db.properties
	*Db.script
	.settings
	stacktrace.log
	/*.zip
	/plugin.xml
	/*.log
	/*DB.*
	/cobertura.ser
	.DS_Store
	/target/
	/out/
	/web-app/plugins
	/web-app/WEB-INF/classes
	/.link_to_grails_plugins/
	/target-eclipse/
	
	.classpath
	.project
