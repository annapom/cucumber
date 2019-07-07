Feature: Wiki
  Scenario:
    Given user is on wikipedia
    When user search for anna
    Then user can not find Reference

#@Given("^user is on wikipedia")
#public void user_is_on_wikipedia_page() throws Throwable{
#// Write code here that turns the phrase above into concrete actions
#throw new PendingException();
#}
#
#@When("^user search for \"([^\"]*)\"$")
#public void user_search_for(String arg1) throws Throwable {
#// Write code here that turns the phrase above into concrete actions
#throw new PendingException();
#}
#
#@Then("^user can not find Reference$")
#public void user_can_not_find_Reference() throws Throwable {
#// Write code here that turns the phrase above into concrete actions
#throw new PendingException();
#}