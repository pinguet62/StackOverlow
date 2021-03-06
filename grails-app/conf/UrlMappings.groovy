import javax.swing.SpringLayout.Constraints;

class UrlMappings {

	static mappings = {
		// D�faut
		"/$controller/$action?/$id?" {
			constraints {
			}
		}
		
		
		// Question
		// - afficher
		"/question?"(controller: "question", action: "list")
		"/question/$id"(controller: "question", action: "show") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		// - cr�er
		"/question/create"(controller: "question", action: "create")
		"/question/create/submit"(controller: "question", action: "create_submit")
		// - �diter
		"/question/$id/edit"(controller: "question", action: "edit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		"/question/$id/edit/submit"(controller: "question", action: "edit_submit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		// - supprimer
		"/question/$id/delete"(controller: "question", action: "delete") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		
		// Response
		// - cr�er
		"/response/$id/create/submit"(controller: "response", action: "create_submit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		// - �diter
		"/response/$id/edit"(controller: "response", action: "edit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		"/response/$id/edit/submit"(controller: "response", action: "edit_submit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		
		
		// Commentaire
		// - cr�er
		"/commentaire/$id/create/submit"(controller: "commentaire", action: "create_submit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		
		
		// Vote
		"/vote/$id/up"(controller: "vote", action: "up") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		"/vote/$id/down"(controller: "vote", action: "down") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		
		
		// Tag
		// - afficher
		"/tag?"(controller: "tag", action: "list")
		"/tag/$id"(controller: "tag", action: "show") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		// - �diter
		"/tag/$id/edit"(controller: "tag", action: "edit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		"/tag/$id/edit/submit"(controller: "tag", action: "edit_submit") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		
		
		// User
		
		//login
		"/user/login"(controller: "user", action: "login")
		"/user/logout"(controller: "user", action: "logout")
		"/logUser"(view: "/user/loginForm")
		
		
		//create user
		"/user/create"(controller: "user", action: "create")
		"/user/new"(view: "/user/newUser")
		
		
		//edit user
		"/user/editUser"(controller: "user", action: "edit")
		"/user/edit"(controller: "user", action: "updateUser")
		
		//delete user
		"/user/deleteUser"(controller: "user", action: "delete")
		
		
		//rules
		"/user/rules"(controller: "user", action: "rules")
		
		"/user"(controller: "user", action: "all")
		"/user/error"(view: "/user/error")
		
		
		"/user/delete"(controller: "user", action: "delete")
		"/user/$id"(controller: "user", action: "show")
		"/user/all"(controller: "user", action: "all") // page 1
	
		
		
		// Accueil
		"/index"(controller: "question", action: "list")
		"/"(controller: "question", action: "list")
		
		
		// Erreurs
		"500"(view: "/error")
	}
}
