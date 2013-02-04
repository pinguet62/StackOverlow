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
		"/question?"(controller: "question", action: "all")
		"/question/$id"(controller: "question", action: "show") {
			constraints {
				id matches: /[0-9]+/
			}
		}
		// - r�pondre
		"/question/$id/answer"(controller: "question", action: "answer_submit") {
			constraints {
				id matches: /[0-9]*/
			}
		}
		// - cr�er
		"/question/ask"(controller: "question", action: "ask")
		"/question/ask/submit"(controller: "question", action: "ask_submit")
		// - �diter
		// TODO
		// - supprimer
		// TODO
		
		// User
		"/user"(controller: "user", action: "all")
		"/user/error"(view: "/user/error")
		"/user/new"(view: "/user/newUser")
		"/user/create"(controller: "user", action: "create")
		"/user/delete"(controller: "user", action: "delete")
		"/user/login"(controller: "user", action: "login")
		"/user/logout"(controller: "user", action: "logout")
		"/user/$id"(controller: "user", action: "show")
		"/user/all"(controller: "user", action: "all") // page 1
		//"/user/all/$page"(controller: "user", action: "all")
		
		
		// Tag
		"/tag/$id"(controller: "tag", action: "show")
		"/tag/all"(controller: "tag", action: "all") // page 1
		"/tag/all/$page"(controller: "tag", action: "all")
		
		
		// StackOverflow : essayer de rediriger les liens de StackOverflow vers notre application
		"/users/logout"(controller: "user", action: "logout")
		
		
		"/"(controller: "question", action: "all")
		"500"(view: "/error")
	}
}
