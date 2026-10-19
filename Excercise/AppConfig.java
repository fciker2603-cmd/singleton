package Excercise;
public class AppConfig {

    private static final AppConfig instance = new AppConfig();
    private String theme;
    private String language;

    private AppConfig() {
        // Load default settings
        System.out.println("Loading default settings...");
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }

    public static AppConfig getInstance() {

        return instance;
    }

    public void setTheme(String string) {
        this.theme = string;
    }
    public void setLanguage(String string) {
        this.language = string;
    }

    public void printConfig() {
        System.out.println("Theme: " + this.theme);
        System.out.println("Language: " + this.language);   
    }
}