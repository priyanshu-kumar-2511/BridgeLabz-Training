package browserbuddy;

import java.util.Stack;

public class Browser {
    private Tab currentTab = new Tab();
    private Stack<Tab> closedTabs = new Stack<>();

    public void openNewTab() {
        currentTab = new Tab();
        System.out.println("New tab opened");
    }

    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new Tab();
        System.out.println("Tab closed");
    }

    public void reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to reopen.");
            return;
        }
        currentTab = closedTabs.pop();
        System.out.println("Reopened tab at: " + currentTab.getCurrentPage());
    }

    public Tab getCurrentTab() {
        return currentTab;
    }
}
