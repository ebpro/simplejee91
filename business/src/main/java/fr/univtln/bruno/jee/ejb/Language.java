package fr.univtln.bruno.jee.ejb;

public @interface Language {
    Code value();

    enum Code {FR, EN}
}
