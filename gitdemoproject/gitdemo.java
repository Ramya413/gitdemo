
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

        public class  gitDemo {();
                driver.get("http://demo.automationtesting.in/Frames.html");
                Thread.sleep(5000);
                driver.switchTo().frame(driver.findElement(By.id("singleframe")));
                Thread.sleep(3000);
                WebElement ele = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
                ele.sendKeys("ajay krishna");
                Thread.sleep(3000);
                driver.switchTo().parentFrame();
                Thread.sleep(3000);
                WebElement ifi = driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']"));
                ifi.click();
                Thread.sleep(3000);
                driver.close();
            }



        }

    }

