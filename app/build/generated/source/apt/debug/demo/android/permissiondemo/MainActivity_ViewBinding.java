// Generated code from Butter Knife. Do not modify!
package demo.android.permissiondemo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427416;

  private View view2131427417;

  private View view2131427418;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_upload, "field 'btn_upload' and method 'setBtn_upload'");
    target.btn_upload = Utils.castView(view, R.id.btn_upload, "field 'btn_upload'", ImageButton.class);
    view2131427416 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBtn_upload(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_contacts, "field 'btn_contacts' and method 'setBtn_contacts'");
    target.btn_contacts = Utils.castView(view, R.id.btn_contacts, "field 'btn_contacts'", Button.class);
    view2131427417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBtn_contacts(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_location, "field 'btn_location' and method 'setBtn_location'");
    target.btn_location = Utils.castView(view, R.id.btn_location, "field 'btn_location'", Button.class);
    view2131427418 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBtn_location(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_upload = null;
    target.btn_contacts = null;
    target.btn_location = null;

    view2131427416.setOnClickListener(null);
    view2131427416 = null;
    view2131427417.setOnClickListener(null);
    view2131427417 = null;
    view2131427418.setOnClickListener(null);
    view2131427418 = null;
  }
}
