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

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
