public enum Animal {

    // as soon as we create constructor with input attribute - we need to fix constants values (inputs)
    DOG("Собака"),
    CAT("Kіт"),
    FROG("Жаба");

    private String translation;

    /*private*/ Animal(String translation){ // we can treat enum as an object and add constructor
        this.translation = translation;
    }

    public String getTranslation(){
        return this.translation;
    }

    public String toString(){
        return "Translation to Ukrainian is " + this.translation;
    }
}
