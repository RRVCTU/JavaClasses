package class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }

    void navigage() {
        System.out.println("Opening the URL");
    }

    void test() {
        System.out.println("Testing the WebPage");
    }
    void closeBrowser() {
        System.out.println("Closing the Browser");
    }
}

class Chrome extends Browser{
    @Override
    void openBrowser() {
        System.out.println("Opening the browser in less than 1 sec");
    }
}

class FireFox extends Browser{
    @Override
    void openBrowser() {
        System.out.println("Opening the browser in less than 2 sec");
    }
}
