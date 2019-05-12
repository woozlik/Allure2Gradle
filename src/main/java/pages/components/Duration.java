package pages.components;

import org.openqa.selenium.By;

public enum Duration {
    _12_Monate(By.cssSelector(".Select-option[aria-label ='12 Monate']")),
    _24_Monate(By.cssSelector(".Select-option[aria-label ='24 Monate']")),
    _36_Monate(By.cssSelector(".Select-option[aria-label ='36 Monate']"));

    private By duration;

    Duration(By duration) {
        this.duration = duration;
    }
    public By getLocator(){
        return duration;
    }
}
