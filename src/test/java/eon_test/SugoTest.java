package eon_test;

import org.testng.annotations.*;

public class SugoTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void newHelpGroupUid1de027f4b4ee46108b37276c17c11584() {
        // Given login
        actionwords.login();
        // Then create new group
        actionwords.createNewGroup();
        // And define the group content
        actionwords.defineTheGroupContent();
        // Then save the created group
        actionwords.saveTheCreatedGroup();
        // Then the group should be created
        actionwords.theGroupShouldBeCreated();
    }
}