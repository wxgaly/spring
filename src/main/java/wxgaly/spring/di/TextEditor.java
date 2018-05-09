package wxgaly.spring.di;

public class TextEditor {

//    private SpellChecker spellChecker;
//
//    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("Inside TextEditor constructor.");
//        this.spellChecker = spellChecker;
//    }
//
//    public void spellCheck() {
//        spellChecker.checkSpelling();
//    }

    private SpellChecker spellChecker;
    private String name;

    // a setter method to inject the dependency.
//    public void setSpellChecker(SpellChecker spellChecker) {
//        System.out.println("Inside setSpellChecker.");
//        this.spellChecker = spellChecker;
//    }

    public TextEditor(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
