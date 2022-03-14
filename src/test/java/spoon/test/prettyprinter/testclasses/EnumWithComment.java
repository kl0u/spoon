package spoon.test.prettyprinter.testclasses;

public enum EnumWithComment {
    ENGLISH( /* boom */      "Hello", "World"),
    FRENCH("Bonjour","l'univers") /* bam */;

    String hello;
    String world;

    EnumWithComment(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }
}
