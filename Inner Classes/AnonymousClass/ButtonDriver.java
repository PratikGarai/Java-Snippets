package AnonymousClass;

public class ButtonDriver {
    
    public static void main(String[] args) { 

        Button btn = new Button("Print", null);

        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        btn.click();
    }
    
}
