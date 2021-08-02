package LocalClass;

public class ButtonDriver {
    
    public static void main(String[] args) {
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }    

        Button btn = new Button("Print", new ClickListener());
        btn.click();
    }
    
}
