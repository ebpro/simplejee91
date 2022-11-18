package fr.univtln.bruno.jee.ejb;

import jakarta.ejb.Stateless;

import static fr.univtln.bruno.jee.ejb.Language.Code.EN;

@Stateless
@Language(EN)
public class GoodByeBean implements GoodbyeService, GoodbyeRemote {
    public String sayGoodbye() {
        return "Bye";
    }
}
