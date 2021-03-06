<!-- Afficher la liste des question -->
<!-- @param listQuestions Liste des questions -->
<!-- @param sort Type de tri -->
<!-- @param currentPage Numéro de page courrante -->
<!-- @param listPages Liste des numéros de page -->
<!-- @param pagesize Nombre de questions par page -->
<!-- @author Julien -->



<html>
	<head>
		<meta name="layout" content="main">
		<title>Questions</title>
	</head>
	<body class="question-page">
		<div id="custom-header"></div>
		<div class="container">
			<g:render template="/header" model="[locality: 'questions']"/>
			<div id="content">
				<div id="mainbar">
					<div class="subheader">
						<h1 id="h-all-questions"><g:message code="question.all.title"/></h1>
						<div id="tabs">
							<a ${sort == fr.isima.stackoverlow.Sort.NEWEST ? 'class="youarehere"' : ''} title="the most recently asked questions" href="/StackOverlow/question?sort=${fr.isima.stackoverlow.Sort.NEWEST.toString()}"><g:message code="application.tri.newest"/></a>
							<a ${sort == fr.isima.stackoverlow.Sort.VOTES ? 'class="youarehere"' : ''} title="questions with the most votes" href="/StackOverlow/question?sort=${fr.isima.stackoverlow.Sort.VOTES.toString()}"><g:message code="application.tri.votes"/></a>
						</div>
					</div>
					<div id="questions">
						<g:each var="question" in="${listQuestions}">
							<div id="question-summary-${question.id}" class="question-summary">
								<div class="statscontainer">
									<div class="statsarrow"></div>
									<div class="stats">
										<div class="vote">
											<div class="votes">
												<span class="vote-count-post ">
													<strong>${new fr.isima.stackoverlow.VoteService().getMark(question)}</strong>
												</span>
												<div class="viewcount">votes</div>
											</div>
										</div>
										<g:if test="${question.responses.size() == 0}">
											<div class="status unanswered">
												<strong>0</strong>
												answers
											</div>
										</g:if>
										<g:else>
											<div class="status answered">
												<strong>${question.responses.size()}</strong>
												answers
											</div>
										</g:else>
									</div>
								</div>
								<div class="summary">
									<h3>
										<a class="question-hyperlink" href="/StackOverlow/question/${question.id}">
											${question.title}
										</a>
									</h3>
									<div class="excerpt">
										${question.content}
									</div>
									<div class="tags t-cñ t-javascript t-aspûnet t-web-applications">
										<g:each var="tag" in="${question.tags}">
											<g:stackTagIcon tag="${tag}"/>
										</g:each>
									</div>
									<div class="started fr">
										<div class="user-info">
											<div class="user-action-time">
												asked
												<g:stackDate date="${question.date}"/>
											</div>
											<div class="user-gravatar32">
												<a href="/user/${question.author.id}">
													<div class="">
														<g:stackAvatar user="${question.author}"/>
													</div>
												</a>
											</div>
											<div class="user-details">
												<a href="/StackOverlow/user/${question.author.id}">${question.author.name}</a>
												<br/>
												<span class="reputation-score" dir="ltr" title="reputation score">
													${new fr.isima.stackoverlow.VoteService().getReputation(question.author)}
												</span>
												<!-- badges -->
											</div>
										</div>
									</div>
								</div>
							</div>
						</g:each>
					</div>
					<br class="cbt"></br>
					<div class="page-sizer fr">
						<a class="page-numbers ${pagesize==15 ? 'current' : ''}" title="show 15 items per page" href="/StackOverlow/question?pagesize=15">15</a>
						<a class="page-numbers ${pagesize==30 ? 'current' : ''}" title="show 30 items per page" href="/StackOverlow/question?pagesize=30">30</a>
						<a class="page-numbers ${pagesize==50 ? 'current' : ''}" title="show 50 items per page" href="/StackOverlow/question?pagesize=50">50</a>
						<span class="page-numbers desc"><g:message code="application.pagesize"/></span>
					</div>
					<g:render template="/listPages" model="[currentPage: currentPage, listPages: listPages, baseURL: '/StackOverlow/question']"/>
				</div>
				<div class="sidebar">
					<div id="questions-count" class="module">
						<div class="summarycount al">
							${fr.isima.stackoverlow.Question.all.size()}
						</div>
						<p>questions</p>
					</div>
					<div id="related-tags" class="module">
						<h4 id="h-related-tags"><g:message code="questiol.all.relatedTags"/></h4>
						<g:each var="tag" in="${new fr.isima.stackoverlow.TagService().get(0, 25, fr.isima.stackoverlow.Sort.POPULAR)}">
							<g:stackTagIconAndPopularity tag="${tag}"/>
							<br></br>
						</g:each>
					</div>
				</div>
			</div>
		</div>
		<g:render template="/footer"/>
	</body>
</html>