package fr.isima.stackoverlow

/**
 * Utilisateur
 * @author Julien
 */
class User {
	
	// Attributs
	String name
	String mail
	String password
	Boolean admin = false
	
	// Liens avec la BDD
	static hasMany = [votes: Vote, messages: Message]
	
	
	static constraints = {
		name(unique: true, minSize: 5)
		mail(unique: true, email: true)
		password(minSize: 5)
    }
	
}
