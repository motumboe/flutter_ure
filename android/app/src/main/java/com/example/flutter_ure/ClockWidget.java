import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
import com.example.flutter_ure.R; 


public class ClockWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        System.out.println("[ML] Widget update");
        // This method is called when it's time to update the widget content.

        // You can customize the appearance of your widget here.
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_clock);

        // You can update the TextView in your widget layout with the current time, for example:
        // views.setTextViewText(R.id.appwidget_text, "Updated Text");

        // Update all instances of the widget with the updated RemoteViews
        appWidgetManager.updateAppWidget(appWidgetIds, views);
    }
}
