package fr.univtln.bruno.jee.ejb;

import jakarta.ejb.Remote;

@Remote
public interface GoodbyeRemote {
    String sayGoodbye();
}
