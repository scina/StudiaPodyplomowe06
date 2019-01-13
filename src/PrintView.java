public class PrintView {
    private View view;

    public PrintView(View view) {
        this.view = view;
    }

    public void printView() {
        System.out.println(view.title());
        System.out.println(view.header());
        System.out.println(view.content());
    }
}
