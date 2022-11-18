package fr.univtln.bruno.jee.ejb;

import jakarta.ejb.Stateless;

import static fr.univtln.bruno.jee.ejb.Language.Code.FR;

@Stateless
@Language(FR)
public class AuRevoirBean implements GoodbyeService {
    public String sayGoodbye() {
        return "Au revoir";
    }
}
