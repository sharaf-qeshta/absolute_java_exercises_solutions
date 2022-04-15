package chapter_twelve;

/**
 * The Controller exists between the view and the model.
 * */
public class CounterController
{
    private int startValue, endValue;
    private CounterModel model;
    private CounterView view;

    public CounterController(int startValue, int endValue)
    {
        this.startValue = startValue;
        this.endValue = endValue;
        model = new CounterModel(startValue);
        view = new CounterView();
    }

    public void Start()
    {
        for (int i = startValue; i < endValue+1; i++)
        {
            try {
                view.Display();
                model.Increment();
                Thread.sleep(1000);
            }catch (Exception ignored) {}
        }
    }


}
