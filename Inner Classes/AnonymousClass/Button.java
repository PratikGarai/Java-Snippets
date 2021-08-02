package AnonymousClass;

public class Button {
    private String title;
    private OnClickListener onClickListener;
    

    public Button(String title, OnClickListener onClickListener) {
        this.title = title;
        this.onClickListener = onClickListener;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void click() {
        this.onClickListener.onClick(this.title);
    }
    
    public interface OnClickListener {
        public void onClick(String title);
    }
}
