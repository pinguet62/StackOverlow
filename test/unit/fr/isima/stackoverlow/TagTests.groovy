package fr.isima.stackoverlow

import org.junit.Before
import org.junit.Test

@TestFor(Tag)
class TagTests {
	
	@Before
	public void before() {
		Tag.where{}.deleteAll()
	}
	
	
	@Test
	void tag() {
		Tag tag = new Tag(name: "tagName")
		tag.save()
		
		assertEquals(Tag.list().size(), 1)
	}
	
}
