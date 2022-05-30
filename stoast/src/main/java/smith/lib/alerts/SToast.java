package smith.lib.alerts;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

public class SToast {

	// themes
        public static final String DARK = "#2E3338", LIGHT = "#FFFFFF", FOLLOW_SYSTEM = "SYSTEM";
	// types
        public static final int TYPE_OK = 0, TYPE_WARN = 1, TYPE_DONE = 2, TYPE_ERROR = 3, TYPE_DEFAULT = 4, TYPE_HEART = 5,
			TYPE_CONFUSE = 6;
	private static Toast toast;
	private static String theme = DARK, text;
	private static int type = TYPE_DEFAULT;
        private static int gravity = Gravity.BOTTOM;
        private static int length = Toast.LENGTH_SHORT;
	private static Context context;
        // duration
	public static final int LENGTH_LONG = Toast.LENGTH_LONG, LENGTH_SHORT = Toast.LENGTH_SHORT;

	public void setThemeAndType(String style, int typ) {
		theme = style;
		type = typ;
	}

	public void setText(String txt) {
		text = txt;
	}

	public void setGravityAndDuration(int gvt, int dur) {
		gravity = gvt;
		length = dur;
	}

	public void show() {
		toast = new Toast(context);
		View inflate = ((Activity) context).getLayoutInflater().inflate(R.layout.toast, null);

		LinearLayout main = (LinearLayout) inflate.findViewById(R.id.main);
		LinearLayout img_bg = (LinearLayout) inflate.findViewById(R.id.img_bg);
		ImageView img = (ImageView) inflate.findViewById(R.id.img);
		TextView title = (TextView) inflate.findViewById(R.id.text);

		switch (theme) {
		case LIGHT:
			ui(main, LIGHT, 30);
			title.setTextColor(Color.parseColor(DARK));
			break;
		case DARK:
			ui(main, DARK, 30);
			title.setTextColor(Color.parseColor(LIGHT));
			break;
		case FOLLOW_SYSTEM:
			if (isNightModeEnabeld(context)) {
				ui(main, DARK, 30);
				title.setTextColor(Color.parseColor(LIGHT));
			} else {
				ui(main, LIGHT, 30);
				title.setText(Color.parseColor(DARK));
			}
			break;
		}

		switch (type) {
		case TYPE_OK:
			ui(img_bg, "#1877F2", 0);
			img.setImageResource(R.drawable.ok_img);
			break;
		case TYPE_WARN:
			ui(img_bg, "#FF6801", 0);
			img.setImageResource(R.drawable.warn_img);
			break;
		case TYPE_DONE:
			ui(img_bg, "#43A047", 0);
			img.setImageResource(R.drawable.true_img);
			break;
		case TYPE_ERROR /*3*/:
			ui(img_bg, "#FF5252", 0);
			img.setImageResource(R.drawable.false_img);
			break;
		case TYPE_DEFAULT /*4*/:
			ui(img_bg, "#0D47A1", 0);
			img.setImageResource(R.drawable.default_img);
			break;
		case TYPE_HEART /*5*/:
			ui(img_bg, "#FF5252", 0);
			img.setImageResource(R.drawable.heart_img);
			break;
		case TYPE_CONFUSE /*6*/:
			ui(img_bg, "#FF6801", 0);
			img.setImageResource(R.drawable.confuse_img);
			break;
		}

		main.setClipToOutline(true);

		title.setText(text);

		toast.setGravity(gravity, 0, 150);

		toast.setView(inflate);

		toast.setDuration(length);

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				((Activity)context).runOnUiThread(new Runnable() {
					@Override
					public void run() {
						ObjectAnimator animator = new ObjectAnimator();
						animator.setDuration(1000);
						animator.setFloatValues(0.0f, 1.0f);
						animator.setPropertyName("alpha");
						animator.setTarget(img);
						animator.start();
					}
				});
			}
		};
		timer.schedule(task, 300);

		toast.show();
	}

	private static boolean isNightModeEnabeld(Context context) {
		int nightModeFlags = context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
		if (nightModeFlags == Configuration.UI_MODE_NIGHT_YES) {
			return true;
		} else {
			return false;
		}
	}

	private static void ui(View view, String str, int i) {
		GradientDrawable gradientDrawable = new GradientDrawable();
		gradientDrawable.setColor(Color.parseColor(str));
		gradientDrawable.setCornerRadius((float) i);
		view.setBackground(gradientDrawable);
	}

	public SToast(Context ctx) {
		context = ctx;
	}

        /*
	*
	*
	*    THIS LIBRARY CREATED BY HUSSEIN SHAKIR (SMITH)
	*
	*       TELEGRAM : @SMITHDEV
	*	YOUTUBE : HUSSEIN SMITH
	*
	*	YOU GUYS ARE NOT ALLOWED TO MODIFY THIS LIBRARY,
	*	WITHOT ANY PERMISSION FROM ME PERSONALLY..
	*	ALL RIGHTS RESERVED © HUSSEIN SHAKIR, 2022.
	*
	*
	*/
}
